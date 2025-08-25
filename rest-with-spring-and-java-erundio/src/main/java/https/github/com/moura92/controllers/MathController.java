package https.github.com.moura92.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    //SOMA:
    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable ("numberOne") String numberOne,
                      @PathVariable ("numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }
    //SUBTRAÇÃO:
    //http://localhost:8080/math/sub/3/5
    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable ("numberOne") String numberOne,
                      @PathVariable ("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Erro! digite o numero correto");
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }
    //MULTIPLICAÇÃO:
    //http://localhost:8080/math/mul/3/5
    @RequestMapping("/mul/{numberOne}/{numberTwo}")
    public Double mul(@PathVariable ("numberOne") String numberOne,
                      @PathVariable ("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedOperationException("Erro! Digite um numero");
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }
    //DIVISÃO:
    //http://localhost:8080/math/div/50/5
    @RequestMapping ("/div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable ("numberOne") String numberOne,
                      @PathVariable ("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("ERRO! Valor Incorreto");
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }
    //MÉDIA:
    //http://localhost:8080/math/med/60/50
    @RequestMapping ("/med/{numero1}/{numero2}")
    public Double med(@PathVariable ("numero1") String numero01,
                      @PathVariable ("numero2") String numero02) throws Exception {
        if (!isNumeric(numero01) || !isNumeric(numero02)) throw new UnsupportedOperationException("ERRO!.");
        return (convertToDouble(numero01) + convertToDouble(numero02)) / 2;
    }
    //RAIZ QUADRADA:
    //http://localhost:8080/math/rq/5
    @RequestMapping ("rq/{numero}")
    public Double rq (@PathVariable ("numero") String numero) throws Exception {
        if (!isNumeric(numero)) throw new UnsupportedOperationException("ERRO de digitação.");
        return Math.sqrt(convertToDouble(numero));
    }



    private Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");// converte virgula em ponto.
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");// converte virgula em ponto.
        return  number.matches("[-+]?\\.?[0-9]+");
    }
}

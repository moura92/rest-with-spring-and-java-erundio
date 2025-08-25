package https.github.com.moura92.controllers;

import https.github.com.moura92.math.SimpleMath;
import https.github.com.moura92.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    //SOMA:
    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable ("numberOne") String numberOne,
                      @PathVariable ("numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    //SUBTRAÇÃO:
    //http://localhost:8080/math/sub/3/5
    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable ("numberOne") String numberOne,
                      @PathVariable ("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedOperationException("Erro! digite o numero correto");
        return math.sub(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    //MULTIPLICAÇÃO:
    //http://localhost:8080/math/mul/3/5
    @RequestMapping("/mul/{numberOne}/{numberTwo}")
    public Double mul(@PathVariable ("numberOne") String numberOne,
                      @PathVariable ("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw  new UnsupportedOperationException("Erro! Digite um numero");
        return math.mul(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    //DIVISÃO:
    //http://localhost:8080/math/div/50/5
    @RequestMapping ("/div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable ("numberOne") String numberOne,
                      @PathVariable ("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedOperationException("ERRO! Valor Incorreto");
        return math.div(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    //MÉDIA:
    //http://localhost:8080/math/med/60/50
    @RequestMapping ("/med/{numero1}/{numero2}")
    public Double med(@PathVariable ("numero1") String numero01,
                      @PathVariable ("numero2") String numero02) throws Exception {
        if (!NumberConverter.isNumeric(numero01) || !NumberConverter.isNumeric(numero02)) throw new UnsupportedOperationException("ERRO!.");
        return math.med(NumberConverter.convertToDouble(numero01), NumberConverter.convertToDouble(numero02));
    }
    //RAIZ QUADRADA:
    //http://localhost:8080/math/rq/5
    @RequestMapping ("rq/{numero}")
    public Double rq (@PathVariable ("numero") String numero) throws Exception {
        if (!NumberConverter.isNumeric(numero)) throw new UnsupportedOperationException("ERRO de digitação.");
        return math.rq(NumberConverter.convertToDouble(numero));
    }

}

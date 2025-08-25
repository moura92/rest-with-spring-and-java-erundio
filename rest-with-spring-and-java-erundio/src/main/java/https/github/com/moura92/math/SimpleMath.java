package https.github.com.moura92.math;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {

    //SOMA:
    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }
    //SUBTRAÇÃO:
    //http://localhost:8080/math/sub/3/5
    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }
    //MULTIPLICAÇÃO:
    //http://localhost:8080/math/mul/3/5
    @RequestMapping("/mul/{numberOne}/{numberTwo}")
    public Double mul(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }
    //DIVISÃO:
    //http://localhost:8080/math/div/50/5
    @RequestMapping ("/div/{numberOne}/{numberTwo}")
    public Double div(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }
    //MÉDIA:
    //http://localhost:8080/math/med/60/50
    @RequestMapping ("/med/{numero1}/{numero2}")
    public Double med(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }
    //RAIZ QUADRADA:
    //http://localhost:8080/math/rq/5
    @RequestMapping ("rq/{numero}")
    public Double rq(Double number) {
        return Math.sqrt(number);
    }
}

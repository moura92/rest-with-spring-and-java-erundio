package https.github.com.moura92.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperaionException extends RuntimeException {

    public UnsupportedMathOperaionException(String message) {
        super(message);
    }
}

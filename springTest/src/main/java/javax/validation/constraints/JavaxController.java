package javax.validation.constraints;

import org.springframework.validation.annotation.ValidatedResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.annotation.ValidatedResponseCustom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/javaxController")
public class JavaxController {

    @GetMapping("/javax")
    public String javax(@Validated @RequestBody JavaxData javaxData){
        return "javax";
    }

    @GetMapping("/javaxA")
    public String javaxA(@Validated(InterfaceA.class) @RequestBody JavaxData javaxData){
        return "javaxA";
    }

    @GetMapping("/javaxB")
    public String javaxB(@Validated(InterfaceB.class) @RequestBody JavaxData javaxData){
        return "javaxB";
    }

    @GetMapping("/javaxResponse")
    @ValidatedResponse()
    public JavaxData javaxResponse(){
        return null;
    }

    @GetMapping("/javaxAResponse")
    @ValidatedResponse(InterfaceA.class)
    public JavaxData javaxAResponse(){
        return null;
    }

    @GetMapping("/javaxBResponse")
    @ValidatedResponse(InterfaceB.class)
    public JavaxData javaxBResponse(){
        return null;
    }
}

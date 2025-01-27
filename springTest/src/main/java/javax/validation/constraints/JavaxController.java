package javax.validation.constraints;

import org.springframework.validation.annotation.ValidatedResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/javaxController")
public class JavaxController {

    @GetMapping("/javax")
    public String javax(@Validated @RequestBody JavaxData javaxData) {
        return "javax";
    }

    @GetMapping("/javaxA")
    public String javaxA(@Validated(InterfaceA.class) @RequestBody JavaxData javaxData) {
        return "javaxA";
    }

    @GetMapping("/javaxB")
    public String javaxB(@Validated(InterfaceB.class) @RequestBody JavaxData javaxData) {
        return "javaxB";
    }

    @GetMapping("/javaxAB")
    public String javaxAB(@Validated({InterfaceA.class, InterfaceB.class}) @RequestBody JavaxData javaxData) {
        return "javaxAB";
    }

    @GetMapping("/javaxResponse")
    @ValidatedResponse()
    public JavaxData javaxResponse() {
        return null;
    }

    @GetMapping("/javaxAResponse")
    @ValidatedResponse(InterfaceA.class)
    public JavaxData javaxAResponse() {
        return null;
    }

    @GetMapping("/javaxBResponse")
    @ValidatedResponse(InterfaceB.class)
    public JavaxData javaxBResponse() {
        return null;
    }

    @GetMapping("/javaxABResponse")
    @ValidatedResponse({InterfaceA.class, InterfaceB.class})
    public JavaxData javaxBResponseAB() {
        return null;
    }

    @Validated()
    @GetMapping("/javaxMethod")
    public String javaxMethod(@RequestBody JavaxData javaxData) {
        return "javaxMethodA";
    }

    @Validated(InterfaceA.class)
    @GetMapping("/javaxMethodA")
    public String javaxMethodA(@RequestBody JavaxData javaxData) {
        return "javaxMethodA";
    }

    @Validated(InterfaceB.class)
    @GetMapping("/javaxMethodB")
    public String javaxMethodB(@RequestBody JavaxData javaxData) {
        return "javaxMethodB";
    }

    @Validated({InterfaceA.class, InterfaceB.class})
    @GetMapping("/javaxMethodAB")
    public String javaxMethodAB(@RequestBody JavaxData javaxData) {
        return "javaxMethodAB";
    }

    @Validated({InterfaceA.class, InterfaceB.class})
    @GetMapping("/javaxMethodABA")
    public String javaxMethodABA(@RequestBody @Validated({InterfaceA.class}) JavaxData javaxData) {
        return "javaxMethodABA";
    }

}

package javax.validation.constraints;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JavaxData {

    private String notIgnore;

    @FieldIgnore
    private String ignore;

    @FieldIgnore(groups = InterfaceA.class)
    private String ignoreA;

    @FieldIgnore(groups = InterfaceB.class)
    private String ignoreB;


}

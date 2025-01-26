package com.example.springtest.entity.assembly;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(oneOf = {AssemblyOne.class, AssemblyTwo.class})
public class AssemblyOneOfClass {

    private String assemblyOneOfClass1;

    private Integer assemblyOneOfClass2;

    private String assemblyOneOfClass3;

    private Integer assemblyOneOfClass4;

}

package com.example.springtest.entity.assembly;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Schema(oneOf = {AssemblyOne.class, AssemblyTwo.class})
public class AssemblyOneOfField {

    private String assemblyOneOfField1;

    private Integer assemblyOneOfField2;

    private String assemblyOneOfField3;

    private Integer assemblyOneOfField4;

}

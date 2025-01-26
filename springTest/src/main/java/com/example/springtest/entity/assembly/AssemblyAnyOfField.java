package com.example.springtest.entity.assembly;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Schema(anyOf = {AssemblyOne.class, AssemblyTwo.class})
public class AssemblyAnyOfField {

    private String assemblyAnyOfField1;

    private Integer assemblyAnyOfField2;

    private String assemblyAnyOfField3;

    private Integer assemblyAnyOfField4;

}

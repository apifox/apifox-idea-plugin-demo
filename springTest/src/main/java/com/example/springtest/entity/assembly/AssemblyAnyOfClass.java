package com.example.springtest.entity.assembly;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(anyOf = {AssemblyOne.class, AssemblyTwo.class})
public class AssemblyAnyOfClass {

    private String assemblyAnyOfClass1;

    private Integer assemblyAnyOfClass2;

    private String assemblyAnyOfClass3;

    private Integer assemblyAnyOfClass4;

}

package com.example.springtest.entity.assembly;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(allOf = {AssemblyOne.class, AssemblyTwo.class})
public class AssemblyAllOfClass {

    private String assemblyAllOfClass1;

    private Integer assemblyAllOfClass2;

    private String assemblyAllOfClass3;

    private Integer assemblyAllOfClass4;

}

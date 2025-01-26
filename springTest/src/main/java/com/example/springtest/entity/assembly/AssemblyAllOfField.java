package com.example.springtest.entity.assembly;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(allOf = {AssemblyOne.class, AssemblyTwo.class})
public class AssemblyAllOfField {

    private String assemblyAllOfField1;

    private Integer assemblyAllOfField2;

    private String assemblyAllOfField3;

    private Integer assemblyAllOfField4;

}

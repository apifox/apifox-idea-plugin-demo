package com.example.springtest.entity.assembly;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Schema(allOf = {AssemblyOne.class})
public class Assembly {

    private String assembly1;

    private Integer assembly2;

    private String assembly3;

    private Integer assembly4;

}

package com.example.springtest.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(allOf = {AssemblyOne.class, AssemblyTwo.class, AssemblyThree.class})
public class Assembly {

    private String assembly1;

    private Integer assembly2;

}

package com.example.springtest.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestHandlerJsonFieldSchema {

//    /**
//     * @null
//     * @fieldRequire
//     */
//    @Schema(description = "用户邮箱", example = "john@example.com")
//    private String email;
//
//    @Schema(description = "用户手机号", example = "13800138000")
//    private String phone;
//
//    /**
//     * @null
//     * @fieldRequire
//     */
//    @Schema(oneOf = {AssemblyOne.class, AssemblyTwo.class, AssemblyThree.class})
//    private OtherOneOf otherOneOf;
//
//    @Schema(anyOf = {AssemblyOne.class, AssemblyTwo.class, AssemblyThree.class})
//    private OtherAnyOf otherAnyOf;
//
//    @Schema(allOf = {AssemblyOne.class, AssemblyTwo.class, AssemblyThree.class})
//    private OtherAllOf otherAllOf;
//
//    @Schema(oneOf = AssemblyOne.class)
//    private OtherOneOfOne otherOneOfOne;
//
//    @Schema(anyOf = AssemblyThree.class)
//    private OtherAnyOfOne otherAnyOfOne;
//
//    @Schema(allOf = AssemblyTwo.class)
//    private OtherAllOfOne otherAllOfOne;
//
//    @Schema(oneOf = AssemblyOne.class)
//    private Object obj1;
//
//    @Schema(oneOf = {AssemblyOne.class})
//    private Object obj2;
//
//    @Schema(oneOf = {AssemblyOne.class, AssemblyTwo.class, AssemblyThree.class})
//    private Object obj3;
//
//    @Schema(anyOf = AssemblyOne.class)
//    private Object obj4;
//
//    @Schema(anyOf = {AssemblyOne.class})
//    private Object obj5;
//
//    @Schema(anyOf = {AssemblyOne.class, AssemblyTwo.class, AssemblyThree.class})
//    private Object obj6;
//
//    @Schema(allOf = AssemblyOne.class)
//    private Object obj7;
//
//    @Schema(allOf = {AssemblyOne.class})
//    private Object obj8;
//
//    @Schema(allOf = {AssemblyOne.class, AssemblyTwo.class, AssemblyThree.class})
//    private Object obj9;

    private Assembly assembly;

}

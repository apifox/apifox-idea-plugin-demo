package com.example.springtest.entity;

import com.example.springtest.anno.*;
import com.example.springtest.enumData.EnumData;
import com.example.springtest.enumData.UserTypeConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述有问题
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FieldDefaultDto implements Serializable {


    private static final long serialVersionUID = -4607862808303533196L;


    private String price;
    private String name;
    private Integer age;

    /**
     * @default 100
     */
    private Integer ageAnno;

    @DefaultValueAnno("999")
    private Integer ageDoc;

    /**
     * @example 90
     */
    private Integer exampleAgeAnno;

    @Example("101")
    private Integer exampleAgeDoc;

    /**
     * 描述2
     * @fieldDesc 描述一
     */
    private String descAnno;

    /**
     * 直接描述
     * @fieldDesc 注释描述
     */
    @FieldDesc("注解描述")
    private String descDoc;

    private String ignoreNoField;

    /**
     * @fieldIgnore true
     */
    private String ignoreFieldAnno;

    @FieldIgnore(value = true)
    private String ignoreFieldDoc;

    private String log;
    private String ignoreLog;


    private String noMock;

    /**
     * @mock 1@natural(0,9)
     */
    private String mockDoc;

    @Mock("1@natural(0,10)")
    private String mockAnno;

    /**
     * @mock ${float_with_two}
     */
    private String mockDoc$;

    @Mock("${float_with_two}")
    private String mockAnno$;

    private String fieldName;

    /**
     * @fieldName fieldNameDoc
     */
    private String fieldNameD;

    @FieldName("fieldNameAnno")
    private String fieldNameA;

    private String fieldNoRequire;

    /**
     * @fieldRequire true
     */
    private String fieldRequireDoc;

    @FieldRequire(value = true)
    private String fieldRequireAnno;

    private UserTypeConstant userTypeConstant;

    /**
     * @see UserTypeConstant
     */
    private String userTypeConstantString;

    private String noChineseName;

    /**
     * @chineseName 注释中文名
     */
    private String chineseNameDoc;

    @ChineseName("注解中文名")
    private String chineseNameAnno;


    private String noMaxLength;

    /**
     * @maxLength 10
     */
    private String maxLengthDoc;

    @MaxLength("20")
    private String maxLengthAnno;

    private String noMinLength;

    /**
     * @minLength 10
     */
    private String minLengthDoc;

    @MinLength("20")
    private String minLengthAnno;

    private Integer noFormat;

    /**
     * @format long
     */
    private Integer formatDoc;

    @Format("long")
    private Integer formatAnno;

    private String noPattern;

    /**
     * @pattern ^\d{3}$
     */
    private String patternDoc;

    @Pattern("^\\d{4}$")
    private String patternAnno;

    private String noConst;

    /**
     * @const testDoc
     */
    private String constDoc;

    @Const("testAnno")
    private String constAnno;

    private String noReadOnly;

    /**
     * @readOnly
     */
    private String readOnlyDoc;

    @ReadOnly
    private String readOnlyAnno;


    private String noWriteOnly;

    /**
     * @writeOnly
     */
    private String writeOnlyDoc;

    @WriteOnly
    private String writeOnlyAnno;

    private String permitNull;

    /**
     * @notNull
     */
    private String permitNullDoc;

    @NotNull
    private String permitNullAnno;


    /**
     * @see EnumData
     */
    private String enumDataString;


    /**
     * @see EnumData
     */
    private EnumData enumDataSee;




}

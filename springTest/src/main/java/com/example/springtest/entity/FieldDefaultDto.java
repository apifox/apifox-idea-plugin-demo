package com.example.springtest.entity;

import com.example.springtest.anno.*;
import com.example.springtest.enumData.EnumData;
import com.example.springtest.enumData.UserTypeConstant;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 描述有问题
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FieldDefaultDto<T> implements Serializable {

    private List<T> data;

    private Object obj;

    private static final long serialVersionUID = -4607862808303533196L;


    private String price;//价格
    private String name;//名字
    private Integer age;//年龄

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
     *
     * @fieldDesc 描述一
     */
    private String descAnno;

    /**
     * 直接描述
     *
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
     * @null
     */
    private String permitNullDoc;

    @Null
    private Integer permitNullAnno;


    /**
     * @see EnumData#getAddress()
     */
    private String enumDataString;


    /**
     * @see EnumData#address
     */
    private String enumDataInteger;

    /**
     * @see EnumData
     */
    private EnumData enumDataSee;

    private EnumData address;

    private OpenDateEnum openDateEnum;


//    /**
//     * @writeOnly
//     */
//    private Case writeOnly;

    /**
     * @readOnly
     */
    private Case readOnly;


    /**
     * @fieldDoc 字段描述
     */
    private String fieldDoc;

    /**
     * @fieldDoc 字段描述数组
     */
    private List<String> fieldDocList;

    /**
     * 对象描述1
     *
     * @chineseName 注释中文名1
     */
    @FieldRequire
    @Null
    private FieldOrder desc1;

    /**
     * 对象描述2
     *
     * @chineseName 注释中文名2
     */
    @FieldIgnore
    private FieldOrder desc2;

    /**
     * 对象描述3
     *
     * @chineseName 注释中文名3
     */
    @FieldName("desc4")
    private FieldOrder desc3;

    @FieldRequire
    @Nullable
    private FieldOrder desc5;

    @FieldRequire
    @org.springframework.lang.Nullable
    private FieldOrder desc6;

    public String getPrice() {
        return price;
    }
}

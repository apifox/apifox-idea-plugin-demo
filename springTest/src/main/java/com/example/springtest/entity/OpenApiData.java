package com.example.springtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenApiData {

    /**
     * @fieldRequire
     */
    private Integer requireIn;

    private Integer noRequireIn;

    /**
     * @fieldRequire
     */
    private String requireStr;

    private String noRequireStr;

    /**
     * @default 100
     */
    private Integer defaultIn;

    private Integer noDefaultIn;

    /**
     * @default default
     */
    private String defaultStr;

    private String noDefaultStr;


    /**
     * @chineseName 中文名字
     */
    private Integer titleIn;

    private Integer noTitleIn;

    /**
     * @maxLength 100
     * @minLength 50
     */
    private String minAndMaxLengthIn;

    private String noMinAndMaxLengthIn;

    /**
     * @exclusiveMinimum 10
     * @minimun 10
     * @exclusiveMaximum 100
     * @maximum 100
     * @multipleOf 2
     */
    private Integer  minAndMaxIMUNIn;

    private Integer noMminAndMaxIMUNIn;

    /**
     * @deprecated
     */
    private Integer  deprecatedIn;

    private Integer noDeprecatedIn;

    /**
     * @minItems 12
     * @maxItems 23
     * @uniqueItems
     */
    private Integer[]  arrayIn;

    private Integer[] noArrayIn;

    /**
     * @format int64
     */
    private Integer formatIn;

    private Integer noFormatIn;


}

package com.example.springtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JavaValiData {

    @AssertFalse
    private Boolean assertFalse;
    private Boolean assertNoFalse;

    @AssertTrue
    private Boolean assertTrue;
    private Boolean assertNoTrue;

    @DecimalMax(value = "100.11")
    @DecimalMin(value = "20.11")
    private Integer decimalMaxInteger;
    private Integer decimalNoMaxInteger;

    @DecimalMax(value = "100.22")
    @DecimalMin(value = "20.22")
    private Double decimalMaxDouble;
    private Double decimalNoMaxDouble;

    @DecimalMax(value = "100.33",inclusive = false)
    @DecimalMin(value = "20.33",inclusive = false)
    private Float decimalMaxFloat;
    private Float decimalNoMaxFloat;

    /**
     * 最大数值给到了9位
     */
    @Digits(integer=11,fraction=2)
    private Integer digitsIntegerMax;
    private Integer digitsNoIntegerMax;

    @Digits(integer=8,fraction=2)
    private Integer digitsInteger;
    private Integer digitsNoInteger;

    /**
     * 最大数值给到了15位
     */
    @Digits(integer=20,fraction=20)
    private Double digitsDouble;
    private Double digitsNoDouble;

    @Digits(integer=9,fraction=14)
    private Float digitsFloat;
    private Float digitsNoFloat;



    @Max(value = 100)
    @Min(value = 10)
    private Integer maxInteger;
    private Integer maxNoInteger;

    @Max(value = 99)
    @Min(value = 81)
    private Double maxDouble;
    private Double maxNoDouble;

    @Max(value = 37)
    @Min(value = 21)
    private Float maxFloat;
    private Float maxNoFloat;

    @Negative()
    private Integer negativeInteger;
    private Integer negativeNoInteger;

    @Negative()
    private Double negativeDouble;
    private Double negativeNoDouble;

    @Negative()
    private Float negativeFloat;
    private Float negativeNoFloat;

    @NegativeOrZero()
    private Integer negativeOrZeroInteger;
    private Integer negativeOrZeroNoInteger;

    @NegativeOrZero()
    private Double negativeOrZeroDouble;
    private Double negativeOrZeroNoDouble;

    @NegativeOrZero()
    private Float negativeOrZeroFloat;
    private Float negativeOrZeroNoFloat;


    @Positive()
    private Integer positiveInteger;
    private Integer positiveNoInteger;

    @Positive()
    private Double positiveDouble;
    private Double positiveNoDouble;

    @Positive()
    private Float positiveFloat;
    private Float positiveNoFloat;

    @PositiveOrZero()
    private Integer positiveOrZeroInteger;
    private Integer positiveOrZeroNoInteger;

    @PositiveOrZero()
    private Double positiveOrZeroDouble;
    private Double positiveOrZeroNoDouble;

    @PositiveOrZero()
    private Float positiveOrZeroFloat;
    private Float positiveOrZeroNoFloat;


    @Size(max=30,min = 10)
    private String sizeString;
    private String sizeNoString;


    @Email()
    private String email;
    private String emailNo;

    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
    private String pattern;
    private String patternNo;



}

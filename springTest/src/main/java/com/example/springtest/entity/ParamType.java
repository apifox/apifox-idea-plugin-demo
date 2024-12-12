package com.example.springtest.entity;

import javax.validation.constraints.Max;
import java.util.List;

public record ParamType(
        @Max(value = 100)
        Integer aParamType,
        @Max(value = 101)
        Integer bParamType,
        char cParamType,
        Double dParamType,
        double eParamType,
        Float fParamType,
        float gParamType,
        Long hParamType,
        long iParamType,
        String[] a1ParamType,
        Character[] b1ParamType,
        char[] c1ParamType,
        Double[] d1ParamType,
        double[] e1ParamType,
        Float[] f1ParamType,
        float[] g1ParamType,
        Long[] h1ParamType,
        long[] i1ParamType,
        List<String> a2ParamType,
        List<Character> b2ParamType,
        List<Double> d2ParamType,
        List<Float> f2ParamType,
        List<Long> h2ParamType,
        List<ParamTypeData> paramTypeDatas1,
        ParamTypeData[] paramTypeDatas2
) {
}

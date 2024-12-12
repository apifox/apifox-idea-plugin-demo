package com.example.springtest.controller;

import com.example.springtest.entity.ParamType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/anyParamTypeController")
public class AnyParamTypeController {

    /**
     * anyParamType
     * @return
     */
    @PostMapping("/pathType/{a}/{b}/{c}/{d}/{e}/{f}/{g}/{h}/{i}/{a1}/{b1}/{c1}/{d1}/{e1}/{f1}/{g1}/{h1}/{i1}/{a2}/{b2}/{d2}/{f2}/{h2}/{paramType}/{paramType1}/{paramType2}/{paramType3}")
    public void pathType(
            @PathVariable(value = "a",required = false) String a,
            @PathVariable("b") Character b,
            @PathVariable("c") char c,
            @PathVariable("d") Double d,
            @PathVariable("e") double e,
            @PathVariable("f") Float f,
            @PathVariable("g") float g,
            @PathVariable("h") Long h,
            @PathVariable("i") long i,

            @PathVariable("a1") String[] a1,
            @PathVariable("b1") Character[] b1,
            @PathVariable("c1") char[] c1,
            @PathVariable("d1") Double[] d1,
            @PathVariable("e1") double[] e1,
            @PathVariable("f1") Float[] f1,
            @PathVariable("g1") float[] g1,
            @PathVariable("h1") Long[] h1,
            @PathVariable("i1") long[] i1,

            @PathVariable("a2") List<String> a2,
            @PathVariable("b2") List<Character> b2,
            @PathVariable("d2") List<Double> d2,
            @PathVariable("f2") List<Float> f2,
            @PathVariable("h2") List<Long> h2,
            @PathVariable("paramType") ParamType pa,
            @PathVariable("paramType1") ParamType[] pa1,
            @PathVariable("paramType2") List<ParamType> pa2,
            @PathVariable("paramType3") Map<ParamType, String> pa3
    ) {
    }

    @PostMapping("/queryType")
    public void queryType(
            @RequestParam(defaultValue = "100") String a,
            Character b,
            char c,
            Double d,
            double e,
            Float f,
            float g,
            Long h,
            long i,
            String[] a1,
            Character[] b1,
            char[] c1,
            Double[] d1,
            double[] e1,
            Float[] f1,
            float[] g1,
            Long[] h1,
            long[] i1,
            List<String> a2,
            List<Character> b2,
            List<Double> d2,
            List<Float> f2,
            List<Long> h2,
//            ParamType pa
//            ParamType[] pa1
            List<ParamType> pa2 //这3个是同一种效果写出来
    ) {

    }


    @PostMapping("/formType")
    public void formType(
            @ModelAttribute String a,
            @ModelAttribute Character b,
            @ModelAttribute char c,
            @ModelAttribute Double d,
            @ModelAttribute double e,
            @ModelAttribute Float f,
            @ModelAttribute float g,
            @ModelAttribute Long h,
            @ModelAttribute long i,
            @ModelAttribute String[] a1,
            @ModelAttribute Character[] b1,
            @ModelAttribute char[] c1,
            @ModelAttribute Double[] d1,
            @ModelAttribute double[] e1,
            @ModelAttribute Float[] f1,
            @ModelAttribute float[] g1,
            @ModelAttribute Long[] h1,
            @ModelAttribute long[] i1,
            @ModelAttribute List<String> a2,
            @ModelAttribute List<Character> b2,
            @ModelAttribute List<Double> d2,
            @ModelAttribute List<Float> f2,
            @ModelAttribute List<Long> h2,
//            ParamType pa
            @ModelAttribute ParamType[] pa1
//            @ModelAttribute List<ParamType> pa2
    ) {

    }

    @PostMapping("/bodyType")
    public List<ParamType> bodyType(
            @RequestBody ParamType[] pa1
    ) {
        return  null;
    }


}

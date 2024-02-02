package com.example.springtest.entity;

import com.example.springtest.anno.JsonRuleFieldDesc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonRuleFieldDesc("类的描述")
public class RuleClassDescAnno {

    private String desc;

}

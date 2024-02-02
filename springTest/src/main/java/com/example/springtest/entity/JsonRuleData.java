package com.example.springtest.entity;

import com.example.springtest.anno.JsonRuleFieldDesc;
import com.example.springtest.anno.JsonRuleFieldIgnore;
import com.example.springtest.anno.JsonRuleFieldName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonRuleData {

    private String jsonRuleIgnore;

    /**
     * @jsonRuleFieldIgnore true
     */
    private String jsonRuleIgnoreDoc;

    @JsonRuleFieldIgnore
    private String jsonRuleIgnoreAnno;

    private String jsonRuleName;

    /**
     * @jsonRuleFieldName jsonName1
     */
    private String jsonRuleNameDoc;

    @JsonRuleFieldName("jsonName2")
    private String jsonRuleNameAnno;

    private RuleClassDescAnno ruleClassDescAnno;
    private RuleClassDescDoc ruleClassDescDoc;



}

package com.demo.rule.execute;


import com.demo.rule.domain.AddressRule;
import com.demo.rule.domain.NationalityRule;
import com.demo.rule.dto.AgeRule;
import com.demo.rule.dto.RuleDto;

import java.util.Arrays;

/**
 * 测试类型
 *
 * @author sunx
 * @date 2021/4/22
 */
class RuleServiceTest {
    public static void main(String[] args) {
        //1. 定义规则  init rule
        NationalityRule nationalityRule = new NationalityRule();
        AddressRule addressRule = new AddressRule();
        AgeRule ageRule = new AgeRule();

        //2. 构造需要的数据 create dto
        RuleDto dto = new RuleDto();
        dto.setAge(18);
        dto.setName("蒙哥莫打我");
        dto.setAddress("天灾");

        //3. 通过以链式调用构建和执行 rule execute
        boolean ruleResult = RuleService
                .create()
                .and(Arrays.asList(nationalityRule, addressRule))
                .or(Arrays.asList(ageRule))
                .execute(dto);
        System.out.println("this student rule execute result :" + ruleResult);
    }
}
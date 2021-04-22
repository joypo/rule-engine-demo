package com.demo.rule.domain;

import com.demo.rule.base.AbstractRule;
import com.demo.rule.dto.NationalityRuleDto;
import com.demo.rule.dto.RuleDto;

import static com.demo.rule.constants.RuleConstant.MATCH_ADDRESS_START;
import static com.demo.rule.constants.RuleConstant.MATCH_NATIONALITY_START;

/**
 * 具体实现规则2
 *
 * @author sunx
 * @date 2021/4/22
 */
public class NationalityRule extends AbstractRule {
    @Override
    protected <T> T convert(RuleDto dto) {
        NationalityRuleDto nationalityRuleDto = new NationalityRuleDto();
        if (dto.getAddress().startsWith(MATCH_ADDRESS_START)) {
            nationalityRuleDto.setNationality(MATCH_NATIONALITY_START);
        }
        return (T) nationalityRuleDto;
    }

    @Override
    protected <T> boolean executeRule(T t) {
        System.out.println("NationalityRule invoke!");
        NationalityRuleDto nationalityRuleDto = (NationalityRuleDto) t;
        if (nationalityRuleDto.getNationality().startsWith(MATCH_NATIONALITY_START)) {
            return true;
        }
        return false;
    }
}

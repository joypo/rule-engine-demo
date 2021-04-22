package com.demo.rule.domain;

import com.demo.rule.base.AbstractRule;
import com.demo.rule.dto.RuleDto;

import static com.demo.rule.constants.RuleConstant.MATCH_ADDRESS_START;

/**
 * 具体实现的规则1
 *
 * @author sunx
 * @date 2021/4/22
 */
public class AddressRule extends AbstractRule {
    @Override
    public boolean execute(RuleDto dto) {
        System.out.println("AddressRule invoke!");
        if (dto.getAddress().startsWith(MATCH_ADDRESS_START)) {
            return true;
        }
        return false;
    }
}

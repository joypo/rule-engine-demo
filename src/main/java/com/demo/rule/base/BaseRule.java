package com.demo.rule.base;

import com.demo.rule.dto.RuleDto;

/**
 * @author sunx
 * @date 2021/4/22
 */
public interface BaseRule {
    /**
     * 执行
     *
     * @param dto
     * @return
     */
    boolean execute(RuleDto dto);
}

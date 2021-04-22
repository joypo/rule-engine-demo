package com.demo.rule.base;

import com.demo.rule.dto.RuleDto;

/**
 * @author sunx
 * @date 2021/4/22
 */
public abstract class AbstractRule implements BaseRule {

    /**
     * 数据转换
     *
     * @param dto
     * @param <T>
     * @return
     */
    protected <T> T convert(RuleDto dto) {
        return (T) dto;
    }

    /**
     * 执行
     *
     * @param dto
     * @return
     */
    @Override
    public boolean execute(RuleDto dto) {
        return executeRule(convert(dto));
    }

    /**
     * 执行具体规则
     *
     * @param t
     * @param <T>
     * @return
     */
    protected <T> boolean executeRule(T t) {
        return true;
    }
}

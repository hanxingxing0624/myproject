package com.hxx.aop;

import org.springframework.stereotype.Component;

@Component
public class MathCalcuator {

    public int plus(int i, int j) {
        return i + j;
    }

    public int div(int i, int j) {
        return i / j;
    }
}

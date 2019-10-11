package com.hxx.config;

import com.hxx.aop.MathCalcuator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPConfigTest {

    private AnnotationConfigApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
    }

    @Test
    public void test01() {
        MathCalcuator bean = applicationContext.getBean(MathCalcuator.class);
        int div = bean.div(1, 1);
        System.out.println(div+"111");
    }
}
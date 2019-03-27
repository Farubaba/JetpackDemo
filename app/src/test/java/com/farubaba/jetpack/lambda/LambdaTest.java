package com.farubaba.jetpack.lambda;

import com.farubaba.jetpack.demo.lambda.LambdaDemo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author farubaba
 * @date 2019/3/27 15:29
 */
public class LambdaTest {

    @Before
    public void before(){

    }

    @Test
    public void testLambda(){
        String value = LambdaDemo.invokeLambdaFuntion("Hello world", s -> s + " from Lambda");
        assertEquals("Hello world from Lambda",value);
    }
}

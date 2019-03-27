package com.farubaba.jetpack.demo.lambda;

/**
 * @author farubaba
 * @date 2019/3/27 15:30
 */
public class LambdaDemo {

    /**
     * 定义可以在调用时使用Lambda表达式的方法。
     * @param input
     * @param functionInterface1
     * @return
     */
    public static String invokeLambdaFuntion(String input, FunctionInterface1 functionInterface1){
        return functionInterface1.doFunction(input);
    }
}

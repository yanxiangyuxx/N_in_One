package com.yxy.sjms.factory;

/**
 * Created by syyanxiangyu on 14-12-8.
 */
public class Main {

    public static void main(String arg[]){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getOperation(1);

        System.out.println("加运算：" + operation.getResult(20, 30));
        operation = operationFactory.getOperation(2);
        operation.setNum1(2);
        operation.setNum2(3);

        System.out.println("减运算："+operation.getResult());
    }
}

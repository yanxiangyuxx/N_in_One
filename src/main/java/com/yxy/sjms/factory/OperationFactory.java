package com.yxy.sjms.factory;

/**
 * Created by syyanxiangyu on 14-12-8.
 */
public class OperationFactory {

    Operation operation;

    public Operation getOperation(int type){
        switch (type){
            case 1:
                operation = new AddOperation();
                break;
            case 2:
                operation = new SubOperation();
                break;
        }
        return  operation;
    }
}

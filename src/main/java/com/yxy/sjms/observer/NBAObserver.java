package com.yxy.sjms.observer;

/**
 * Created by syyanxiangyu on 2014/12/24.
 */
public class NBAObserver extends Observer {
    @Override
    public void update() {
        System.out.println("关闭NBA，开始工作");
    }
}

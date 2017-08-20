package com.dream.deffective.chapter1.item3;

/**
 * Singleton -- 公有成员是个静态工厂方法
 */
public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2(){}

    public static Elvis2 getInstance(){
        return INSTANCE;
    }

    public void leaveTheBuilding(){}
}

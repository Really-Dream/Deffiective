package com.dream.deffective.chapter1.item3;

/**
 * Singleton -- 公有静态成员是个final域
 */
public class Elvis {
    public static final Elvis INSTANCE  = new Elvis();
    private Elvis(){}

    public void leaveTheBuilding(){}

}

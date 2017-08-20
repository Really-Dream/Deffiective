package com.dream.deffective.chapter1.item1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态工厂方法 -- 与构造器相比的优势
 * 有名称
 * 不必在每次调用时候都创建一个新类
 * 可以返回原返回类型的任何子类型的对象
 * 在创建参数化类型实例的时候，使代码更简单
 *
 */
public class Services {
    private Services() {
    }

//    Java 5中支持高并发、高吞吐量的线程安全HashMap实现
    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        providers.put(name,p);
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p != null)
            throw new IllegalArgumentException("no provider registered with name: " + name + " ");
        return p.newService();
    }
}

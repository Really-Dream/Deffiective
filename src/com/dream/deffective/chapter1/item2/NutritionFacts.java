package com.dream.deffective.chapter1.item2;

/**
 * Builder模式 -- 好处
 * 既能保证重叠构造器的安全性
 * 也可以保证JavaBeans模式那么好的可读性
 */
public class NutritionFacts {
    private final int servingSize;
    private final int calories;

    public static class Builder{
        private final int servingSize;

        private int calories = 0;

        public Builder(int servingSize){
            this.servingSize = servingSize;
        }

        public Builder calories(int val){
            calories = val;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        calories = builder.calories;
    }

    public static void main(String args[]){
        Builder builder = new Builder(2);
        NutritionFacts nutritionFacts = new NutritionFacts(builder.calories(1));

        NutritionFacts cocaCola = new NutritionFacts.Builder(20).calories(10).build();
    }

}

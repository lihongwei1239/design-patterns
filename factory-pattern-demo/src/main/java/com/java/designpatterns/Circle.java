package com.java.designpatterns;

/**
 * 第2步：创建实现相同接口的具体类
 */
public class Circle implements Shape {
    
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

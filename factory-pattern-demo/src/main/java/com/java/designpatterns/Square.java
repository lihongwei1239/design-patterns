package com.java.designpatterns;

/**
 * 第2步：创建实现相同接口的具体类
 */
public class Square implements Shape {
    
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

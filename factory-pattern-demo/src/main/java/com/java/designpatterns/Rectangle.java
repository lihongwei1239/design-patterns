package com.java.designpatterns;

/**
 * 第2步：创建实现相同接口的具体类
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

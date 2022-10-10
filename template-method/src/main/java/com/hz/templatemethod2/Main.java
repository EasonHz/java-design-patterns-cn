package com.hz.templatemethod2;

/**
 * @author hz
 * @since 2022/10/10
 */
public class Main {
    public static void main(String[] args) {
        CarTemplate car = new SportsCar();
        car.manufactureCar();
        System.out.println("装配好的车辆信息: ");
        System.out.println("======================================================================");
        System.out.println(car);
        System.out.println("======================================================================");
    }
}

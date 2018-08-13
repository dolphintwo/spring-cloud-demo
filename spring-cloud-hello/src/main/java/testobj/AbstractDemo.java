package testobj;

/**
 * @author DolphinTwo
 * @date 2018/8/13
 */
public class AbstractDemo {
    public static void main(String[] args) {
        // Error:(9, 22) java: testobj.Employee是抽象的; 无法实例化
        // Employee e = new Employee("George W.", "Houston, TX", 43);
        // System.out.println("\n Call mailCheck using Employee reference--");
        // e.mailCheck();

        Employee e = new Salary("George W.", "Houston, TX", 43,4800);
        System.out.println("\n Call mailCheck using Salary reference--");
        e.mailCheck();
    }
}

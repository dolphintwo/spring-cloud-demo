package testobj;

/**
 * @author DolphinTwo
 * @date 2018/8/13
 */
public class Duotai {
    public static void main(String[] args) {
        show(new Cat());  // 以 Cat 对象调用 show 方法
        show(new Dog());  // 以 Dog 对象调用 show 方法

        FaAnimal a = new Cat();  // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
        Cat c = (Cat)a;        // 向下转型
        c.work();        // 调用的是 Cat 的 work
    }

    public static void show(FaAnimal a)  {
        a.eat();
        // 类型判断
        if (a instanceof Cat)  {  // 猫做的事情
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) { // 狗做的事情
            Dog c = (Dog)a;
            c.work();
        }
    }
}


abstract class FaAnimal {
    abstract void eat();
}

class Cat extends FaAnimal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends FaAnimal {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}
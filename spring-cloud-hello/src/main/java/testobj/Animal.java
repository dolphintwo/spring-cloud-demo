package testobj;

/**
 * @author DolphinTwo
 * @date 2018/8/13
 */
public class Animal {
    public String name;
    public int id;

    public Animal(String myName,int myId){
        name = myName;
        id = myId;
    }

    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}

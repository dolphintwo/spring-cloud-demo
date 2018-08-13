package testobj;

/**
 * @author DolphinTwo
 * @date 2018/8/13
 */
public class RunEncap {
    public static void main(String[] args) {
        Encap encap = new Encap();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.println("Name : " + encap.getName()+ " Age : "+ encap.getAge());
    }
}

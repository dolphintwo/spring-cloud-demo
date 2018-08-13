package testobj;

/**
 * @author DolphinTwo
 * @date 2018/8/13
 */
public class MammalInt implements Animal_itf {
    public void eat(){
        System.out.println("Mammal eats");
    }
    public void travel(){
        System.out.println("Mammal travel");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }

}

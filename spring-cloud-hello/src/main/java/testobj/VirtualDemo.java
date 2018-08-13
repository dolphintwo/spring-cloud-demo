package testobj;

/**
 * @author DolphinTwo
 * @date 2018/8/13
 */
public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("员工A","beijing",3,3600);
        Employee e = new Salary("员工B","shanghai",2,2400);
        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("\n使用 Employee 的引用调用 mailCheck--");
        e.mailCheck();
    }
}

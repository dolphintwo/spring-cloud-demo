package testobj;

/**
 * @author DolphinTwo
 * @date 2018/8/13
 */
public abstract class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number) {
        System.out.println("Employee 构造函数");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay()
    {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }
    public void mailCheck() {
        System.out.println("邮寄支票给： " + this.name
                + " " + this.address);
    }
    public String toString() {
        return name + " " + address + " " + number;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public int getNumber() {
        return number;
    }
}
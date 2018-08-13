package testobj;

/**
 * @author DolphinTwo
 * @date 2018/8/13
 */
public class Salary extends Employee{
    private double salary;

    public Salary(String name,String address,int number,double salary){
        super(name, address, number);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary>=0.0){
            salary = newSalary;
        }
    }

    public double computePay(){
        System.out.println("计算工资，付给："+getName());
        return salary/52;
    }
}

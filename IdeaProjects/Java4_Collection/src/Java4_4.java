import java.util.*;

class Employee implements Comparator<Employee> {

    public String name;
    public double salary;
    public double age;

    public Employee(String name, double salary, double age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.salary-e2.salary);
    }


}

class SalaryComparator implements Comparator<Employee>
{
    public int compare(Employee e1,Employee e2){

       return (int) (e2.salary-e1.salary);
    }
}
public class Java4_4 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Jatin", 20000, 21));
        list.add(new Employee("Naman", 60000, 23));
        list.add(new Employee("Manish", 50000, 22));

        Collections.sort(list,new SalaryComparator());

        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            Employee e=(Employee) itr.next();
            System.out.println(e.name+" "+e.salary+" "+e.age);
        }
    }
}
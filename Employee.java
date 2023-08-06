import java.util.*;

public class Employee
{
    public static void main (String[] args)
    {
        int i[3], s[3],a ;

        Scanner sc = new Scanner(System.in);
        for(a=1;a<=3;a++){
        System.out.println("Enter "+i+" ID");
        i[a]= sc.nextInt();
        System.out.println("Enter "+i+" salary");
        s[a]= sc.nextInt();
        }
        Salary e1 = new Salary();
        e1.getID(i[1]);
        e1.getsalary(s[1]) ;
        System.out.println("your 1 id"+e1.ID);
        System.out.println("your 1st salary"+e1.Salary);

        Salary e2 = new Salary();
        e2.getID(i[2]);
        e2.getsalary(s[2]) ;
        System.out.println(e2.ID);
        System.out.println(e2.Salary);

    }
}

class Salary
{
    int ID  ;
    int Salary ;
    String name ;
    void getID(int newID ) 
    {
        ID = newID; 
 
    }
    void getsalary(int newsalry)
    {
        Salary = newsalry;
    }
    void getname(String newname)
    {
        name = newname ;
    }

}
import java.util.Scanner;

class Faculty
{
    public void salary(int baseSalary)
    {
        System.out.println("Base Salary: " + baseSalary);
    }
}
class CSE extends Faculty
{

        public void salary(int baseSalary)
        {
        System.out.println("CSE Faculty: " + (baseSalary + 3000));
        }
}
class IT extends Faculty
{
        public void salary(int baseSalary)
        {
            System.out.println("IT Faculty: " + (baseSalary + 5000));
        }
}
class ECE extends Faculty
{
        public void salary(int baseSalary)
        {
            System.out.println("ECE Faculty: " + (baseSalary + 4500));
        }
}

class Main
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int baseSalary = sc.nextInt();
    if (baseSalary > 0){
        Faculty faculty = new Faculty();
        faculty.salary(baseSalary);
        CSE cse = new CSE();
        cse.salary(baseSalary);
        IT it = new IT();
        it.salary(baseSalary);
        ECE ece = new ECE();
        ece.salary(baseSalary);
    }
    
    else {
        System.out.println("null");
    }
    
    //implement your required concept here
    }
}
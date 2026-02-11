package Week_2;



//3. Create an abstract class Employee with: -
//• An abstract method calculateSalary()
//• A concrete method displayDetails()
//• Create two subclasses: -
//o FullTimeEmployee
//o PartTimeEmployee
//
//Override calculateSalary() in both classes and demonstrate runtime polymorphism.

abstract  class Employee
{
   abstract void  calculateSalary();
   public void displayDetails()
   {
       System.out.println("Display details...");
   }

}
class FullTimeEmployee extends Employee
{
        void calculateSalary()
        {
            System.out.println("Full-time Employeee");
        }

}
class PartTimeEmployee extends Employee
{
    void calculateSalary()
    {
        System.out.println("Part-time Employeee");

    }
}
public  class Program_3
{
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee();
        emp1.calculateSalary();
        emp1.displayDetails();

        Employee emp2 = new PartTimeEmployee();
        emp2.calculateSalary();
        emp2.displayDetails();
    }

}


package Week_2;
class demo_reference
{
   String name;
   int age;

    demo_reference(String name, int age)
    {
            this.name = name;
            this.age = age;

    }
    void  update_name(demo_reference obj1)
    {
        obj1.name = "Mahajan";
        System.out.println("Name after updation : "+name );
    }
}
public class Program_5 {
    int value =10;
    void update_value(int a)
    {
        System.out.println("Updated value: "+(value+a));
    }
    public static void main(String[] args)
    {
        Program_5 obj = new Program_5();
        System.out.println("Original value : " + obj.value);
        obj.update_value(20);
        demo_reference obj1 = new demo_reference("Vaishnavi",22);
        System.out.println("Before updation :"+ obj1.name);
        obj1.update_name(obj1);





    }


}

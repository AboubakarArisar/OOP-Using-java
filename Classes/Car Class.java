import java.util.Scanner;

class Car
{
    String name;
    int model;
    String Color;
    double price;

    void display()
    {
        System.out.println("Name of Car : "+name);
        System.out.println("Model of Car : "+model);
        System.out.println("Color of Car : "+Color);
        System.out.println("Price of Car : "+price);
    }
}
public class Practice
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name of Car : ");
        String name=sc.nextLine();
        System.out.print("Enter Model of Car : ");
        int model=sc.nextInt();
        System.out.print("Enter Color of Car : ");
        String Color=sc.next();
        System.out.print("Enter Price of Car : ");
        double price=sc.nextDouble();
        Car c=new Car();
        c.name=name;
        c.model=model;
        c.Color=Color;
        c.price=price;
        c.display();

    }
}

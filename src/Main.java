import java.util.Scanner;
public class Main {

public static void main (String[] arg)
{
    System.out.println("задание 1"+ '\n');
    Scanner input = new Scanner(System.in);
    Circle a = new Circle();
    a.setName("A");
    System.out.println("Введите радиус окружности А = ");
    a.setRadius(input.nextInt());

    Circle b = new Circle();
    b.setName("B");
    System.out.println("Введите радиус окружности B = ");
    b.setRadius(input.nextInt());

    System.out.println("Длинна окружности А = " + a.circLangth());
    System.out.println("Площадь окружности А = " + a.circSquare());

    System.out.println("задание 2"+ '\n');

    Head h1 = new Head();
    h1.setL(15);
    h1.setHair("Black");
    h1.setEye("Blue");

    Leg le1 = new Leg();
    le1.setFeetl(50.5);
    le1.setRazmer(43);
    Leg le2 = new Leg();
    le2.setRazmer(43);
    le2.setFeetl(50.4);

    Hand ha1 = new Hand();
    ha1.setHandlength(44.4);
    Hand ha2 = new Hand();
    ha2.setHandlength(44.3);

    Human John = new Human();
    John.name = "John";
    John.h1 =ha1;
    John.h2 = ha2;
    John.t = h1;
    John.l1 =le1;
    John.l2 = le2;

    System.out.println(John);
}

}


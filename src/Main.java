import java.util.Scanner;
public class Main {

public static void main (String[] arg)
{
    System.out.println("задание 1");
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

    System.out.println("задание 2");

    Head h1 = new Head();
    h1.setL(15);
    h1.setHair("Black");
    h1.setEye("Blue");

    Leg l1 = new Leg();
    l1.setFeetl(50.5);
    l1.setRazmer(43.2);
    Leg l2 = new Leg();
    l2.setRazmer(43.5);
    l2.setFeetl(50.4);

    Hand ha1 = new Hand();
    ha1.setHandl(44.4);
    Hand ha2 = new Hand();
    ha2.setHandl(44.3);

    Human John = new Human();

}

}
}

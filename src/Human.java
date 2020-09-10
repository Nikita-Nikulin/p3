public class Human {
    String name;
    Head t;
    Leg l1;
    Leg l2;
    Hand h1;
    Hand h2;

    public String toString()
    {
        String s ="Длинна головы человека " +t.l + '\n'+"Цвет волос человека "+t.hair+ '\n'+"Цвет глаз человека "+ t.eye+'\n';
        return  s;
    }


    Human() {
        t = new Head();
    }
}

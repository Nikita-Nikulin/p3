public class Human {
    String name;
    Head t;
    Leg l1;
    Leg l2;
    Hand h1;
    Hand h2;

    public String toString() {
        String s = "Имя челвека - " + name +'\n'+ "Длинна головы человека = " + t.l + '\n' + "Цвет волос человека - " + t.hair + '\n' + "Цвет глаз человека - " + t.eye + '\n'+
                "Длинна левой руки = "+ h1.handlength+'\n'+ "Длинна правой руки = "+h2.handlength+'\n' + "Длинна левой ноги = "+ l1.feetl+ '\n'+
                "Длина правой ноги = " + l2.feetl +'\n'+ "Размер обуви = " + l1.razmer;
        return s;
    }

}

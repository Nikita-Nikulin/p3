public class Circle {
    String name;
    int radius;

    public double circLangth(){
        return 2*3.14 * radius;
    }

    public double circSquare(){
        return 3.14 * (radius * radius);


    }

    public String toString()
    {
        String s = "Name of a Circle = " + name + '\n' + "Radius = " + radius + '\n';
        return  s;
    }
    public String getName(){
        return name;
    }
    public int getRadius() {
        return radius;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
}

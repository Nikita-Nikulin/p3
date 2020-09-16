public class Leg {

    double feetl;
    int razmer;

    public String toString()
    {
        String s ="Длинна = " + feetl + '\n' + "Размер обуви = " + razmer +'\n';
        return s ;
    }

    public double getFeetL(){
        return feetl;
    }
    public int getRazmer() {
        return razmer;
    }

    public void setFeetl(double feetl){
        this.feetl = feetl;
    }

    public void setRazmer(int razmer) {this.razmer = razmer;}


}

public class Head {
    int l;
    String hair;
    String eye;

    public String toString()
    {
        String s ="Длинна = " + l + '\n' + "Цвет волос = " + hair +'\n'+ "Цвет глаз = " + eye+ '\n';
        return  s;
    }

    public String getHair(){
        return hair;
    }
    public int getL() {
        return l;
    }
    public String getEye(){ return eye;    }
    public void setHair(String hair){
        this.hair = hair;
    }
    public void setL(int l){
        this.l = l;
    }
    public void setEye(String eye) {this.eye = eye;}


}

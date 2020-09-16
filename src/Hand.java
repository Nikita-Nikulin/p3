public class Hand {
    double handlength;


    public String toString()
    {
        String s ="Длинна = " + handlength + '\n';
        return s;
    }

    public double getHandlength(){
        return handlength;
    }

    public void setHandlength(double handlength){
        this.handlength = handlength;
    }

}

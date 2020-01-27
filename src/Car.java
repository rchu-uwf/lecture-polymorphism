

public class Car {

    private String color;
    private String make;
    private int mpg;

    Car() {
        this.color = "grey";
        this.make = "Jalopy";
        this.mpg = -1;
    }

    Car(String color, String make, int mpg) {
        this.color = color;
        this.make = make;
        this.mpg = mpg;
    }

    public String getMPG(){
        if (this.mpg == -1){
            return "Unknown";
        } else {
            return "" + this.mpg;
        }
    }

    public void setMPG(int newMPG) {
        this.mpg = newMPG;
    }

    public void paint(String newColor){
        this.color = newColor;
    }

    public String toString(){
        return "[color=" + this.color + ", make=" + this.make + ", mpg=" + this.getMPG() + "]";
    }



}
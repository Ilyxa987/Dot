package com.company;

public class Ndot {

     private float x;
     private float y;
     private String a = "Black";

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public String getA() {
        return a;
    }

    public Ndot goRight(float n){
        Ndot rez = new Ndot();
        rez.x = this.x + n;
        rez.y = this.y;
        return rez;
    }

    public Ndot goLeft(float n){
        Ndot rez = new Ndot();
        rez.x = this.x - n;
        rez.y = this.y;
        return rez;
    }

    public Ndot goUp(float n){
        Ndot rez = new Ndot();
        rez.x = this.x;
        rez.y = this.y + n;
        return rez;
    }

    public Ndot goDown(float n){
        Ndot rez = new Ndot();
        rez.x = this.x;
        rez.y = this.y - n;
        return rez;
    }

    public Ndot color(String a){
        Ndot rez = new Ndot();
        rez.x = this.x;
        rez.y = this.y;
        switch (a){
            case "Red":
                a = "Red"; break;
            case "White":
                a = "White"; break;
            case "Blue":
                a = "Blue"; break;
            case "Green":
                a = "Green"; break;
            case "Yellow":
                a = "Yellow"; break;
                default:
                    a = "Black";
        }
        rez.a = a;
        return rez;
    }

    @Override
    public String toString() {
        return (x + ", " + y + "\n" + a);
    }
}

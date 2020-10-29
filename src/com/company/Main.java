package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    Ndot dot = new Ndot();
        dot.setX(0);
        dot.setY(0);
        Ndot dot1 = new Ndot();
        dot1 = dot.color(in.next());
        System.out.println(dot.goDown(5));
        System.out.println(dot1);
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    Scanner no.Walls =new

    Scanner(System.in);
            System.out.println("Enter Number of Walls");
    double no.Walls =(double)no.Walls.nextDouble();

    double totalArea = 0;
    if i<no.Walls

    {
        public static void main (String[]args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Width(Meters)");
        double width = (double) input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Height(Meters)");
        double height = (double) input2.nextDouble();

        double area = width * height;
        System.out.println("Area of Wall is " + area + "Meters^2");

        double totalArea = totalArea + area;
    }

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Area Per Tin");
        double areaPerTin = (double) input3.nextDouble();

        int noOfTins = (int) ((Math.round(area / areaPerTin)) + Math.ceil((area % areaPerTin) / areaPerTin));
        System.out.println("The number of tin(s) required is " + noOfTins);
    }
}

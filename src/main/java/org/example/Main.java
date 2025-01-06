package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
     return isBarking && ((clock >= 18 && clock <= 24) || (clock >= 0 && clock < 8) );
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return (firstAge > 13 && firstAge <= 19) || (secondAge > 13 && secondAge <= 19) || (thirdAge > 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     if(isSummer) {
         return temp > 25 && temp < 45;
     }
     return temp >= 25 && temp <= 35;
    }

    public static double area(double width, double height) {
       return width * height < 0 ? -1 : width * height;
    }

    public static double area(double radius) {
       return radius < 0 ? -1 : radius*radius*Math.PI;
    }
}

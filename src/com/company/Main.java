package com.company;

public class Main {

    public static void main(String[] args) {

        printMyName();
        System.out.println("Rezultatul adunarii este: " + adunare(2,3));
        System.out.println("Rezultatul scaderii este: " + scadere(2,3));
        System.out.println("Rezultatul inmultirii este: " + inmultire(2,-3));
        System.out.println("Rezultatul impartire este: " + impartire(5,3));
        System.out.println(concatenare("    j    a   v     v  a\n", "    j   a  a  v   v  a  a\n" ," j  j  aaaaaa  v v  aaaaaa\n" ,"  jj  a      a  v  a      a",""));
        System.out.println("Rezultatul mediei este: " + media(5,3,8));
        System.out.println(concatenare(" +\"\"\"\"\"\"\"+\n", "[ | o o | ]\n" ,"  |  ^  |\n" ,"  | '_' |\n","  +-----+ "));
        System.out.println("Restul este: " + modulo(7,3));
        System.out.println("temperatura in Celsius este: " + celsius(123));
        System.out.println("distanta in metri este: " + metru(65));
        System.out.println("viteza este: " + viteza(2100,1, 5, 59)+" m/s");
        System.out.println("viteza este: " + viteza2(2100,1, 5, 59)+" km/h");
        System.out.println("viteza este: " + viteza3(2100,1, 5,59)+" mile/h");
    }


    public static void printMyName(){

        System.out.println("Hello \nNicu");

    }

    public static int adunare(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;

    }

    public static int scadere(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar - alDoileaNumar;

        return rezultat;

    }

    public static int inmultire(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar * alDoileaNumar;

        return rezultat;

    }

    public static double impartire(double primulNumar, int alDoileaNumar){

        double rezultat = primulNumar / alDoileaNumar;

        return rezultat;

    }

    public static String concatenare(String s1, String s2, String s3, String s4, String s5){

        String rezultat = s1+s2+s3+s4+s5;

        return rezultat;

    }

    public static Double media(double a1, int a2, int a3){

        Double rezultat = (a1+a2+a3)/3;

        return rezultat;

    }

    public static int modulo(int a1, int a2){

        int rezultat = a1%a2;

        return rezultat;

    }

    public static double celsius(double a1){

        double rezultat = (a1-32)*5/9;

        return rezultat;

    }

    public static double metru(double a2){

        double rezultat = a2*0.0254;

        return rezultat;

    }

    public static double viteza(double a1, int h, int m, int s){

        double t = (h*3600)+(m*60)+s;

        double rezultat = a1/t;

        return rezultat;

    }

    public static double viteza2(double a1, int h, int m, int s){

        double t = (h*3600)+(m*60)+s;

        double rezultat = (a1/1000)/(t/3600);

        return rezultat;

    }

    public static double viteza3(double a1,  int h, int m, int s){

        double t = (h*3600)+(m*60)+s;

        double rezultat = (a1/1609)/(t/3600);

        return rezultat;

    }

}

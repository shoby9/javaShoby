package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(2,3);
        String comparare = op.comparare("FastTrackIT");
        String comparare1 = op.comparare1("FastTrackIT", 3);
        String comparare2 = op.comparare2(6);
        String comparare3 = op.comparare3(-123);
        int number = op.switch1(12);
        boolean number2=op.isNumberEven(123);
        boolean number3=op.isEligibleToVote(67);
        int maxim = op.maxim(7,118,89);


        System.out.println("Rezultatul adunarii este: " + calculator.adunare(2,3));
        System.out.println("Rezultatul scaderii este: " + calculator.scadere(2,3));
        System.out.println("Rezultatul inmultirii este: " + calculator.inmultire(2,-3));
        System.out.println("Rezultatul impartire este: " + calculator.impartire(5,3));
        System.out.println(calculator.concatenare("    j    a   v     v  a\n", "    j   a  a  v   v  a  a\n" ," j  j  aaaaaa  v v  aaaaaa\n" ,"  jj  a      a  v  a      a",""));
        System.out.println("Rezultatul mediei este: " + calculator.media(5,3,8));
        System.out.println(calculator.concatenare(" +\"\"\"\"\"\"\"+\n", "[ | o o | ]\n" ,"  |  ^  |\n" ,"  | '_' |\n","  +-----+ "));
        System.out.println("Restul este: " + calculator.modulo(7,3));
        System.out.println("temperatura in Celsius este: " + calculator.celsius(123));
        System.out.println("distanta in metri este: " + calculator.metru(65));
        System.out.println("viteza este: " + calculator.viteza(2100,1, 5, 59)+" m/s");
        System.out.println("viteza este: " + calculator.viteza2(2100,1, 5, 59)+" km/h");
        System.out.println("viteza este: " + calculator.viteza3(2100,1, 5,59)+" mile/h");

        System.out.println("Rezultatul comparari este: " + biggest);
        System.out.println("Rezultatul comparari este: " + comparare);
        System.out.println("Rezultatul comparari este: " + comparare1);
        System.out.println(comparare2);
        System.out.println(comparare3);
        System.out.println("The number is:"+number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(maxim);
    }

  public static class Calculator {
    public  void printMyName() {

        System.out.println("Hello \nNicu");

    }

    public  int adunare(int primulNumar, int alDoileaNumar) {

        return primulNumar + alDoileaNumar;

    }

    public  int scadere(int primulNumar, int alDoileaNumar) {

        return primulNumar - alDoileaNumar;

    }

    public  int inmultire(int primulNumar, int alDoileaNumar) {

        return primulNumar * alDoileaNumar;

    }

    public double impartire(double primulNumar, int alDoileaNumar) {

        return primulNumar / alDoileaNumar;

    }

    public  String concatenare(String s1, String s2, String s3, String s4, String s5) {

        return s1 + s2 + s3 + s4 + s5;

    }

    public Double media(double a1, int a2, int a3) {

        return (a1 + a2 + a3) / 3;

    }

    public  int modulo(int a1, int a2) {

        return a1 % a2;

    }

    public  double celsius(double a1) {

        return (a1 - 32) * 5 / 9;

    }

    public  double metru(double a2) {

        return a2 * 0.0254;

    }

    public  double viteza(double a1, int h, int m, int s) {

        double t = (h * 3600) + (m * 60) + s;

        return a1 / t;

    }

    public  double viteza2(double a1, int h, int m, int s) {

        double t = (h * 3600) + (m * 60) + s;

        return (a1 / 1000) / (t / 3600);

    }

    public double viteza3(double a1, int h, int m, int s) {

        double t = (h * 3600) + (m * 60) + s;

        return (a1 / 1609) / (t / 3600);

    }
  }
  public static class LogicalOp {

    public int checkBiggerNumber(int a1, int a2) {
        if (a1 > a2) {
            return a1;
        } else {
            return a2;
        }
    }
    public String comparare(String a){

      if( a.equals("FastTrackIT")) {
          return("Learning text comparison");
      } else {
          return ("Got to try some more");
      }
    }
    public String comparare1(String a, int b) {
        if(a.equals("FastTrackIT") & b<=3) {
          return a+b;
        }else{
            return b+a;
        }
    }

    public String comparare2(int a){
      if((a > 8) || (a == 6)){
          return ("The amount of snow this winter was(cm):"+ a);
      }else{
          return ("The forecast snow is(cm):"+ a);
      }
    }

    public String comparare3(int a){
        if((a > 3) && !(a == 4)){
            return ("The number is greater than 3 and not equal to 4");
        }else if(a==4){
            return ("The number is equal to 4");
        }else if(a<3){
            return ("The number is lower than 3");
        }
        return null;
    }

    public int switch1(int number){
        switch(number){
            case 1:
                System.out.println("The number is:"+ number);
                break;
            case 2:
                System.out.println("The number is:"+ number);
                break;
            case 3:
                System.out.println("The number is:"+ number);
                break;
        }
        return 1000000;
    }

    public Boolean isNumberEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
      public Boolean isEligibleToVote(int a){
          if(a>=18){
              return true;
          }else {
              return false;
          }
    }

    public int maxim(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if (b >= a && b >= c){
            return b;
        }else{
            return c;
        }
    }

  }
}



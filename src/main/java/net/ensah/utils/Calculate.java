package net.ensah.utils;

public class Calculate {

       private int a;
       private int b;

       public Calculate(int a,int b){
           this.a = a;
           this.b = b;
       }

       public int calculate(Opertaion opertaion){
           return switch (opertaion){
               case SUM -> a+b;
               case DIV -> a/b;
               case MULTIPLICATION -> a*b;
               case MINUS -> a - b;
           };
       }


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
           this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

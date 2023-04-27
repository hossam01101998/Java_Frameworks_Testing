package hossam;

public class Calculator {
    public static boolean isEven(int input){
        System.out.println(input);
        return input%2==0;

    };
    public static double surfaceCircle (double radius){
        double result = radius * radius * Math.PI;
        System.out.println(result);
        return result;
    }

    //OEFENING 1:
    public static double power (double x, double e){
        double result = Math.pow(x,e);
        return result;
    }
    //OEFENING 2:
    public static double divide (double x, double y){
        if (y==0.0){
            throw new ArithmeticException("/ by 0");
        }
        System.out.println(x/y);
        return x/y;
    }
    //OEFENING 3:
    public static int factorial (int x){
        int result = 1;
        for (int i=0;i<x;i++){
            result = result * (i+1);
        }
        System.out.println(result);
        return result;
    }
}

// this code contains functions of add ,subtract , multiply , divide 

public class operators {
    
    static int add(int a,int b){return a+b;}
    static int subtract(int a,int b){return a-b;}
    static int multiply(int a,int b){return a*b;}
    static int divide(int a,int b){return a/b;}

    public static void main(String[] args)
    {
        System.out.println("sum = " + add(5,4));
        System.out.println("subtract = " + subtract(90, 80));
        System.out.println("multiply = " + multiply(5,8));
        System.out.println("division = " + divide(70, 60));
    }

}
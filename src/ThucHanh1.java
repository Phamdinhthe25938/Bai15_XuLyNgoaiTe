import java.util.Scanner;

public class ThucHanh1 {

    public static  void solveTheEquation(int a,int b){
        if(a!=0){
            float c = (float) b/a;
            System.out.println("result of equation:"+c);
        }
        else
            System.out.println("Equation is not result!");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a :");
        int a = sc.nextInt();
        System.out.println("Input b:");
        int b = sc.nextInt();
        solveTheEquation(a,b);
    }
}

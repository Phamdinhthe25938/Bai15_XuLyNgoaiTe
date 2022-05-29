import java.util.Scanner;

public class ThucHanh3 {
    public static void calculate(int a,int b){
       try {
           int total =  a+b;
           int brand = a-b;
           int volume= a*b;
           int love= a/b;
//           int aư=1/0;
           System.out.println("Total:"+total);
           System.out.println("Brand:"+brand);
           System.out.println("Volume:"+volume);
           System.out.println("Love :"+love);
       }
       catch (Exception e){
           System.out.println("Program exception occurs!:"+e.getMessage());
       }
    }

    public static void main(String[] args) {
      //  try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a:");
        int a= sc.nextInt();
            System.out.println("Input b:");
        int b = sc.nextInt();
            calculate(a,b);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}

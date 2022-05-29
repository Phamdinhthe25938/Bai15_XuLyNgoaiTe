import java.util.Scanner;

public class mainCheckTriangle {

//    public static void main(String[] args) {
//        try{
//            int arr[] = new int[5];
//            arr[5] = 4;
//            System.out.println("arr[5] = " + arr[5]);
//        } catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex);
//        } finally {
//            System.out.println("Khối lệnh finally luôn được thực thi");
//        }
//
//        System.out.println("Finished!");
//    }
//    public static void main(String[] args) {
//        try {
//            try {
//                int zero = 0;
//                int average = 10 / zero;
//                System.out.println("Average = " + average);
//            } catch (ArithmeticException ex) {
//                System.out.println(ex);
//            }
//            System.out.println("Continue...");
//            int arr[] = new int[5];
//            arr[5] = 4;
//            System.out.println("arr[5] = " + arr[5]);
//
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println(ex);
//        }
//
//        System.out.println("Finished!");
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       TriangleEdgesCheck check = new TriangleEdgesCheck();
       try {
           System.out.println("Input side 1:");
           double side1= sc.nextDouble();
           System.out.println("Input side 2:");
           double side2= sc.nextDouble();
           System.out.println("Input side 3:");
           double side3= sc.nextDouble();
           try {
               check.checkTriangleEdges(side1,side2,side3);
           } catch (TriangleEdgesException e) {
               System.out.println(e.getMessage());
           }
       } catch (RuntimeException e) {
           throw new RuntimeException(e);
       }
    }
}

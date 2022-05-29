import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BaiDocXuLyNgoaiTe {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>() ;
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.get(1));
        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Input a:");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.println("Input b:");
//            int b = Integer.parseInt(scanner.nextLine());
//            int result = a / b;
//            System.out.println(a + "/" + b + "=" + result);
//
//        }
////            bắt lỗi khi nhập khác kiểu dữ liệu!
////        Exception là khối bắt ngoại lệ lớn nhất bắt đc tất cả ngoại lệ có thể xảy ra vì nó luôn phải đặt
////        sau nh khối catch có nh ngoại lệ củ thể(vì nếu để trc thì nó sẽ
////        hứng hết tất cả ngoại lệ và tk catch k thể hứng đc nx )
//        catch (Exception e){
//            System.out.println("input error");
//            e.printStackTrace();
        }
//        Bắt lỗi khi phép tính k thể chạy kết quả  vì lỗi dũ liệu!
//        catch (ArithmeticException e){
//            System.out.println("Arithmetic error");
//        }

    }
//}

import java.util.Random;
import java.util.Scanner;

public class ThucHanh2 {
    public static  int[] creatArrayRandom(){
        Random rd = new Random();
        int arrayInt[]= new int[100];
        for(int i =0;i<100;i++){
            arrayInt[i]=rd.nextInt(100);
            System.out.print(arrayInt[i]+" ");
        }
        return arrayInt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[]=creatArrayRandom();
        System.out.println("");
        System.out.println("Input 1 index of elements you want search:");
        int  index = sc.nextInt();
        try {
            System.out.println("Element but you want find:"+array[index]);
        }
//        Ngoại lệ bắt đc vị trí không hợp lệ trong mảng !
        catch (IndexOutOfBoundsException e){
            System.out.println("Index is not invalid");
        }
    }
}

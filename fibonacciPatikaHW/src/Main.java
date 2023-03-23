import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result =0;

        Scanner keyb = new Scanner(System.in);

        System.out.print("Fibonacci serisi kaç elemanlı olacak?\nGiriniz\t:");
        int N = keyb.nextInt();

        int[] arrFib = new int[10];

        arrFib[0]=0;
        arrFib[1]=1;

        for(int i=2;i<10;i++){

            arrFib[i] =arrFib[i-1]+ arrFib[i-2];
        }

        for(int j=0;j< arrFib.length;j++){

            System.out.print(arrFib[j]+" ");
        }







    }
}
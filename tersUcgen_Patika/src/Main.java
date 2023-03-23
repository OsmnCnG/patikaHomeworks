import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner keyboard= new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz\t:");
        int N = keyboard.nextInt();

        int count=0;

        for(int i=0;i<100*N;i++){
            for(int j=0;j<2*N+1;j++){
                System.out.print("*");
            }
            count++;
            System.out.print("\n");
            for (int k=0;k<count;k++){
                System.out.print(" ");
            }
            N--;
            if(N==0){
                System.out.print("*");
                break;
            }
        }


    }
}
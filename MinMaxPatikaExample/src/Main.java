import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("Kaç sayı girilecek?");

        Scanner keyboard = new Scanner(System.in);

        int N= keyboard.nextInt();

        int[] arr = new int[N];

        for(int i=0;i<N;i++){

            System.out.println((i+1)+". Sayı\t:");
            arr[i]= keyboard.nextInt();

        }



        System.out.println("En büyük sayı\t:"+Maximum(arr));
        System.out.println("En küçük sayı\t:"+Minimum(arr));



    }

    public static void Print(int value){

        System.out.println(value);

    }

    public static int Maximum(int[] arr){

        int maxVal=arr[0];

        for(int i=1;i<arr.length;i++){

            if (arr[i] >arr[i-1]){
                maxVal= arr[i];
            }

        }

        return maxVal;
    }

    public static int Minimum(int[] arr){

        int minVal=arr[0];

        for(int i=1;i<arr.length;i++){

            if (arr[i] <arr[i-1]){
                minVal= arr[i];
            }

        }

        return minVal;
    }




}
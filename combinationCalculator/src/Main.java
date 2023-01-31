import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.println("n\t:");
        int n= keyboard.nextInt(); // kümenin eleman sayısı
        System.out.println("r\t:");
        int r=keyboard.nextInt();  // r elemanlı farklı gruplar


        double result=0;

        result = factorial(n)/ (factorial(r)*factorial(n-r));

        System.out.println("N elemanlı bir kümenin r'li kombinasyonlarının sayısı");

        System.out.println("C("+n+","+r+")\t="+result);


    }


    public static double factorial(int n){
        double result=1;
        if(n==0){
            return 1;
        }

        int count=n;
        for(int i=1;i<=count;i++){
            result= result * i;
        }

        return result;
    }



}
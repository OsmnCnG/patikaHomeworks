import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Kuvveti alınacak sayı\t:");
        int number= keyboard.nextInt();
        System.out.print("Kuvvet\t\t:");
        int power = keyboard.nextInt();

        int result=1;

        for(int i=0; i<power;i++){
            result= result * number;
        }

        if(power==0 && number==0){
            System.out.println(number+"^"+power+"\t="+"Belirsizdir!");
        }else{
            System.out.println(number+"^"+power+"\t="+result);
        }


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean isPrime=false;

        int num;

        do{

                System.out.print("Enter the number\t:");
                num = keyboard.nextInt();

                if(num==1){

                    isPrime=false;;

                }
                else if(num==2){


                    isPrime=true;

                }
                else{
                    for(int i=2; i<num; i++){



                        if(num%i==0){

                            isPrime=false;
                            break;
                        }else{

                            isPrime=true;

                        }

                    }
                }

                if(isPrime==false){
                    System.out.println("The number is Not a prime number.");
                }else if(isPrime==true){
                System.out.println("The number is a prime number.");
                }


        }


        while(num!=-1);
    }

}
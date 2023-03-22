import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Dizinin Boyutu\t:");
        int i= keyboard.nextInt();


        int[] array=new int[i];


        System.out.println("Dizinin elemanlarını giriniz:\t:");

        for(int j=0;j<i;j++){
            System.out.print(j+1+". Elemanı\t:");
            array[j]= keyboard.nextInt();
        }



        int temp ;
        for (int x = 0 ; x < array.length; x++){
            for (int y = 1 ; y < (array.length - x) ; y++){     //dizi.lenght - i dememin nedeni buble sorth yaparken en büyük eleman sona gidiyor bu yüzden sondaki elemanı bişey le kıyaslamamıza gerek yok
                if (array[y-1]>array[y]){
                    temp = array[y-1] ;  // yeri değişecek büyük elemanı buna atıyoruz kaybolmaması için
                    array[y-1]=array[y];   // küçük elemanı büyük elemanın yerine tanımlıyoruz
                    array[y] = temp ;     // hafızaya attığımız büyük elemanı yeni yerine koyuyoruz
                }
            }
        }




        System.out.print("Sıralama\t:");
        for(int l=0;l<i;l++){

            System.out.print(array[l]+" ");

        }



    }
}
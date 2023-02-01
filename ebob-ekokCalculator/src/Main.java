


public class Main {
    public static void main(String[] args) throws Exception {


        double ebob=Ebob(1,7);
        double ekok=Ekok(1,7);

        System.out.println("EBOB\t:"+ebob);

        System.out.println("EKOK\t:"+ekok);
    }


    public static double Ebob(double number,double number2) throws Exception {

        double i=1;
        double ebob=0;

        while(true) {
            if(number==0 || number2==0)
            {
                //System.out.println("0 ile bir sayının ebobu hesaplanamaz.");

                throw new RuntimeException("cannot be calculated");
            }
            if(number%i== 0 && number2%i== 0){
                ebob=i;
            }
            if(number==i || number2==i){
                break;
            }
            i++;


        }

        return ebob;



    }

    public static double Ekok(int number,int number2) throws Exception {

        Ebob(number,number2);
        return (number*number2)/Ebob(number,number2);

    }

}
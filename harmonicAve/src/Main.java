public class Main {


    public static void main(String[] args) {

        double[] arr = {10,20,30,40};
        double harmonicAverage;

        harmonicAverage=harmonicFunc(arr);


        System.out.println("Verilen dizinin harmonik ortalaması\t:"+ harmonicAverage);
    }


    public static double harmonicFunc(double[] arr) {
        double total=0.0;
        for(int i=0;i<arr.length;i++){
            total += 1.0/arr[i];
        }
        double res = arr.length/ total;
        return res;
    }






}
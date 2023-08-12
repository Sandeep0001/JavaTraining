package programs;

public class PrintPowerOfValue {

    static double pow(int a, int b){

        if(b==0){
            return 1;
        }

        if(b>0) {
            return a * pow(a, b - 1);
        }else{
            double d = 1.0 / a * pow(a, b+1);
            return d;
        }

    }

    public static void main(String[] args) {

        System.out.println(pow(2, 4)); //16

        System.out.println(pow(3,-3)); //0.037037037037037035

    }


}

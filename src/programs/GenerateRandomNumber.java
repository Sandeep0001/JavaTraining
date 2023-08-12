package programs;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {

    /**
     * Generate random number in Java
     * 1. Random class
     * 2. Math.random()
     * 3. ThreadLocalRandom (class got added after JDK 1.7)
     *
     * Use cases: RandomNumber in email : test123@gmail.com, phone number etc...
     *
     * */

    public static void main(String[] args) {

        Random random = new Random();

        for (int i=1; i<=5;i++) {
            System.out.println("random int : " + random.nextInt());
            System.out.println("random double : " + random.nextDouble());
            System.out.println("random float : " + random.nextFloat());
            System.out.println("random boolean : " + random.nextBoolean());
        }
        /*random int : -395492827
        random int : 1278660785
        random int : -2127058073
        random int : 952943524
        random int : 982928988*/

        System.out.println("----------------------------------------------------------");

        //2 Math.random()
        for (int i=0;i<=5;i++){
            System.out.println(Math.random()); // this gives random doubles
        }

        /**
         * 0.5319511333912708
         * 0.7287451059154055
         * 0.3734766409445224
         * 0.01345272454059454
         * 0.22866018842376445
         * 0.8889932994245717*/

        System.out.println("----------------------------------------------------------------");
        for (int i=0;i<=5;i++){
            System.out.println(ThreadLocalRandom.current().nextInt());
            System.out.println(ThreadLocalRandom.current().nextFloat());
        }


        System.out.println("--------------------------range---------------------------------------");

        for (int i=0; i<=5;i++) {
            System.out.println(random.nextInt(2000));// it will generate numbers between 0 to 20
            System.out.println((int) (Math.random() * 50));// it will generate numbers between 0 to 50
            System.out.println(ThreadLocalRandom.current().nextInt(0,20));

        }

    }


}

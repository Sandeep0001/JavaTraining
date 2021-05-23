package JavaBasicPrograms;

import java.util.StringJoiner;

public class StringJoinerConcept {

    //What is StringJoiner?  --> JDK 1.8

    public static void main(String[] args) {

        //Rama, Sita, Lakshmana

        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add("Rama")
                .add("Sita")
                .add("Lakshmana");

        System.out.println(joiner.toString()); //[Rama,Sita,Lakshmana]


    }

}

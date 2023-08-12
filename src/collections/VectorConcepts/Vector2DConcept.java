package collections.VectorConcepts;

import java.util.Vector;

public class Vector2DConcept {

    public static void main(String[] args){

        Vector<String> langVector = new Vector<>();

        langVector.add("Java");
        langVector.add("Python");
        langVector.add("Ruby");
        langVector.add("C#");

        Vector osVector = new Vector();
        osVector.add(langVector); //0th position

        for(int i=0; i<langVector.size();i++){
            String str = (String)((Vector)osVector.get(0)).get(i); //Casting
            System.out.println(str);
            /**
             * Java
             * Python
             * Ruby
             * C#
             */
        }

    }

}

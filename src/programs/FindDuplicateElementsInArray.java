package programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementsInArray {

    public static void main(String[] args){

        String infra[] = {"Amazon", "Flipkart", "PhonePe", "Amazon"};

        //1. Brute force
        //2. HashSet
        //3. HashMap<k,v>
        //4. Streams


        //-------------------------------------------------------------------------------

        System.out.println("***********Brute force***********");
        for (int i=0; i< infra.length; i++){
            for(int j=i+1; j< infra.length; j++){
                if (infra[i].equals(infra[j])){
                    System.out.println(infra[i]); //Amazon -> O(n^2)
                }
            }
        }

        //----------------------------------------------------------------------------

        System.out.println("******HashSet************");
        Set<String> data = new HashSet<>();
        for (String e : infra){
            if (data.add(e) == false){
                System.out.println(e); //Amazon
            }
        }


        //---------------------------------------------------------------------------

        System.out.println("***********HashMap************");
        Map<String, Integer> infraMap = new HashMap<>();
        for (String e : infra){
            Integer count = infraMap.get(e);
            if (count==null){
                infraMap.put(e, 1);
            }else{
                infraMap.put(e, ++count);
            }
        }

        //print all the duplicate elements:
        Set<Map.Entry<String, Integer>> entrySet = infraMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey()); //Amazon
            }
        }

        //---------------------------------------------------------------------------------------

        System.out.println("***********Stream set and filter**********");

        Set<String> dataSet = new HashSet<>();

        Set<String> dupSet =
                Arrays.asList(infra).stream().filter(e -> !dataSet.add(e)).collect(Collectors.toSet());
        System.out.println(dupSet); //[Amazon]


        //--------------------------------------------------------------------------------

        System.out.println("***********Streams grouping by**********");

        Set<String> elementSet = Arrays.asList(infra)
                .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

        System.out.println(elementSet); //[Amazon]


        //--------------------------------------------------------------------------

        System.out.println("***********Streams using frequency**********");

        List<String> list = Arrays.asList(infra);
        Set<String> eleList = list.stream().filter(e -> Collections.frequency(list, e) > 1)
                .collect(Collectors.toSet());

        System.out.println(eleList); //[Amazon]

    }

}

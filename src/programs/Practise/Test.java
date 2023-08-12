package programs.Practise;

public class Test {

    public static void main(String[] args) {
        String[] infra = {"Amazon", "Flipkart", "amazon", "Flipkart"};

        for (int i=0;i< infra.length;i++){
            for (int j= i+1; j<infra.length; j++){
                if (infra[i].equalsIgnoreCase(infra[j])){
                    System.out.println(infra[i]);
                }
            }
        }
    }


}

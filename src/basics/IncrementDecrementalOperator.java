package basics;

public class IncrementDecrementalOperator {

    public static void main(String[] args) {
        //++
        //--

        System.out.println("post increment");
        int i = 1;
        int j = i++;//post increment

        System.out.println(i); //2
        System.out.println(j); //1

        System.out.println("pre increment");
        int a = 1;
        int b = ++a;//pre increment

        System.out.println(a); //2
        System.out.println(b); //2

        System.out.println("post decrement");
        int m = 2;
        int n = m--;//post decrement

        System.out.println(m); //1
        System.out.println(n); //2

        System.out.println("pre decrement");
        int p = 2;
        int q = --p;

        System.out.println(p); //1
        System.out.println(q); //1
    }
}

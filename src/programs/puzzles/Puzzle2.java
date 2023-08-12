package programs.puzzles;

public class Puzzle2 {

    public static void main(String[] args) {

        int a[] = {10,20,30};
        int i =5, j=0;

        try{
            System.out.println(a[3]);
            System.out.println(i/j);
        }catch(ArithmeticException e){
            System.out.println("Line 1");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Line2");
        }catch (Exception e){
            System.out.println("Line 3");
        }
//        catch (NumberFormatException e){ //Compilation error as NumberFormatException is already caught otherwise the output will be Line2
//            System.out.println("Line 4");
//        }

    }


}

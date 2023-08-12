package collections.setconcept;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

    //EnumSet is not synchronized
    //its a highly performance member of java collection
    //faster than HashSet
    //all the methods are implemented using  bitwise arithmetic operations.

    enum Lang{
        JAVA,
        CSharp,
        JS,
        PYTHON,
        Ruby
    }

    public static void main(String[] args){

        //created a new enumSet using enum
        EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
        System.out.println(langs); //[JAVA, CSharp, JS, PYTHON, Ruby]

        EnumSet<Lang> l = EnumSet.noneOf(Lang.class); //to create empty enum set
        System.out.println(l); //[]

        //range(e1, e2);
        EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA, Lang.PYTHON);
        System.out.println(enumRange); //[JAVA, CSharp, JS, PYTHON]

        //of:
        EnumSet<Lang> cSharpEnum = EnumSet.of(Lang.CSharp);
        System.out.println(cSharpEnum);//[CSharp]

        EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVA, Lang.Ruby);
        System.out.println(multipleEnum); //[JAVA, Ruby]

        //add and addAll() methods:
        EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
        EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class); //to create empty enum set

        lang2.add(Lang.JS);
        lang2.addAll(lang1);

        System.out.println(lang2); //[JAVA, CSharp, JS, PYTHON, Ruby]

        //how to iterate EnumSet: iterator:
        EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);

        Iterator<Lang> it = fullLang.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
            System.out.print(" , "); //JAVA , CSharp , JS , PYTHON , Ruby ,

        }

        //remove() and removeAll():
        EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
        System.out.println();
        System.out.println(newLang); //[JAVA, CSharp, JS, PYTHON, Ruby]

        boolean b = newLang.remove(Lang.CSharp);
        System.out.println(b); //true
        System.out.println(newLang); //[JAVA, JS, PYTHON, Ruby]

        boolean b1 = newLang.removeAll(newLang);
        System.out.println(b1);//true
        System.out.println(newLang);//[]
    }
}

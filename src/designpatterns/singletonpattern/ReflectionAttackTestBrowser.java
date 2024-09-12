package designpatterns.singletonpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAttackTestBrowser {
    public static void main(String[] args) {
        Browser instance1 = Browser.getInstance();
        Browser instance2;

        Constructor<Browser> constructor;
        try {
            constructor = Browser.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance2 = constructor.newInstance();


            System.out.println("hashcode of instance1 : " + instance1.hashCode());
            System.out.println("hashcode of instance2 : " + instance2.hashCode());

            /*output //singleton is broken due to reflectionAttack
             * hashcode of instance1 : 295530567
             * hashcode of instance2 : 1989780873*/

        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

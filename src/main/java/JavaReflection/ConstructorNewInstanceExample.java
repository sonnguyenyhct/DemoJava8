package JavaReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorNewInstanceExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("JavaReflection.Cat");
        Constructor<?>[] allConstructor = clazz.getConstructors();
        for (Constructor<?> constructor : allConstructor){
            System.out.println(constructor.getParameterTypes().length);
        }

        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);

        Cat cat = (Cat) constructor.newInstance("abc",2);
        System.out.println(cat.getName() + " - " + cat.getAge());
    }
}

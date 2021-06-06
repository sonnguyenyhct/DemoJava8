package JavaReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectConstructorExample {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Cat> aClass = Cat.class;

        Constructor<?> constructor = aClass.getConstructor(String.class,int.class);

        System.out.println("Params: ");
        Class<?>[] paramClasses = constructor.getParameterTypes();
        for (Class<?> paramClass : paramClasses){
            System.out.println(paramClass.getSimpleName());
        }
        // Create object by reflect
        Cat tom = (Cat) constructor.newInstance("Tom",2);
        System.out.println("Cat 2: " + tom.getName() + ", age" + tom.getAge());

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName() + " - " + field.getType());
        }
        Field ageField = aClass.getField("age");
        Integer age = (Integer) ageField.get(tom);
        System.out.println(age);
        ageField.set(tom,2);

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods){
            System.out.println("+ " + method.getName());
        }
        Method setNameMethod = aClass.getDeclaredMethod("setName",String.class);
        setNameMethod.setAccessible(true);
        setNameMethod.invoke(tom,"Tom2");

        System.out.println(tom.getName());

    }
}

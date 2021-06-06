package JavaReflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectClassExample {
    public static void main(String[] args) {
            try {
                getClassInfo();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }

    public static void getClassInfo() throws ClassNotFoundException {
        Class<?> aClazz = Class.forName("JavaReflection.Cat");
        System.out.println("Name: " + aClazz.getName());
        System.out.println("Simple Name " + aClazz.getSimpleName());
        Package pkg = aClazz.getPackage();
        System.out.println("Package Name = " + pkg.getName());

        int modifiers = aClazz.getModifiers();
        boolean isPublic = Modifier.isPublic(modifiers);
        boolean isInterface = Modifier.isInterface(modifiers);
        boolean isFinal = Modifier.isFinal(modifiers);
        boolean isAbstract = Modifier.isAbstract(modifiers);

        System.out.println("Is Public? " + isPublic);
        System.out.println("Is Abstract? " + isAbstract);
        System.out.println("Is Interface? " + isInterface);
        System.out.println("Is Final? " + isFinal);

        Class<?> aSuperClass = aClazz.getSuperclass();
        System.out.println("Simple Class Name of Supper class = " + aSuperClass.getSimpleName());
        System.out.println("\nInterface: ");
        Class<?>[] itfClasses = aClazz.getInterfaces();
        for (Class<?> itfClass : itfClasses){
            System.out.println(itfClass.getSimpleName());
        }
        System.out.println("\nConstructor");
        Constructor<?>[] constructors = aClazz.getConstructors();
        for (Constructor<?> constructor : constructors){
            System.out.println(constructor.getName() + " has " + constructor.getParameterCount() + " param");
        }
        System.out.println("\nDeclared Methods: ");
        Method[] methods = aClazz.getDeclaredMethods();
        for (Method method : methods){
            System.out.println("+ " + method.getName());
        }

        System.out.println("\nFields");
        Field[] fields = aClazz.getFields();
        for (Field field : fields) {
            System.out.println("+ " + field.getName());
        }
        System.out.println("\nAnnotation:");
        Annotation[] annotations = aClazz.getAnnotations();
        for (Annotation ann : annotations) {
            System.out.println("+ " + ann.annotationType().getSimpleName());
        }



    }
}

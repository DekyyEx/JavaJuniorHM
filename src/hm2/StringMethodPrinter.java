package hm2;

import java.lang.reflect.Method;

public class StringMethodPrinter {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;

        Method[] methods = stringClass.getDeclaredMethods();

        System.out.println("Методы класса String:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}

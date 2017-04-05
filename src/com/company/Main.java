package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.soap.Text;

public class Main {
    public static void main(String[] args) {
        Class<?> cls = TextContainer.class;
        SaveTo annotation = cls.getAnnotation(SaveTo.class);
        String path = annotation.path();
        Method[] methods = cls.getMethods();
        for(Method m: methods){
            if (m.isAnnotationPresent(Saver.class)){
                try {
                    m.invoke(cls.newInstance(),path);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package me.kay.decorator;

import java.io.*;

public class DecoratorClient {

    public static void main(String[] args) throws FileNotFoundException {
//        Decorated decorated = new SecondDecorator(new DecoratedImpl());
        Decorated decorated = new SecondDecorator(new FirstDecorator(new DecoratedImpl()));
        decorated.doSomething();

//        InputStream inputStream = new FileInputStream(new File(""));
//        BufferedInputStream
    }
}

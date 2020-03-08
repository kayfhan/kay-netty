package me.kay.decorator;

//public class SecondDecorator extends FirstDecorator {
public class SecondDecorator extends Decorator {

    public SecondDecorator(Decorated decorated) {
        super(decorated);
    }

    @Override
    public void doSomething() {
        doBeforeMethod();
        super.doSomething();
        doSecondThing();
    }



    public void doSecondThing() {
        System.out.println("do second thing end method...");
    }

    public void doBeforeMethod(){
        System.out.println("do second thing before Method...");
    }
}
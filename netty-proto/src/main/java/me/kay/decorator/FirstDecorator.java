package me.kay.decorator;

public class FirstDecorator extends Decorator {

    public FirstDecorator(Decorated decorated) {
        super(decorated);
    }

    @Override
    public void doSomething() {
        doBeforeMethod();
        super.doSomething();
        doFirstThing();
    }

    public void doOtherThing(){
        System.out.println("do other thing...");
    }
    public void doFirstThing() {
        System.out.println("do first thing  end method...");
    }

    public void doBeforeMethod(){
        System.out.println("do first thing Before Method...");
    }
}

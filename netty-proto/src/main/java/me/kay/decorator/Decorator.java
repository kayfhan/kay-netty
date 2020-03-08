package me.kay.decorator;

public class Decorator implements Decorated{

    private Decorated decorated;

    public Decorator(final Decorated decorated) {
        this.decorated = decorated;
    }

    public void doSomething() {
        decorated.doSomething();
    }
}

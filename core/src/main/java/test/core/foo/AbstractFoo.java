package test.core.foo;

public abstract class AbstractFoo {

    public void something(){
        System.out.println("do something");
        doSomething();
    }

    protected abstract void doSomething();
}

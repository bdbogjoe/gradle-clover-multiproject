package test.impl.foo;

import test.core.foo.AbstractFoo;

public class FooImpl extends AbstractFoo {

    @Override
    protected void doSomething() {
        System.out.println("do something impl");
    }
}

package test.impl.foo

import spock.lang.Specification

class FooImplSpec extends Specification {
    def "DoSomething"() {
        given:
        FooImpl foo = new FooImpl()
        when:
        foo.something()
        then:
        true
    }
}

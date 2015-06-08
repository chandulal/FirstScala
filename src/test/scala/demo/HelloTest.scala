package demo

import org.scalatest.FunSuite

/**
 * Created by chanduk on 29/05/15.
 */
class HelloTest extends FunSuite {
    test("say Hello Method correctly.") {
        val hello = new Hello
        assert(hello.sayHello("Scala") == "Hello, Scala!")
    }
}

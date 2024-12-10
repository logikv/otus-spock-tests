package tech.bv4lo

import spock.lang.Specification

class ArithmeticTest extends Specification {

    Arithmetic arithmetic
    Calculator calculator

    void setup() {
        calculator = Mock(Calculator)
        arithmetic = new Arithmetic(calculator)
    }

    void cleanup() {
        arithmetic = null
        calculator = null
    }

    def "Sum"() {
        given:
        def a = 10
        def b = 5

        when:
        def sum = arithmetic.sum(a, b)

        then:
        sum == 15
        1 * calculator.calculate(_, _, _) >> 15

    }

    def "expect failed test"() {
        given:
        def a = 10
        def b = 5

        when:
        def sum = arithmetic.sum(a, b)

        then:
        sum != 0
    }

}

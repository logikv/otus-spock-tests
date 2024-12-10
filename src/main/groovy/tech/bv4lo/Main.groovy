package tech.bv4lo

import groovy.util.logging.Log

@Log
class Arithmetic {

    private Calculator calculator

    Arithmetic(Calculator calculator) {
        this.calculator = calculator
        log.info("Created Arithmetic instance")
    }

    def sum(a, b) {
        return calculator.calculate(a, b, "add")
    }

    def minus(a, b) {
        return a - b
    }

    def multiply(a, b) {
        return a * b
    }

    def divide(a, b) {
        return a / b
    }

}

@Log
trait Calculator {

    def calculate(a, b, operation) {
        log.info("Calculating $a $operation $b")
        // Need internet connection
        throw new UnsupportedOperationException("Not implemented")
    }

}
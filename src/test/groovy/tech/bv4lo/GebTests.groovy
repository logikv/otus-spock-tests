package tech.bv4lo

import geb.Browser
import geb.ConfigurationLoader
import org.openqa.selenium.firefox.FirefoxDriver
import spock.lang.Specification

class GebTests extends Specification {

    def setup() {
        System.setProperty("webdriver.gecko.driver", "geckodriver")
    }

    def "test"() {
        given:
//        def browser = new Browser(driver: new FirefoxDriver())

        when:
        Browser.drive {
            go "http://gebish.org"

            assert title == "Geb - Very Groovy Browser Automation"

            $("div.menu a.manuals").click()
            waitFor { !$("#manuals-menu").hasClass("animating") }

            $("#manuals-menu a")[0].click()

            assert title.startsWith("The Book Of Geb")
        }


        then:
        true
    }
}

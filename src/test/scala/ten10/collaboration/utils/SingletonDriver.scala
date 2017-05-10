package ten10.collaboration.utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object SingletonDriver {

  System.setProperty("webdriver.chrome.driver", "chromedriver")
  val driver: WebDriver = new ChromeDriver()
}

trait DriverInitialisation {

  implicit lazy val driver = SingletonDriver.driver

}
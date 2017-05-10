package ten10.collaboration.utils

import org.scalatest.selenium.WebBrowser
import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

trait BaseFeatureSpec
  extends FeatureSpec
    with GivenWhenThen
    with Matchers
    with WebBrowser {

}

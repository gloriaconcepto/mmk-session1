package consulting.ikenna.beginningscala

import org.scalatest.{FreeSpec, Matchers}

class TemperatureConversionTest extends FreeSpec with Matchers {


  "A function to convert temperatures" - {

    /**
      * Convert Centigrade to Fahrenheit.
      * Hint: Multiply by 9, then divide by 5, then add 32
      */
    "Centigrade to Fahrenheit" - {
      "0°C is 32°F" in {
        TemperatureConverter.centigradeToFahrenheit(0) shouldBe 32
      }
      "25°C is 77°F" in {
        TemperatureConverter.centigradeToFahrenheit(25) shouldBe 77
      }
      "30°C is 86°F" in {
        TemperatureConverter.centigradeToFahrenheit(30)  shouldBe 86
      }
      "45°C is 113°F" in {
        TemperatureConverter.centigradeToFahrenheit(45) shouldBe 113
      }
      "50°C is 122°F" in {
        TemperatureConverter.centigradeToFahrenheit(50) shouldBe 122
      }

      "60°C is 140°F" in {
        TemperatureConverter.centigradeToFahrenheit(60) shouldBe 140
      }
      "100°C is 212°F" in {
        TemperatureConverter.centigradeToFahrenheit(100) shouldBe 212
      }
      "150°C is 302°F" in {
        TemperatureConverter.centigradeToFahrenheit(150) shouldBe 302
      }

      "200°C is 392°F" in {
        TemperatureConverter.centigradeToFahrenheit(200) shouldBe 392
      }



    }


    /**
      * Convert Fahrenheit to Centigrade.
      * Hint: Deduct 32, then multiply by 5, then divide by 9
      */
    "Fahrenheit to Centigrade" - {
      "212°F is 100°C" in {
        TemperatureConverter.fahrenheitToCentigrade(212) shouldBe 100
      }
      "50°F is 10°C" in {
        TemperatureConverter.fahrenheitToCentigrade(50) shouldBe 10
      }
      "158°F is 70°C" in {
        TemperatureConverter.fahrenheitToCentigrade(158) shouldBe 70
      }
      "59°F is 15°C" in {
        TemperatureConverter.fahrenheitToCentigrade(59) shouldBe 15
      }
      "77°F is 25°C" in {
        TemperatureConverter.fahrenheitToCentigrade(77) shouldBe 25
      }
    }
  }
}

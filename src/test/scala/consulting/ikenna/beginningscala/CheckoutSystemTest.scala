package consulting.ikenna.beginningscala

import org.scalatest.{FreeSpec, Matchers}


class CheckoutSystemTest extends FreeSpec with Matchers {

  /**
    * Shopping cart
    * You are building a checkout system for a shop which only sells apples and oranges.
    * Apples cost ₦300 and oranges cost ₦150.
    * Build a checkout system which takes a list of items scanned at the till and
    * outputs the total cost. Your input should be a list of strings.
    */


  "Checkout System" - {

    {

      CheckoutSystem.Sum(List("ORANGE","ORANGE","APPLE"))
    }

    "should give a total of 300 Naira for 1 apple" in {

      CheckoutSystem.Sum(List("APPLE"))

    }

    "should give a total of 150 Naira for 1 orange" in {

      CheckoutSystem.Sum(List("ORANGE"))
    }

    "should give a total of 900 Naira for 3 apples" in {

      CheckoutSystem.Sum(List("APPLE","APPLE","APPLE"))
    }

    "should give a total of 1050 Naira for input 'Apple, Apple, Orange, Apple' " in {

      CheckoutSystem.Sum(List("APPLE","APPLE","ORANGE","APPLE"))
    }

    "should give a total of 0 Naira and print such fruit in not included in the list. for input 'MANGO,GRAPE,GUAVA' " in {
      CheckoutSystem.Sum(List("MANGO","GRAPE","GUAVA"))
    }
    "should give a total of 150 Naira for input 'Mango, Grape, Orange' " in {
      CheckoutSystem.Sum(List("MANGO","GRAPE","ORANGE"))
    }
    "should give a total of 300 Naira for input 'Mango, Grape, Apple' " in {
      CheckoutSystem.Sum(List("MANGO","GRAPE","APPLE"))
    }

    "should give a total of 450 Naira for input 'Apple, Orange' " in {
      CheckoutSystem.Sum(List("APPLE","ORANGE"))
    }
    "should give a total of 600 Naira for input 'Orange, Orange,Apple' " in {
      CheckoutSystem.Sum(List("ORANGE", "ORANGE", "APPLE"))
    }
    "should give a total of N725.60 Naira for input 'Banana, Avocado,Apple' " in {
      CheckoutSystem.Sum(List("AVOCADO", "BANANA", "APPLE"))
    }
    "should give a total of N750 Naira for input 'orange,apple, apple" in {

      CheckoutSystem.SumWithDiscountForAppleAndOrange(List("orange","APPLE","APPLE"))
    }
    "should give a total of N2076.6 Naira for input 'orange,banana, apple,avocado,banana" in {

      CheckoutSystem.SumWithDiscountForAppleAndOrange(List("APPLE","ORANGE","BANANA","AVOCADO","BANANA"))
    }
    "should give a total of N1450.0 Naira for input 'orange,apple, apple,apple,apple,orange,orange" in {

      CheckoutSystem.SumWithDiscountForAppleAndOrange(List("APPLE","ORANGE","APPLE","ORANGE","APPLE","APPLE","ORANGE"))
    }

    "should give a total of N750 Naira for input 'avocado,orange,avocado,orange" in {

      CheckoutSystem.SumWithDiscountForAppleAndOrange(List("AVOCADO","ORANGE","AVOCADO","ORANGE"))
    }

    "should give a total of N1975.6 Naira for input 'orange,banana, apple,avocado,banana" in {

      CheckoutSystem.SumWithDiscountForBananaAndAvocado(List("APPLE","ORANGE","BANANA","AVOCADO","BANANA"))
    }
    "should give a total of N1650.0 Naira for input 'orange,apple, apple,apple,apple,orange,orange" in {

      CheckoutSystem.SumWithDiscountForBananaAndAvocado(List("APPLE","ORANGE","APPLE","ORANGE","APPLE","APPLE","ORANGE"))
    }

    "should give a total of N1700 Naira for input 'avocado,orange,avocado,orange" in {

      CheckoutSystem.SumWithDiscountForBananaAndAvocado(List("AVOCADO","ORANGE","AVOCADO","ORANGE"))
    }

  }

}
package consulting.ikenna.beginningscala

import org.scalatest.{FreeSpec, Matchers}

class FibonacciTest extends FreeSpec with Matchers{
  /**
    * Fibonacci numbers are the numbers in the following integer sequence, called the Fibonacci sequence:
    * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    * Every number after the first two is the sum of the two preceding ones. That is,
    *  Xn = Xn-1 + Xn-2 , with seed values X0 = 0, and X1 = 1.
    * The Fibonacci sequence is named after Italian mathematician Leonardo of Pisa, known as Fibonacci.
    * Fibonacci numbers occur unexpectedly in mathematics and biology.
    *
    * Write a recursive function to calculate fibonacci numbers
    */

  "Calculate Fibonacci numbers" - {
    "0" in {
      Fibonacci.fibonacciNumbers(0) shouldBe 0
    }

    "1" in {
      Fibonacci.fibonacciNumbers(1) shouldBe 1
    }

    "2" in {
      Fibonacci.fibonacciNumbers(2) shouldBe 1
    }

    "3" in {
      Fibonacci.fibonacciNumbers(3) shouldBe 2
    }

    "4" in {
      Fibonacci.fibonacciNumbers(4) shouldBe 3
    }

    "5" in {
      Fibonacci.fibonacciNumbers(5) shouldBe 5
    }

    "6" in {
      Fibonacci.fibonacciNumbers(6) shouldBe 8
    }
  }

}

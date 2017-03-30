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
      Fibonacci.nonTailRecursiveFibonacci(0) shouldBe 0
    }

    "1" in {
      Fibonacci.nonTailRecursiveFibonacci(1) shouldBe 1
    }

    "2" in {
      Fibonacci.nonTailRecursiveFibonacci(2) shouldBe 1
    }

    "3" in {
      Fibonacci.nonTailRecursiveFibonacci(3) shouldBe 2
    }

    "4" in {
      Fibonacci.nonTailRecursiveFibonacci(4) shouldBe 3
    }

    "5" in {
      Fibonacci.nonTailRecursiveFibonacci(5) shouldBe 5
    }

    "6" in {
      Fibonacci.nonTailRecursiveFibonacci(6) shouldBe 8
    }



  }
  "Calculate Fibonacci numbers using tail recursive approach" - {
    "0" in {
      Fibonacci.tailRecursiveFibonacci(0) shouldBe 0
    }

    "1" in {
      Fibonacci.tailRecursiveFibonacci(1) shouldBe 1
    }

    "2" in {
      Fibonacci.tailRecursiveFibonacci(2) shouldBe 1
    }

    "3" in {
      Fibonacci.tailRecursiveFibonacci(3) shouldBe 2
    }

    "4" in {
      Fibonacci.tailRecursiveFibonacci(4) shouldBe 3
    }

    "5" in {
      Fibonacci.tailRecursiveFibonacci(5) shouldBe 5
    }

    "6" in {
      Fibonacci.tailRecursiveFibonacci(6) shouldBe 8
    }
  }

}

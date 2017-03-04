package consulting.ikenna.beginningscala

import org.scalatest.{FreeSpec, Matchers}


class FactorialTest extends FreeSpec with Matchers {


  "Write a factorial function that is not tail recursive" - {
    "1 factorial should be 1" in {
      FactorialFunction.nonTailRecursiveFactorial(1) shouldBe 1
    }

    "2 factorial should be 2" in {
      FactorialFunction.nonTailRecursiveFactorial(2) shouldBe 2
    }

    "3 factorial should be 6" in {
      FactorialFunction.nonTailRecursiveFactorial(3) shouldBe 6
    }

    "4 factorial should be 24" in {
      FactorialFunction.nonTailRecursiveFactorial(4) shouldBe 24
    }

    "5 factorial should be 120" in {
      FactorialFunction.nonTailRecursiveFactorial(5) shouldBe 120
    }

  }

  "Write a factorial function that is tail recursive" - {
    "1 factorial should be 1" in {
      FactorialFunction.tailRecursiveFactorial(1) shouldBe 1
    }

    "2 factorial should be 2" in {
      FactorialFunction.tailRecursiveFactorial(2) shouldBe 2
    }

    "3 factorial should be 6" in {
      FactorialFunction.tailRecursiveFactorial(3) shouldBe 6
    }

    "4 factorial should be 24" in {
      FactorialFunction.tailRecursiveFactorial(4) shouldBe 24
    }

    "5 factorial should be 120" in {
      FactorialFunction.tailRecursiveFactorial(5) shouldBe 120
    }

  }
}



package consulting.ikenna.beginningscala



object Factorial {
  def nonTailRecursiveFactorial(n: Int): Int = {
    if (n == 0) 1

    else
      n *nonTailRecursiveFactorial (n - 1)
  }


  def tailRecursiveFactorial(num: Int): Int =
  {
    @scala.annotation.tailrec
    def tailRecursiveFactorialHelper(number: Int, acc: Int): Int = {
      if (number == 0) acc
      else
        tailRecursiveFactorialHelper(number - 1, acc * number)
    }
    tailRecursiveFactorialHelper(num, 1)
  }
}

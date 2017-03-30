package consulting.ikenna.beginningscala

object Fibonacci {


  def nonTailRecursiveFibonacci (n:BigInt):BigInt =   {
    //if (n==0)  0
    //if(n==1)1
    // else {nonTailRecursiveFibonacci(n - 1) + nonTailRecursiveFibonacci(n - 2)}

    if (n == 1 || n == 0)
      n
    else { nonTailRecursiveFibonacci( n-1 ) + nonTailRecursiveFibonacci( n-2 )}

  }


  def tailRecursiveFibonacci(n:BigInt):BigInt= {

    @scala.annotation.tailrec
    def tailHelper(num: BigInt, acc1: BigInt, acc2: BigInt): BigInt = {
      if (num == 0) acc1
      else tailHelper(num - 1, acc2, acc1 + acc2)
    }

    tailHelper(n, 0, 1)
  }

}

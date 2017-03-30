package consulting.ikenna.beginningscala

object CheckoutSystem {
  def Sum(items: List[String]): Float = {


    if (!items.contains("APPLE") && !items.contains("ORANGE")&& !items.contains("BANANA") && !items.contains("AVOCADO") ) {
      println("Sorry we don't have that fruit in the list yet")
    }



    val applePrice: Float = 300.0f

    val orangePrice: Float = 150.0f
    val  bananaPrice: Float = 450.50f
    val  avocadoPrice :Float = 725.60f

    val appleFilter = items.filter(_.startsWith("APPLE"))

    val orangeFilter = items.filter(_.startsWith("ORANGE"))
    val bananaFilter = items.filter(_.startsWith("BANANA"))
    val avocadoFilter = items.filter(_.startsWith("AVOCADO"))


    appleFilter.size * applePrice + orangeFilter.size * orangePrice + bananaFilter.size*bananaPrice+ avocadoFilter.size*avocadoPrice

  }

  def SumWithDiscountForAppleAndOrange(items: List[String]): Float = {


    if (!items.contains("APPLE") && !items.contains("ORANGE")&& !items.contains("BANANA") && !items.contains("AVOCADO") ) {
      println("Sorry we don't have that fruit in the list yet")
    }

    val applePrice: Float = 300.0f

    val orangePrice: Float = 150.0f
    val  bananaPrice: Float = 450.50f
    val  avocadoPrice :Float = 725.60f

    val appleSpecialPrice: Float = 800.0f
    val orangeSpecialPrice: Float = 200.0f

    val appleFilter = items.filter(_.startsWith("APPLE"))

    val orangeFilter = items.filter(_.startsWith("ORANGE"))
    val bananaFilter = items.filter(_.startsWith("BANANA"))
    val avocadoFilter = items.filter(_.startsWith("AVOCADO"))

    val appleLengthSize:Int=appleFilter.size

    val numberOfferForApple:Int=3
        val howManyDiscountApple:Int=(appleLengthSize)/numberOfferForApple
         val appleRemaining: Int=(appleLengthSize)%numberOfferForApple
          val appleTotalPrice:Float= (howManyDiscountApple*appleSpecialPrice)+(appleRemaining*applePrice)



    val orangeLengthSize:Int=orangeFilter.size
    val numberOfferForOrange:Int=2
    val howManyDiscountOrange:Int=(orangeLengthSize)/numberOfferForOrange
    val orangeRemaining: Int=(orangeLengthSize)%numberOfferForApple
    val orangeTotalPrice:Float= ( howManyDiscountOrange*orangeSpecialPrice)+(orangeRemaining*orangePrice)


    appleTotalPrice+orangeTotalPrice+ bananaFilter.size*bananaPrice+ avocadoFilter.size*avocadoPrice

  }

  def SumWithDiscountForBananaAndAvocado(items: List[String]): Float = {


    if (!items.contains("APPLE") && !items.contains("ORANGE")&& !items.contains("BANANA") && !items.contains("AVOCADO") ) {
      println("Sorry we don't have that fruit in the list yet")
    }

    val applePrice: Float = 300.0f

    val orangePrice: Float = 150.0f
    val  bananaPrice: Float = 450.50f
    val  avocadoPrice :Float = 725.60f

    val bananaSpecialPrice: Float = 800.0f
    val avocadoSpecialPrice: Float = 1400.0f

    val appleFilter = items.filter(_.startsWith("APPLE"))

    val orangeFilter = items.filter(_.startsWith("ORANGE"))
    val bananaFilter = items.filter(_.startsWith("BANANA"))
    val avocadoFilter = items.filter(_.startsWith("AVOCADO"))

    val bananaLengthSize:Int=bananaFilter.size

    val numberOfferForBanana:Int=2
    val howManyDiscountBanana:Int=(bananaLengthSize)/numberOfferForBanana
    val bananaRemaining: Int=(bananaLengthSize)%numberOfferForBanana
    val bananaTotalPrice:Float= (howManyDiscountBanana*bananaSpecialPrice)+(bananaRemaining*bananaPrice)



    val avocadoLengthSize:Int=avocadoFilter.size
    val numberOfferForAvocado:Int=2
    val howManyDiscountAvocado:Int=(avocadoLengthSize)/numberOfferForAvocado
    val avocadoRemaining: Int=(avocadoLengthSize)%numberOfferForAvocado
    val avocadoTotalPrice:Float= ( howManyDiscountAvocado*avocadoSpecialPrice)+(avocadoRemaining* avocadoPrice)


    bananaTotalPrice+avocadoTotalPrice+ appleFilter.size*applePrice + orangeFilter.size*orangePrice

  }



}

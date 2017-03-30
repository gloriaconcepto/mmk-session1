package consulting.ikenna.beginningscala

object TemperatureConverter {
  def centigradeToFahrenheit(tem:Float):Float=
  {
    val cal:Float=((tem * 9.0f))/(5.0f) + 32.0f
    cal

  }

  def fahrenheitToCentigrade(tem:Float):Float=
  {
    val cal:Float=(((tem - 32.0f))*5.0f)/9.0f
    cal

  }
}

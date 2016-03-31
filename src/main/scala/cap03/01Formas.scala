package cap03

class FormasCap03 
{
	def area: Double = 0.0
}
// Hemos definido una clase con un método, que por defecto dará como valor 0
// Tb podiamos haberlo escrito con el Trait (se verá más adelante) 

class Rectangle(val width: Double, val height: Double) extends FormasCap03
{
  override def area: Double = width * height
}

class Circle(val radius: Double) extends FormasCap03
{
  override def area: Double = math.Pi * radius * radius
}



object Formas extends App 
{
	def dibujar(f:FormasCap03): Unit =
	{
		println("Mi area es: " + f.area)
	}	
	val rectangle = new Rectangle(2.0,3.0)
	println(rectangle.area)
	println(rectangle.width)
	println(rectangle.height)
	println()


	val circulo = new Circle(2)
    dibujar(circulo)
    println(circulo.radius)
}
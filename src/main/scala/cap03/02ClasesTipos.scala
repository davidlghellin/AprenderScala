package cap03

// Constructores

class Book(val title: String)
{
  //solo getters por ser val
  def impr: String = "titulo es: " + title
}

class Book2(var title: String)
{
  //getters & setters por ser var
  def impr: String = "titulo es: " + title
}

class Book3(private var title: String)
{
  //si especificamos private delante de var/val solo tendríamos acceso dentro de la clase
  def printTitle
  { println(title) }
}

class Book4(title: String)
{
  //no tenemos acceso a los getters y setters
  def impr: String = "titulo es: " + title
}

class Book5(val title: String)
{

  // Constructor sin parámetros
  def this()
  {
    this("Titulo de constructor vacio")
    //es como si llamaramos a: new Book5("Titulo de constructor vacio")
  }

  def impr: String = "titulo es: " + title

  def printTitle
  { println(title) }
}

class Book6(var title: String = "por defecto")
{
  // en este caso el constructor tiene valires por defecto
  def printTitle
  { println(title) }
}

object ClasesTipos extends App 
{
    val libro = new Book("Don Quijote")
    println(libro.impr)
    println(libro.title)
    println()

    val libro2 = new Book2("Don Quijote")
    libro2.title = "nuevo DonQuijote"
    println(libro2.impr)
    println(libro2.title)
    println()

    val libro3 = new Book3("Quijote")
    libro3.printTitle
    println()

    val libro5 = new Book5()
    libro5.printTitle
    println()

    val libro6 = new Book6()
    libro6.printTitle
    println()
}
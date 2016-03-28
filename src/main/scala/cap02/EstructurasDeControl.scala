package cap02

object EstructurasDeControl extends App 
{
	//if
	if(true) println("yes")
	if(false) println("yes") else println("no")
	if(false) println("yes") else  if (false) println("yes") else println("no")

	val i: Int = if(true) 1 else 3
	val i2: Int = if(true) 1 
		else 
		{
			val j= System.currentTimeMillis
			(j% 100L).toInt
		}
	val ifuncion: (Boolean) => Int = (a) => if (a) 1 else 3

	// For comprehension
	// Es como el foreach, para iterar sobre cualquier colección 
	val libros : List[String]=List("Beginning Scala", "Beginning Groovy", "Beginning Java", "Scala in easy steps", "Scala in 24 hours")
	for (l <- libros)
      println(l)
    println()

    /////////
	///Filter
    /////////
    //lo usamos caundo no queremos iterar sobre toda la colección,
    // solamentoe con los que nos cumplan una condicion
	for (l <- libros if l.contains("Scala"))
      println(l+" :")

    val num: List[Int]=List(1,2,3,4,5,6)
	for (n<- num)
		println(n)	
	println()

	//mayores que 4
	for (n<- num if n > 4)
		println(n)	
	println()


	//Yield
	var scalaBocks = for { l <- libros if l.contains("Scala") } yield l
	//los que cumplen la condición renderiza/construye
	for (l <- scalaBocks)
      println(l+" yield")
    println()

    //Math expresion 
    // Math expresion para una variable
    val res44: (Boolean) = 
    44 match 
    {
    	case 44 =>true
    	case _  =>false  
    }
    println(res44)

    println()
    val n=30
    // Math expresion para la definición de una función
    def mayorQue(n:Int): Boolean = 
    n match 
    {
      case n if n>30 =>true
      case _         =>false
    }
    println("¿" + n + " es mayor que 30? " + mayorQue(n))

    println()
    val resDavid: (Int) = "David" match
    {
      case "David"  => 45 // Si es david return 45
      case "Elwood" => 77 // En caso de ser elwood ..
      case _        => 0  // en cualquier otro caso (default)..
    }
    println(resDavid)

    val x = 8
    val cuadrado:(Int) =
  	{ x * x}

  	
  	def cuadrado(i: Int): Int =
    { i * i }
  	val resCuadrado = cuadrado(5)
  	println(resCuadrado)
}
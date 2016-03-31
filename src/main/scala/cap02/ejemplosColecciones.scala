package cap02

object ejemplosColecciones extends App 
{
	//Arrays
	// para usar arrays, los elementos tienen que ser del mismo tipo
	// definimos el tamaño de array
	var arr :Array[Int] = new Array[Int](3)
	println(arr(0))
	var arr2 :Array[Int] =  Array[Int](3,5,8)
	println(arr2(0))

	// definimos un array de string
	var librosN : Array[String] = new Array[String](3)
	// por defecto lo crea a null
	println(librosN(0))
	//creamos un array con los elementos creados
	var libros : Array[String] =  Array[String]("Beginning Scala", "Beginning Java", "Beginning Groovy")
	println(libros(0))

	// List
	// podemos crear listas de la siguiente maner
    val empty: List[Nothing] = List()
    println(empty)
    // de esta forma le decimos que cree una lista vacía
    val empty2 = Nil
    println(empty2)

    // vamos añadiendo elementos por la izquierda 
    // como si fuera una cola LIFO
	val books = "Beginning Scala" :: ("Beginning Groovy" :: ("Beginning Java" :: Nil))
    println(books(0))	//scala
    println(books(1))	//groovy
    println(books(2))	//java
    println()

    // primer elemento 
    println(books.head)
    // todos los elementos quitando la cabeza (nos quedamos con el resto)
    println(books.tail)
    println()

    // Tuplas
    // las tuplas podemos tener cualquier tipo de dato
    val tuple = (1, false, "Scala")
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)


}
package cap01

/**
  * Created by David López González on 23/03/16.
  */

object ejmplos01 extends App
{

     //definimos una funcion en una variable
    val cuadrado:(Int) => Int = (i) =>
    {
      i * i
    }
 
    //definimos una funcion en una variable
    val cuadrado2 = (i: Int) =>
    {
      i * i
    }
    val c = cuadrado(2)
    println("El cuadrado de dos es " + c)

    for
    {i <- 1 to 10}
      println(i)

    for
    {i <- 1 to 10
     j <- 1 to 10}
    {
      print(i + " " + j)
      println()
    }
  
}

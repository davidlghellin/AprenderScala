package cap00
object HolaMundo extends App
{
	//def main(args: Array[String]) =
		println("Hola estoy dentro de main de scala")
}
object PruebasConsola extends App
{
	println("Hola desde el segundo singleton")
	val persona=new Persona("David","5123")
	println(persona)
	println(persona.nombre)
	println(persona.dni)

//funcion
//def nombreFuncion: (tipoParametro[,tipoParametro]) => ValorRetorno = (nombreParametro[,nombreParametro]) => f(a)
	def sumaUno:(Int) => Int = (a)=> a+1
	println(sumaUno(1))



//funcion con case class
//def nombreFuncion (nombreParametro: tipoParametro): ValorRetorno = nombreParametro match
  	def isDavid(p: Persona): String = p match
  	{
    	case Persona(nombre, _) if nombre.equals("David") => "eres David"
    	case _ => "no David"
  	}
  	println(isDavid(persona))
}
case class Persona(nombre:String, dni:String) 

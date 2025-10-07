import utilidades.Cancion;
public class InstanciacionReferenciaYComparacion {
public static void main(String[] args) {
//Crea un objeto cancion (C1) usando el contructor por defecto
Cancion C1 = new Cancion();
//Crea un objeto cancion (C2) usando el contructor por defecto
Cancion C2 = new Cancion ("Clocks", "Coldplay");
//Muestra por consola ambas canciones con System.out.println()
System.out.println(C1); 
System.out.println(C2);

//Ejercicio 2
//Crea dos objetos Cancion (c3 y c4) distintos, con los mismos valores.
Cancion C3 = new Cancion("Mande in orcasitas", "El jincho");
Cancion C4 = new Cancion("Callaita", "Bad Bunny");

System.out.println(C3 == C4);
}
}
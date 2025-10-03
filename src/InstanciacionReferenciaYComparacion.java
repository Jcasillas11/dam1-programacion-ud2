import utilidades.Cancion;
public class InstanciacionReferenciaYComparacion {
public static void main(String[] args) {
Cancion C1 = new Cancion();
Cancion C2 = new Cancion ("Clocks", "Coldplay");
System.out.println(C1);
System.out.println(C2);
}
}
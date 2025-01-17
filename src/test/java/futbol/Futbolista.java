package futbol;
import java.util.ArrayList;
public abstract class Futbolista implements Comparable{
	private String nombre;
	private int edad;
	private final String posicion;
	private static ArrayList<Futbolista> jugadores= new ArrayList<>();
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		jugadores.add(this);
		
	}
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	public boolean equals(Futbolista f) {
		if(this == f) {
				return true;
		}
		return false;
	}
	public abstract boolean jugarConLasManos();

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return this.posicion;
	}
	public String toString() {
		return "El futbolista" + this.getNombre() + " tiene " + this.getEdad() + " y juega de "+ this.getPosicion();
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
	
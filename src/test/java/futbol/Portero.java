package futbol;

public class Portero extends Futbolista  {
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}	

	public int getGolesRecibidos() {
		return this.golesRecibidos;
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if( o instanceof Portero) {
			int diferencia = this.getGolesRecibidos() - ((Portero)o).getGolesRecibidos();
			if( diferencia < 0) {
				diferencia *= 1;
				return diferencia;
			}
		}
		return 0;
		
	}
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de "+ this.getPosicion()+ ". Le han marcado " + this.getGolesRecibidos();
	}

}

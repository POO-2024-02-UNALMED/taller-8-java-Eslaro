package futbol;

public class Jugador extends Futbolista  {
	public short golesMarcados;
	public byte dorsal;
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	public byte getDorsal() {
		return this.dorsal;
	}
	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de "+ this.getPosicion() + " con el dorsal "+ this.getDorsal() +  ". Ha marcado " + this.golesMarcados;
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	 public int compareTo(Object otro) {
		if(otro instanceof Futbolista) {
			return Integer.compare(this.getEdad(), ((Futbolista)otro).getEdad());
		}
		return 0;
    }
	
}

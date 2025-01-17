package futbol;

public class Jugador extends Futbolista  {
	private short golesMarcados;
	private byte dorsal;
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
	@Override
	public String toString() {
		return ((Futbolista) this).toString() + ". Ha marcado " + this.golesMarcados;
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	 public int compareTo(Futbolista otro) {
        return Integer.compare(this.getEdad(), otro.getEdad());
    }
	
}

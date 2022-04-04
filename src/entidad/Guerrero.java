package entidad;

public class Guerrero extends Personaje {

	private int fuerza;

	public Guerrero() {

	}

	public Guerrero(int fuerza) {
		super();
		this.fuerza = fuerza;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void habilidad() {
		int totalVida = getPuntosVida() + fuerza;
		System.out.println("Poseo FUERZA, esto me proporciona m�s puntos de vida.");
		System.out.println("Mis puntos de vida totales ahora son: " + totalVida);
	}

}

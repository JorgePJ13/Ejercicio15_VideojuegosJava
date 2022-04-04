package entidad;

public class Mago extends Personaje {

	private int inteligencia;

	public Mago() {

	}

	public Mago(int inteligencia) {
		super();
		this.inteligencia = inteligencia;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	@Override
	public void habilidad() {
		int totalVida = getPuntosVida() + inteligencia;
		System.out.println("Poseo INTELIGENCIA, esto me proporciona más puntos de vida.");
		System.out.println("Mis puntos de vida totales ahora son: " + totalVida);
	}

}

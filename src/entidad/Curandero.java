package entidad;

public class Curandero extends Personaje {

	private int sabiduria;

	public Curandero() {

	}

	public Curandero(int sabiduria) {
		super();
		this.sabiduria = sabiduria;
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public void habilidad() {
		int totalVida = getPuntosVida() + sabiduria;
		System.out.println("Poseo SABIDURÍA, esto me proporciona más puntos de vida.");
		System.out.println("Mis puntos de vida totales ahora son: " + totalVida);
	}

}

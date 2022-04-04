package entidad;

public class Batalla {

	private Personaje p1;
	private Personaje p2;

	public Personaje getP1() {
		return p1;
	}

	public void setP1(Personaje p1) {
		this.p1 = p1;
	}

	public Personaje getP2() {
		return p2;
	}

	public void setP2(Personaje p2) {
		this.p2 = p2;
	}

	@Override
	public String toString() {
		return "Batalla [p1=" + p1 + ", p2=" + p2 + "]";
	}

	public Personaje combate() {
		System.out.println("Da por comenzada la batalla por la Tierra Media\n");
		Personaje primerPersonaje = null;
		Personaje segundoPersonaje = null;
		Personaje ganadorP = null;

		int comienzo = NumeroAleatorio.generadorNumeroAleatorio(2, 1);
		if (comienzo == 1) {
			primerPersonaje = p1;
			segundoPersonaje = p2;
		} else {
			primerPersonaje = p2;
			segundoPersonaje = p1;
		}

		System.out.println("Primer Personaje: " + primerPersonaje.getNombre() + " emplea el arma " + primerPersonaje.getArma().getNombre());
		System.out.println("Segundo Personaje: " + segundoPersonaje.getNombre() + " emplea el arma " + segundoPersonaje.getArma().getNombre());

		boolean terminado = false;
		do {
			int danio = primerPersonaje.atacar(segundoPersonaje);
			System.out.println(
					"\nEl personaje " + p1.getNombre() + " ha hecho " + danio + " puntos de daño al personaje " + p2.getNombre());
			if (segundoPersonaje.muerto()) {
				ganadorP = primerPersonaje;
				terminado = true;
			} else {
				danio = segundoPersonaje.atacar(primerPersonaje);
				System.out.println(
						"El personaje " + p2.getNombre() + " ha hecho " + danio + " de daño al personaje " + p1.getNombre());
				if (primerPersonaje.muerto()) {
					ganadorP = segundoPersonaje;
					terminado = true;
				}
			}
			System.out.println();
			System.out.println(primerPersonaje.toString());
			System.out.println(segundoPersonaje.toString());
		} while (!terminado);

		return ganadorP;
	}

}

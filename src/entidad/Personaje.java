package entidad;

public abstract class Personaje {

	protected String nombre;
	protected Arma arma;
	protected int puntosVida;

	public Personaje() {

	}

	public Personaje(String nombre, Arma arma) {
		super();
		this.nombre = nombre;
		this.arma = arma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", arma=" + arma.getNombre() + ", puntosVida=" + puntosVida + "]";
	}

	public int atacar(Personaje p) {
		int danio = getArma().usar();
		int vida = p.getPuntosVida() - danio;
		p.setPuntosVida(vida);
		return danio;
	}

	public boolean muerto() {
		boolean estaMuerto = false;
		if (getPuntosVida() <= 0) {
			System.out.println("El Personaje " + this.nombre + " ha muerto en combate :(");
			estaMuerto = true;
		}
		return estaMuerto;
	}

	public abstract void habilidad();

}

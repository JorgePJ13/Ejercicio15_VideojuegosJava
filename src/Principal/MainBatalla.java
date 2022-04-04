package Principal;

import entidad.Arco;
import entidad.Batalla;
import entidad.Espada;
import entidad.Guerrero;
import entidad.Mago;
import entidad.Personaje;

public class MainBatalla {

	public static void main(String[] args) {
		Guerrero guerrero1 = new Guerrero();
		guerrero1.setNombre("Aragorn");
		guerrero1.setFuerza(20);
		guerrero1.setPuntosVida(200);

		Guerrero guerrero2 = new Guerrero();
		guerrero2.setNombre("Legolas");
		guerrero2.setFuerza(15);
		guerrero2.setPuntosVida(150);

		Espada espada = new Espada();
		espada.setNombre("Andúril");
		espada.setDanioMax(15);
		espada.setDanioMin(5);
		espada.setPlusEspada(10);

		Arco arco = new Arco();
		arco.setNombre("Belthronding");
		arco.setDanioMax(20);
		arco.setDanioMin(10);
		arco.setPlusArco(15);

		guerrero1.setArma(espada);
		espada.setP(guerrero1);

		guerrero2.setArma(arco);
		arco.setP(guerrero2);

		Batalla batalla = new Batalla();
		batalla.setP1(guerrero1);
		batalla.setP2(guerrero2);

		Personaje pVencedor = batalla.combate();
		System.out.println("\nEl vencedor por la lucha de la Tierra Media es: " + pVencedor);
	}
}

package produto;

import java.time.LocalDate;

import produto.model.Console;
import produto.model.Jogo;
import produto.model.Produto;

public class TestaGame {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2017, 02, 24);
		Produto g1 = new Produto(1, "Hollow Knight", 1, "Team Cherry", data, 100.00f);
		
		LocalDate data2 = LocalDate.of(2022, 11, 9);
		Produto g2 = new Produto(2, "GodOfWar", 4, "Santa Monica", data2, 200.00f);
		
		g1.visualizar();
		g2.visualizar();
		
		
		Jogo j1 = new Jogo(1, "Hollow Knight", 1, "Team Cherry", data, 100.00f, "Ari Gibson");
		
		Jogo j2 = new Jogo(2, "GodOfWar", 4, "Santa Monica", data2, 200.00f, "David Jaffe");
		
		j1.visualizar();
		j2.visualizar();
		

		Console c1 = new Console(1, "Hollow Knight", 1, "Team Cherry", data, 100.00f, "Computador");
		
		Console c2 = new Console(2, "GodOfWar", 4, "Santa Monica", data2, 200.00f, "Play Station");
		
		c1.visualizar();
		c2.visualizar();
	}

}

package produto;

import java.time.LocalDate;

import produto.model.Produto;

public class TestaGame {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2002, 05, 29);
		Produto g1 = new Produto(1, "WarCraft", 1, "Blizzard", data, 100.00f);
		
		LocalDate data2 = LocalDate.of(2002, 05, 29);
		Produto g2 = new Produto(2, "GodOfWar", 1, "Santa Monica", data2, 200.00f);
		
		g1.visualizar();
		g2.visualizar();
	}

}

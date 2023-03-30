package optional;

import java.util.Optional;

public class Optional_01 {

	public static void main(String[] args) {

		String[] palavras = new String [10];
		
		palavras [5] = "turma 62";
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		if (checaNulo.isPresent()) {
		String palavra = palavras[5].toLowerCase();
		System.out.println(palavra);
		}else
			System.out.println("A palavra é nula!");
		
		System.out.println("Optional está vazio? " + checaNulo.isEmpty());

	}

}

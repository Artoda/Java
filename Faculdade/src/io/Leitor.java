package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
	
	public static void leitor(String path) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\romul\\Documents\\Serratec\\Eclipse\\WorkSpace\\Faculdade"));
		String linha = "";

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				System.out.println(linha);
			} else

				break;

		}
		buffRead.close();
	}
}

package Principal;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Enum.PessoasEnum;
import io.Escritor;

public class Principal {

	public static void main(String[] args) throws ParseException, IOException {

//		List<String> lista = new ArrayList<String>();
//		Integer numd = 1;
//		lista.add("manuel");
//		lista.add("manus");
//		lista.add("munis");
//
//		System.out.println(lista);
//		Collections.sort(lista);
//		System.out.println(lista);
//
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Date date = new Date();
//		// System.out.println(simpleDateFormat.format(date));
//		String stx = "07/12/2934 10:23:34";
//		Date dataUsuario = simpleDateFormat.parse(stx);
//		System.out.println(dataUsuario);
//
//		GregorianCalendar calendar = new GregorianCalendar();
//
//		System.out.println(calendar.get(calendar.DAY_OF_WEEK));
//
//        LocalDate hoje = LocalDate.now();
//        System.out.println("LocalDate antes de formatar: " + hoje);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String hojeFormatado = hoje.format(formatter);
//        System.out.println("LocalDate depois de formatar: " + hojeFormatado);

		LocalDateTime agora = LocalDateTime.now();
		System.out.println("LocalDateTime antes de formatar: " + agora);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String agoraFormatado = agora.format(formatter);
		System.out.println("LocalDateTime depois de formatar: " + agoraFormatado);

		String testaEnum = "PRESIDENTE";
		PessoasEnum presidente = PessoasEnum.PRESIDENTE;
		PessoasEnum gerente = PessoasEnum.GERENTE;

		if (testaEnum.equalsIgnoreCase(PessoasEnum.PRESIDENTE.name())) {
			System.out.println("Tipo da Pessoa = " + presidente.name());

		} else if (testaEnum.equalsIgnoreCase(PessoasEnum.GERENTE.name())) {
			System.out.println("Tipo da Pessoa = " + gerente.name());

		}
		
        //Escritor.escritor(".\\arquivos\\teste.txt");

	}

}
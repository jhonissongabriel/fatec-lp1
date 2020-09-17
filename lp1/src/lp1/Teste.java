package lp1;

import java.util.HashSet;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
/*
//		LUGAR
		Lugar l1, l2, l3, l4, l5;

		l1 = new Lugar("Rua A", 123, "02034-670", "São Paulo", "SP");
		System.out.println(
				l1.getRua() + ", " + l1.getNumero() + " - " + l1.getCep() + " - " + l1.getCidade() + "/" + l1.getUf());
		l2 = new Lugar("Rua 13", 456, "12344-720", "São José dos Campos", "SP");
		System.out.println(
				l2.getRua() + ", " + l2.getNumero() + " - " + l2.getCep() + " - " + l2.getCidade() + "/" + l2.getUf());
		l3 = new Lugar("Rua dos Estudante", 78, "76854-410", "Manaus", "AM");
		System.out.println(
				l3.getRua() + ", " + l3.getNumero() + " - " + l3.getCep() + " - " + l3.getCidade() + "/" + l3.getUf());
		l4 = new Lugar("Rua dos Pássaros", 9, "31879-570", "Gramado", "RS");
		System.out.println(
				l4.getRua() + ", " + l4.getNumero() + " - " + l4.getCep() + " - " + l4.getCidade() + "/" + l4.getUf());
		l5 = new Lugar("Rua Verde", 1011, "46598-020", "Salvador", "BA");
		System.out.println(
				l5.getRua() + ", " + l5.getNumero() + " - " + l5.getCep() + " - " + l5.getCidade() + "/" + l5.getUf());

//		PESSOA
		Pessoa p1, p2, p3, p4, p5;
		p1 = Pessoa.of("João", "1985-04-05", "123456789", "MASCULINO", 1.78);
		p2 = Pessoa.of("Maria", "1978-12-04", "112333131", "FEMININO", 1.65);
		p3 = Pessoa.of("José", "1968-10-04", "127567589", "MASCULINO", 1.70);
		p4 = Pessoa.of("Paula", "1990-11-23", "128678678", "FEMININO", 1.82);
		p5 = Pessoa.of("Flávio", "1996-08-30", "345612149", "MASCULINO", 1.89);

		System.out.println("\n\n");
		System.out.println(p1 + "\n");
		System.out.println(p2 + "\n");
		System.out.println(p3 + "\n");
		System.out.println(p4 + "\n");
		System.out.println(p5 + "\n");
		System.out.println("\n");

		p1.alterarDataNascimento("1980-10-10");
		System.out.println(p1 + "\n");

		p2.alterarNome("Mariana");
		System.out.println(p2 + "\n");

		p3.alterarRg("111222333");
		System.out.println(p3 + "\n");

		p4.alterarAltura(2.10);
		System.out.println(p4 + "\n");
		
		
//		ALUNO FATEC SJC
		AlunoFatecSJC a1, a2, a3, a4, a5;
		a1 = new AlunoFatecSJC("Gabriel", "1234567890123", "BD","noturno");
		a2 = new AlunoFatecSJC("Maria", "2439236785676", "MAN","noturno");
		a3 = new AlunoFatecSJC("José", "2948295854908", "ADS","manhã");
		a4 = new AlunoFatecSJC("Paula", "2342349805340", "LOG","manhã");
		a5 = new AlunoFatecSJC("Pedro", "8958304938509", "LOG","noturno");
		
		a1.mudarCurso("LOG","manha");	
		a2.mudarHorario("manhã");
		a3.mudarRa("0987957694013");

		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		
		
//		INSTRUMENTO MUSICAL
		InstrumentoMusical m1, m2, m3, m4, m5;
		m1 = new InstrumentoMusical("Violão", "Tagima",10,300.00);
		m2 = new InstrumentoMusical("Flauta", "Michael",14,70.00);
		m3 = new InstrumentoMusical("Violino", "Eagle",3,1400.00);
		m4 = new InstrumentoMusical("Guitarra", "Gibson",5,1300.00);
		m5 = new InstrumentoMusical("Bateria", "Yamaha",2,7000.00);
		
		m1.venderInstrumento(2);
		m2.venderInstrumento(5);
		m3.venderInstrumento(1);
		m1.venderInstrumento(7);
		m1.venderInstrumento(2);
		*/
		
//		CALÇADO
		Calcado c1, c2, c3, c4, c5;
		Set<String> estilo1 = new HashSet<String>();
		estilo1.add("Segurança");
		estilo1.add("Esporte");
		
		Set<String> estilo2 = new HashSet<String>();
		estilo2.add("Social");
		estilo2.add("Esporte");
		
		Set<String> cor1 = new HashSet<String>();
		cor1.add("Preto");
		cor1.add("Azul");
		cor1.add("Vermelho");
		
		Set<String> cor2 = new HashSet<String>();
		cor2.add("Preto");
		cor2.add("Azul");
		cor2.add("Vermelho");
		cor2.add("Rosa");
		cor2.add("Amarelo");
		
		Set<String> cor3 = new HashSet<String>();
		cor3.add("Preto");
		cor3.add("Azul");
		cor3.add("Vermelho");
		cor3.add("Rosa");
		cor3.add("Amarelo");
		cor3.add("Branco");
		
		Set<Integer> tamanho1 = new HashSet<Integer>();
		tamanho1.add(34);
		tamanho1.add(35);
		tamanho1.add(36);
		tamanho1.add(37);
		tamanho1.add(38);
		tamanho1.add(39);
		tamanho1.add(40);
		tamanho1.add(41);
		tamanho1.add(42);
		tamanho1.add(43);
		tamanho1.add(44);
		
		Set<Integer> tamanho2 = new HashSet<Integer>();
		tamanho2.add(40);
		tamanho2.add(41);
		tamanho2.add(42);
		tamanho2.add(43);
		
		Set<Integer> tamanho3 = new HashSet<Integer>();
		tamanho3.add(32);
		tamanho3.add(33);
		tamanho3.add(34);
		tamanho3.add(35);
		
		
		c1 = new Calcado("Sapato",estilo1,cor2,tamanho1);
		c2 = new Calcado("Sapatenis",estilo1,cor3,tamanho2);
		c3 = new Calcado("Tênis",estilo1,cor2,tamanho1);
		c4 = new Calcado("Sandália",estilo2,cor3,tamanho3);
		c5 = new Calcado("Bota",estilo2,cor1,tamanho3);
		
		c1.adicionarEstilo("Social");
		c2.adicionarEstilo("Casual");
		c3.adicionarCor("Rosa");
		c4.adicionarTamanho(36);
		c4.adicionarTamanho(37);
		
		c3.escolherCalcado(33, "Esporte", "Branco");
		c4.escolherCalcado(36, "Casual", "Azul");
		c5.escolherCalcado(42, "Social", "Vrmelho");
	}

}

package br.com.dio.desafio.main;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
				
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();		
		mentoria.setTitulo("Menstoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Spread Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Spread Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devElvis = new Dev();
		devElvis.setNome("Elvis");
		devElvis.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Elvis: " + devElvis.getConteudosInscritos());

		System.out.println("--=--=--=--=--=--=--=--=--=--=--");
		devElvis.prodredir();
		devElvis.prodredir();
		System.out.println("Conteudos inscritos Elvis: " + devElvis.getConteudosInscritos());
		System.out.println("Conteudos concluídos Elvis: " + devElvis.getConteudosConcluidos());
		System.out.println("XP: " + devElvis.calcularTotalXp());
		System.out.println();
		
		System.out.println("----");
		Dev devMaicol = new Dev();
		devMaicol.setNome("Maicol");
		devMaicol.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Maicol: " + devMaicol.getConteudosInscritos());
		
		System.out.println("--=--=--=--=--=--=--=--=--=--=--");
		devMaicol.prodredir();
		devMaicol.prodredir();
		devMaicol.prodredir();
		System.out.println("Conteudos inscritos Maicol: " + devMaicol.getConteudosInscritos());
		System.out.println("Conteudos concluídos Maicol: " + devMaicol.getConteudosConcluidos());
		System.out.println("XP: " + devMaicol.calcularTotalXp());
	}
}

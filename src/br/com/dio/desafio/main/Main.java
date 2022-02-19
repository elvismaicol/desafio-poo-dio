package br.com.dio.desafio.main;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescri��o("descri��o curso java");
		curso1.setCargaHoraria(8);
				
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescri��o("descri��o curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Menstoria Java");
		mentoria.setDescricao("Descri��o mentoria Java");
		mentoria.setData(LocalDate.now());

		System.out.println(curso1);
		System.out.println(curso2);
	}
}

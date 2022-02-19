package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	public Curso() {
	}

	public Curso(String titulo, String descri��o, int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + 
				", descri��o=" + getDescricao() + 
				", cargaHoraria=" + cargaHoraria + "]";
	}
}

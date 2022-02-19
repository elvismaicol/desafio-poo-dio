package br.com.dio.desafio.dominio;

public class Curso {

	private String titulo;
	private String descri��o;
	private int cargaHoraria;
	
	public Curso() {
	}

	public Curso(String titulo, String descri��o, int cargaHoraria) {
		this.titulo = titulo;
		this.descri��o = descri��o;
		this.cargaHoraria = cargaHoraria;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descri��o=" + descri��o + ", cargaHoraria=" + cargaHoraria + "]";
	}
}

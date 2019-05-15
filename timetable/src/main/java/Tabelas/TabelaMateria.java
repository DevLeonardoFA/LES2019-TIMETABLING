package Tabelas;

import javafx.beans.property.SimpleStringProperty;

public class TabelaMateria {

	private final SimpleStringProperty nome;
	private final SimpleStringProperty curso;
	private final SimpleStringProperty periodo;
	
	public TabelaMateria(String nome, String curso, String periodo) {
		super();
		this.nome = new SimpleStringProperty(nome);
		this.curso = new SimpleStringProperty(curso);
		this.periodo = new SimpleStringProperty(periodo);
	}

	public String getNome() {
		return nome.get();
	}

	public String getCurso() {
		return curso.get();
	}

	public String getPeriodo() {
		return periodo.get();
	}
	
}

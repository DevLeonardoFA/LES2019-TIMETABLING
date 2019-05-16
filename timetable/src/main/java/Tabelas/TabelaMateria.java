package Tabelas;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class TabelaMateria {

	private final SimpleLongProperty id;
	private final SimpleStringProperty nome;
	private final SimpleStringProperty curso;
	private final SimpleStringProperty periodo;
	
	public TabelaMateria(Long id, String nome, String curso, String periodo) {
		super();
		this.id = new SimpleLongProperty(id);
		this.nome = new SimpleStringProperty(nome);
		this.curso = new SimpleStringProperty(curso);
		this.periodo = new SimpleStringProperty(periodo);
	}

	public Long getid() {
		return id.get();
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

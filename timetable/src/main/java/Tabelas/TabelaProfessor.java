package Tabelas;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class TabelaProfessor {
	
	private final SimpleLongProperty id;
	private final SimpleStringProperty nome;
	private final SimpleStringProperty email;
	
	public TabelaProfessor(Long id, String nome, String email) {
		super();
		this.id = new SimpleLongProperty(id);
		this.nome = new SimpleStringProperty(nome);
		this.email = new SimpleStringProperty(email);
	}

	public Long getId() {
		return id.get();
	}

	public String getNome() {
		return nome.get();
	}

	public String getEmail() {
		return email.get();
	}

}

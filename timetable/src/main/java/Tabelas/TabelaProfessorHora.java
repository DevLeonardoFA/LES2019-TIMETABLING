package Tabelas;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class TabelaProfessorHora {

	private final SimpleStringProperty horaField;
	private final SimpleBooleanProperty horaDom;
	private final SimpleBooleanProperty horaSeg;
	private final SimpleBooleanProperty horaTer;
	private final SimpleBooleanProperty horaQua;
	private final SimpleBooleanProperty horaQui;
	private final SimpleBooleanProperty horaSex;
	private final SimpleBooleanProperty horaSab;
	
	public TabelaProfessorHora(String horaField) {
		
		super();
		this.horaField = new SimpleStringProperty(horaField);
		this.horaDom = new SimpleBooleanProperty(false);
		this.horaSeg = new SimpleBooleanProperty(false);
		this.horaTer = new SimpleBooleanProperty(false);
		this.horaQua = new SimpleBooleanProperty(false);
		this.horaQui = new SimpleBooleanProperty(false);
		this.horaSex = new SimpleBooleanProperty(false);
		this.horaSab = new SimpleBooleanProperty(false);
		
	}

	public String getHoraField() {
		return horaField.get();
	}
	
	public Boolean getHoraDom() {
		return horaDom.get();
	}

	public Boolean getHoraSeg() {
		return horaSeg.get();
	}

	public Boolean getHoraTer() {
		return horaTer.get();
	}

	public Boolean getHoraQua() {
		return horaQua.get();
	}

	public Boolean getHoraQui() {
		return horaQui.get();
	}

	public Boolean getHoraSex() {
		return horaSex.get();
	}

	public Boolean getHoraSab() {
		return horaSab.get();
	}
	
	
}
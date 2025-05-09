package Gestor.models;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Tarea {
	private String titulo;
	private String descripcion;
	private boolean completada;

	// Constructor
	public Tarea(String titulo, String descripcion) {
		setTitulo(titulo);
		setDescripcion(descripcion);
		this.completada = false; 
	}

	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCompletada() {
		return completada;
	}

	public void setCompletada(boolean completada) {
		this.completada = completada;
	} // Setter público
	

	@Override
	public String toString() {
		return "[ " + (completada ? "✔" : "✖") + " ] " + titulo + " - " + descripcion;
	}
}

package Gestor.views;
import Gestor.models.Tarea;
import Gestor.services.GestorTareas;

public class Main {

	public static void main(String[] args) {
		
		GestorTareas gestor = new GestorTareas("Limpiar casa");
		Tarea tarea1 = new Tarea("Barrer piso", "Agarrar una escoba y barrer el piso");
		
		
		gestor.mostrarTareas();
		gestor.agregarTarea(tarea1);
		gestor.mostrarTareas();
		gestor.actualizar(tarea1,true);
		gestor.mostrarTareas();
		gestor.guardarTareasEnArchivo("tareas.txt");

	}

}

package Gestor.services;
import Gestor.models.Tarea;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class GestorTareas {
	
	String nombre;
	ArrayList<Tarea> listaDeTareas = new ArrayList<>();
	
	public GestorTareas(String nombre) {
		this.nombre = nombre;
	
	}

	public Tarea getTarea(int indice) {
	    if (indice >= 0 && indice < listaDeTareas.size()) {
	        return listaDeTareas.get(indice);
	    }
	    return null;
	}

	public void setTarea(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Tarea> getListaDeTareas() {
		return listaDeTareas;
	}

	public void setListaDeTareas(ArrayList<Tarea> listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}
	
	 public void agregarTarea(Tarea tarea) {
	        
		 if (tarea == null) {
	            System.out.println("Error: La tarea no puede ser null.");
	        } else {
	        if (!buscarTarea(tarea)) {
	            listaDeTareas.add(tarea);
	            System.out.println("Tarea agregada correctamente.");
	        } else {
	            System.out.println("La tarea ya existe, no se agregará.");
	        }
	 
	        }
	 }

	 

	 
	private boolean buscarTarea(Tarea tarea) {
		int i = 0;
	    boolean elementoEncontrado = false;

	    while (!elementoEncontrado && i < listaDeTareas.size()) {
	        if (listaDeTareas.get(i).equals(tarea)) { 
	            elementoEncontrado = true;
	            System.out.println("Tarea encontrada en la posición: " + i);
	        }
	        i++; 
	    }

	    if (!elementoEncontrado) {
	        System.out.println("Tarea no encontrada.");
	    }
		return elementoEncontrado;
	}
	 
	
	public void mostrarTareas() {
	    System.out.println("LISTA DE TAREAS");

	    if (listaDeTareas.isEmpty()) {
	        System.out.println("No hay tareas para mostrar.");
	    } else {
	        int i = 1;
	        for (Tarea t : listaDeTareas) {
	            System.out.println("- Tarea número " + i + ": " + t);
	            i++;
	        }
	    }
	}
	
	public void eliminarTarea(Tarea tarea) {
	    if (tarea == null) {
	        System.out.println("Error: La tarea no puede ser null.");
	    } else {
	        if (!buscarTarea(tarea)) {
	            System.out.println("La tarea no existe.");
	        } else {
	            listaDeTareas.remove(tarea);
	            System.out.println("La tarea ha sido eliminada.");
	        }
	    }
	}
	
	public boolean actualizar(Tarea tarea, boolean estado) {
		 if (tarea == null) {
		        System.out.println("Error: La tarea no puede ser null.");
		    } else {
		        if (!buscarTarea(tarea)) {
		            System.out.println("La tarea no existe.");
		        } else {
		        	tarea.setCompletada(estado);
		        	return estado;
		        }
		        
		    }
		return !estado;
	}
	

	public void guardarTareasEnArchivo(String nombreArchivo) {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
	        for (Tarea tarea : listaDeTareas) {
	            writer.write(tarea.toString());
	            writer.newLine();
	        }
	        System.out.println("Tareas guardadas en " + nombreArchivo);
	    } catch (IOException e) {
	        System.out.println("Error al guardar las tareas: " + e.getMessage());
	    }
	}

	

	
}
	
	


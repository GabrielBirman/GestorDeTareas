# Gestor de Tareas ☕

Aplicación de consola en Java para administrar una lista de tareas (CRUD), organizada en capas: modelo, servicio y vista.

## Funcionalidades

- Agregar tareas, con validación de nulos y de duplicados
- Listar las tareas con su estado
- Marcar una tarea como completada o pendiente
- Eliminar tareas
- Guardar la lista en un archivo de texto (`tareas.txt`)

## Tecnologías

- Java
- Programación orientada a objetos
- Git

## Estructura

```
src/Gestor/
├── models/     # Tarea: título, descripción y estado
├── services/   # GestorTareas: lógica del CRUD y guardado en archivo
└── views/      # Main: punto de entrada
```

## Cómo usarlo

1. Clonar el repositorio.
2. Abrir la carpeta `_GestorDeTareas_` en Eclipse o IntelliJ.
3. Ejecutar `Gestor.views.Main`.

## Próximas mejoras

- Menú interactivo para cargar tareas desde la consola
- Guardar y leer las tareas en formato JSON
- Interfaz gráfica con JavaFX

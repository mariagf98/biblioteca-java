import java.util.ArrayList;
import java.util.Scanner;


public class Biblio {
	private static ArrayList<Libro> catalogo = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("== Sistema de Biblioteca ==");
			System.out.println("1. Añadir Libro");
			System.out.println("2. Ver catálogo");
			System.out.println("3. Prestar Libro");
			System.out.println("4.Devolver Libro");
			System.out.println("5. Salir");
			System.out.println("Opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			switch (opcion) {
			   case 1 -> agregarLibro();
               case 2 -> mostrarCatalogo();
               case 3 -> prestarLibro();
               case 4 -> devolverLibro();
               case 5 -> System.out.println("Saliendo del sistema...");
               default -> System.out.println("Opción no válida.");
			}
		}while (opcion != 5);
	}
	
	private static void agregarLibro() {
		System.out.println("Título: ");
		String titulo = sc.nextLine();
		System.out.println("Autor: ");
		String autor = sc.nextLine();
		
		Libro libro = new Libro(titulo, autor, false);
		catalogo.add(libro);
		
		System.out.println("Libro añadido a catalogo.");
	}
	
	private static void mostrarCatalogo() {
		if (catalogo.isEmpty()) {
			System.out.println("No hay libros en el catálogo");
		}else {
			for(int i = 0; i < catalogo.size(); i++) {
				System.out.println(i + ". " + catalogo.get(i));
			}
		}
	}
	
	private static void prestarLibro() {
		mostrarCatalogo();
		if(!catalogo.isEmpty()) {
			System.out.println("Número del libro a prestar: ");
			int index = sc.nextInt();
			sc.nextLine();
			if(index >= 0 && index < catalogo.size()) {
				catalogo.get(index).prestar(); // Llamada a métod de Libro
			}else {
				System.out.println("Número inválido");
			}
		}
	}
	
	private static void devolverLibro() {
		mostrarCatalogo();
		if(!catalogo.isEmpty()) {
			System.out.println("Número del libro a devolver: ");
			int index = sc.nextInt();
			sc.nextLine();
			
			if( index >= 0 && index < catalogo.size()) {
				catalogo.get(index).devolver();
			}else {
				System.out.println("Número inválido");
			}
		}
	}
}

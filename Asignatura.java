package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Biblioteca {
	 
	public static Scanner sc = new Scanner (System.in);
	static int num;

	static ArrayList<Libro> libro = new ArrayList<Libro>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		do {
			System.out.println("1 Introduce un libro");
			System.out.println("2 Prestar un libro");
			System.out.println("3 Devolver un libro");
			System.out.println("4 Mostrar los libros de la biblioteca");
			System.out.println("0 Salir");
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				introducirLibros(libro);
				break;
			case 2:
				prestarLibros(libro);
				break;
			case 3:
				devolverLibros(libro);
				break;
			case 4:
				mostrarLibros(libro);
				break;
			
			}
			
		}while(num != 0);
		
	}
		public static void introducirLibros(ArrayList <Libro> libro) {
		System.out.println("Introduce un ISBN");
		int isbn = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce un titulo");
		String titulo = sc.nextLine();
		System.out.println("Introduce un autor");
		String autor = sc.nextLine();
		Libro li = new Libro (isbn,titulo,autor);
		libro.add(li);
		System.out.println(li.toString());
		}
		public static void prestarLibros(ArrayList <Libro> libro) {
			
				 
	}

		
		public static void devolverLibros(ArrayList <Libro> libro) {
			
			}
		public static void mostrarLibros(ArrayList <Libro> libro) {
			Iterator <Libro> it = libro.iterator();
			while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
package com.edukt;

import com.edukt.Foro.ComentarioComposite;
import com.edukt.Foro.ComentarioLeaf;
import com.edukt.Foro.IComponentForo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class EduktUnmsmApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EduktUnmsmApplication.class, args);
		String dato = new String();
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		//DATOS
		LocalDateTime date = LocalDateTime.now();
		String c = "curso";
		String a = "autor";
		ComentarioComposite ForoRoot = new ComentarioComposite("miforo", date,c,a);
		ComentarioComposite trabajo = ForoRoot;
		int datoEntero =0;

		while(!salir){

			try {
				System.out.println("estoy en: "+ trabajo.getTexto());
				System.out.println("1. Adicionar coment Compuesto / 2. Adicionar comentario / 3. borrar / 4. buscar / 5. Mostrar / 6. reiniciar  / 7. salir");
				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch(opcion){
					case 1:
						System.out.println("Dame el nombre del comentario compuesto");
						dato = sn.next();
						IComponentForo coment = new ComentarioComposite(dato,date,c,a);
						trabajo.addComentario(coment);
						System.out.println();
						trabajo = (ComentarioComposite) coment;
						break;
					case 2:
						System.out.println("Dame el nombre del comentario ");
						dato = sn.next();
						coment = new ComentarioLeaf(dato,date,c,a);
						trabajo.addComentario(coment);
						break;
					case 3:
						System.out.println("dame el dato a borrar");
						datoEntero = sn.nextInt();
						coment = trabajo.removeComentario(datoEntero);
						System.out.println("comentario eliminado: "+coment.getTexto());
						break;
					case 4:
						System.out.println("dame el dato a buscar");
						datoEntero = sn.nextInt();
						if (datoEntero<trabajo.getComentarios().size()){
							trabajo = (ComentarioComposite) trabajo.getComentarios().get(datoEntero);
							System.out.println(trabajo.getTexto());
						}else {
							System.out.println("dato no indexado");
						}
						break;
					case 5:
						System.out.println(ForoRoot.mostrar(0));
						break;
					case 6:
						trabajo = ForoRoot;
						break;
					case 7:
						salir=true;
						break;
					default:
						System.out.println("Solo números entre 1 y 4");
				}
			}catch (InputMismatchException e){
				System.out.println("debes insertar un numero");
				sn.next();
			}



		}
	}

}

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class Principal {

	public static void main (String [] args) {
		int numero1=0;
		int numero2=0,cantadecuada=0,total=0,postractor1=0,postractor2=0,totalcasillas= 0,cantidad = 0,opcion = 0;
		int direccion;
		int cantidadsobrante;
		Scanner leer = new Scanner(System.in);
		do {
		System.out.println("Eligen una opcion: ");
		System.out.println("1 : leer datos por teclado ");
		System.out.println("2 : leer datos desde fichero");
		opcion=leer.nextInt();
		
			switch (opcion) {
			case 1:
				System.out.println("Introduce numero de filas");
				numero1= leer.nextInt();
				System.out.println("Introduce numero de columnas");
				numero2= leer.nextInt();
				totalcasillas=numero1*numero2;
				System.out.println("Introduce la cantidad adecuada por casilla entre 1-8  ");
				cantadecuada=leer.nextInt();
				do {
					System.out.println("Introduce x del tractor");
					postractor1= leer.nextInt();
					System.out.println("Introduce y del tractor");
					postractor2= leer.nextInt();
					}
					while(postractor1>numero1 || postractor2>numero2);
				break;
			case 2:
				
				
				break;
			default:
				System.out.println("Introduce una opcion valida");
			    break;
			}
		}while (opcion > 2);
		
		
		Casilla [][] tablero = new Casilla [numero1][numero2];		
		Tractor tractor = new Tractor( postractor1, postractor2, totalcasillas);
		total=cantadecuada*totalcasillas;;
		// Bucle para que la cantidad del tablero sea exacta
		int suma=0;
		do {
		suma=0;
		for (int x=0; x < tablero.length; x++) {
			  for (int y=0; y < tablero[x].length; y++) {
				  cantidad=(int) (Math.random()*7+1);
				  if(cantidad>cantadecuada) {
				  cantidadsobrante=cantidad-cantadecuada;
				  }else 
					  cantidadsobrante=0;
			    tablero[x][y]= new Casilla(x, y, cantidad, false,cantadecuada,cantidadsobrante);
			    suma=suma+tablero[x][y].getcantidad();
			  }
		}
			}while(suma!=total);
		
		
		for (int x=0; x < tablero.length; x++) {
			  for (int y=0; y < tablero[x].length; y++) {
			   System.out.print(tablero[x][y].getcantidad()); 
			  }
			 }
		
		//tractor.accion(cantidad, cantadecuada, cantidadsobrante, tablero, postractor1, postractor2);
		System.out.println("Introduce una direccion a la que moverte: 1:N, 2:S, 3:E, 4:O" );
		direccion=leer.nextInt();
		tractor.mover(direccion,tractor,postractor1,postractor2,numero1,numero2);
		System.out.println("La nueva posicion del tractor es :" +tractor.getCol() +tractor.getFil());
		
		//ESCRIBIR DATOS EN EL FICHERO
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("c:/prueba.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 1; i++)
                pw.println("x y k max c f " );
            for (int i = 0; i < 1; i++)
                pw.println(+numero1+ +numero2+ +cantadecuada+ +postractor1);
  
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
	}
}
	

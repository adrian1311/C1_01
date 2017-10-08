
public class Tractor {
private int col;
private int fil;
private int cantidadsobrante;




public Tractor(int col,int fil, int cantidadsobrante) {
	this.col=col;
	this.fil=fil;
	this.cantidadsobrante=cantidadsobrante;
}

public int getCol() {
	return col;
}

public void setCol(int col) {
	this.col = col;
}

public int getFil() {
	return fil;
}

public void setFil(int fil) {
	this.fil = fil;
}
public static void accion(int cantidad, int cantidadadecuada, int cantidadsobrante, Casilla [][] tablero ) {
	if (cantidad<=cantidadadecuada) {
		//mover(direccion, tractor, postractor1,postractor2, numero1, numero2);
	if (cantidad>cantidadadecuada) {
		cantidadsobrante=cantidad-cantidadadecuada;
		//distribuir(cantidad,cantidadadecuada,cantidadsobrante,tablero, col, fil);
		//mover();
	}
	}
}

public void mover(int direccion, Tractor tractor, int postractor1, int postractor2, int numero1, int numero2) {
	switch (direccion) {
	case 1:
		col=col-1;
		fil=fil;
		if (col<0) {
			System.out.println("Esa posicion esta fuera del tablero, vuelve a elegir");
			col=col+1;
		}
		break;
	case 2:
		col=col+1;
		fil=fil;
		if (col>numero1-1) {
			System.out.println("Esa posicion esta fuera del tablero, vuelve a elegir");
			col=col-1;
		}
		break;
	case 3:
		col=col;
		fil=fil+1;
		if (fil>numero2-1) {
			System.out.println("Esa posicion esta fuera del tablero, vuelve a elegir");
			fil=fil-1;
		}
		
		break;
	case 4:
		col=col;
		fil=fil-1;
		if (fil<0) {
			System.out.println("Esa posicion esta fuera del tablero, vuelve a elegir");
			fil=fil+1;
		}
		break;
	}
}
	
}



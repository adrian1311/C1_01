
public class Casilla {
private int fila;
private int columna;
private int cantidad;
private boolean recorrido;
private int cantidadadecuada;
private int cantidadsobrante;

public Casilla(int fila, int columna, int cantidad , boolean recorrido, int cantidadadecuada, int cantidadsobrante) {
	
	this.fila=fila;
	this.columna=columna;
	this.cantidad=cantidad;
	this.recorrido=recorrido;
	this.cantidadadecuada=cantidadadecuada;
	this.cantidadsobrante=cantidadsobrante;
}
public int getCantidadadecuada() {
	return cantidadadecuada;
}
public void setCantidadadecuada(int cantidadadecuada) {
	this.cantidadadecuada = cantidadadecuada;
}
public int getfila() {
	return fila;
}
public void setfila(int fila) {
	this.fila=fila;
}
public int getcolumna() {
	return columna;
}
public void setcolumna(int columna) {
	this.columna=columna;
}
public int getcantidad() {
	return cantidad;
}
public void setcantidad(int cantidad) {
	this.cantidad=cantidad;
}
public boolean getrecorrido() {
	return recorrido;
}
public void setrecorrido(boolean recorrido) {
	this.recorrido=recorrido;
}
public int getcantidadsobrante() {
	return cantidadsobrante;
}
public void cantidadsobrante(int cantidadsobrante) {
	this.cantidadsobrante=cantidadsobrante;;
}
}

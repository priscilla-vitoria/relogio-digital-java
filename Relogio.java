public class Relogio {
private int horas;
private int minutos;
private int segundos;

public Relogio() {
	this.horas=0;
	this.minutos=0;
	this.segundos=0;
}
public int getHoras() {
	
	return this.horas;
}
public int getMinutos() {
	return this.minutos;
}
public int getSegundos() {
	return this.segundos;
}
public void setHoras(int h) {
	if(h>=0 && h<=23) {
		this.horas=h;
	}
	
}
public void setMinutos(int m) {
	if(m >=0 &&m<=59) {
		this.minutos=m;
	}
	
}
public void setSegundos(int s) {
	if(s>=0 && s<=59) {
	this.segundos=s;
	}
}
public void satatus() {
	
	System.out.println(this.getHoras()+ " Horas "+this.getMinutos()+ " Minutos " +this.getSegundos()+" Segundos ");
	
}
}

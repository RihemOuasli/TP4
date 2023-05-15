package Modeles;

public class NumberBean {
private double x;
public NumberBean(){
	setX(0);
	}
public double getX(){
	return x;
}
public void setX(double x){
	this.x = x;
}
public double calculRandom(double x){
	return Math.random()*x;
}
}

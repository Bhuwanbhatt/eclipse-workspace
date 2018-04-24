/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 7/Dec/2017
  Assignment: #12
  Instructor: Gray Newell
 */


import java.text.DecimalFormat;
public class RightTriangle {
private double sideA;
private double  sideB;
DecimalFormat df = new DecimalFormat("0.00");
public RightTriangle(double a , double b) {
	this.sideA =a ;
	this.sideB = b;
			
}
public RightTriangle() {
	sideA = 0;
	sideB = 0;
	
}
public double getHypotenuse() {
	double hypotenuse = Math.sqrt((sideA*sideA)+(sideB*sideB));
	return hypotenuse;
}
public double getangleA() {
	double A = Math.asin(sideA / getHypotenuse());
	return Math.toDegrees(A);
}
double getangleB(){
	double B = Math.asin(sideB / getHypotenuse());
	return Math.toDegrees(B);
}
double getPerimeter(){
	return sideA + sideB + getHypotenuse();
}
double getArea(){
	 
	return (sideA * sideB) * 1 / 2; 
}
public String toString(){
	return "SideA : " + sideA +  "\tSideB : " + sideB + "\tHypotenuse : " + df.format(getHypotenuse()) + "\tPerimeter : " + df.format(getPerimeter()) + "\tArea: "+ df.format(getArea()); 
	
}
void setSideA(double side){
	// Change side if greater than or equal to 0 
	if (side >= 0){
		sideA = side;
	}
	
}

void setSideB(double side){
	if (side >= 0){
		sideB = side;
		}
}
}

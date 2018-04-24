
public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{ //defines octagon class and extends geometricobject and implements compareable and cloneable interfaces.
private double side;
private double area;
private double perimeter;
private boolean wasClone = false;

public Octagon(double side) {//constructor 
	this.side = side;
}
//@Override getArea , gerPerimeter and toString method defined in geometriobject class.
public double getArea() {
	return (2+4/Math.sqrt(2))*side*side;
}
public double getPerimeter() {
	return 8*side;
	
}
public String toString() {
	return("Octangon with side = " + side + " Perimeter = " + getPerimeter() + " area = " + getArea() +" wasClone = " + wasClone);
}
//@overrides the clone method and declares the exception 
public Object clone() throws CloneNotSupportedException{
	Octagon clone = (Octagon)super.clone();
	clone.wasClone = true;
	return clone;
}
//@overrides CompareTo method and compares the area of cloned octagon
public int compareTo(Octagon o) {
	if(getArea() > o.getArea())
		return 1;
	else if(getArea() < o.getArea())
		return -1;
	else 
		return 0;
}
}




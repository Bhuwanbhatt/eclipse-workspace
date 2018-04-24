
public class Laptop implements Comparable<Laptop> {
private double cpu,ram,hdd,screensize,weight,batterylife,price;
boolean graphics;
double cpuMax=3;
double ramMax=32;
double hddMax=2048;
double screensizeMax=17;
double weightMax=6;
double batteryMax=9;
double priceMax=2000;
public static boolean graphics() {
	return Math.random() <1;
}
	public int getGraphics() {
	if (graphics() == true)
		return 1;
		else 
			return 2;
}

public  Laptop( double cpu,double ram,double hdd,double screensize, double weight , double batterylife, double price) {
this.cpu =cpu;
this.ram = ram;
this.hdd = hdd;
this.screensize= screensize;
this.weight = weight;
this.batterylife = batterylife;
this.price = price;

double laptopScore = (2*cpu/cpuMax) + (2*ram/ramMax) + (1*hdd/hddMax)+ getGraphics() + (1*screensize/screensizeMax) + (1*weight/weightMax) + (1*batterylife/batteryMax) + (1*price/priceMax);
	
}


public int randomLaptopCreater () {
	Laptop[] laptop = {
			
		             	new Laptop(Math.random()*3+1,Math.random()*32+4,Math.random()*2080+ 500, Math.random()*17+8,Math.random()*6+2,Math.random()*9+3,Math.random()*2000+500,Math.random()*2+1),
						new Laptop(Math.random()*3+1,Math.random()*32+4,Math.random()*2080+ 500, Math.random()*17+8,Math.random()*6+2,Math.random()*9+3,Math.random()*2000+500),
						new Laptop(Math.random()*3+1,Math.random()*32+4,Math.random()*2080+ 500, Math.random()*17+8,Math.random()*6+2,Math.random()*9+3,Math.random()*2000+500 ),
						new Laptop(Math.random()*3+1,Math.random()*32+4,Math.random()*2080+ 500, Math.random()*17+8,Math.random()*6+2,Math.random()*9+3,Math.random()*2000+500 ),
						new Laptop(Math.random()*3+1,Math.random()*32+4,Math.random()*2080+ 500, Math.random()*17+8,Math.random()*6+2,Math.random()*9+3,Math.random()*2000+500 )};
	return 0;
	        
	
	
	
	}

@Override
public int compareTo(Laptop o) {

	return 0;
}
}


public class BMI {
 private int height;
 private int weight;
 public BMI(){
	height = 0;
	weight = 0;
 }
 public static double getBMI(double weight,double height) {
	 final  double pound =  0.45359237;
	 final double meter = 0.0254;
	 double WeightInKg = weight*pound;
	 double HeightInMeter = height * meter;
	 double BMI = (WeightInKg/(HeightInMeter*HeightInMeter));
	 return BMI;
 }
 public static long getMaxWeight(double height) {
	 final double meter = 0.0254;
	 double HeightInMeter = height * meter; 
	 long weightInPounds = (long) ((25*HeightInMeter*HeightInMeter)/ 0.45359237);
	 return weightInPounds;
 }
 public static void setWeight(int goalweight) {
	double weight = goalweight;
 }
}

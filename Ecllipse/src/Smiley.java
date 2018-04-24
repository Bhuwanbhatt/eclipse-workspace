
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class Smiley extends Application{
	 // Override the start method in the Application class
	 public void start(Stage primaryStage) {
		 // creates a cicle.
		  Circle circle = new Circle(250,250,100);
		  circle.setStroke(Color.BLACK);
		  circle.setFill(null);
		  
		  Circle eye1 = new Circle(220,215,10);
		  eye1.setStroke(Color.BLACK);
		  eye1.setFill(Color.BLACK);
		  //creates a ellipse.
		  Ellipse eye1Base = new Ellipse(220,215,20,15);
		  eye1Base.setStroke(Color.BLACK);
		  eye1Base.setFill(Color.WHITE);
		  
		  Circle eye2 = new Circle(280,215,10);
		  eye2.setStroke(Color.BLACK);
		  eye2.setFill(Color.BLACK);
		  
		  Ellipse eye2Base = new Ellipse(280,215,20,15);
		  eye2Base.setStroke(Color.BLACK);
		  eye2Base.setFill(Color.WHITE);
		  //draws a line.
		  Line nose1 = new Line(250,235,220,280);
		  
		  Line nose2 = new Line(250,235,280,280);
		  
		  Line nose3 = new Line(220,280,280,280);
		
		  Arc smile = new Arc(250,300,25,25,180,180);
		  smile.setType(ArcType.OPEN);
		  smile.setFill(Color.WHITE);
		  smile.setStroke(Color.BLACK);
		  // creates a new pae
		  Pane pane = new Pane();
		  //adds all objects to pane.
		  pane.getChildren().add(circle);
		  pane.getChildren().add(eye1Base);
		  pane.getChildren().add(eye1);
		  pane.getChildren().add(eye2Base);
		  pane.getChildren().add(eye2);
		  pane.getChildren().add(nose1);
		  pane.getChildren().add(nose2);
		  pane.getChildren().add(nose3);
		  pane.getChildren().add(smile);

         // creates a new scene with size 500*500 and adds pane to it
		  Scene scene = new Scene(pane, 500, 500);
		  primaryStage.setTitle("Smiley");//sets title to Simley
		  primaryStage.setScene(scene);//sets scene to stage 
		  primaryStage.show();//shows the stage
	 }

	 public static void main(String[] args) {
	    launch(args);
	}
}
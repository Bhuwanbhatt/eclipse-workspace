import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class ModernArt extends Application{

	public void start(Stage PrimaryStage) {
		Pane pane = new Pane();
		for(int i =0;i<50;i++) {
	  double height =	(int) (Math.random()*100 +10);
	  double width = (int) (Math.random()*100 +10);
	  double xcord = (int)(Math.random()*600 +0);
	  double ycord = (int)(Math.random()*300 + 0);
	  
		Rectangle rec = new Rectangle(xcord,ycord,width,height);
		rec.setFill(Color.color(Math.random(), Math.random(),Math.random()));
		pane .getChildren().add(rec);
	}
	
   Scene scene = new Scene (pane,600,300);
   PrimaryStage.setTitle("Modern Art");
   PrimaryStage.setScene(scene);
   PrimaryStage.show();
   

	}

public static void main(String[] args) {
    launch(args);
}
}

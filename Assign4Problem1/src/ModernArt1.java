
import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;




public class ModernArt1 extends Application{

	private Button draw;
	private TextField objCount;
	private TextField maxSize;
 	ObservableList<String> shapeTypes =
 	FXCollections.observableArrayList("Rectangle", "Circle");
	final ComboBox combobox = new ComboBox(shapeTypes);
	private BorderPane bdrPane = new BorderPane();
	private HBox drawingBarPane;	
  	private int siz=100;
	private int obj=50;	
	Pane artworkPane = new Pane();
	
	private Pane AddHBox(){
	
		drawingBarPane	= new HBox();
		drawingBarPane.setSpacing(8);
		drawingBarPane.setPadding(new Insets(4,4,4,4));
	
		Label lbl1 = new Label("Object Count");		 
		Label lbl2 = new Label("Size");
	
		objCount = new TextField();
		maxSize = new TextField();
		draw = new Button("Draw");	
	 	combobox.setValue("Circle");
	
		drawingBarPane.getChildren().addAll(combobox, lbl1, objCount, lbl2, maxSize, draw);
		
		
		draw.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				artworkPane.getChildren().clear();
				siz = 100;
				obj = 50;
				drawShape();
			}
		});
	    		
		objCount.setOnAction(new EventHandler<ActionEvent>(){
			 public void handle(ActionEvent event){
			 artworkPane.getChildren().clear();
			 obj = Integer.parseInt(objCount.getText());
            drawShape();
       	 }
        });
		maxSize.setOnAction(new EventHandler<ActionEvent>(){
        	 public void handle(ActionEvent event){
        		 artworkPane .getChildren().clear();
        		 siz = Integer.parseInt(maxSize.getText());
                 drawShape();
       	 }
        });
		return drawingBarPane;		
	
	}
	
    @Override           	
	public void start(Stage primeryStage) {		
  	DrawCircle();	     				        			     				      			 		 					        			
    	combobox.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			artworkPane.getChildren().clear();
    	         drawShape();
    				
    		}
    	});			        			
      		
   
    	bdrPane.setBottom(AddHBox());
    	bdrPane.setCenter(artworkPane);
    	
	Scene scene = new Scene(bdrPane, 600, 300);		
    	primeryStage.setTitle("Modern Art");
    	primeryStage.setScene(scene);
    	primeryStage.show(); 		
   
	}
	 private void DrawCircle() {
		 for(int i =0;i < obj;i++) {
				
	     		Circle cir = new Circle (getCenterX(), getCenterY(), getRadius());
	 		    cir.setFill(Color.color(Math.random(), Math.random(),Math.random()));
	 		   artworkPane.getChildren().add(cir); 
		 }
		
	}

	private void drawShape(){
		 if(combobox.getValue()=="Rectangle") {
				for(int i =0;i < obj;i++) {  				          				
		 	    	 
		 	    	     double height =	(int) (Math.random()*siz);
		      		 double width = (int) (Math.random()*siz);
		      		 double xcord = (int)(Math.random()*600 +0);
		      		 double ycord = (int)(Math.random()*180 + 0);   		      				
		      		 Rectangle rec = new Rectangle(xcord,ycord,width,height);        				
		      			 rec.setFill(Color.color(Math.random(), Math.random(),Math.random())); 
		      			 rec.setOpacity(0.5);
		      			artworkPane.getChildren().add(rec);
		      		
			
			}
				 
			}
		
			  
				 if (combobox.getValue() == "Circle"){
					 for(int i =0;i < obj;i++) { 
	      		     Circle cir = new Circle (getCenterX(), getCenterY(), getRadius());
	      		     cir.setFill(Color.color(Math.random(), Math.random(),Math.random()));
	      		     cir.setOpacity(0.5);
	      		   artworkPane.getChildren().add(cir);     
	      		   
				 }
					
				 }		 	 
				 }
     			       				  	
	 private double getRadius() {
		
		return (int) (Math.random()*siz);
	 }
	 private double getCenterY() {
		return (int)(Math.random()*180 +0);
	 }

	 private double getCenterX() {
		return (int)(Math.random()*600 +0);
	 }


	 public static void main(String[] args) {    		 
		 launch(args);

	 }
}

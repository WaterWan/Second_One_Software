package test9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkel extends Application {
	
	public static void main(String[] args) {
		System.out.println("Launching JavaFX application.");
		
		launch();
	}
	
	public void init() {
		System.out.println("Inside the init() method.");
	}

	@Override
	public void start(Stage myStage) {
		System.out.println("Inside the start() method.");
		
		myStage.setTitle("JavaFX Skeleton.");
		
		FlowPane rootNode = new FlowPane();
		
		Scene myScene = new Scene(rootNode, 500, 400);
		
		myStage.setScene(myScene);
		myStage.show();
		
	}
	
	public void stop(){
		System.out.println("Inside the stop() method.");
	}

}

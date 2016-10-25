package test9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
		Scene myScene = new Scene(rootNode, 1000, 1200);
		Image image = new Image("http://img3.redocn.com/20140523/Redocn_2014051521304245.jpg");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		rootNode.getChildren().add(imageView);
		myStage.setScene(myScene);
		myStage.show();
	}

	public void stop() {
		System.out.println("Inside the stop() method.");
	}

}

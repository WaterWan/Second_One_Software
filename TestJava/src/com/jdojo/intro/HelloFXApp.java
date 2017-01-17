package com.jdojo.intro;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloFXApp extends Application {

	@Override
	public void start(Stage stage){
		stage.setTitle("Hello JavaFX Application233");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

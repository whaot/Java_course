package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
public class javafx_3 extends Application {
@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("ok"));
		Scene scene=new Scene(pane,400,250);
		primaryStage.setTitle("button in pane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
//		System.out.println("launch ")
		Application.launch(args);
	}
}

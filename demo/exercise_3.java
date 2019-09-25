package demo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class exercise_3 extends Application {
@Override
	public void start (Stage primaryStage)
	{
	  TextField field = new TextField(); 
      field.setPrefSize(200, 50); 
      field.setEditable(true); // 可编辑
      field.setPromptText("请输入月薪"); 
      field.setAlignment(Pos.CENTER_LEFT); //设置对齐方式
      field.setPrefColumnCount(10); 
      Label label=new Label();
      label.setText("本年应纳税金额：");
      Button btn = new Button("开始计算");
	  btn.setOnAction(new EventHandler<ActionEvent>() {
	      @Override
	      public void handle(ActionEvent event) {
	    	  double in = Double.valueOf(field.getText());
	    	  double out;
	    	  if(in<=5000)
	    		  out=0;
	    	  else if(12*(in-5000)<=36000)
	    		  out=(in-5000)*0.03*12;
	    	  else if(12*(in-5000)<=144000)
	    		  out=(in-5000)*0.1*12-2520;
	    	  else if(12*(in-5000)<=300000)
	    		  out=(in-5000)*0.2*12-16920;
	    	  else if(12*(in-5000)<=420000)
	    		  out=(in-5000)*0.25*12-31920;
	    	  else if(12*(in-5000)<=660000)
	    		  out=(in-5000)*0.3*12-52920;
	    	  else if(12*(in-5000)<=960000)
	    		  out=(in-5000)*0.35*12-85920;
	    	  else
	    		  out=(in-5000)*0.45*12-181920;
	    	  out=(double) Math.round(out * 100) / 100;
	          label.setText("本年应纳税金额："+out);
	      }
	  });
	  BorderPane pane=new BorderPane();
      pane.setCenter(btn);
      pane.setTop(field);
      pane.setBottom(label);
      Scene scene=new Scene(pane,400,250);
      primaryStage.setScene(scene);
	  primaryStage.setTitle("个人所得税计算器");
	  primaryStage.setResizable(false);//锁定大小
	  primaryStage.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
}
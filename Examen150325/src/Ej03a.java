import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Ej03a extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 3");
        Group grupo=new Group();
        Text titulo = new Text("Circulo Creciente");
        Button botón = new Button("Ampliar 1/3");
        int radio=30;
        Circle circulo = new Circle(10+radio,150,radio);
        grupo.getChildren().addAll(titulo,botón,circulo);
        
        primaryStage.setScene(new Scene(grupo,620,700));
        primaryStage.show();
        
        titulo.setLayoutX(10);
        titulo.setLayoutY(40);
        botón.setLayoutX(320/2-botón.getBoundsInParent().getWidth()/2);
        botón.setLayoutY(360);
        circulo.setFill(null);
        circulo.setStroke(Color.DARKBLUE);
        circulo.setStrokeWidth(5);
               
        
        botón.setOnAction(e -> {
                int ancho=(int) (circulo.getStrokeWidth()*(4.0/3.0));
                circulo.setStrokeWidth(ancho);
                circulo.setRadius(circulo.getRadius()+ancho*2);
        });
	}

	public static void main(String[] args) {
		launch(args);
	}

}

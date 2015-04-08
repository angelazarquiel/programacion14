import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Ej03b extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ejercicio 3");
        Group grupo=new Group();
        Text titulo = new Text("Rectángulo menguante");
        Button botón = new Button("Reducir 1/3");
        int anchoInicial=300;
        Rectangle rectángulo = new Rectangle(10,50,anchoInicial,anchoInicial);
        grupo.getChildren().addAll(titulo,botón,rectángulo);
        
        primaryStage.setScene(new Scene(grupo,320,400));
        primaryStage.show();
        
        titulo.setLayoutX(10);
        titulo.setLayoutY(40);
        botón.setLayoutX(320/2-botón.getBoundsInParent().getWidth()/2);
        botón.setLayoutY(360);
        rectángulo.setFill(Color.DARKRED);          
        
        botón.setOnAction(e -> {
                int ancho=(int) (rectángulo.getWidth()*2/3);
                rectángulo.setWidth(ancho);
                rectángulo.setHeight(ancho);
                rectángulo.setLayoutX(rectángulo.getLayoutX()+ancho/4);
                rectángulo.setLayoutY(rectángulo.getLayoutY()+ancho/4);
        });
	}

	public static void main(String[] args) {
		launch(args);
	}

}

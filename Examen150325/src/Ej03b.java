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
        Text titulo = new Text("Rect�ngulo menguante");
        Button bot�n = new Button("Reducir 1/3");
        int anchoInicial=300;
        Rectangle rect�ngulo = new Rectangle(10,50,anchoInicial,anchoInicial);
        grupo.getChildren().addAll(titulo,bot�n,rect�ngulo);
        
        primaryStage.setScene(new Scene(grupo,320,400));
        primaryStage.show();
        
        titulo.setLayoutX(10);
        titulo.setLayoutY(40);
        bot�n.setLayoutX(320/2-bot�n.getBoundsInParent().getWidth()/2);
        bot�n.setLayoutY(360);
        rect�ngulo.setFill(Color.DARKRED);          
        
        bot�n.setOnAction(e -> {
                int ancho=(int) (rect�ngulo.getWidth()*2/3);
                rect�ngulo.setWidth(ancho);
                rect�ngulo.setHeight(ancho);
                rect�ngulo.setLayoutX(rect�ngulo.getLayoutX()+ancho/4);
                rect�ngulo.setLayoutY(rect�ngulo.getLayoutY()+ancho/4);
        });
	}

	public static void main(String[] args) {
		launch(args);
	}

}

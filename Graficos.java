import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;

import javafx.scene.image.Image;
/**
 * Write a description of class Graficos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graficos extends Application
{

    private static final float ANCHO_DE_LA_ESCENA = 800;
    private static final float ALTO_DE_LA_ESCENA = 600;
    private static final String TITULO_DE_LA_VENTANA = "Grafico";

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        // Creacion y configuraciono de la escena y el escenario:
        Pane panel = new Pane();
        Scene escena = new Scene(panel, ANCHO_DE_LA_ESCENA, ALTO_DE_LA_ESCENA);
        primaryStage.setScene(escena);
        primaryStage.setTitle(TITULO_DE_LA_VENTANA);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();

        
        // Inicializamos los recursos multimedia
        try{
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        primaryStage.show();
    }
}

package de.mfo.surfer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Surfer extends Application
{
	final Logger logger = LoggerFactory.getLogger( Surfer.class );

        public static void main( String args[] )
	{
                launch( args );
        }

        @Override
        public void start( Stage stage )
	{
                Button btn = new Button( "Click ");
                btn.setOnAction(e -> logger.info( "Hello JavaFX 8 SURFER" ) );
                StackPane root = new StackPane();
                root.getChildren().add( btn );
                stage.setScene( new Scene( root ) );
                stage.setWidth( 300 );
                stage.setHeight( 300 );
                stage.setTitle("JavaFX 8 app");
                stage.show();
        }
}

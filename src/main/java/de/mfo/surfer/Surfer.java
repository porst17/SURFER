package de.mfo.surfer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import jfxtras.labs.scene.layout.ScalableContentPane;

import de.mfo.surfer.ui.*;

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
                throws Exception
	    {
                logger.info( "loading user interface" );

                FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource( "Surfer.fxml" ) );

                ScalableContentPane scp = new ScalableContentPane();
                scp.getContentPane().getChildren().add( fxmlLoader.load() );

                Scene scene = new Scene( scp );
                scene.getStylesheets().add(getClass().getResource("css/color.css").toExternalForm());

                VBox colorPickersVBox = ( VBox ) scp.lookup( "#colorPickers" );
                colorPickersVBox.getChildren().clear();
                colorPickersVBox.getChildren().add( new CustomColorPicker() );
                colorPickersVBox.getChildren().add( new CustomColorPicker() );

                stage.setTitle("SURFER");
                stage.setScene( scene );
                stage.setWidth( 1280 );
                stage.setHeight( 720 );
                stage.show();
        }
}

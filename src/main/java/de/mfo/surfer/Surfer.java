package de.mfo.surfer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import jfxtras.labs.scene.layout.ScalableContentPane;

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

                ScalableContentPane scp = new ScalableContentPane();
                scp.getContentPane().getChildren().add( FXMLLoader.load( getClass().getResource( "Surfer.fxml" ) ) );

                Scene scene = new Scene( scp );

                stage.setTitle( "SURFER" );
                stage.setScene( scene );
                stage.setWidth( 1280 );
                stage.setHeight( 720 );
                stage.show();
        }
}

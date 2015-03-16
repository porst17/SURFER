package de.mfo.surfer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

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
                Scene scene = new Scene( FXMLLoader.load( getClass().getResource( "Surfer.fxml" ) ) );
                stage.setScene( scene );
                stage.setTitle( "SURFER" );
                stage.show();
        }
}

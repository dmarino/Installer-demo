package com.dmarino.app;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Main() {
		
		
		getContentPane( ).setLayout( new BorderLayout( ) );
        setSize( 100, 120 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo( null );
        setResizable( false );
        setTitle( "Test" );
        
        SubClass panel = new SubClass(); 
        add(panel, BorderLayout.CENTER);		
	}
	
	public static void main(String[] args) {	
        Main main = new Main( );

        try {
            URL resource = main.getClass().getResource("/resources/test.png");
            BufferedImage image = ImageIO.read(resource);
            main.setIconImage(image);
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
        
        main.setVisible( true );        
	}
}

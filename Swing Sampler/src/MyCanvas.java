import java.awt.*;

import javax.swing.*;
//COMMENT CMOMENT COMMENT CMOMENT

public class movingSquare extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        MovingSquare canvas = new MovingSquare();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		
	        graphics.setColor(Color.red);
	        graphics.fillOval(140, 130, 100, 100);
	        
	        graphics.setColor(Color.blue);
	        graphics.fillRect(10, 10, 200, 100);
	        
	        graphics.setColor(Color.black);
	        graphics.drawLine(40, 30, 330, 380);
	        
	        
	        for (int x = 0; x < 20; x++){
	        for (int i = 0; i < 325; i = i + 5)
	        	{
		        graphics.setColor(Color.green);
		        graphics.fillRect(300, i, 50, 50);
		        
		        delay();
		        
		        graphics.setColor(Color.white);
		        graphics.fillRect(300, i, 50, 50);
	        	}
	        
	        for (int i = 325; i > 0; i = i - 5)
	        	{
		        graphics.setColor(Color.green);
		        graphics.fillRect(300, i, 50, 50);
		        
		        delay();
		        
		        graphics.setColor(Color.white);
		        graphics.fillRect(300, i, 50, 50);
	        	}
	        }
	        
    		}
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(50);
    					} catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}
	
package com.assignment_5.calculator.calculator_larsw;

import static org.junit.Assert.*;

import java.awt.Button;
import java.awt.Component;
import java.util.logging.Logger;

import javax.swing.JPanel;

import org.junit.Test;

import com.assignment_5.calculator.operations.CalculatorBasicOperations;
import com.assignment_5.calculator.panels.BasicPanel;

import junit.framework.TestCase;

public class BasicPanelTest extends TestCase{
	public static final Logger LOG = Logger.getLogger(BasicPanel.class.getName());
	
	@Test
	public void testBasicPanel() {
	        Button btn1 = new Button();
	        assertNotNull(btn1);
//	        JPanel BasicPanel=btn1;
//	        btn1.activate();
			int height=btn1.getHeight();
			System.out.println(height);
	        int width=btn1.getWidth();
	        LOG.info("Testing the Button btn1");
	        assertEquals(50,height);
	        assertEquals(50,width);
	        int x=btn1.getX();
	        int y=btn1.getY();
	        assertEquals(2,x);
	        assertEquals(158,y);
//	        int x1=tf.getX();
//	        int y1=tf.getY();
//	        assertEquals(50,x1);
//	        assertEquals(50,y1);
	        
	
	        
/*	        btn.run();
	        b.doClick();

	        String str=tf1.getText().toString();
	        assertEquals("Welcome to junit.",str);
*/	    }

}

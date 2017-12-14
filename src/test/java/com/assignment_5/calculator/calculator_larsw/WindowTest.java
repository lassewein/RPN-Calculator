package com.assignment_5.calculator.calculator_larsw;

import static org.junit.Assert.*;

import java.awt.Frame;
import java.util.logging.Logger;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.assignment_5.calculator.panels.BasicPanel;
import com.assignment_5.calculator.windows.WindowBasic;

import junit.framework.TestCase;

public class WindowTest extends TestCase{
	public static final Logger LOG = Logger.getLogger(WindowBasic.class.getName());
	
	private JFrame testFrame;

    protected void tearDown(  ) throws Exception {
        if (this.testFrame != null) {
            this.testFrame.dispose();
            this.testFrame = null;
        }
    }

    public JFrame getTestFrame(  ) {
        if (this.testFrame == null) {
            this.testFrame = new JFrame("Test");
        }
        return this.testFrame;
    }
	

	@Test
	public void testIsShowing() {
		LOG.info("Test");
	}
}

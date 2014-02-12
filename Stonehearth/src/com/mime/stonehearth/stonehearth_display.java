package com.mime.stonehearth;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class stonehearth_display {

	public static void main(String[] args) {
		try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.setTitle("Stonehearth Pre-Alpha 0.0.1");
            Display.create();
        } catch (LWJGLException e) {
            System.err.println("Display wasn't initialized correctly.");
            System.exit(1);
        }
 
        while (!Display.isCloseRequested()) {
            Display.update();
            Display.sync(60);
        }
 
        Display.destroy();
        System.exit(0);

	}

}

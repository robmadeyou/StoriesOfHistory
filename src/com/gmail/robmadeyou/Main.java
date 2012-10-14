package com.gmail.robmadeyou;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;
import static org.lwjgl.opengl.GL11.GL_LINES;

import java.text.DecimalFormat;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.FloatBuffer;

public class Main {
    
    public static String command = "";
    public static String commandExecuted = "";
    
    public static boolean fontsLoaded = false;
	public Main(){
		
		try {
			Display.setDisplayMode(new DisplayMode(640,480));
			Display.setTitle("");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho( 0, 640, 480, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
		
		GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		
		while(!Display.isCloseRequested()){
			if(!fontsLoaded){
				Fonts.setUpFonts();
				fontsLoaded = true;
			}
			glClear(GL_COLOR_BUFFER_BIT);
			onUpdate();
			if(commandExecuted.toLowerCase().equals("red")){
				Screen.c10 = java.awt.Color.red;
				Screen.chatBasic("Dis is me, I am red");
				Screen.chatBasic("Today is a great day to sing a song");
				commandExecuted = "";
			}
			if(commandExecuted.toLowerCase().equals("hello")){
				System.out.println("YO, this is niggaawatt");
				
				commandExecuted = "";
			}else{
				
			}
			Display.update();
			Display.sync(60);
		}
		Display.destroy();
		System.exit(0);
	
	}
	
	
	public void onUpdate(){
		Input.checkInput();
		Screen.update();
		State.stateDecider();
		drawLine();
	}
	public void drawLine(){
	}
	

	
	public static void main(String args[]){
		new Main();
	}
}

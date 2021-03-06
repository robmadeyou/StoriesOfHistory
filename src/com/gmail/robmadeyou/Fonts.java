package com.gmail.robmadeyou;

import java.awt.Font;
import java.io.InputStream;
import java.text.DecimalFormat;

import org.lwjgl.util.Color;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.util.ResourceLoader;

public class Fonts {
	
	//default text font, used for command
    static UnicodeFont defFont;
    
    //Used for teaching stuff and stuff you know for stuff
    static UnicodeFont guideFont;
    
    //Used for the command line input
    @SuppressWarnings("deprecation")
	static TrueTypeFont command;
    
    //Used for the main chat box
    static UnicodeFont chat;
    
    //Used for all the variables
    static UnicodeFont variables;
    
    static UnicodeFont time;
    
    
    //Colour initialization for chat strings
    public static java.awt.Color color = java.awt.Color.white;
    
    private static DecimalFormat formatter = new DecimalFormat("#.##");
    
    
	
    static void setUpFonts() {
    	commandFont();
    	textBox();
    	variableList();
    }
    static void commandFont(){
        try {
        	InputStream inputStream = ResourceLoader.getResourceAsStream("res\\fonts\\601.ttf");
        	Font awtFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
        	awtFont = awtFont.deriveFont(16f); // set font size
        	command = new TrueTypeFont(awtFont, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void textBox(){
    	java.awt.Font awtFont = new java.awt.Font("Times Roman", 0,16);
        chat = new UnicodeFont(awtFont);
        chat.getEffects().add(new ColorEffect(java.awt.Color.LIGHT_GRAY));
        chat.addAsciiGlyphs();
    	try {
            chat.loadGlyphs();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    static void variableList(){
    	java.awt.Font awtFont = new java.awt.Font("Times Roman", 0,16);
        variables = new UnicodeFont(awtFont);
        variables.getEffects().add(new ColorEffect(java.awt.Color.WHITE));
        variables.addAsciiGlyphs();
    	try {
            variables.loadGlyphs();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

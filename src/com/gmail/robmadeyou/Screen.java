package com.gmail.robmadeyou;

import java.awt.Color;

public class Screen {
	
	static String t1 = "";
	static String t2 = "";
	static String t3 = "";
	static String t4 = "";
	static String t5 = "";
	static String t6 = "";
	static String t7 = "";
	static String t8 = "";
	static String t9 = "";
	static String t10 = "";
	static String t11 = "";
	static String t12 = "";
	static String t13 = "";
	static String t14 = "";
	static String t15 = "";
	static String t16 = "";
	static String t17 = "";
	static String t18 = "";
	static String t19 = "";
	static String t20 = "";
	static String t21 = "";
	
	static Color c1 = java.awt.Color.WHITE;
	static Color c2 = java.awt.Color.WHITE;
	static Color c3 = java.awt.Color.WHITE;
	static Color c4 = java.awt.Color.WHITE;
	static Color c5 = java.awt.Color.WHITE;
	static Color c6 = java.awt.Color.WHITE;
	static Color c7 = java.awt.Color.WHITE;
	static Color c8 = java.awt.Color.WHITE;
	static Color c9 = java.awt.Color.WHITE;
	static Color c10 = java.awt.Color.WHITE;
	static Color c11 = java.awt.Color.WHITE;
	static Color c12 = java.awt.Color.WHITE;
	static Color c13 = java.awt.Color.WHITE;
	static Color c14 = java.awt.Color.WHITE;
	static Color c15 = java.awt.Color.WHITE;
	static Color c16 = java.awt.Color.WHITE;
	static Color c17 = java.awt.Color.WHITE;
	static Color c18 = java.awt.Color.WHITE;
	static Color c19 = java.awt.Color.WHITE;
	static Color c20 = java.awt.Color.WHITE;
	static Color c21 = java.awt.Color.WHITE;
	
	static int cursorBlink = 0;
	static String cursor = "";
	
	static String lastText = "";
	public static void blink(){
		
		if(cursorBlink > 0 && cursorBlink < 50){
			cursor = "";
		}
		if(cursorBlink > 50 && cursorBlink < 100){
			cursor = "|";
		}
		if(cursorBlink > 100){
			cursorBlink = 0;
		}
		cursorBlink++;
	}
	public static void update(){
		blink();
		chatDisplay();
		commandLine();
		variableDraw();
		
	}
	public static void commandLine(){
		Fonts.command.drawString(0, 460, " > "+ Main.command + cursor);
	}
	public static void chatDisplay(){
		Fonts.color = c21;
		Fonts.chat.drawString(0, 40, t21);
		Fonts.color = c20;
		Fonts.chat.drawString(0, 60, t20);
		Fonts.color = c19;
		Fonts.chat.drawString(0, 80, t19);
		Fonts.color = c18;
		Fonts.chat.drawString(0, 100, t18);
		Fonts.color = c17;
		Fonts.chat.drawString(0, 120, t17);
		Fonts.color = c16;
		Fonts.chat.drawString(0, 140, t16);
		Fonts.color = c15;
		Fonts.chat.drawString(0, 160, t15);
		Fonts.color = c14;
		Fonts.chat.drawString(0, 180, t14);
		Fonts.color = c13;
		Fonts.chat.drawString(0, 200, t13);
		Fonts.color = c12;
		Fonts.chat.drawString(0, 220, t12);
		Fonts.color = c11;
		Fonts.chat.drawString(0, 240, t11);
		Fonts.color = c10;
		Fonts.chat.drawString(0, 260, t10);
		Fonts.color = c9;
		Fonts.chat.drawString(0, 280, t9);
		Fonts.color = c8;
		Fonts.chat.drawString(0, 300, t8);
		Fonts.color = c7;
		Fonts.chat.drawString(0, 320, t7);
		Fonts.color = c6;
		Fonts.chat.drawString(0, 340, t6);
		Fonts.color = c5;
		Fonts.chat.drawString(0, 360, t5);
		Fonts.color = c4;
		Fonts.chat.drawString(0, 380, t4);
		Fonts.color = c3;
		Fonts.chat.drawString(0, 400, t3);
		Fonts.color = c2;
		Fonts.chat.drawString(0, 420, t2);
	}
	public static void chatUpdate(String text){
		t21 = t20;
		t20 = t19;
		t19 = t18;
		t18 = t17;
		t17 = t16;
		t16 = t15;
		t15 = t14;
		t14 = t13;
		t13 = t12;
		t12 = t11;
		t11 = t10;
		t10 = t9;
		t9 = t8;
		t8 = t7;
		t7 = t6;
		t6 = t5;
		t5 = t4;
		t4 = t3;
		t3 = t2;
		t2 = text;
	}
	
	public static void chatCommand(String text){
		chatUpdate(">" + text);
	}
	public static void chatBasic(String text){
		chatUpdate(text);
	}
	public static void chatSingle(String text){
		if(text != lastText){
			chatUpdate(text);
			lastText = text;
		}
	}
	public static void add(String text){
		
	}
	static void variableDraw(){
		Fonts.variables.drawString(0, 0, "Location: " + Game.location);
		Game.money ++;
		Fonts.variables.drawString(0, 20, "Mood: " + Game.moodTranslated());
		Fonts.variables.drawString(150, 0, "Health: " + Game.health);
		Fonts.variables.drawString(150, 20, "Fatigue: " + Game.fatigue + "%");
		Fonts.variables.drawString(300, 0, "Hunger: " + Game.hunger + "%");
		Fonts.variables.drawString(300, 20, "Thirst: " + Game.thirst + "%");
		Fonts.variables.drawString(450, 0, "Money: " + Game.money);
		Fonts.variables.drawString(450, 20, "Time: " + Game.timeMinute());
	}
}

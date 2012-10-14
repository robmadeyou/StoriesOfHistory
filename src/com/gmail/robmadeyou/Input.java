package com.gmail.robmadeyou;

import org.lwjgl.input.Keyboard;

public class Input {
	
	public static void checkInput(){
		while(Keyboard.next()){
			backspacePressed();
			bPressed();
			getCommand();
		}
	}
	
	public static void backspacePressed(){
		if(Keyboard.getEventKeyState()){
			if(Keyboard.isKeyDown(Keyboard.KEY_BACK)){
				Main.command = "";
			}
		}
	}
	
	public static void bPressed(){
		if(Keyboard.getEventKeyState()){
			if(Keyboard.isKeyDown(Keyboard.getEventKey())){
				if(isOnlyLettersNumbers(Keyboard.getKeyName(Keyboard.getEventKey()).toLowerCase())){
					Main.command += Keyboard.getKeyName(Keyboard.getEventKey());
				}
			}
		}
	}
	
	public static boolean isOnlyLettersNumbers(String k){
		if(k.equals("q") || k.equals("w") || k.equals("e") || k.equals("r") || k.equals("t") || k.equals("y") || k.equals("u") || k.equals("i") || k.equals("o") || k.equals("p") || k.equals("a")
			|| k.equals("s") || k.equals("d") || k.equals("f") || k.equals("g") || k.equals("h") || k.equals("j") || k.equals("k") || k.equals("l") || k.equals("z") || k.equals("x") || k.equals("c")
			 || k.equals("v") || k.equals("b") || k.equals("n") || k.equals("m") || k.equals("1") || k.equals("2") || k.equals("3") || k.equals("4") || k.equals("5") || k.equals("6") || k.equals("7")
			 || k.equals("8") || k.equals("9") || k.equals("0")){
			return true;
		}
		return false;
	}
	public static void getCommand(){
		if(Keyboard.getEventKeyState()){
			if(Keyboard.isKeyDown(Keyboard.KEY_RETURN)){
				Main.commandExecuted = Main.command;
				Screen.chatCommand(Main.command);
				Main.command = "";
			}
		}
	}
	public static boolean isCommand(String command){
		if(Main.commandExecuted.toLowerCase().equals(command)){
			Main.commandExecuted = "";
			return true;
		}
		return false;
	}
}

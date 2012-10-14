package com.gmail.robmadeyou;

import org.lwjgl.opengl.Display;

public class StateMenu {
	static boolean menuLoaded = false;
	public static void onUpdate(){
		chat();
		commandCheck();
	}
	public static void chat(){
		if(!menuLoaded){
			Screen.chatBasic("#########################################################");
			Screen.chatBasic("                                  ##      Stories-Of-History      ##");
			Screen.chatBasic("#########################################################");
			Screen.chatBasic("#------------------START-your-exploration-of-life---------------------#");
			Screen.chatBasic("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
			Screen.chatBasic("#--------------------------Ask-for-GUIDANCE---------------------------#");
			Screen.chatBasic("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
			Screen.chatBasic("#------------------------------CREDITS--------------------------------#");
			Screen.chatBasic("#-----------------------QUIT-your-quest-of-life-----------------------#");
			Screen.chatBasic("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
			Screen.chatBasic("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
			Screen.chatBasic("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
			menuLoaded = true;
		}
	}
	public static void commandCheck(){
		if(Input.isCommand("start")){
			System.out.println("Cows are indeed amazing");
			State.state = "GAME";
		}else if(Input.isCommand("ask")){
			System.out.println("pigs are fascinating creatures");
			State.state = "ASK";
		}else if(Input.isCommand("quit")){
			Display.destroy();
			System.exit(0);
		}
	}
}

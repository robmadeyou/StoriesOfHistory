package com.gmail.robmadeyou;

public class StateAsk {
	static boolean chatIni = false;
	
	
	public static void onUpdate(){
		chat();
		commandCheck();
	}
	public static void chat(){
		if(!chatIni){
			Screen.chatBasic("Welcome to the Help menu, here you can learn quite a few of the commands.");
			Screen.chatBasic("");
			Screen.chatBasic("(type back to go back any time)");
			chatIni = true;
		}
	}
	public static void commandCheck(){
		if(Input.isCommand("back")){
			State.state = "MAIN_MENU";
			chatIni = false;
		}
	}
}

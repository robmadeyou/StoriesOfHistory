package com.gmail.robmadeyou;

public class StateCredits {
	static boolean creditsIni = false;
	
	public static void onUpdate(){
		chat();
		commandCheck();
	}
	public static void chat(){
		if(!creditsIni){
			Screen.chatBasic("Made by RobMadeYou and NeverLost");
			Screen.chatBasic("+++ A massive thansk to Neverlost for helping me create the game");
			Screen.chatBasic("+++ and helping me with some of the concepts. Couldn't have done it without you");
			Screen.chatBasic("+++ buddy.");
			Screen.chatBasic("+++ Thanks a million to Matylda, for awesome support. I love you <3");
			Screen.chatBasic("+++ To Niamh. Herro :3");
			creditsIni = true;
		}
	}
	public static void commandCheck(){
		if(Input.isCommand("back")){
			State.state = "MAIN_MENU";
			creditsIni = false;
		}
	}
	
}

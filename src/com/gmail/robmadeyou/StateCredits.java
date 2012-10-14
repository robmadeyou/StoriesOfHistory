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
			Screen.chatBasic("+++ A massive thanks to Neverlost for helping me create the game");
			Screen.chatBasic("+++ and helping me with some of the concepts. Couldn't have done it without you buddy.");
			Screen.chatBasic("+++ Thanks to Cody and Lewiz for helping test the game out.");
			Screen.chatBasic("++++ Thanks a million to Matylda, for awesome support.");
			Screen.chatBasic("+++++ Dedicated to Niamh, thanks for existing. <3");
			Screen.chatBasic("");
			Screen.chatBasic("(Type \"back\" to go to Main Menu)");
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

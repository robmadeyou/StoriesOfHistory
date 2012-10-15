package com.gmail.robmadeyou;

public class Game {
	
	//Added To Save
	static String location = "HOUSE";
	static String pLocation(){
		if(location.equals("HOUSE")){
			return "Your house";
		}else if(location.equals("")){
			
		}
		return "null";
	}
	
	static int money = 10;
	
	static boolean firstTime = true;
	
	public static void onUpdate(){
		if(location.equals("HOUSE")){
			if(Input.isCommand("save")){
				firstTime = false;
				Save.saveGame();
			}
			if(firstTime){
				Screen.chatBasic("-----Welcome to your life-----");
				Screen.chatBasic("From here on, you will start your life as a new person. Changing everything that");
				Screen.chatBasic("was; and changing what will be. Will you end up a big shot? Or live your life alone...");
				Screen.chatBasic("It's your time to decide.");
				Screen.chatBasic("(type \"inspect\" to check around your house");
			}
		}
	}
}

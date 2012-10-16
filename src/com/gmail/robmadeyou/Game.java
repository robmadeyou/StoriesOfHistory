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
	/*
	 * Health. Max = 100, min = 0 
	 * If health is at 0 player dies.. Tough shit, right?
	 * 
	 * Health goes down if you haven't eaten and or drank anything 
	 * for a while. It also goes down if you are unhappy, or tired
	 */
	static int health = 100;
	
	/*
	 * Fatigue, it's in %. Once it reaches like 100%
	 * your player will literally fall asleep on the floor and be unhappy
	 * and stuff
	 */
	static int fatigue = 0;
	
	/*
	 * Thirst is a % you can last 3 days maximum without drinking
	 * but your health will go down if you don't drink at least once 
	 * a day
	 */
	static int thirst = 0;
	
	/*
	 * Hunger is a % you can survive for 10 days max without eating
	 * but your health will go down if you don't eat at least once
	 * a day
	 */
	static int hunger = 0;
	
	
	
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

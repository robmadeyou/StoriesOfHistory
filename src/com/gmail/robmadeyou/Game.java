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
	/*
	 * Mood will change through the game, depending on the things you do, the things
	 * you like doing will boost up your mood, but things that you
	 * Moods are:
	 * happy
	 * sad
	 * satisfied
	 * indifferent
	 * grumpy
	 */
	static String mood = "happy";
	
	static String moodTranslated(){
		if(mood == "happy"){
			return "Happy";
		}else if(mood == "sad"){
			return "Sad";
		}else if(mood == "satisfied"){
			return "Satisfied";
		}else if(mood == "indifferent"){
			return "Indifferent";
		}else if(mood == "grumpy"){
			return "Grumpy";
		}
		return "null";
	}
	
	/*
	 * It has come to time.. This variable will check the Ticks in game for Time :p
	 * 28,800 ticks for a full day
	 */
	static int time = 0;
	
	static int timeMinute(){
		
		return (time / 2) / 10;
	}
	static boolean firstTime = true;
	//Chat Loaded booleans.. I'm silly I know :(
	static boolean firstTimeChat1 = false;
	public static void onUpdate(){
		timeUpdate();
		if(location.equals("HOUSE")){
			if(Input.isCommand("save")){
				firstTime = false;
				Save.saveGame();
			}
			if(firstTime){
				if(!firstTimeChat1){
					Screen.chatBasic("-----Welcome to your life-----");
					Screen.chatBasic("From here on, you will start your life as a new person. Changing everything that");
					Screen.chatBasic("was; and changing what will be. Will you end up a big shot? Or live your life alone...");
					Screen.chatBasic("It's your time to decide.");
					Screen.chatBasic("(type \"look around\" to check around your house");
					firstTimeChat1 = true;
				}
				if(Input.isCommand("look around")){
					Screen.chatBasic("--You look around the room--");
					Screen.chatBasic("There is a NOTE on the table");
					Screen.chatBasic("(the words that are in uppercase are commands, type the object to interact with it)");
				}
				if(Input.isCommand("note")){
					Screen.chatBasic("--You pick up the note--");
					Screen.chatBasic("It's written: " + StateGame.name + ", congratulations on passing your tests");
				}
			}
		}
	}
	public static void timeUpdate(){
		time++;
		
		System.out.println(time);
	}
}

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
	static int lastTime = 0;
	
	
	
	//Max = 60 mins obviously
	static int timeMinute = 0;
	//max 23 hours obviously
	static int timeHour = 0;
	static int timeHourRaw = 0;
	// max 30 days for now anyway
	static int timeDay = 0;
	static int timeDayRaw = 0;
	// max 12 months
	static int timeMonth = 0;
	static int timeMonthRaw = 0;
	//max unlimited years
	static int timeYear = 0;
	static int timeYearRaw = 0;
	
	//Game time used for things in game, 24 hour army time stuffs
	static int aTime = 0;
	
	static boolean firstTime = true;
	//Chat Loaded booleans.. I'm silly I know :(
	static boolean firstTimeChat1 = false;
	
	
	public static void onUpdate(){
		timeUpdate();
		if(location.equals("HOUSE")){
			if(firstTime){
				if(!firstTimeChat1){
					Screen.chatBasic("-----Welcome to your life-----");
					Screen.chatBasic("From here on, you will start your life as a new person. Changing everything that");
					Screen.chatBasic("was; and changing what will be. Will you end up a big shot? Or live your life alone...");
					Screen.chatBasic("It's your time to decide.");
					Screen.chatBasic("(type \"look around\" to check around your house)");
					firstTimeChat1 = true;
				}
				if(Input.isCommand("look around")){
					Screen.chatBasic("--You look around the house--");
					Screen.chatBasic("There is a NOTE on the table");
					Screen.chatBasic("(the words that are in uppercase are commands, type the object to interact with it)");
				}
				if(Input.isCommand("note")){
					Screen.chatBasic("--You pick up the note--");
					Screen.chatBasic("It's written: " + StateGame.name + ", congratulations on passing your tests.");
					Screen.chatBasic("even though you could have done better. Now is your chance to shine and be");
					Screen.chatBasic("the best person out there!");
					Screen.chatBasic("--end--");
					Screen.chatBasic("All the commands have been explained in the Ask menu.");
					Screen.chatBasic("type END to quit from the introduction");
				}
				if(Input.isCommand("end")){
					firstTime = false;
				}
			}else{
				if(Input.isCommand("look around")){
					Screen.chatBasic("--You look around the house--");
					Screen.chatBasic("You can use the following:");
					Screen.chatBasic("");
				}
			}
		}
	}
	
	/*
	 * This.. was annoying to do, but I have it done, still quite buggy but works! 
	 * Saving and loading works with it too
	 * 
	 */
	public static void timeUpdate(){
		time++;
		timeMinute = ((time / 2) / 10) - timeHour * 60;
		timeHour = timeHourRaw - timeDay * 24;
		timeDay = timeDayRaw - timeMonth * 30;
		timeMonth = timeMonthRaw - timeYear * 12;
		timeYear = timeYearRaw;
		aTime = (timeHour * 100) + timeMinute;
		if(timeMinute >= 60 && lastTime != time - 1){
			timeHourRaw ++;
			lastTime = time;
		}
		if(time >= 28800){
			timeDayRaw++;
		}
		if(timeDay >= 30){
			timeMonthRaw++;
		}
		if(timeMonth >= 12){
			timeYearRaw++;
		}
		if(time >= 28800){
			time = 0;
		}
	}
}

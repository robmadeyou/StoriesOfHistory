package com.gmail.robmadeyou;

public class StateGame {
	
	static boolean firstTime = true;
	
	/*
	 * GameState list =
	 * 
	 * LOAD_GAME
	 * NEW_GAME
	 * GENDER_SELECT
	 * NAME_SELECT
	 * HISTORY_SELECT
	 */
	static String gameState = "LOAD_GAME";
	
	
	//String booleans... shit stuff, really boring :(
	static boolean isPromtedToLoadGame = false;
	static boolean isShownInfoAboutGame = false;
	static boolean isGenderAsked = false;
	
	
	
	//IMPORTANT GAME VARIABLES! IMPORTANTES!
	//Only male or female.. Sorry lewiz
	static String gender = "";
	//Select name... Won't be used for much really...
	static String name = "";
	/*
	 * Select history. 
	 * 0 = Poor family, hardly surviving on anything
	 * 1 = Rich family get anything you want
	 * 2 = Moderate family, strict but caring
	 * 3 = Moderate family don't give a crap about kid
	 */
	static int history = 0;
	public static void onUpdate(){
		stateDecider();
	}
	
	public static void stateDecider(){
		if(gameState.equals("LOAD_GAME")){
			loadGame();
			
		}else if(gameState.equals("NEW_GAME")){
			newGame();
		}else if(gameState.equals("GENDER_SELECT")){
			
		}
	}
	static void loadGame(){
		
		if(!isPromtedToLoadGame){
			Screen.chatBasic("Would you like to start a NEW game or LOAD a save?");
			isPromtedToLoadGame = true;
		}
		if(Input.isCommand("new")){
			gameState = "NEW_GAME";
			Screen.chatBasic("-New Game started-");
			isPromtedToLoadGame = false;
		}else if(Input.isCommand("load")){
			Save.loadGame();
			if(Save.loaded == true){
				Screen.chatBasic("Save Successfully loaded!");
				isPromtedToLoadGame = false;
			}else{
				Screen.chatBasic("Save does not exist. Start NEW game");
				isPromtedToLoadGame = false;
			}
		}
	}
	
	static void newGame(){
		if(!isShownInfoAboutGame){
			Screen.chatBasic("Welcome");
			Screen.chatBasic("Everything will be explained shortly");
			Screen.chatBasic("(If you would like to learn about COMMANDS type \"COMMANDS\")");
			Screen.chatBasic("(To continue type \"c\")");
			isShownInfoAboutGame = true;
		}
		if(Input.isCommand("commands")){
			State.state = "ASK";
			isShownInfoAboutGame = false;
		}else if(Input.isCommand("c")){
			gameState = "GENDER_SELECT";
			Screen.chatBasic("-Continued-");
			isShownInfoAboutGame = false;
		}
	}
	static void genderSelect(){
		if(!isGenderAsked){
			Screen.chatBasic("First of all, answer one question:");
			Screen.chatBasic("Are you MALE or FEMALE");
			Screen.chatBasic("Answer with \"MALE\" or \"FEMALE\"");
			isGenderAsked = false;
		}
		if(Input.isCommand("male")){
			
		}
	}
}

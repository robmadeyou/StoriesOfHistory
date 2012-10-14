package com.gmail.robmadeyou;

public class State {
	/*
	 * Available game states are:
	 * MAIN_MENU
	 * CREDITS
	 * GAME
	 * ASK
	 */
	static String state = "MAIN_MENU";
	public static void stateDecider(){
		if(state.equals("MAIN_MENU")){
			StateMenu.onUpdate();
		}else if(state.equals("GAME")){
			
		}else if(state.equals("CREDITS")){
			StateCredits.onUpdate();
		}
	}
}

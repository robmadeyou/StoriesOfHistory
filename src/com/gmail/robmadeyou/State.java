package com.gmail.robmadeyou;

public class State {
	/*
	 * Available game states are:
	 * MAIN_MENU
	 * GAME
	 * ASK
	 */
	static String state = "MAIN_MENU";
	public static void stateDecider(){
		if(state.equals("MAIN_MENU")){
			StateMenu.onUpdate();
		}
	}
}

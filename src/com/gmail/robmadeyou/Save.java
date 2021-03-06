package com.gmail.robmadeyou;

import java.io.*;
import java.util.ArrayList;

public class Save {
	
	static boolean loaded = false;
	
	public static void loadGame(){
		
		// Wrap all in a try/catch block to trap I/O errors.
		try{
		// Open file to read from, named SavedObj.sav.
		
		FileInputStream saveFile = new FileInputStream("res\\save\\save.sav");

		// Create an ObjectInputStream to get objects from save file.
		ObjectInputStream save = new ObjectInputStream(saveFile);
		loaded = (Boolean) save.readObject();
		
		
		StateGame.firstTime = (Boolean) save.readObject();
		StateGame.gameState = (String) save.readObject();
		StateGame.gender = (String) save.readObject();
		StateGame.name = (String) save.readObject();
		
		Game.location = (String) save.readObject();
		Game.money = (Integer) save.readObject();
		Game.health = (Integer) save.readObject();
		Game.fatigue = (Integer) save.readObject();
		Game.thirst = (Integer) save.readObject();
		Game.hunger = (Integer) save.readObject();
		
		//Time is here!
		
		Game.time = (Integer) save.readObject();
		Game.timeMinute = (Integer) save.readObject();
		Game.timeHourRaw = (Integer) save.readObject();
		Game.timeDayRaw = (Integer) save.readObject();
		Game.timeMonthRaw = (Integer) save.readObject();
		Game.timeYearRaw = (Integer) save.readObject();
		
		
		Game.firstTime = (Boolean) save.readObject();
		//Player's level's are here
		
		
		// Close the file.
		save.close(); // This also closes saveFile.
		}
		catch(Exception exc){
		exc.printStackTrace(); // If there was an error, print the info.
		}
	}
	
	public static void saveGame(){
		try{  // Catch errors in I/O if necessary.
		// Open a file to write to, named save.sav.
		loaded = true;
		FileOutputStream saveFile=new FileOutputStream("res\\save\\save.sav");

		// Create an ObjectOutputStream to put objects into save file.
		ObjectOutputStream save = new ObjectOutputStream(saveFile);
		
		
		// Now we do the save.
		
		save.writeObject(loaded);
		save.writeObject(StateGame.firstTime);
		save.writeObject(StateGame.gameState);
		save.writeObject(StateGame.gender);
		save.writeObject(StateGame.name);
		
		
		//Player variables IMPORTANTES!
		save.writeObject(Game.location);
		save.writeObject(Game.money);
		save.writeObject(Game.health);
		save.writeObject(Game.fatigue);
		save.writeObject(Game.thirst);
		save.writeObject(Game.hunger);
		
		//Time variables VERY IMPROTANTES!
		save.writeObject(Game.time);
		save.writeObject(Game.timeMinute);
		save.writeObject(Game.timeHourRaw);
		save.writeObject(Game.timeDayRaw);
		save.writeObject(Game.timeMonthRaw);
		save.writeObject(Game.timeYearRaw);
		
		save.writeObject(Game.firstTime);
		//Player levels are under here
		
		// Close the file.
		save.close(); // This also closes saveFile.
		}
		catch(Exception exc){
		exc.printStackTrace(); // If there was an error, print the info.
		}
	}
}

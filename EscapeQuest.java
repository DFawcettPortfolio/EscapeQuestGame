import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class EscapeQuest {

	public static void main(String[] args) {
			game();

			
		}//MAIN ENDS HERE

			
// MAIN METHOD ABOVE THIS

 

		

	
	

		
			
public static void game() {
	
	List <String>inventory = new ArrayList <String> ();
//ITEM ARRAY//
	
	String itemList[] ;
		itemList = new String [11];
		itemList[0] = new String ("LETTER");
		itemList[1] = new String ("ROPE");
		itemList[2] = new String ("KEY");
		itemList[3] = new String ("GEM");
		itemList[4] = new String ("TORCH");
		itemList[5] = new String ("SHED");
		itemList[6] = new String ("LOCK");
		itemList[7] = new String ("CLIFF");
		itemList[8] = new String ("STATUE");
		itemList[9] = new String ("TUNNEL");
		itemList[10] = new String ("TABLE");
	
	
//LOCATION ARRAY//	
	
	String location [];
		location = new String [8];
		location[0] = new String("in the central area");
		location[1] = new String("in front of a dark tunnel");
		location[2] = new String("at the top of a cliff");
		location[3] = new String("at the bottom of the cliff"); //east + east
		location[4] = new String("in an open field with a shed");
		location[5] = new String("in the shed"); // south + south
		location[6] = new String("in front of a strange statue");
		location[7] = new String("YOU WIN"); //north + north
		
				
																													
		String playerLocation = location[0];		
		
		
		String playerInventory[] ;
			playerInventory = new String [5];
			playerInventory[0] = new String ("LETTER");
			playerInventory[1] = new String ("ROPE");
			playerInventory[2] = new String ("KEY");
			playerInventory[3] = new String ("GEM");
			playerInventory[4] = new String ("TORCH");
			
		
	List <Integer>roomsDiscovered = new ArrayList <Integer> ();
		roomsDiscovered.add(0);
		
		
		
		
		
		
		
		

//variables and such		
		
	int lockStatus =1; //1 if locked, 2 if unlocked
	boolean solved = false; //false if game continues, true if playerLocation.equals(location[7])
	boolean titleScreen=true;
	//1 is in starting point, 2 is in inventory, 3 is used, 4 is on ground(torch only)
	int letterLocation =1;
	int gemLocation =1;
	int torchLocation = 1;
	int keyLocation =1;
	int ropeLocation =1;
	
	
System.out.println("WELCOME TO ESCAPE QUEST!");
				System.out.println("Press Enter to continue");
				try{System.in.read();}
				catch(Exception e){}
				
System.out.println (); //SPACER BETWEEN EACH DISPLAY
				




System.out.print( "You find yourself in a clearing, with no recollection of what brought you here. "
		+ "As you scan your surroundings you see a letter on the ground at your feet. Do you read it? Y/N");
System.out.println (); //SPACER BETWEEN EACH DISPLAY

	while (titleScreen==true) {	
	String[] accepted = {"Y", "N", "HELP"};
	Scanner answer = new Scanner(System.in);
	String answerGiven = answer.next().toUpperCase();
	if(answerGiven.equals("CANCEL")) {
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
            	System.out.println ();} //SPACER BETWEEN EACH DISPLAY}
	if(Arrays.asList(accepted).contains(answerGiven)){
	
		
if (answerGiven.equals("N")){
	answer.nextLine();
	System.out.println ("You stand " + playerLocation + ", what would you like to do?");
	System.out.println ();
	titleScreen=false;} //SPACER BETWEEN EACH DISPLAY 

if (answerGiven.equals("Y")){
	answer.nextLine();
	 	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 	System.out.println("Welcome to ESCAPE QUEST. You must explore the world here to find a way to escape. To do so you may use the following commands:");  
		System.out.println();
		System.out.println("NORTH - travel North");
		System.out.println("SOUTH - travel South");
		System.out.println("EAST - travel East");
		System.out.println("WEST - travel West");
		System.out.println("LOOK - look around at your current area");
		System.out.println("INVESTIGATE -  receive a description of an item or object");
		System.out.println("INVENTORY - display your inventory");
		System.out.println("MAP - display your location on a map");
		System.out.println("TAKE - place an item in your inventory");
		System.out.println("USE - use an item in your inventory");
		System.out.println("CANCEL - return to prompt menu");
		System.out.println("HELP - see the commands");
		System.out.println();
		System.out.println("Note that an ITEM must be specified by name when trying to INVESTIGATE, TAKE, or USE it!");
		System.out.println();
		System.out.println("Pressing enter will send this LETTER to your inventory.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		try{System.in.read();}
				catch(Exception e){};
				System.out.println ("The LETTER was placed in your inventory.");
				letterLocation=2;
				inventory.add("LETTER");
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				System.out.println (); //SPACER BETWEEN EACH DISPLAY}
	titleScreen=false;			
					}

if (answerGiven.equals("HELP")){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 	System.out.println("Welcome to ESCAPE QUEST. You must explore the world here to find a way to escape. To do so you may use the following commands:");  
		System.out.println();
		System.out.println("NORTH - travel North");
		System.out.println("SOUTH - travel South");
		System.out.println("EAST - travel East");
		System.out.println("WEST - travel West");
		System.out.println("LOOK - look around at your current area");
		System.out.println("INVESTIGATE -  receive a description of an item or object");
		System.out.println("INVENTORY - display your inventory");
		System.out.println("MAP - display your location on a map");
		System.out.println("TAKE - place an item in your inventory");
		System.out.println("USE - use an item in your inventory");
		System.out.println("CANCEL - return to prompt menu");
		System.out.println();
		System.out.println("Note that an ITEM must be specified by name when trying to INVESTIGATE, TAKE, or USE it!");
		System.out.println();
		System.out.println("(Press enter to continue).");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		try{System.in.read();}
				catch(Exception e){};
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				System.out.println (); //SPACER BETWEEN EACH DISPLAY}
						break;}


}
	else {
		
	System.out.println ("That command is not recognized. Please enter Y or N");
	answer.nextLine();
	System.out.println (); //SPACER BETWEEN EACH DISPLAY}
	}
	
	}
	
	
	//START THE GAME HERE

	String[] acceptableInputs = {"NORTH", "SOUTH", "EAST", "WEST", "INVESTIGATE", "INVENTORY", "TAKE", "USE",  "MAP", "CANCEL", "HELP", "LOOK"};
	while(solved==false) {
	Scanner answer = new Scanner(System.in);
	String answerGiven = answer.next().toUpperCase();
	
	
	while(Arrays.asList(acceptableInputs).contains(answerGiven)){
				if(answerGiven.equals("CANCEL")) {
			answer.nextLine();
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				System.out.println (); //SPACER BETWEEN EACH DISPLAY
				break;
		} 

	if (answerGiven.equals("HELP")){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 	System.out.println("Welcome to ESCAPE QUEST. You must explore the world here to find a way to escape. To do so you may use the following commands:");  
		System.out.println();
		System.out.println("NORTH - travel North");
		System.out.println("SOUTH - travel South");
		System.out.println("EAST - travel East");
		System.out.println("WEST - travel West");
		System.out.println("LOOK - look around at your current area");
		System.out.println("INVESTIGATE -  receive a description of an item or object");
		System.out.println("INVENTORY - display your inventory");
		System.out.println("MAP - display your location on a map");
		System.out.println("TAKE - place an item in your inventory");
		System.out.println("USE - use an item in your inventory");
		System.out.println("CANCEL - return to prompt menu");
		System.out.println();
		System.out.println("Note that an ITEM must be specified by name when trying to INVESTIGATE, TAKE, or USE it!");
		System.out.println();
		System.out.println("(Press enter to continue).");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		try{System.in.read();}
				catch(Exception e){};
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				System.out.println (); //SPACER BETWEEN EACH DISPLAY}
						break;}

		
	if(answerGiven.equals("INVESTIGATE")) {
		//answer.nextLine();
		System.out.println("What would you like to investigate?");
		Scanner investigate = new Scanner(System.in);
		String investigateItem = investigate.next().toUpperCase();
			if(investigateItem.equals("CANCEL")) {
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break; }
			if(Arrays.asList(itemList).contains(investigateItem)){
		if( investigateItem.equals("GEM")) {
			if(inventory.contains("GEM") || playerLocation == location[5] &&gemLocation==1  ) {
				System.out.println("A beautifully cut gemstone, it resembles a green eye.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
			}//end gem
		if( investigateItem.equals("TABLE")) {
			if(playerLocation == location[5]) {
				System.out.println("A simple wooden table. It has no use to you.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
			}//end table
		if( investigateItem.equals("LETTER")) {
			if(inventory.contains("LETTER") || playerLocation == location[0] &&letterLocation==1) {
				System.out.println("This appears to be a normal letter, written on folded cardstock in black ink with no envelope or seal.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY 
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
		}//end letter
		
		if( investigateItem.equals("ROPE")) {
			if(inventory.contains("ROPE") ||playerLocation == location[1]  &&ropeLocation==1) {
				System.out.println("A long rope. It seems strong enough to support you.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
		}//end rope
		if( investigateItem.equals("KEY") ) {
			if(inventory.contains("KEY") ||playerLocation == location[3]  &&keyLocation==1) {
				System.out.println("An ornate key. It must have a lock.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
			}//end key
		
		if( investigateItem.equals("TORCH")) {
			if(inventory.contains("TORCH") ||playerLocation == location[6] &&torchLocation!=2 ) {
				System.out.println("A stone torch. It glows with a magical light.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
			}//end torch
		
		if( investigateItem.equals("SHED")) {
			if(playerLocation.equals(location[4])) {
				System.out.println("The shed has a heavy door with a lock.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
		}//end door
		if( investigateItem.equals("LOCK")) {
			if(playerLocation.equals(location[4])) {
				System.out.println("An intricate lock. You wouldn't be able to get through without a key.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
		}//end lock
		if( investigateItem.equals("CLIFF")) {
			if(playerLocation.equals(location[2])) {
				System.out.println("A steep cliff, maybe you could scale it if you had some rope.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
		}//end cliff
		if( investigateItem.equals("STATUE")) {
			if(playerLocation.equals(location[6]) &&torchLocation==1 ) {
				System.out.println("A large stone statue with one green gemstone eye and one empty socket. It holds a glowing torch.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			if(playerLocation.equals(location[6]) &&torchLocation==4 ) {
				System.out.println("A large stone statue with two green gemstone eyes. A glowing torch rests near it on the ground.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			if(playerLocation.equals(location[6]) &&(torchLocation==2||torchLocation==3) ) {
				System.out.println("A large stone statue with two green gemstone eyes.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
		}//end statue
		if( investigateItem.equals("TUNNEL")) {
			if(playerLocation.equals(location[1])) {
				System.out.println("This tunnel is too dark to navigate without light.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
		}//end tunnel
		
		
			}//end of if item entered is valid 	 
			else {System.out.println("There is no " +investigateItem + " here to investigate.");
			investigate.nextLine();
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			}
	
		
			
	}//END OF INVESTIGATE
	
	
	if (answerGiven.equals("TAKE")) {
		
		System.out.println("What would you like to take?");
		System.out.println (); //SPACER BETWEEN EACH DISPLAY
		Scanner take = new Scanner(System.in);
		String takeItem = take.next().toUpperCase();
		if(takeItem.equals("CANCEL")) {
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			break;}
		if( Arrays.asList(itemList).contains(takeItem) && !inventory.contains(takeItem) ){
					
		if (takeItem.equals("LETTER") && playerLocation == location[0] &&letterLocation==1){
			
			inventory.add("LETTER");
			
			System.out.println("The " + takeItem + " was added to your inventory." );
			letterLocation =2;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		if (takeItem.equals("ROPE") && playerLocation == location[3]) {
			System.out.println ("You cannot take the " + takeItem + " from here.");
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
		if (takeItem.equals("ROPE") && playerLocation == location[1]  &&ropeLocation==1){
			
			inventory.add("ROPE");
			
			System.out.println("The " + takeItem + " was added to your inventory." ); 
			ropeLocation=2;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		if (takeItem.equals("ROPE") && playerLocation == location[2]  &&ropeLocation==3){
			
			inventory.add("ROPE");
			
			System.out.println("The " + takeItem + " was added to your inventory." ); 
			ropeLocation=2;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		
		if (takeItem.equals("KEY") && playerLocation == location[3]  &&keyLocation==1){
			
			inventory.add("KEY"); 
		
			System.out.println("The " + takeItem + " was added to your inventory." ); 
			keyLocation=2;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		
		if (takeItem.equals("GEM") && playerLocation == location[5] &&gemLocation==1  ){
			
			inventory.add("GEM"); 
			
			System.out.println("The " + takeItem + " was added to your inventory." ); 
			gemLocation=2;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		if (takeItem.equals("GEM") && playerLocation == location[6] &&gemLocation==3  ) {
			System.out.println("The " + takeItem + " is firmly stuck in the statue now. You cannot take it" ); 
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
			
		
		
		if (takeItem.equals("TORCH") && playerLocation == location[6] &&torchLocation==4 ){
			
			inventory.add("TORCH");
			
			System.out.println("The " + takeItem + " was added to your inventory." ); 
			torchLocation=2;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		if (takeItem.equals("TORCH") && playerLocation == location[6] &&torchLocation==1 ){
			System.out.println("You try to take the TORCH but it is held tightly by the statue." ); 
			System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
		if( takeItem.equals("TABLE")&&playerLocation == location[5]) {
				System.out.println("The table is too large to carry. Leave it here.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
		if( takeItem.equals("STATUE")&&playerLocation == location[6]) {
				System.out.println("The statue is too large to carry. Leave it here.");
				System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
			
		else {System.out.println ("You don't see a " + takeItem + ".");
		System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
	
		
		
			} //end of if !inventory contains loop
		else {System.out.println ("You don't see a " + takeItem + ".");
		System.out.println ();//SPACER BETWEEN EACH DISPLAY
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				break;}
	
		} // end of TAKE
			
	
		if(answerGiven.equals("NORTH")) {
			answer.nextLine();
		
		if (playerLocation.equals(location[0])) {	 													//if player is at central area
			playerLocation = location [1];																//move player to tunnel room			
			System.out.println("You move North");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			
			if(!roomsDiscovered.contains(1)) {
				roomsDiscovered.add(1);	}
		
			break;}
			
		if (playerLocation.equals(location[4])) {														//if player is in Southern field
			playerLocation = location [0];																//move player to central area
			System.out.println("You move North");
			System.out.println ();  //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		
		
		if (playerLocation.equals(location[5])) {														//if player is in the shed
			playerLocation = location [4];																//move player to Southern field			
			System.out.println("You move North");
			System.out.println ();  //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			if(!roomsDiscovered.contains(4)) {
				roomsDiscovered.add(4);	}
			break;}
		
		
		if (playerLocation.equals(location[1])&&torchLocation == 3) {	 								//if player is in tunnel room
												 														//and has the torch equipped
				playerLocation = location [7];															//move player to exit
				System.out.println("YAY");
				break;}																
			
		else {																							//if player cannot move North
			System.out.println("You cannot move that direction!");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY	
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
	}
		
	if(answerGiven.equals("SOUTH")) {
		answer.nextLine();
		if (playerLocation.equals(location[4])) {														//if player is in Southern field
			if(lockStatus ==2) {																		//and door is open
			playerLocation = location [5];																//move player into the shed		
			System.out.println("You move South");
			System.out.println ();  //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			if(!roomsDiscovered.contains(5)) {
				roomsDiscovered.add(5);	}
			break;}
			}
		

		if (playerLocation.equals(location[0])) {														//if player is in central area
			playerLocation = location [4];																//move player to Southern field
			System.out.println("You move South");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			if(!roomsDiscovered.contains(4)) {
				roomsDiscovered.add(4);	}
			break;}
			

		if (playerLocation.equals(location[1])) {														//if player is in tunnel room
			playerLocation = location [0];																//move player to central area
			System.out.println("You move South");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY	
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		
		else {																							//if player cannot move South	
			System.out.println("You cannot move that direction!");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY	
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}	
	}
	
	
	if(answerGiven.equals("EAST")) {
		answer.nextLine();
		if (playerLocation.equals(location[0])) {														//if player is in central area
			playerLocation = location [2];																//move player to cliff top
			System.out.println("You move East");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			if(!roomsDiscovered.contains(2)) {
				roomsDiscovered.add(2);	}
			break;}
	if (playerLocation.equals(location[6])) {															//if player location is statue grounds
			playerLocation = location [0];																//move player to central area
			System.out.println("You move East");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
	if (playerLocation.equals(location[2]) &&ropeLocation==3) {															//if player location is on cliff top
			playerLocation = location [3];																//move player to cliff bottom
			System.out.println("You move East");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			if(!roomsDiscovered.contains(3)) {
				roomsDiscovered.add(3);	}
			break;}
	else {																								//if player cannot move East
			System.out.println("You cannot move that direction!");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY	
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
		break;}
			}
	
	if(answerGiven.equals("WEST")) {
		answer.nextLine();
		if (playerLocation.equals(location[0])) {														//if player is in central area
			playerLocation = location [6];																//move player to statue grounds
			System.out.println("You move West");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			if(!roomsDiscovered.contains(6)) {
				roomsDiscovered.add(6);	}
			break;
			}
		if (playerLocation.equals(location[2])) {														//if player is on cliff top
			playerLocation = location [0];																//move player to central area
			System.out.println("You move West");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		if (playerLocation.equals(location[3])) {														//if player is on cliff bottom
			playerLocation = location [2];																//move player to cliff top
			System.out.println("You move West");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			if(!roomsDiscovered.contains(2)) {
				roomsDiscovered.add(2);	}
			break;}
		else {																							//if player cannot move West
			System.out.println("You cannot move that direction!");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY	
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
		break;}
		
		} //end of MOVE
	
	
	
	
	
	
	if(answerGiven.equals("LOOK")) {
		answer.nextLine();
			if (playerLocation.equals(location[0])) {
				if(letterLocation!=1) {
				System.out.println("You look around and see an empty clearing. Nothing here looks helpful.");
				System.out.println (); //SPACER BETWEEN EACH DISPLAY
				System.out.println ("What would you like to do?");
				break;}
				else {System.out.println("You look around and see an empty clearing. There is a letter on the ground.");
				System.out.println (); //SPACER BETWEEN EACH DISPLAY
				System.out.println ("What would you like to do?");
				break;}
			}
			//LOOK NORTHERN SQUARE
			//Can pick up ROPE
			if (playerLocation.equals(location[1])) { 
				if (ropeLocation!=1){
				System.out.println("You look around and see an empty room with a dark tunnel opened in the Northen wall.");
				System.out.println (); //SPACER BETWEEN EACH DISPLAY
				System.out.println ("What would you like to do?");
				break;}
				else{
				System.out.println("You look around and see an empty room with a dark tunnel opened in the Northen wall. There is a rope coiled up in a corner.");
				System.out.println (); //SPACER BETWEEN EACH DISPLAY
				System.out.println ("What would you like to do?");
				break;}
			}
			
			if (playerLocation.equals(location[2])) {
				if (keyLocation!=1){
						System.out.println("You look out from the cliffside and admire the view.");
						System.out.println (); //SPACER BETWEEN EACH DISPLAY
						System.out.println ("What would you like to do?");
						break;}
				else {
					System.out.println("You look out from the cliffside and see a faint shimmer as sunlight reflects off something on the ground below.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY
					System.out.println ("What would you like to do?");
					break;}
				}
			
			 if (playerLocation.equals(location[3])) { 	
				 if(keyLocation!=1){
			 		System.out.println("You look around and see nothing but rocks and dirt.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY 
					System.out.println ("What would you like to do?");
					break;}
			 	else{
			 		System.out.println("You look around for the shimmering object and find a key partially buried.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY 
					System.out.println ("What would you like to do?");
					break;}
			 }

						
			if (playerLocation.equals(location[4])) {
				if(lockStatus ==1) {
					System.out.println("You look around and see a small shed with a locked door.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY
					System.out.println ("What would you like to do?");
					break;}

				
				if(lockStatus ==2) {
					System.out.println("You look around and see a small shed with its door open. Moving South will enter the shed.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY
					System.out.println ("What would you like to do?");
					break;}
			}	
			
			if (playerLocation.equals(location[5])) {
				if (gemLocation!=1){
					System.out.println("You look around and see nothing of use or value left inside this shed.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY 
					System.out.println ("What would you like to do?");
					answer.reset();
					break;}
				else{
					System.out.println("You look around and see a single gemstone resting on a table in this otherwise empty space.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY 
					System.out.println ("What would you like to do?");
					break;}
}
			if (playerLocation.equals(location[6])) {
				if (torchLocation==1){
					System.out.println("You look around and see an interesting statue holding a torch.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY 
					System.out.println ("What would you like to do?");
					answer.reset();
					break;}
				if (torchLocation==4){
					System.out.println("You look around and see an interesting statue. A torch glowing torch rests on the ground next to it.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY 
					System.out.println ("What would you like to do?");
					answer.reset();
					break;}
				else{
					System.out.println("You look around and see an interesting statue.");
					System.out.println (); //SPACER BETWEEN EACH DISPLAY 
					System.out.println ("What would you like to do?");
					break;}
}
		

	 }	 //end of LOOK				
	 

	
if(answerGiven.equals("INVENTORY")) {
  System.out.print("Your inventory contains:\n " + inventory);
  System.out.println (); //SPACER BETWEEN EACH DISPLAY	
  System.out.println ("You stand " + playerLocation + ", what would you like to do?");
  break;}

if (answerGiven.equals("USE")) {	
	System.out.println("What would you like to use?");
		System.out.println (); //SPACER BETWEEN EACH DISPLAY
		Scanner use = new Scanner(System.in);
		String useItem = use.next().toUpperCase();
		if(useItem.equals("CANCEL")) {
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			System.out.println (); //SPACER BETWEEN EACH DISPLAY
			break;}
		if(inventory.contains(useItem) ){
					
		if (useItem.equals("LETTER")){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 	System.out.println("Welcome to ESCAPE QUEST. You must explore the world here to find a way to escape. To do so you may use the following commands:");  
		System.out.println();
		System.out.println("NORTH - travel North");
		System.out.println("SOUTH - travel South");
		System.out.println("EAST - travel East");
		System.out.println("WEST - travel West");
		System.out.println("LOOK - look around at your current area");
		System.out.println("INVESTIGATE -  receive a description of an item or object");
		System.out.println("INVENTORY - display your inventory");
		System.out.println("MAP - display your location on a map");
		System.out.println("TAKE - place an item in your inventory");
		System.out.println("USE - use an item in your inventory");
		System.out.println("CANCEL - return to prompt menu");
		System.out.println();
		System.out.println("Note that an ITEM must be specified by name when trying to INVESTIGATE, TAKE, or USE it!");
		System.out.println();
		System.out.println("Pressing enter will send this LETTER to your inventory.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		try{System.in.read();}
				catch(Exception e){};
				System.out.println ("The LETTER was returned to your inventory.");
				letterLocation=2;
				inventory.add("LETTER\n");
				System.out.println ("You stand " + playerLocation + ", what would you like to do?");
				System.out.println (); //SPACER BETWEEN EACH DISPLAY}
						break;}
		if (useItem.equals("ROPE")&&playerLocation.equals(location[2])){
			System.out.println("You tie the rope off and watch as the other end falls to the ground below. You should be able to scale the cliff now.");
			ropeLocation=3;
			inventory.remove("ROPE");
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		
		if (useItem.equals("KEY")&&playerLocation.equals(location[4])){
			if (lockStatus==1) {			
			System.out.println("You place the key in the door and hear a click as the lock disengages");
			lockStatus=2;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
			if (lockStatus==2) {			
			System.out.println("You place the key in the door and hear a click as the lock engages");
			lockStatus=1;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
			
		}
		
		if (useItem.equals("GEM")&&playerLocation.equals(location[6])){
			System.out.println("You place the gem into the statue. As the gem slides into place, the torch the statue held clatters to the floor, still glowing.");
			inventory.remove("GEM");
			gemLocation=3;
			torchLocation=4;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		
		
		if (useItem.equals("TORCH")){
			System.out.println("You hold the torch out in front of you. It lights your path." );
			torchLocation=3;
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		
		else {System.out.println("You have no use for that in this area." );
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
}
		else {System.out.println("You do not have a " +useItem);
			System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;}
		
}//end of USE


	if(answerGiven.equals("MAP")) {
		 String playerLocationMap = playerLocation;
		JFrame window = new JFrame("Graphics window");
		window.setLocationByPlatform(true);
		@SuppressWarnings("serial")
		final JPanel panel = new JPanel() {

			protected void paintComponent(Graphics gx) {
				Graphics2D g = (Graphics2D) gx;
				int width = getWidth();
				int height = getHeight();
				g.setBackground(Color.BLACK);
				g.clearRect(0, 0, width, height);
				g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g.setColor(Color.WHITE);
				
//DRAW MAP HERE	
				
				String title = "ESCAPE QUEST";
				
				g.drawString(title, (width / 2) - 50, 20);
				
				//fillRect ROOMS THAT HAVE BEEN EXPLORED
				if(roomsDiscovered.contains(0)) {
					//center room
					g.setColor(new Color(107,142,35));
					g.fillRect(((width / 2) - 100), ((height / 2) - 100), 100, 100);
					
					g.setColor(Color.white);
					g.drawRect(((width / 2) - 100), ((height / 2) - 100), 100, 100);
					}
				if(roomsDiscovered.contains(1)) {
					//tunnel room
					g.setColor(Color.GRAY);
					g.fillRect(((width / 2) - 100), ((height / 2) - 100) - 125, 100, 100);
					
					g.setColor(Color.white);
					g.drawRect(((width / 2) - 100), ((height / 2) - 100) - 125, 100, 100);
					
					g.setColor(new Color(107,142,35));
					g.fillRect((width / 2) - 70, ((height / 2) - 125), 40, 25);
					
					g.setColor(Color.white);
					g.drawRect((width / 2) - 70, ((height / 2) - 125), 40, 25);
				}
				if(roomsDiscovered.contains(2)) {
					//top of cliff
					g.setColor(new Color(107,142,35));
					g.fillRect(((width / 2) - 100) + 125, ((height / 2) -100), 100, 100);
					
					g.setColor(Color.white);
					g.drawRect(((width / 2) - 100) + 125, ((height / 2) -100), 100, 100);
					
					g.setColor(new Color(107,142,35));
					g.fillRect((width / 2), (height / 2) - 70, 25, 40);	
					
					g.setColor(Color.white);
					g.drawRect((width / 2), (height / 2) - 70, 25, 40);
				}
				if(roomsDiscovered.contains(3)) {
					//bottom of cliff
					g.setColor(new Color(107,142,35));
					g.fillRect(((width / 2) - 100) + 250, ((height / 2) - 100), 100, 100);
					
					g.setColor(Color.gray);
					g.fillRect((width / 2) + 125, (height / 2) - 70, 25, 40);
					
					g.setColor(Color.white);
					g.drawRect(((width / 2) - 100) + 250, ((height / 2) - 100), 100, 100);
					
					g.setColor(Color.white);
					g.drawRect((width / 2) + 125, (height / 2) - 70, 25, 40);
					
					g.setColor(new Color(139,69,19));
					g.drawLine((width / 2) + 125, (height / 2) - 50, (width / 2) + 150, (height / 2) - 50);
				}
				if(roomsDiscovered.contains(4)) {
					//southern field
					g.setColor(new Color(107,142,35));
					g.fillRect(((width / 2) - 100), ((height / 2) - 100) + 125, 100, 100);
					
					g.setColor(new Color(139,69,19));
					g.fillRect(((width / 2) - 50), ((height / 2) - 100) + 175, 40, 30);
					
					g.setColor(Color.white);
					g.drawRect(((width / 2) - 100), ((height / 2) - 100) + 125, 100, 100);
					
					g.setColor(Color.white);
					g.drawRect(((width / 2) - 50), ((height / 2) - 100) + 175, 40, 30);
					
					g.setColor(new Color(107,142,35));
					g.fillRect((width / 2) - 70, (height / 2), 40, 25);
					
					g.setColor(Color.white);
					g.drawRect((width / 2) - 70, (height / 2), 40, 25);
				}
				if(roomsDiscovered.contains(5)) {
					//shed
					g.setColor(new Color(139,69,19));
					g.fillRect(((width / 2) - 50), ((height / 2) - 100) + 175, 40, 30);
					
					g.setColor(Color.white);
					g.drawRect(((width / 2) - 50), ((height / 2) - 100) + 175, 40, 30);
				}
				if(roomsDiscovered.contains(6)) {
					//statue room
					
					g.setColor(new Color(107,142,35));
					g.fillRect(((width / 2) - 100) - 125, ((height / 2) - 100), 100, 100);
					
					g.setColor(Color.white);
					g.drawRect(((width / 2) - 100) - 125, ((height / 2) - 100), 100, 100);
					
					//statue//
					g.setColor(new Color(70, 70, 70));
					g.fillOval((width/2) - 200, (height/2) - 65, 30, 30);
					
					g.setColor(new Color(132, 132, 132));
					g.fillOval((width/2) - 195, (height/2) - 58, 15, 15);
					
					
					g.setColor(new Color(107,142,35));
					g.fillRect((width / 2) - 125, (height / 2) - 70, 25, 40);	
					
					g.setColor(Color.white);
					g.drawRect((width / 2) - 125, (height / 2) - 70, 25, 40);
				}
				
				//FIND AND DRAW PLAYER LOCATION
				if (playerLocationMap.equals(location[0])) {
					//center room
					g.setColor(new Color(255,215,0));
					g.fillRect(((width / 2) - 60), ((height / 2) - 60),20,20);
				}
				if (playerLocationMap.equals(location[1])) {
					//tunnel room
					g.setColor(new Color(255,215,0));
					g.fillRect(((width / 2) - 60), ((height / 2) - 60) - 125,20,20);
				}
				if (playerLocationMap.equals(location[2])) {	
					//top of cliff
					g.setColor(new Color(255,215,0));
					g.fillRect(((width / 2) - 60) + 125, ((height / 2) - 60),20,20);
				}
				if (playerLocationMap.equals(location[3])) {
					//bottom of cliff
					g.setColor(new Color(255,215,0));
					g.fillRect(((width / 2) - 60) + 250, ((height / 2) - 60),20,20);
				}
				if (playerLocationMap.equals(location[4])) {
					//southern field
					g.setColor(new Color(255,215,0));
					g.fillRect(((width / 2) - 58), ((height / 2) - 85) + 125,20,20);
				}
				if (playerLocationMap.equals(location[5])) {
					//shed
					g.setColor(new Color(255,215,0));
					g.fillRect(((width / 2) - 45), ((height / 2) - 95) + 175,20,20);
				}
				if (playerLocationMap.equals(location[6])) {
					//statue room
					g.setColor(new Color(255,215,0));
					g.fillRect(((width / 2) - 60) - 100, ((height / 2) - 60),20,20);
				}
			//END OF DRAWING MAP
			
			}
		};
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		window.setSize(d.width / 4, d.height / 2);
		window.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		window.setContentPane(panel);
		window.setVisible(true);
	

		System.out.println();//SPACER BETWEEN EACH DISPLAY
			System.out.println ("You stand " + playerLocation + ", what would you like to do?");
			break;
			
		
			}//end of map
	
		} //end of WHILE STATEMENT
	
if(!Arrays.asList(acceptableInputs).contains(answerGiven)){																				
	System.out.println ("That command is not recognized. Please enter a valid command.");
	System.out.println (); //SPACER BETWEEN EACH DISPLAY
	System.out.println ("What would you like to do?");}

if (playerLocation.equals(location[7])) {	
			System.out.println ("You have beaten the game");
			solved = true;
			break;}	
	} //end of SOLVED while statement
		
	

}}  //final bracketx2

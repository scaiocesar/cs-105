	/*
	Program/Project: Lab9a - Starter Code
	Your Name: Juliana Cortes
	Date: 2/3/2023
	Instructor: Jeff Light
	Description: Displays a menu to the screen 
	*/
	package week09;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class Lab9b { 	/**
	/** main() method displays a menu to the user and asks them to select a command.
	 * The method will continue to display the menu to the user until they wish to quit by selecting 'Exit' from the menu.
	 * The method also creates a new, empty shoppingList of type ArrayList<String>
	 * Based on the user input, the appropriate method will be called to perform actions on the shoppingList.
	 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
	 */
	public static void main(String[] args) {
	    //Initialize variables
	    Scanner sIn = new Scanner(System.in);						//Input Scanner for String
	    ArrayList<String> shoppingList = new ArrayList<String>();	//ArrayList for shoppingList
	    String choice;												//Holds user input of type String
	    boolean done = false;										//Keeps program running until user wants to quit
	
	    // Keep running the program until the user quits
	    do{
	    	//Print out the menu to the console
	        System.out.println();
	        System.out.println("1. Add Items");
	        System.out.println("2. Delete Items");
	        System.out.println("3. Show Items");
	        System.out.println("4. Sort Items");
	        System.out.println("5. Exit");
	        System.out.print("Please enter a command: ");
	        choice = sIn.nextLine(); 
	        		
	        //Call the appropriate method for the choice selected.
	        switch (choice) { 
	            case "1":	//Add items to the Shopping List
	                System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
	                break;
	            case "2":	//Delete items from the Shopping List
	            	System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
	                break;
	            case "3":	//Show the items in the Shopping List
	                showItems(shoppingList);
	                break;
	            case "4":	//Sort the items in the Shopping List
	                sortItems(shoppingList);
	                break;
	            case "5":	//Exit the program 
	            	System.out.println("\nGoodbye");
	                done = true;
	                break;
	            default:	//Handles all input that is not between 1-5
	            	System.out.println("Invalid response.  Please enter a choice from the menu (1-5).");
	        } //End of switch (choice) 
	    }while(!done);  //Keep running the program until the user quits
	}//end of main()


        //////////////////////////////////////////////
        // STUDENTS, FILL IN THE METHOD STUBS BELOW://
		//  addItems()								//
		//	deleteItems()							//
		//	showItems()								//
		//	sortItems()								//
        //////////////////////////////////////////////
	
	/** addItems() method asks the user to enter an item to be stored in the shoppingList and then adds the item to the shoppingList ArrayList.
	 * The user may enter as many items as they want, hitting ENTER to stop entering items and return to main().
	 * Each time the user enters an item into the list, a message will be displayed showing the item entered in the following format:
	 *     '<item>' has been added to the Shopping List.  [Example:  'Eggs' has been added to the Shopping List.]
	 * Returns the number of items added to the shoppingList
	 */
	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
	        String item = "";
	        int dosIndex = 0;
	        String itemlist = "";
	        String amountlist = "";
	       
	        int count = 0;
	        boolean add = false;
	        
	        while (!add) {
	            System.out.print("\nAdd an item to the list (or just hit 'ENTER' when done): ");
	            item = sIn.nextLine();
	            if (item.isEmpty()) {
	                break;
	            }
	            if (!item.contains(":")){
	            	System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");	            	        	
	            } else {
				dosIndex = item.indexOf(":");
				itemlist = item.substring(0, dosIndex).trim();
				amountlist = item.substring(dosIndex + 1).trim();
				
				shoppingList.add(itemlist + ":" + amountlist);
	            
	            System.out.printf("'%s:%s' has been added to the Shopping List.\n", itemlist, amountlist);
	            count++;
	        }
	        }
		return count;

	}//end of method addItems(ArrayList<String>)

	
	/** deleteItems() method asks the user to enter an item to be deleted from the shoppingList and then deletes the item from the shoppingList ArrayList.
	 * The user may delete as many items as they want, hitting ENTER to stop deleting items and return to main().
	 * Each time the user deletes an item from the list, a message will be displayed showing the item deleted in the following format:
	 *     '<item>' has been deleted to the Shopping List.  [Example:  'Peaches' has been deleted to the Shopping List.]
	 * If the user tries to delete an item not in the list, a message will be displayed indicating the error and showItems() will be called.
	 * Returns the number of items deleted from the shoppingList
	 */	
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
		        String item = "";
		        boolean dele = false;
		        int count = 0;
		        
		        while (!dele) {
		            System.out.print("\nDelete an item from the list (or just hit 'ENTER' when done): ");
		            item = sIn.nextLine();
		            if (item.isEmpty()) {
		                break;
		            }else {
						if (shoppingList.contains(item)) {
							shoppingList.remove(item);
							count++;
							System.out.printf("'%s' has been deleted from the Shopping List.\n", item);
						} else {
							System.out.printf("Invalid response! '%s' is NOT in the Shopping List.\n", item);
							System.out.println("");
							showItems(shoppingList);
						}
					}
				}

				return count;
		
	}

	//end of method deleteItems(ArrayList<String>)
	
	
	/** showItems() method simply displays the contents of the shoppingList ArrayList in it's simplest form:
	 * Example output:
	 * 
	 * The Shopping List contains the following items:
	 * [item-1, item-2, item-n]
	 */	
	public static void showItems(ArrayList<String> shoppingList) {
	        System.out.println("--------------------------------");
	        System.out.println("         Shopping List");
	        System.out.println("--------------------------------");
	        
	        int dosIndex = 0;
	        String itemlist = "";
	        String amountlist = "";
	       
	        for (String item : shoppingList) {
	        	dosIndex = item.indexOf(":");
				itemlist = item.substring(0, dosIndex).trim();
				amountlist = item.substring(dosIndex + 1).trim();
				System.out.printf("%-20s %s\n",itemlist, amountlist);
			}
	        System.out.println("--------------------------------");
	     
	        
	    }//end of method showItems(ArrayList<String>)
	
	
	/** sortItems() method sorts the items in the shoppingList ArrayList, then calls showItems() to display the sorted list.
	 * Example output:
	 * The Shopping List has been sorted.
	 * 
	 * The Shopping List contains the following items:
	 * [item-1, item-2, item-n]
	 */	
	public static void sortItems(ArrayList<String> shoppingList) {
		        Collections.sort(shoppingList);
		        System.out.println("The Shopping List has been sorted.");
		        System.out.println(shoppingList);
	}//end of method sortItems(ArrayList<String>)

}//end of class Lab9aStartCode

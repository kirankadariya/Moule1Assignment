package variable;

public class Variable {

	public static void main(String[] args) {
			
		//Display the message to the user
		System.out.println("Here is my favorite song right now");
		
		//Declare the variable
		  String song;
		  String band;
		  float price;
		  String website;
		  String favGenre;
		  String subGenre;
		  int age;
		  int master;
		  

		//Assign a value to the variable
		song = "Old Twon Road";

		
		//Display the song title to the user
		System.out.println(song);

		
		//Display a secondary message to the user
		System.out.println("I have a song that's close be being my favorite.Its called");

		
		//Change the value of variable
		song="Crash Talk";

		
		//Display new message to user
		System.out.println(song);

		
		//Exercise1 Change variable and then display it in a message
		song= " Dollaz + Sense - Dj Quik";
		System.out.println("My favorite song in middle school was:" + song);

		
		//exercise 2
		  band = "Westside Connection";
		  System.out.println("My favorite band is:" + band);
		  
		  
		//exercise 3 Add value and display message
		  price = 9.99f;
		  System.out.println("The price of my favorite song," +song+ ", was $" +price+ "back when I was in middle school,");
	
		  
	   //exercise 4 
		  website = "Limewire";
		  System.out.println("If you want to get the song," +song+ ",you can go on " +website+ " to get it, Don;t do that though.");
		  
	   //exercise 5
		  favGenre = "hip-hop/Rap";
		  System.out.println("My favorite genre of music is "+favGenre+ ".");
		  
		  
	  //exercise 6
		  subGenre ="West Coast Gangsta rap";
		  System.out.println("The main category of music that I listen to is called " +subGenre+ ".");	  
		  
	
	 //exercise 7
		  age = 11;
		  System.out.println("I was " +age+ " years old when I started listing to " + subGenre+ ".");
		  
		  
	 // exercise 8 
		  int numberSong = 3; 
		  System.out.println(" How many song do you own: "+numberSong + " songs");
		  
			
		  
	} // end of method

}// end of class  

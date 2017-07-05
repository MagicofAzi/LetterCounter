/**
 * Rahat Hossan
 * 12/10/16
 * Counts number of occurrence of a letter
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class LetterCounter {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Instantiated file object and path to file
		
		try 
		{
		String name = JOptionPane.showInputDialog ("Enter file path" ); 
		File file = new File(name);
			
			
		//Used to read lines
		
		Scanner input = new Scanner(file);
		
		//Keeps track of how many times a letter occurred
		
		int[] occur = new int[26];
		for (int i = 0; i<occur.length; i++) {
			occur[i] = 0;
		}
		
		//Occur array is connected to char array in that each letter corresponds to the index of occurrence.
		
		char[] letters = new char[26];
		for(int i = 0; i<letters.length; i++) {
			letters[i] = (char) ('a' + i);
		}
		
		//Loop to check every line
		
		while(input.hasNextLine()) {
			
			//made next line a string
			
			String line = input.nextLine();
			
			//lower case all letters
			
			line = line.toLowerCase();
			
			//went through char array and occur to add values according to their occurrence 
			
			for(int i = 0; i<letters.length; i++) {
				for(int x = 0; x<line.length(); x++) {
					if(letters[i] == line.charAt(x))  {
						occur[i]++;
						
					}
					
				}
				
				
			}
			
		}
		
		//printed all of occur.
		
		for(int i = 0; i<letters.length; i++) {
			System.out.println(letters[i] + " occurs " + occur[i] + " times.");
		}
		
		input.close();
} 
		
		catch(FileNotFoundException e)
		{
		  System.out.println(e);
		}
		
	}

}

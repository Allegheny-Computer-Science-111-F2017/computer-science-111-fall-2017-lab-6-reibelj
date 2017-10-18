package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * This class will manipulate strings of DNA.
 * The program will read in an input and display a complement or mutation based on DNA
 */
public class ManipulateDna {
  /**
   * This is the main method of ManipulateDNA.
   */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Jonathan Reibel " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA string" + dna + ".");
    System.out.println("");
    // Step Two: Compute the complement of the DNA String
    String updna = dna.toUpperCase();
    System.out.println("Enter a string Containing only C, G, T, and A:" + dna);
    String comp1 = dna.replace('a','T');
    String comp2 = comp1.replace('t','A');
    String comp3 = comp2.replace('g','C');
    String comp4 = comp3.replace('c','G');
    System.out.println("The complement of" + updna + "is" + comp4);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random rnd = new Random();
    int into = rnd.nextInt(updna.length());
    String dnastring = "ACTG";
    char letter = dnastring.charAt(rnd.nextInt(dnastring.length()));
    String insert = updna.substring(0, into) + letter + updna.substring(into); 
    System.out.println("Inserting " + letter + " into positon " + into + " gives " + insert);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int outof = rnd.nextInt(updna.length());
    String remove = updna.substring(0, outof) + updna.substring(outof + 1);
    System.out.println("Removing from postion " + outof + " gives " + remove);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int change = rnd.nextInt(updna.length());
    String changing = updna.substring(0, change) + letter + updna.substring(change + 1); 
    System.out.println("Changing position " + change + " gives " + changing);
    // Step Six: Display a final thankyou message
    System.out.println("Thank you for using the Manipulate DNA program.");
    
  }

}

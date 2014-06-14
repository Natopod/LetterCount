/*
 * Program recieves text and returns an array with the count of the 
 * 1 letter words, 2 letter words, 3 letter words etc. count is in
 * ascending order by the count of letters starting at 1
 * 
 */
package lettercount;
import javax.swing.JOptionPane;

public class LetterCount {

    
    public static void main(String[] args) {
        int spPosition;
        
        int nStartPos = 0;
        String userString;
        String msg = "";  //msg variable will build output message to be displayed at the end
        
              
        userString = JOptionPane.showInputDialog("Please enter a sentence");    //take user input
        msg += userString + "\n";
        
        spPosition = userString.length() - (userString.length() - userString.indexOf(" "));   //determine the location of the first space
        int wLen = spPosition - nStartPos;  //determine word length
        
        //tests for the case that a single word is entered and no spaces exist
        if (userString.indexOf(" ") == -1) {
            JOptionPane.showMessageDialog(null, "The length of the only word in this string is: " + userString.length());
        }
        else {
            //loop continues as long as there are more spaces in the string
            while(userString.indexOf(" ", nStartPos) != -1) {
                msg += "The position of the space is " + spPosition + "\n";
                wLen = spPosition - nStartPos;
                nStartPos = spPosition + 1;  //variable is used to change where the indexOf method searches within the string
                                
                spPosition = userString.length() - (userString.length() - (userString.indexOf(" ", nStartPos)));
                
                msg += "word length is: " + wLen +"\n";
            }
            //in the case that the string ends without a space at the end
            if (userString.indexOf(" ") - spPosition != 0) {
                msg += "The length of the last word is " + (userString.length() - nStartPos) + "\n";
                
            }
            //sow created message
            JOptionPane.showMessageDialog(null, msg);
        }
        
        
        
            }
            
        }
        
        
       

    

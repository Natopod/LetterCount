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
        int wNumber = 0;
        int nStartPos = 0;
        String userString;
        String msg = "";
        
              
        userString = JOptionPane.showInputDialog("Please enter a sentence");
        msg += userString + "\n";
        
        spPosition = userString.length() - (userString.length() - userString.indexOf(" "));
        int wLen = spPosition - nStartPos;
        
        if (userString.indexOf(" ") == -1) {
            System.out.println("The length of the only word in this string is: " + userString.length());
        }
        else {
            while(userString.indexOf(" ", nStartPos) != -1) {
                msg += "The position of the space is " + spPosition + "\n";
                wLen = spPosition - nStartPos;
                nStartPos = spPosition + 1;
                                
                spPosition = userString.length() - (userString.length() - (userString.indexOf(" ", nStartPos)));
                
                msg += "word length is: " + wLen +"\n";
            }
            if (userString.indexOf(" ") - spPosition != 0) {
                msg += "The length of the last word is " + (userString.length() - nStartPos) + "\n";
                
            }
            JOptionPane.showMessageDialog(null, msg);
        }
        
        
        
            }
            
        }
        
        
       

    

package myhello;

public class Series { 
    public static void stringReplace (String text) { 
        text = text.replace ('j' , 'i'); 
    } 
 
    public static void bufferReplace (StringBuffer text) { 
        text = text.append ("C"); 
    } 
 
    public static void main (String args[]){ 
        String textString = new String ("java"); 
        StringBuffer textBuffer = new StringBuffer ("java"); 
 
        stringReplace (textString); 
        bufferReplace (textBuffer); 
 
        System.out.println (textString + textBuffer); 
        System.out.println ("change 1");
        System.out.println ("change 2");
    } 
} 
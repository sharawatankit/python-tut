package com.company.calcengine;

/**
 *  <h1> this is a word tool clas</h1>
 *  it conatins methods wordcount and symbol count
 *
 */

public class WordTool {

    WordTool() {};

    /**
     * method wordcout
     * @param s it take a string for which words count is to be returned
     * @return an integer denoting the total number of words
     */
    public int wordCount ( String s ) {
        int count = 0;    // variable to count words
        // if the entry is empty or is null, count is zero
        // therefore we evaluate it only otherwise
        if ( !(s == null || s.isEmpty()) ) {
            // use the split method from the String class to
            // separate the words having the whitespace as separator
            String[] w = s.split("\\s+");
            count = w.length;
        }
        return count;
    }

    public int symbolCount ( String s, boolean withSpaces ) {
        int count = 0;  // variable to count symbols
        // if the entry is empty or is null, count is zero
        // therefore we evaluate it only otherwise
        if ( !(s == null || s.isEmpty()) ) {
            if (withSpaces) {
                // with whitespaces return the full length
                count = s.length();
            } else {
                // without whitespaces, eliminate whitespaces
                // and get the length on the fly
                count = s.replace(" ", "").length();
            }
        }
        return count;
    }

    public static void main(String[] args) {
	// write your code here
        WordTool wt = new WordTool();
        String text = "The river carried the memories from her childhood.";
        System.out.println( "Analyzing the text: \n" + text );
        System.out.println( "Total words: " + wt.wordCount(text) );
        System.out.println( "Total symbols (w. spaces): " + wt.symbolCount(text, true) );
        System.out.println( "Total symbols (wo. spaces): " + wt.symbolCount(text, false) );
    }
}

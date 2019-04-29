package javaapplication2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        Pattern p;
        p = Pattern.compile(
                  "((?<mathoperator>^(\\+|\\-|\\*|\\/)$)"
                + "|(?<logicaloperator>^(&|\\|)$)"
                + "|(?<identifier>^[a-zA-Z_][a-zA-Z0-9_]*$)"
                + "|(?<digit>^[0-9]$)"
                + "|(?<digits>^[0-9]+$)"
                + "|(?<datatype>^(int|char|string)$)"
                + "|(?<decleration>(int|char|string)\\s+([a-zA-Z_][a-zA-Z0-9_]*)\\s*(=)\\s*(.*)))"
        );

        while(true)
        {
            System.out.println("Enter Input: ");
            Matcher m = p.matcher(s.nextLine());

            if (m.find( ))
            {
               if( m.group("mathoperator") != null )
                    System.out.println("Value type: Math Operator" );
               if( m.group("logicaloperator") != null )
                    System.out.println("Value type: Logical Operator" );
               else if( m.group("identifier") != null )
                    System.out.println("Value type: Identifier" );
               else if( m.group("digit") != null )
                    System.out.println("Value type: Digit" );
               else if( m.group("digits") != null )
                    System.out.println("Value type: Digits" );
               else if( m.group("decleration") != null )
                    System.out.println("Value type: Decleration" );
               
               System.out.println("Found value: " + m.group(0) ); 
            } else
                System.err.println("Wrong input!");
            
            System.out.println();
        }
        
    }
    
}

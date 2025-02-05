package dev.sumantakumar.stringenhancement;

public class StripIndent {
    
   @SuppressWarnings("unchecked")
    public static void main(String[] args) {
       String text = "\t\tJava User Group \t\t";
       String add = "\tBhubaneswar\t";

        System.out.println(text+add);

        System.out.println(text.stripIndent()+add.stripIndent());



    }
}

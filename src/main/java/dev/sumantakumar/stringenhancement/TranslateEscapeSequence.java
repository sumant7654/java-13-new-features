package dev.sumantakumar.stringenhancement;

public class TranslateEscapeSequence {
    public static void main(String[] args) {
        String name = "Java\nUser\nGroup";
        String add = "Bhubaneswar\\nOdisha\\nIndia";

        System.out.println(name);
        System.out.println();
        System.out.println(add);
        System.out.println();
        System.out.println(add.translateEscapes());
    }
}

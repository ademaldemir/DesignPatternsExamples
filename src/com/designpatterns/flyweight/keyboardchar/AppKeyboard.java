package com.designpatterns.flyweight.keyboardchar;

// Client Code
public class AppKeyboard {
    public static void main(String[] args) {

        // App UML diagram : http://1.bp.blogspot.com/-yzM4wWpaqN8/UpdJGRy1v3I/AAAAAAAAAoc/RbYK1XgiWag/s640/2.png

        CharacterFactory characterFactory = new CharacterFactory();
/*
        characterFactory.getCharacter('A');
        characterFactory.getCharacter('B');
        characterFactory.getCharacter('Z');
        characterFactory.getCharacter('Z');
        characterFactory.getCharacter('B');
        characterFactory.getCharacter('A');

        characterFactory.getSize();*/

        // Build a document with text
        String document = "AAZZBBZB";

        char[] chars = document.toCharArray();
        CharacterFactory factory = new CharacterFactory();

        // extrinsic state
        int pointSize = 10;

        // For each character use a flyweight object
        for (char c : chars) {
            pointSize++;
            Character character = factory.getCharacter(c);
            character.display(pointSize);
        }

        factory.getSize();

    }
}

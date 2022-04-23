package com.designpatterns.flyweight.keyboardchar;

import java.util.Dictionary;
import java.util.Hashtable;

/// The 'FlyweightFactory' class
public class CharacterFactory {
    private Dictionary<java.lang.Character, Character> _characters;

    public CharacterFactory() {
        this._characters = new Hashtable<>();
    }

    public Character getCharacter(char key){
        Character character = null;

        if (_characters.get(key) != null) {
            return _characters.get(key);
        } else {
            if (key == 'A') {
                character = new CharacterA();
            } else if (key == 'B') {
                character = new CharacterB();
            } else if (key == 'Z') {
                character = new CharacterZ();
            }
            _characters.put(key, character);
        }

        return character;
    }

    public void getSize(){
        System.out.println(String.format("Size of objects %d created in that App.", _characters.size()));
    }
}

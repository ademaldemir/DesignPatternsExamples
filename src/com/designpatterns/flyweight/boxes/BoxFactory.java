package com.designpatterns.flyweight.boxes;

import java.util.Dictionary;
import java.util.Hashtable;

public class BoxFactory {
    private Dictionary<BoxColor, Box> _boxes;

    public BoxFactory() {
        this._boxes = new Hashtable<>();
    }

    public Box get(BoxColor boxColor){
        if (_boxes.get(boxColor) != null){
            return _boxes.get(boxColor);
        }

        Box box = null;

        if (boxColor == BoxColor.Black) {
            box = new BlackBox(20, 20);
        } else if (boxColor == BoxColor.Blue) {
            box = new BlueBox(20, 20);
        }

        _boxes.put(boxColor, box);
        return box;
    }

    public void size(){
        System.out.println(String.format("Size of objects : %d", _boxes.size()));
    }



}

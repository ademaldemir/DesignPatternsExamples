package com.designpatterns.flyweight.boxes;

public class DemoBox {
    public static void main(String[] args) {
        BoxFactory boxFactory = new BoxFactory();

        Box blackBox1 = boxFactory.get(BoxColor.Black);
        Box blackBox2 = boxFactory.get(BoxColor.Black);
        Box blackBox3 = boxFactory.get(BoxColor.Black);
        Box blueBox1 = boxFactory.get(BoxColor.Blue);
        Box blueBox2 = boxFactory.get(BoxColor.Blue);
        Box blueBox3 = boxFactory.get(BoxColor.Blue);

        blackBox1.draw(97, 31);
        blackBox2.draw(34, 78);
        blackBox3.draw(74, 193);
        blueBox1.draw(1, 4);

        boxFactory.size();

    }
}

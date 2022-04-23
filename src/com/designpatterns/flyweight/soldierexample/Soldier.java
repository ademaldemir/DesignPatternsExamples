package com.designpatterns.flyweight.soldierexample;

// Flyweight Class
public abstract class Soldier {
    // Bütün FlyWeight nesne örnekleri tarafından ortak olan ve paylaşılan veriler
    private String unitName;
    private String guns;
    private String health;

    // Istemci tarafından değerlendirilip hesaplanan ve
    // MoveTo operasyonuna gönderilerek Flyweight nesne örnekleri tarafından değerlendirilen veriler

    private Integer X;
    private Integer Y;

    public void setX(Integer x) {
        X = x;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public Integer getX() {
        return X;
    }

    public Integer getY() {
        return Y;
    }

    public Soldier(String unitName, String guns, String health){
        this.guns = guns;
        this.health = health;
        this.unitName = unitName;
    }

    public abstract void moveTo(int x, int y);
}

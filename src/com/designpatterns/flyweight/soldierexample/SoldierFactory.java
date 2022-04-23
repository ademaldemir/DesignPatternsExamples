package com.designpatterns.flyweight.soldierexample;

import java.util.HashMap;

// Flyweight Factory
public class SoldierFactory {

    // Pool of soldiers
    // Uygulama ortamında tekrar edecek olan FLyweight nesne örnekleri depolama alanında basit birer key ile ifade edilir.

    private HashMap<SoldierType, Soldier> soldiers;

    public SoldierFactory() {
        this.soldiers = new HashMap<SoldierType, Soldier>();
    }

    public Soldier getSoldier(SoldierType soldierType){
        Soldier soldier = null;
        // Eğer depolama alanında, parametre olarak gelen Key ile eşleşen bir Flyweight nesnesi var ise onu çek
        if (soldiers.containsKey(soldierType)){
           soldier = soldiers.get(soldierType);
        } else {
            // Yoksa key tipine bakarak uygun FlyWeight nesne örneğini oluştur ve depolama alanına(pool) ekle
            if (soldierType == SoldierType.Private){
                soldier = new Private();
                soldiers.put(SoldierType.Private, soldier);
            } else if (soldierType == SoldierType.Sergeant) {
                soldier = new Sergeant();
                soldiers.put(SoldierType.Sergeant, soldier);
            }
        }

        // Elde edilen flyweight nesnesini geri döndür.
        return soldier;
    }
}

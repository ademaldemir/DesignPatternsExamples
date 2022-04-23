package com.designpatterns.flyweight.soldierexample;

public class Program {
    public static void main(String[] args) {
        // istemci için örnek bir FlyWeight nesne örneği dizisi oluşturulur
        SoldierType[] soldiers = {SoldierType.Private, SoldierType.Private, SoldierType.Sergeant, SoldierType.Private, SoldierType.Sergeant};

        // Flyweight Factory nesnesi örneklenir
        SoldierFactory factory = new SoldierFactory();

        // Extrinsic değerler set edilir
        int locationX = 10;
        int locationY = 10;

        for (SoldierType soldier :
                soldiers) {
            locationX += 10;
            locationY += 5;

            // O anki Soldier tipi için MoveTo operasyonu çağırılmadan önce fabrika nesnesinden tedarik edilir
            Soldier sld = factory.getSoldier(soldier);
            sld.moveTo(locationX, locationY);
        }
    }
}

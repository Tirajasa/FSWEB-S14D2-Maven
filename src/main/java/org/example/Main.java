package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Lamp lamp=new Lamp(LampType.NEON,true,100);
       // Ceiling ceiling=new Ceiling(3, PaintColor.WHITE);
       // asagida ceiling yerine new diyip obje olusturdugmuz gibi yazabiliriz
        Bed bed=new Bed("cift kisilik",4,2,1,1);
        Wall wall1=new Wall("north");
        Wall wall2=new Wall("east");
        Wall wall3=new Wall("south");
        Wall wall4=new Wall("west");
        Wall[] walls=new Wall[]{wall1,wall2,wall3,wall4};
        Carpet carpet=new Carpet(2,3,PaintColor.GREEN);
        Wardrobe wardrobe=new Wardrobe(3,4,200);
        Bedroom bedroom=new Bedroom(wall1,wall2,wall3,wall4,lamp,
                carpet,new Ceiling(3, PaintColor.WHITE),
                wardrobe,bed,"bedroom");

         bedroom.createBedroom();
    }
}
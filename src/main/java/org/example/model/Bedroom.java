package org.example.model;

import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;

public class Bedroom extends Room {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Lamp lamp;
    private Carpet carpet;
    private  Ceiling ceiling;
    private Wardrobe wardrobe;
    private Bed bed;
    private String name;

    Bedroom(Wall wall1,Wall wall2,Wall wall3,Wall wall4,Lamp lamp,Carpet carpet,
            Ceiling ceiling,Wardrobe wardrobe,Bed bed,String name ){
        this.wall1=wall1;
        this.wall2 =wall2;
        this.wall3=wall3;
        this.wall4=wall4;
        this.wardrobe=wardrobe;
        this.lamp=lamp;
        this.carpet=carpet;
        this.ceiling=ceiling;
        this.bed=bed;
        this.name=name;

    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    public String getName() {
        return name;
    }
}

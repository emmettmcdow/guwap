package com.example.guwap.entity;

import android.util.Log;

public class Player implements Region.IEntity {
    private String name;
    private Difficulty difficulty;
    private final int INITIAL_SKILL_POINTS = 16;
    private final int INITIAL_CREDITS = 1000;
    private int pilot, fighter, engineer, trader;
    private Item[] playerInventory;

    public Player() {
        this("Name", Difficulty.NORMAL, 0, 0, 0, 0);
    }

    public Player(String name, Difficulty difficulty, int pilot, int engineer, int fighter, int trader) {
        this.name = name;
        this.difficulty = difficulty;
        this.pilot = pilot;
        this.engineer = engineer;
        this.trader = trader;
        this.fighter = fighter;
        Log.i("Information: ", "Player name: " + this.name
                + "\n Difficulty: " + difficulty.toString()
                + "\n pilot: " + this.pilot
                + "\n engineer: " + this.engineer
                + "\n fighter: " + this.fighter
                + "\n trader: " + this.trader   );
        this.playerInventory = new Items(difficulty).getItems();
    }


    public String getName() {
        return name;
    }

    public Difficulty getDifficulty() { return difficulty; }

    public void setName(String name) {
        this.name = name;
    }


    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getPeopleType() { return this.difficulty.toString();}

    public Item[] getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(Item[] playerInventory) {
        this.playerInventory = playerInventory;
    }
}
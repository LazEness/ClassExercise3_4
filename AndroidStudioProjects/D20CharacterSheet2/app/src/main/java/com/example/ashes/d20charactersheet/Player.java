package com.example.ashes.d20charactersheet;

/**
 * Created by Ashes on 12/16/2015.
 */
public class Player {
    private int playerStr, playerDex, playerCon, playerInt, playerWis, playerCha;
    private int armorClass, carryingCapacity, moveSpeed, hitPoints, classLevel;
    private int playerPlat, playerGold, playerSilver, playerCopper, intitiative;
    private String name, playerClass;

    public Player(int playerStr, int playerDex, int playerCon, int playerInt, int playerWis, int playerCha,
                  int armorClass, int carryingCapacity, int moveSpeed, int hitPoints, int classLevel, int playerPlat,
                  int playerGold, int playerSilver, int playerCopper, int intitiative, String name, String playerClass) {
        super();
        this.playerStr = playerStr;
        this.playerDex = playerDex;
        this.playerCon = playerCon;
        this.playerInt = playerInt;
        this.playerWis = playerWis;
        this.playerCha = playerCha;
        this.armorClass = armorClass;
        this.carryingCapacity = carryingCapacity;
        this.moveSpeed = moveSpeed;
        this.hitPoints = hitPoints;
        this.classLevel = classLevel;
        this.playerPlat = playerPlat;
        this.playerGold = playerGold;
        this.playerSilver = playerSilver;
        this.playerCopper = playerCopper;
        this.intitiative = intitiative;
        this.name = name;
        this.playerClass = playerClass;
    }

    public int getPlayerStr() {
        return playerStr;
    }

    public void setPlayerStr(int playerStr) {
        this.playerStr = playerStr;
    }

    public int getPlayerDex() {
        return playerDex;
    }

    public void setPlayerDex(int playerDex) {
        this.playerDex = playerDex;
    }

    public int getPlayerCon() {
        return playerCon;
    }

    public void setPlayerCon(int playerCon) {
        this.playerCon = playerCon;
    }

    public int getPlayerInt() {
        return playerInt;
    }

    public void setPlayerInt(int playerInt) {
        this.playerInt = playerInt;
    }

    public int getPlayerWis() {
        return playerWis;
    }

    public void setPlayerWis(int playerWis) {
        this.playerWis = playerWis;
    }

    public int getPlayerCha() {
        return playerCha;
    }

    public void setPlayerCha(int playerCha) {
        this.playerCha = playerCha;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public int getPlayerPlat() {
        return playerPlat;
    }

    public void setPlayerPlat(int playerPlat) {
        this.playerPlat = playerPlat;
    }

    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    public int getPlayerSilver() {
        return playerSilver;
    }

    public void setPlayerSilver(int playerSilver) {
        this.playerSilver = playerSilver;
    }

    public int getPlayerCopper() {
        return playerCopper;
    }

    public void setPlayerCopper(int playerCopper) {
        this.playerCopper = playerCopper;
    }

    public int getIntitiative() {
        return intitiative;
    }

    public void setIntitiative(int intitiative) {
        this.intitiative = intitiative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }
    public static int calculateAbilityModifier(int playerStat){
        int abilityModifier = 0;
        switch(playerStat){
            case 1 :
                abilityModifier = -5;
                break;
            case 2:
            case 3:
                abilityModifier = -4;
                break;
            case 4:
            case 5:
                abilityModifier = -3;
                break;
            case 6:
            case 7:
                abilityModifier = -2;
                break;
            case 8:
            case 9:
                abilityModifier = -1;
                break;
            case 10:
            case 11:
                abilityModifier = 0;
                break;
            case 12:
            case 13:
                abilityModifier = 1;
                break;
            case 14:
            case 15:
                abilityModifier = 2;
                break;
            case 16:
            case 17:
                abilityModifier = 3;
                break;
            case 18:
            case 19:
                abilityModifier = 4;
                break;
            case 20:
            case 21:
                abilityModifier = 5;
                break;
            case 22:
            case 23:
                abilityModifier = 6;
                break;
            case 24:
            case 25:
                abilityModifier = 7;
                break;
            case 26:
            case 27:
                abilityModifier = 8;
                break;
            case 28:
            case 29:
                abilityModifier = 9;
                break;
            case 30:
            case 31:
                abilityModifier = 10;
                break;
            case 32:
                abilityModifier = 11;
                break;
            default:
                break;

        }
        return abilityModifier;
    }
}



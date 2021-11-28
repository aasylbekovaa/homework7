package com.company;

public class Main {

    public static void main(String[] args) {
        Magic sheesh = new Magic();
        Medic bro= new Medic();
        Warrior sis= new Warrior();
        Hero[] heroes = { sheesh,bro,sis};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("Ability");

        }









    }
}

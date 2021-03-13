package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("Boss:");

        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        boss.setDamage(50);
        boss.setHealth(250);
        weapon.setNameWeapon("CSS");
        weapon.setTypeWeapon("Rifle");
        boss.setWeapon(weapon);
        boss.printInfo();
        System.out.println("Name:" + boss.getWeapon().getNameWeapon() + " " + "Damage:" +
                boss.getDamage() + " "  + "Health:" + boss.getHealth() + " "
                + "Type:" + boss.getWeapon().getTypeWeapon());

        System.out.println("------------------------------------");
        System.out.println("Skeleton 1:");

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(150);
        skeleton1.setDamage(10);
        skeleton1.setQuantityOfArrows(25);
        skeleton1.setNameWeapon("CBC");
        skeleton1.setTypeWeapon("Shotgun");

        System.out.println("Name:" + skeleton1.getNameWeapon() + " " + "Damage:" + skeleton1.getDamage() + " " +
                "Health:" + skeleton1.getHealth() + " " + "Type:" + skeleton1.getTypeWeapon()
                + " " + "Quantity:" + skeleton1.getQuantityOfArrows());

        System.out.println("------------------------------------");
        System.out.println("Skeleton 2:");

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(100);
        skeleton2.setDamage(8);
        skeleton2.setQuantityOfArrows(30);
        skeleton2.setNameWeapon("FHT");
        skeleton2.setTypeWeapon("Near");

        System.out.println("Name:" + skeleton2.getNameWeapon() + " " + "Damage: " +
                skeleton2.getDamage() + " " + "Health: "
                + skeleton2.getHealth() + " " + "Type:" +
                skeleton2.getTypeWeapon() + " " + "Quantity:" + skeleton2.getQuantityOfArrows());

        System.out.println("------------------------------------");
    }
}

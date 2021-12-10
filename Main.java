////////////////////////////////////////////////////////////////////////////////////
// Garrett Wiese

// Doug Lundin

// CSC 160 Computer Science I

// November 13th, 2021

// Homework 10 - Array of Warrior Objects
////////////////////////////////////////////////////////////////////////////////////
public class Main {

    public static void main(String[] args) {

        WarriorFred darthVader = new WarriorFred("Vader", 9);

        WarriorFred masterYoda = new WarriorFred("Yoda", 8);

        WarriorFred lukeSkywalker = new WarriorFred("Skywalker", 7);

        WarriorFred chewbacca = new WarriorFred("Chewie", 6);

        WarriorFred hanSolo = new WarriorFred("Solo", 5);

        WarriorFred[] warriorArray;

        warriorArray = new WarriorFred[5];

        warriorArray[0] = darthVader;

        warriorArray[1] = masterYoda;

        warriorArray[2] = lukeSkywalker;

        warriorArray[3] = chewbacca;

        warriorArray[4] = hanSolo;

        System.out.println("Warrior data of the first warrior: ");

        warriorArray[0].printInfo();

        System.out.println("Darth Vader is alive: " + darthVader.isAlive());

        darthVader.takeDamage(5);

        darthVader.reaction();

        darthVader.takeDamage(5);

        darthVader.reaction();

        darthVader.takeDamage(15);

        darthVader.reaction();

        System.out.println("Darth Vader is alive:" + darthVader.isAlive());

        System.out.println();

        System.out.println("Warrior data of the second warrior: ");

        warriorArray[1].printInfo();

        System.out.println("Master Yoda is alive: " + masterYoda.isAlive());

        masterYoda.takeDamage(5);

        masterYoda.reaction();

        masterYoda.takeDamage(5);

        masterYoda.reaction();

        masterYoda.takeDamage(15);

        masterYoda.reaction();

        System.out.println("Master Yoda is alive:" + masterYoda.isAlive());

        System.out.println();

        System.out.println("Warrior data of the third warrior: ");

        warriorArray[2].printInfo();

        System.out.println("Luke Skywalker is alive: " + lukeSkywalker.isAlive());

        lukeSkywalker.takeDamage(5);

        lukeSkywalker.reaction();

        lukeSkywalker.takeDamage(5);

        lukeSkywalker.reaction();

        lukeSkywalker.takeDamage(15);

        lukeSkywalker.reaction();

        System.out.println("Luke Skywalker is alive:" + lukeSkywalker.isAlive());

        System.out.println();

        System.out.println("Warrior data of the fourth warrior: ");

        warriorArray[3].printInfo();

        System.out.println("Chewbacca is alive: " + chewbacca.isAlive());

        chewbacca.takeDamage(5);

        chewbacca.reaction();

        chewbacca.takeDamage(5);

        chewbacca.reaction();

        chewbacca.takeDamage(15);

        chewbacca.reaction();

        System.out.println("Chewbacca is alive:" + chewbacca.isAlive());

        System.out.println();

        System.out.println("Warrior data of the fifth warrior: ");

        warriorArray[4].printInfo();

        System.out.println("Han Solo is alive: " + hanSolo.isAlive());

        hanSolo.takeDamage(5);

        hanSolo.reaction();

        hanSolo.takeDamage(5);

        hanSolo.reaction();

        hanSolo.takeDamage(15);

        hanSolo.reaction();

        System.out.println("Han Solo is alive:" + hanSolo.isAlive());
    }
}

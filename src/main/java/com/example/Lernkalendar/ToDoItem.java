package com.example.Lernkalendar;


public class ToDoItem extends Item implements ICalendarItem {

    public void eintragen()
    {
        System.out.println("ToDo-Eintrag wurde erstellt.");
        System.out.println("Name: " + getName());
        System.out.println("Beschreibung: " + getDescription());
        System.out.println("Tag: " + getDay());
        System.out.println("Lernmedium: " + getLearnMedium());


    }
}

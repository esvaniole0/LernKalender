package com.example.Lernkalendar;

//Subklasse von Einträgen
public class TrafficLightItem extends Item implements ICalendarItem {

    public void eintragen()
    {
        System.out.println("Ampel-Eintrag wurde erstellt.");
        System.out.println("Name: " + getName());
        System.out.println("Beschreibung: " + getDescription());
        System.out.println("Tag: " + getDay());
        System.out.println("Lernmedium: " + getLearnMedium());

    }
}

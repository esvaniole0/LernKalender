package com.example.Lernkalendar;

public class TrafficLightItemFactory extends CalendarFactory{

    //überschreibt/initialisiert die Methode aus der CalendarFactory
    @Override
    //initialisiert ein neuen Basic Eintrag
    public ICalendarItem createCalendarItem(String name, String description, String day, String learnMedium) {
        TrafficLightItem item = new TrafficLightItem();
        item.setName(name);
        item.setDescription(description);
        item.setDay(day);
        item.setLearnMedium(learnMedium);
        return item;
    }

}

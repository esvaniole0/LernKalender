package com.example.Lernkalendar;

public class ToDoItemFactory extends CalendarFactory{

    //überschreibt/initialisiert die Methode aus der CalendarFactory
    @Override
    //initialisiert ein neuen Basic Eintrag
    public ICalendarItem createCalendarItem(String name, String description, String day, String learnMedium) {
        ToDoItem item = new ToDoItem();
        item.setName(name);
        item.setDescription(description);
        item.setDay(day);
        item.setLearnMedium(learnMedium);
        return item;
    }

}

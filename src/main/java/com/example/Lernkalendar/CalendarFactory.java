package com.example.Lernkalendar;

//Abstrakte Creator-Klasse: mit abstrakter factoryMethod()
public abstract class CalendarFactory {

    //abstrakte factoryMethod(), wird in Creator-Klassen implementiert
    public abstract ICalendarItem createCalendarItem(String name, String description, String day, String learnMedium);


    //Wird durch Knopfdruck [Erstellen] ausgelöst, in der Zukunft
    public void planItem(String name, String description, String day, String learnMedium)
    {
        //Logik zur Erstellung von Einträgen noch eintragen
        // ci ist dann ein spezifischer Typ von Eintrag !
        ICalendarItem ci = createCalendarItem(name, description, day, learnMedium);

        //Erstellung vom Eintrag (Setter)



        //Brauchen wir das überhaupt?
        ci.eintragen();
    }

}

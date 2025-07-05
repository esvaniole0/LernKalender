//TODOs: LearnMedium noch anpassen!

package com.example.Lernkalendar;
//Elternklasse für Einträge
public class Item {

    //Attribute von Item
    private String name;
    private String description;
    private String day;
    private String learnMedium;


    //Setter für Attribute
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDay(String day) {
        this.day = day;
    }
    //!!Noch ändern, sodass Medium ausgewählt wird
    public void setLearnMedium(String learnMedium) {
        this.learnMedium = learnMedium;
    }


    //Getter für Attribute
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getDay() {
        return day;
    }
    //!!!Wahrscheinlich noch ändern
    public String getLearnMedium() {
        return learnMedium;
    }
}

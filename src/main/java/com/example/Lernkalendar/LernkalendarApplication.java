package com.example.Lernkalendar;

import com.example.Lernkalendar.CalendarFactory;
import com.example.Lernkalendar.BasicItemFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LernkalendarApplication {

	public static void main(String[] args) {

		SpringApplication.run(LernkalendarApplication.class, args);


		//Prüfen ob Einträge vorhanden sind (immer wenn Seite refreshtz wird?)


		//Wenn neuer Typ Botton gedrückt wird, wird neue Seite geöffnet UND Typ gespeichert (in Variable?)
		//mit case?

		String typ = "todo"; //Inhalt nur als Test

		//MIt Scanner Parameter eingeben und übergeben

		Scanner scanner = new Scanner(System.in);

		System.out.println("Name: ");
		String itemname = scanner.nextLine();
		System.out.println("Beschreibung: ");
		String itemdescription = scanner.nextLine();
		System.out.println("Day: ");
		String itemday = scanner.nextLine();
		System.out.println("Lernmedium: ");
		String itemlearnmedium = scanner.nextLine();

		scanner.close();


		//Mit ifs (?) und Typvariable bestimmen welche if ausgelöst wird
		//In if Schleife neuen Eintrag erstellen mit eingegeben Parametern
		//Mit case?

		if (typ == "todo") {
			CalendarFactory toDoItemFactory = new ToDoItemFactory();
			toDoItemFactory.planItem(itemname, itemdescription, itemday, itemlearnmedium);
		}
		if (typ == "traffic") {
			CalendarFactory trafficLightItemFactory = new TrafficLightItemFactory();
			trafficLightItemFactory.planItem(itemname, itemdescription, itemday, itemlearnmedium);
		}
		if (typ == "basic") {
					CalendarFactory basicItemFactory = new BasicItemFactory();
					basicItemFactory.planItem(itemname, itemdescription, itemday, itemlearnmedium);
		}


		//Neuen Eintrag speichern, sodass beim nächsten Start gefunden wird




		///////////////////////////////////////////////////////////////

		//Erst hier die Parameter eingeben und dann an Methode planItem übergeben, die daraus dann einen neuen Eintrag erzeugen


		//Initialisiert neue Basic Eintrag Factory
		CalendarFactory basicItemFactory = new BasicItemFactory();
		//Parameter werden hier zur übergeben zur neuen Instanz
		//in planItem: create und eintragen
		basicItemFactory.planItem(itemname, itemdescription, itemday, itemlearnmedium);





		CalendarFactory toDoItemFactory = new ToDoItemFactory();
		toDoItemFactory.planItem(itemname, itemdescription, itemday, itemlearnmedium);

		CalendarFactory trafficLightItemFactory = new TrafficLightItemFactory();
		trafficLightItemFactory.planItem(itemname, itemdescription, itemday, itemlearnmedium);

	}
}

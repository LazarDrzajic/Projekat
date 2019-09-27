package rs.itbootcamp.humanity.start;

import java.io.IOException;
import java.util.Scanner;

import rs.itbootcamp.humanity.page.tests.HumanityAddEmpExcelTest;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityEditStaffTest;
import rs.itbootcamp.humanity.page.tests.HumanityLogInExcelTest;
import rs.itbootcamp.humanity.page.tests.HumanityLogInTests;
import rs.itbootcamp.humanity.page.tests.HumanityMenuTest;
import rs.itbootcamp.humanity.page.tests.HumanityProfileTest;
import rs.itbootcamp.humanity.page.tests.HumanitySettingsTest;

public class HumanityMain{
	

	public static final int SEGMENTS = 4;
	public static final int HEIGHT = 4;
		
	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		int izbor; 
		do {
			System.out.println("Dobrodosli u program za testiranje web aplikacije Humanity.com");
			System.out.println("Izaberite jednu od ponudjenih opcija: ");
			System.out.println("1 - Manualni testovi");
			System.out.println("2 - Automatizovani testovi");
			System.out.println("0 - Izlaz iz programa");
			System.out.print("Unesite broj: ");
			
			izbor =sc.nextInt(); 
			sc.nextLine();
			switch (izbor) {
			case 0:
				System.out.println("Hvala sto se koristili nas program, dovidjenja.");	
				break;
			case 1:
				String izbormanuelno;
				do {
					System.out.println("Dobrodosli u deo programa za manuelno testiranje aplikacije");
					System.out.println("Operacije koje mozete da sprovedete:");
					System.out.println("1 - Manuelno logovanje na aplikaciju");
					System.out.println("2 - Manuelno dodavanje zaposlenog na listu");
					System.out.println("3 - Testiranje funkcionalnosti polja u glavnom meniju");
					System.out.println("4 - Testiranje promena podataka o zaposlenima");
					System.out.println("5 - Testiranje promena postavki web aplikacije");
					System.out.println("6 - Testiranje promena na profilu korisnika");
					System.out.println("0 - Povratak na pocetni meni");
					System.out.print("Unesite broj testa: ");
					izbormanuelno=sc.nextLine();
					switch (izbormanuelno) {
					case "1":
					if	(HumanityLogInTests.LogInTest()) {
						System.out.println("Test je uspesno izvrsen!");
					} else {
						System.out.println("Test nije uspesno izvrsen!");
					};
						break;
					case "2":
					if	(HumanityAddNewEmployeeTests.AddEmployeeTest()) {
						System.out.println("Test je uspesno izvrsen!");
					} else {
						System.out.println("Test nije uspesno izvrsen!");
					};
						break;
					case "3":
					if	(HumanityMenuTest.MenuTest()) {
						System.out.println("Test je uspesno izvrsen!");
					} else {
						System.out.println("Test nije uspesno izvrsen!");
					};
						break;
					case "4":
					if	(HumanityEditStaffTest.staffTest()) {
						System.out.println("Test je uspesno izvrsen!");
					} else {
						System.out.println("Test nije uspesno izvrsen!");};
						break;
					case "5":	
					if	(HumanitySettingsTest.SettingsTest()) {
						System.out.println("Test je uspesno izvrsen!");
					} else {
						System.out.println("Test nije uspesno izvrsen!");
					};
						break;
					case "6":
					if	(HumanityProfileTest.ProfileTest()) {
						System.out.println("Test je uspesno izvrsen!");
					} else {
						System.out.println("Test nije uspesno izvrsen!");
					};
					break;
					case "0":
						System.out.println("Povratak na pocetni meni");
						Thread.sleep(1000);
						System.out.print(". . . . . . . . .");
						System.out.println();
						break;
					default:
						System.out.println("Izabrali ste nepostojecu operaciju!");
					}
				}while(!izbormanuelno.equals("0"));
				break;
			
			case 2:
				String izborautomatizovano;
				do {
					System.out.println("Dobrodosli u deo programa za automatizovano testiranje aplikacije");
					System.out.println("Operacije koje mozete da sprovedete:");
					System.out.println("1 - Automatizovano logovanje na aplikaciju");
					System.out.println("2 - Automatizovano dodavanje zaposlenih");
					System.out.println("0 - Povratak na pocetni meni");
					System.out.print("Unesite broj testa: ");
					izborautomatizovano=sc.nextLine();
					switch(izborautomatizovano) {
					case "1":
					if	(HumanityLogInExcelTest.Log()) {
						System.out.println("Test je uspesno izvrsen!");
					} else {
						System.out.println("Test nije uspesno izvrsen!");
					};
						break;
					case "2":
					if	(HumanityAddEmpExcelTest.Addemp()) {
						System.out.println("Test je uspesno izvrsen!");
					} else {
						System.out.println("Test nije uspesno izvrsen!");
					};
						break;
					case "0":
						System.out.println("Povratak na pocetni meni");
						Thread.sleep(1000);
						System.out.print(". . . . . . . . .");
						System.out.println();
						break;
					default:
						System.out.println("Izabrali ste nepostojecu operaciju!");
						
					}
				}while(!izborautomatizovano.equals("0"));
				break;
			default: 
				System.out.println("Izabrali ste nepostojecu operaciju!");
				Thread.sleep(1000);
				System.out.print(". . . . . . . . .");
				System.out.println();
				break;
			}
		}while (izbor!=0);	
	}		
}

package main;

import java.util.GregorianCalendar;

import menjacnica.Menjacnica;

public class TestMain {

	public static void main(String[] args) {
		Menjacnica m = new Menjacnica();

		GregorianCalendar datum = new GregorianCalendar();
		datum.set(2016, 5, 23);
		m.dodajKurs(datum, "Euro", "EUR", 101, 102, 98);

		GregorianCalendar datum1 = new GregorianCalendar();
		datum1.set(2016, 5, 24);
		m.dodajKurs(datum1, "Euro", "EUR", 100, 103, 98);

		GregorianCalendar datum2 = new GregorianCalendar();
		datum2.set(2016, 5, 24);
		m.dodajKurs(datum2, "Dolar", "USD", 105, 103, 100);

			
		m.dodajKurs(datum2, "Dolar", "USD", 108, 180, 109);
		//m.obrisiKurs(datum1, "Euro", "EUR");
		m.prikazi();

		m.vratiKurs(datum2, "Dolar", "USD");
	}
	
	
}

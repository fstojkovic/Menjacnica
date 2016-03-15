package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(GregorianCalendar datum, String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKurs(GregorianCalendar datum, String naziv, String skraceniNaziv) {
		// TODO Auto-generated method stub

	}

	@Override
	public double[] vratiKurs(GregorianCalendar datum, String naziv, String skraceniNaziv) {
		// TODO Auto-generated method stub
		return null;
	}

}

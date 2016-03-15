package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> valute;
	
	@Override
	public void dodajKurs(GregorianCalendar datum, String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs) {
		
		Valuta valuta = new Valuta();
		valuta.setSrednjiKurs(srednjiKurs);
		valuta.setDatum(datum);
		valuta.setKupovniKurs(kupovniKurs);
		valuta.setSkraceniNaziv(skraceniNaziv);
		valuta.setProdajniKurs(prodajniKurs);
		valuta.setNaziv(skraceniNaziv);
		valute.add(valuta);

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

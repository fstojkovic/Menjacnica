package menjacnica.interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodajKurs(GregorianCalendar datum, String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs);

	public void obrisiKurs(GregorianCalendar datum, String naziv, String skraceniNaziv);

	public double[] vratiKurs(GregorianCalendar datum, String naziv, String skraceniNaziv);

}

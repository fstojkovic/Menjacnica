package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> valuta;

	@Override
	public void dodajKurs(GregorianCalendar datum, String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs) {
		Valuta v = new Valuta();
		v.setNaziv(skraceniNaziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setDatum(datum);
		v.setKupovniKurs(kupovniKurs);
		v.setProdajniKurs(prodajniKurs);
		v.setSrednjiKurs(srednjiKurs);
		valuta.add(v);

	}

	@Override
	public void obrisiKurs(GregorianCalendar datum, String naziv, String skraceniNaziv) {
		Valuta v = new Valuta();
		v.setNaziv(skraceniNaziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setDatum(datum);

		for (int i = 0; i < valuta.size(); i++) {

			if (valuta.get(i).equals(v)) {
				valuta.get(i).setKupovniKurs(0);
				valuta.get(i).setProdajniKurs(0);
				valuta.get(i).setSrednjiKurs(0);
				break;
			}
		}
	}

	@Override
	public double[] vratiKurs(GregorianCalendar datum, String naziv, String skraceniNaziv) {
		Valuta v = new Valuta();
		v.setNaziv(skraceniNaziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setDatum(datum);
		double[] kursnaLista = new double[3];

		for (int i = 0; i < valuta.size(); i++) {

			if (valuta.get(i).equals(v)) {
				kursnaLista[0] = valuta.get(i).getKupovniKurs();
				kursnaLista[1] = valuta.get(i).getProdajniKurs();
				kursnaLista[2] = valuta.get(i).getSrednjiKurs();

				break;

			}

		}

		return kursnaLista;
	}
}
package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> valuta = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(GregorianCalendar datum, String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs) {

		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setDatum(datum);
		v.setKupovniKurs(kupovniKurs);
		v.setProdajniKurs(prodajniKurs);
		v.setSrednjiKurs(srednjiKurs);
		boolean unos = false;
		for (int i = 0; i < valuta.size(); i++) {

			if (valuta.get(i).equals(v)) {
				valuta.get(i).setKupovniKurs(kupovniKurs);
				valuta.get(i).setProdajniKurs(prodajniKurs);
				valuta.get(i).setSrednjiKurs(srednjiKurs);
				unos = true;
				break;
			}
		}
		if (!unos) {
			valuta.add(v);
		}
	}

	@Override
	public void obrisiKurs(GregorianCalendar datum, String naziv, String skraceniNaziv) {
		Valuta v = new Valuta();
		v.setNaziv(naziv);
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
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setDatum(datum);
		double[] kursnaLista = new double[3];
		String nazivValute = "";
		GregorianCalendar datumKursa = new GregorianCalendar();

		for (int i = 0; i < valuta.size(); i++) {

			if (valuta.get(i).equals(v)) {
				kursnaLista[0] = valuta.get(i).getProdajniKurs();
				kursnaLista[1] = valuta.get(i).getKupovniKurs();
				kursnaLista[2] = valuta.get(i).getSrednjiKurs();
				nazivValute = valuta.get(i).getNaziv();
				datumKursa = valuta.get(i).getDatum();

				break;

			}

		}
		System.out.println("[Naziv valute:" + nazivValute + "\n" + "Datum kursa: " + datumKursa.getTime());
		for (int i = 0; i < kursnaLista.length; i++) {

			switch (i) {
			case 0:
				System.out.println("Prodajni kurs: " + kursnaLista[i]);
				break;
			case 1:
				System.out.println("Kupovni kurs: " + kursnaLista[i]);
				break;
			case 2:
				System.out.println("Srednji kurs: " + kursnaLista[i] + "]");
				break;

			}
		}

		return kursnaLista;
	}

	public void prikazi() {
		if (valuta.isEmpty()) {
			System.out.println("Lista je prazna.");
		}
		for (int i = 0; i < valuta.size(); i++) {
			System.out.println(valuta.get(i));

		}

	}
}
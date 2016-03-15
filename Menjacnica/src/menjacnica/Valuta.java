package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null || naziv.isEmpty()) {
			System.out.println("Greska u nazivu.");
		} else {
			this.naziv = naziv;
		}
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null || skraceniNaziv.isEmpty()) {
			System.out.println("Greska u skracenom nazivu.");
		} else {
			this.skraceniNaziv = skraceniNaziv;
		}
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum == null) {
			System.out.println("Datum ne sme biti null.");
		} else {
			this.datum = datum;
		}
	}

	public double getProdajniKurs() {

		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs <= 0) {
			System.out.println("Prodajni kurs ne sme biti manji od 0.");
		} else {
			this.prodajniKurs = prodajniKurs;
		}
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs <= 0) {
			System.out.println("Kupovni kurs ne sme biti manji od 0.");
		} else {
			this.kupovniKurs = kupovniKurs;
		}
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs <= 0) {
			System.out.println("Srednji kurs ne sme biti manji od 0.");
		} else {
			this.srednjiKurs = srednjiKurs;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Valuta) {
			Valuta v = (Valuta) obj;
			if (naziv.equals(v.getNaziv()) && skraceniNaziv.equals(v.getSkraceniNaziv())
					&& (datum.compareTo(v.getDatum()) == 0)) {
				return true;
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", datum=" + datum.getTime()
				+ ", prodajniKurs=" + prodajniKurs + ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs
				+ "]";
	}

}

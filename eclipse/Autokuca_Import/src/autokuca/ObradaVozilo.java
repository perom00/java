package autokuca;

import java.util.ArrayList;
import java.util.List;

import autokuca.model.ProdajnoMjesto;
import autokuca.model.Prodavac;
import autokuca.model.Vozilo;

public class ObradaVozilo {

	private List<Vozilo> vozilo;
	private Izbornik izbornik;

	public ObradaVozilo(Izbornik izbornik) {
		this();
		this.izbornik = izbornik;
	}

	public List<Vozilo> getVozilo() {
		return vozilo;
	}

	public ObradaVozilo() {
		vozilo = new ArrayList<>();
		if (Pomocno.DEV) {
			testniPodaci();
		}
	}

	private void testniPodaci() {

		vozilo.add(new Vozilo(1, 200, new ProdajnoMjesto(1, "Adresa", "kk", new Prodavac(1, "ime", "prezime"))));
		vozilo.add(new Vozilo(2, 2200, new ProdajnoMjesto(1, "Adresa", "kk", new Prodavac(1, "ime", "prezime"))));
//		vozilo.add(new Vozilo(3, 300, izbornik.getObradaProdajnoMjesto().getProdajnoMjesto().get(1)));
	}

	public void prikaziIzbornik() {
		System.out.println("\nIzbornik vozila");
		System.out.println("1.Pregled vozila");
		System.out.println("2.Unos novih vozila");
		System.out.println("3.Promjena postojećih vozila");
		System.out.println("4.Brisanje postojećih vozila");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {
		switch (Pomocno.unosRasponBroja("Odaberi stavku izbornika", "Odabir mora biti 1-5", 1, 5)) {
		case 1:
			pregledVozila();
			prikaziIzbornik();
			break;
		case 2:
			unosVozila();
			prikaziIzbornik();
			break;
		case 3:
			promjenaVozila();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeVozila();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}

	}

	private void brisanjeVozila() {
		if (vozilo.isEmpty()) {
			System.out.println("Prazno");
		} else {
			pregledVozila();
			int i = Pomocno.unosRasponBroja("Odaberi redni broj vozila", "Odabir nije dobar", 1, vozilo.size());
			vozilo.remove(i - 1);
		}

	}

	private void promjenaVozila() {
		if (vozilo.isEmpty()) {
			System.out.println("Prazno");
		} else {
			int i = Pomocno.unosRasponBroja("Odabeir redni broj prodajnog mjesta", "Odabir nije dobar", 1,
					vozilo.size());
			Vozilo v = new Vozilo();
			v.setSifra(Pomocno.unosRasponBroja("Unesi sifru vozila", "Odabir nije dobar", 1, Integer.MAX_VALUE));
			v.setCijena(Pomocno.unosFloat("Unesi cijenu vozila(. za decimalni dio) (" + v.getCijena() + ")",
					"Greška kod unosa"));
			ProdajnoMjesto p = new ProdajnoMjesto();
			v.setProdajnomjesto(p);
		}

	}

	private void unosVozila() {
		Vozilo v = new Vozilo();
		v.setSifra(Pomocno.unosRasponBroja("Odaberi redni broj vozila", "Odabir nije dobar", 1, Integer.MAX_VALUE));
		v.setCijena(Pomocno.unosFloat("Unesi cijenu vozila(. za decimalni dio) (" + v.getCijena() + ")",
				"Greška kod unosa"));
		v.setProdajnomjesto(postaviProdajnoMjesto());
		vozilo.add(v);
	}

	private ProdajnoMjesto postaviProdajnoMjesto() {
		izbornik.getObradaProdajnoMjesto().pregledProdajnihMjesta();
		int i = Pomocno.unosRasponBroja("Odaberi redni broj prodajnog mjesta", "Odabir nije dobar", 1,
				izbornik.getObradaProdajnoMjesto().getProdajnoMjesto().size());
		return izbornik.getObradaProdajnoMjesto().getProdajnoMjesto().get(i - 1);
	}

	public void pregledVozila() {
		int b = 1;
		System.out.println();
		System.out.println("\nPregled vozila:");
		for (Vozilo v : vozilo) {
			System.out.println(b + ". Šifra vozila: " + v.getSifra());
			System.out.println("   Cijena: " + v.getCijena());
			System.out.println("   Prodajno mjesto:");
			System.out.println("      Adresa: " + v.getProdajnomjesto().getAdresa());
			System.out.println("      Grad: " + v.getProdajnomjesto().getNaziv());
			System.out.println("      Prodavac: " + v.getProdajnomjesto().getProdavac().getIme() + " "
					+ v.getProdajnomjesto().getProdavac().getPrezime());
			System.out.println();
			b++;
		}

	}

}

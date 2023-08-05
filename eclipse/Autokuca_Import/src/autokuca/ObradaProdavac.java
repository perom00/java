package autokuca;

import java.util.ArrayList;

import java.util.List;

import autokuca.model.Prodavac;
public class ObradaProdavac {
	
	
	private List<Prodavac> prodavaci;
	private Izbornik izbornik;
	
	public List<Prodavac> getProdavaci() {
		return prodavaci;
	}
	public ObradaProdavac(Izbornik izbornik) {
		this();
		this.izbornik= izbornik;
	}
	
	public ObradaProdavac() {
		prodavaci = new ArrayList<>();
		if(Pomocno.DEV) {
			testniPodaci();
		}
	}
	
	private void testniPodaci() {
		prodavaci.add(new Prodavac(1,"Pero","Matić"));
		
	}
	public void prikaziIzbornik() {
		System.out.println("\nIzbornik prodavača");
		System.out.println("1.Pregled prodavača");
		System.out.println("2.Unosi novih prodavača");
		System.out.println("3.Promjena postojećih prodavača");
		System.out.println("4.Brisanje postojećih prodavača");
		System.out.println("5.Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}



	private void ucitajStavkuIzbornika() {
		switch(Pomocno.unosRasponBroja("Odaberi stavku izbornika", 
				"Odabir mora biti 1-5", 1, 5)) {
		case 1:
			pregledProdavaca();
			prikaziIzbornik();
			break;
		case 2:
			dodavanjeProdavaca();
			prikaziIzbornik();
			break;
		case 3:
			promjenaProdavaca();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeProdavaca();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
		
	}



	private void brisanjeProdavaca() {
		pregledProdavaca();
		int i=Pomocno.unosRasponBroja("Odaberi redni broj prodavača",
				"Nije dobar odabir", 1, prodavaci.size());
		prodavaci.remove(i-1);
	}

	private void promjenaProdavaca() {
		pregledProdavaca();
		int i = Pomocno.unosRasponBroja("Odaberi redni broj prodavača",
				"Odabir nije dobar", 1, prodavaci.size());
		Prodavac p =prodavaci.get(i-1);
		p.setSifra(Pomocno.unosRasponBroja("Odaberi redni broj predavača",
				"Odabir nije dobar", 1, prodavaci.size()));
		p.setIme(Pomocno.unosString("Unesi ime prodavača(" + p.getIme()+ ")", "Ime obavezno"));
		p.setPrezime(Pomocno.unosString("Unesi prezime prodavača", "Prezime obavezno"));
	}



	private void dodavanjeProdavaca() {
		Prodavac p = new Prodavac();
		// var p= new Polaznik();
		p.setSifra(Pomocno.unosRasponBroja("Odaberi redni broj predavača:",
				"Odabir nije dobar", 1, Integer.MAX_VALUE));
		p.setIme(Pomocno.unosString("Unesi ime predavača", "Ime obavezno"));
		p.setPrezime(Pomocno.unosString("Unesi prezime prodavača", "Prezime obavezno"));
		prodavaci.add(p);
	}



	public void pregledProdavaca() {
		int b=1;
		System.out.println();
		for (Prodavac p:prodavaci)
			System.out.println(b++ + ". "+ p);	
		System.out.println();
	}
}
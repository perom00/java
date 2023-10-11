package autokuca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;



@Entity
public class ProdajnoMjesto extends Entitet {
	private String adresa;
	private String naziv;
        @ManyToOne
	private Prodavac prodavac;
	
	@OneToMany(mappedBy = "prodajnomjesto")
	private List<Vozilo> vozilo=new ArrayList<>();
                
                
                
                
        public ProdajnoMjesto() {
            super();
        }

        public ProdajnoMjesto(String adresa, String naziv, Prodavac prodavac, Integer sifra) {
            super(sifra);
            this.adresa = adresa;
            this.naziv = naziv;
            this.prodavac = prodavac;
        }

    

    

   

        
        public List<Vozilo> getVozilo() {
            return vozilo;
        }

        public void setVozilo(List<Vozilo> vozilo) {
            this.vozilo = vozilo;
        }


	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Prodavac getProdavac() {
		return prodavac;
	}

	public void setProdavac(Prodavac prodavac) {
		this.prodavac = prodavac;
	}
        
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            if (getNaziv() != null) {
                if (getNaziv().length() > 10) {
                    sb.append(getNaziv().substring(0, 10));
                    sb.append("...");
                } else {
                    sb.append(getNaziv());
                }
            } else {
                sb.append(""); 
            }

            sb.append(" [");

            if (getAdresa() != null) {
                if (getAdresa().length() > 20) {
                    sb.append(getAdresa().substring(0, 20));
                    sb.append("...]");
                } else {
                    sb.append(getAdresa());
                    sb.append("]");
                }
            } else {
                sb.append(""); 
            }

            return sb.toString();
}

}
   
      






            
    
        
     
       
       
               
    

	
    

	
	
	

	

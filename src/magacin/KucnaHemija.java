package magacin;

import java.util.GregorianCalendar;

public class KucnaHemija extends Artikli {
	
	
	private String naziv;
	private String opis;
	private int sifra;
	private int kolicina;
	private GregorianCalendar rokTrajanja;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public GregorianCalendar getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(GregorianCalendar rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	@Override
	public String toString() {
		return "KucnaHemija [naziv=" + naziv + ", opis=" + opis + ", sifra=" + sifra + ", kolicina=" + kolicina
				+ ", rokTrajanja=" + rokTrajanja + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + kolicina;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + ((rokTrajanja == null) ? 0 : rokTrajanja.hashCode());
		result = prime * result + sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof KucnaHemija))
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		if (kolicina != other.kolicina)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		if (rokTrajanja == null) {
			if (other.rokTrajanja != null)
				return false;
		} else if (!rokTrajanja.equals(other.rokTrajanja))
			return false;
		if (sifra != other.sifra)
			return false;
		return true;
	}

	
	
	
}

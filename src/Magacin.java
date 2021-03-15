import java.util.LinkedList;
import java.util.*;
import interfejs.MagacinInterfejs;
import magacin.Artikli;

public class Magacin implements MagacinInterfejs {
	
	LinkedList<Artikli> artikli = new LinkedList<Artikli>();

	
	public void dodavanjeArtikla(Artikli a) {
	for (Artikli ar: artikli)
		if (!artikli.contains(a))
			artikli.add(a);
		
	}

	@Override
	public void brisanjeArtikla(Artikli a, int kolicina) {
		for (Artikli ar:artikli)
		if (artikli.contains(a))
			a.setKolicina(a.getKolicina()-kolicina);


	}

	
	public String nadjiArtikal( int sifra) {
		for (int i=0; i<artikli.size(); i++) 
			if (artikli.get(i).getSifra()==sifra) 
			
		
		return artikli.get(i).getNaziv();
	}
	
}

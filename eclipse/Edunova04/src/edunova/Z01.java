package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		// Korisnik unosi dva cijela broja
		// Program ispisuje
		// zbroj svih neparnih brojeva
		// između dva unesena broja
		
		
		int p=Integer.parseInt(JOptionPane.showInputDialog("prvi"));
		int d=Integer.parseInt(JOptionPane.showInputDialog("Drugi"));
		
		int manji= p < d ? p:d;
		int veci=p > d ? p:d;
		int zbroj=0;
		
		for(int i=manji;i<=veci;i++) {
			if(i %2 !=0) {
				zbroj +=i;
			}
		}
		System.out.println("zbroj neparnih "  + p + " i " + d + " je: " + zbroj);
	
		
	}

}

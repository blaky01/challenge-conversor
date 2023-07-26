package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 56.03;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Dominicanos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 61.93;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Dominicanos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 72.22;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Dominicanos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 0.40;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Dominicanos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.044;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Dominicanos");
	}
}

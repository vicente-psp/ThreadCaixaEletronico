package teste;

import javax.swing.JOptionPane;

import entity.CaixaEletronico;
import entity.Conta;

public class Teste {
	public static void main(String[] args) {
		Conta conta = new Conta();

		for(int i = 0; i < 1; i++) {
			new CaixaEletronico(conta).start();
		}
		JOptionPane.showMessageDialog(null, "saldo: " + conta.getSaldo());
		JOptionPane.showMessageDialog(null, "saldo: " + conta.getSaldo());
		
//		JOptionPane.showMessageDialog(null, "Programa finalizando....");
		JOptionPane.showMessageDialog(null, "Programa finalizando....");
		JOptionPane.showMessageDialog(null, "Programa finalizando....");
	}
}

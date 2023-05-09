package view;
import controller.IPlayerController;
import controller.PlayerController;

import javax.swing.JOptionPane;

import br.ewefernandes.lista.listastring.*;

public class Main {

	public static void main(String[] args) throws Exception {
		IPlayerController cont = new PlayerController();
		Lista l = new Lista();
		String musica = "";
		int opc = 0;
		int pos = 0;
		
		while (opc != 9){
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar musicas na playlist; 2- Remover; 3- Tocar playlist; 9- Sair."));
			
			switch (opc) {
			case 1: 
				musica = concatenaString();
				cont.addMusica(l, musica);
				break;
			case 2: 
				pos = Integer.parseInt(JOptionPane.showInputDialog("Posicao da musica na playlist:"));
				cont.removeMusica(l, pos);
				break;
			case 3: 
				cont.execPlaylist(l);
				break;
			case 9:
				break;
			}
			
		} 
	
	}
	
	public static String concatenaString() {
		String musica = JOptionPane.showInputDialog("Música: ");
		String artista = JOptionPane.showInputDialog("Artista: ");
		String duracao = JOptionPane.showInputDialog("Duracao: ");
		
		String concatena = musica+ ";" + artista + ";" +duracao;
		return concatena;
	}

}

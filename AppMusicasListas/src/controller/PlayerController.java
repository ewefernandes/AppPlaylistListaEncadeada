package controller;
import model.Musica;
import br.ewefernandes.lista.listastring.Lista;

public class PlayerController implements IPlayerController {
	
	@Override
	public void addMusica(Lista lista, String musica) throws Exception {
		String[] split = musica.split(";");
		Musica song = new Musica();
		
		song.nome = split[0];
		song.artista = split[1];
		song.duracao = Integer.parseInt(split[2]);
		
		if (lista.isEmpty()) {
			lista.addFirst(musica);
		} else {
			lista.addLast(musica);
		}
	}

	@Override
	public void removeMusica(Lista lista, int posicao) throws Exception {
		lista.remove(posicao);
		System.out.println(lista.toString());
	}

	@Override
	public void execPlaylist(Lista lista) throws Exception {
		int tam = lista.size();
		
		for (int i = 0; i < tam; i ++) {
			String music = lista.get(i);
			String [] vetorM = music.split(";");
			System.out.println("Musica: " + vetorM[0] + " - Artista: " +vetorM[1]+ " - Duracao: " +vetorM[2]+ " min");
		}
	}

}

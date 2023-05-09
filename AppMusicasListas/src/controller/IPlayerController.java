package controller;

import br.ewefernandes.lista.listastring.Lista;

public interface IPlayerController {
	public void addMusica(Lista lista, String musica) throws Exception;
	public void removeMusica(Lista lista, int posicao) throws Exception;
	public void execPlaylist(Lista lista) throws Exception;
}

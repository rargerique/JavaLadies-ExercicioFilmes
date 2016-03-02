import java.util.Collection;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private List<Filme> filmesAssistidos;
	private List<Filme> filmesQueroAssistir;
	
	//TO-DO: Descomentar ao implementar a classe Serie
	/*private List<Serie> seriesAssistidas;
	private List<Serie> seriesQueroAssistir;*/

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Filme> getFilmesAssistidos() {
		return filmesAssistidos;
	}
	
	public void setFilmesAssistidos(List<Filme> filmesAssistidos) {
		this.filmesAssistidos = filmesAssistidos;
	}
	
	public List<Filme> getFilmesQueroAssistir() {
		return filmesQueroAssistir;
	}
	
	public void setFilmesQueroAssistir(List<Filme> filmesQueroAssistir) {
		this.filmesQueroAssistir = filmesQueroAssistir;
	}	
	
	//TO-DO: Descomentar ao implementar a classe Serie
	/*public List<Serie> getSeriesAssistidas() {
		return seriesAssistidas;
	}

	public void setSeriesAssistidas(List<Serie> seriesAssistidas) {
		this.seriesAssistidas = seriesAssistidas;
	}

	public List<Serie> getSeriesQueroAssistir() {
		return seriesQueroAssistir;
	}

	public void setSeriesQueroAssistir(List<Serie> seriesQueroAssistir) {
		this.seriesQueroAssistir = seriesQueroAssistir;
	}*/
	
	//TO-DO: implementar método para assistir filme. 
	//Deve verificar pelo título do filme se ele está na lista de filmes a serem assistidos e retirar dessa lista. 
	//Após, criar um objeto filme e adicioná-lo na lista de filmes assistidos
	public void assistirFilme(String nomeDoFilme){
		
	}
	
	//TO-DO: fazer um loop nos filmes assistidos e retornar o genero da maioria
	//Considerar apenar três gêneros: Ação, Ficção Científica e Romance
	public Genero getGeneroPreferido(){
		return null;
	}
	
	//TO-DO: exibir com System.out.println todos os filmes já assistidos
	public void listarFilmesAssistidos(){
		
	}
	
	//TO-DO: exibir com System.out.println todos os filmes a serem assistidos
	public void listarFilmesAAssistir(){
		
	}

}

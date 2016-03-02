import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Teste {

	public static void main(String[] args) {
		
		//Criar pessoa
		Pessoa p = new Pessoa();
		p.setNome("Fulana");
		
		//Criar gêneros
		Genero g1 = new Genero();
		g1.setNome("Ação");
		Genero g2 = new Genero();
		g2.setNome("Ficção Científica");
		Genero g3 = new Genero();
		g3.setNome("Romance");
		
		//Criar lista de filmes assistidos
		List<Filme> filmesAssistidos = new ArrayList<Filme>();
		Filme f1 = new Filme();
		f1.setGenero(g1);
		f1.setNome("Mad Max");
		filmesAssistidos.add(f1);
		Filme f2 = new Filme();
		f2.setGenero(g2);
		f2.setNome("Star Wars");
		filmesAssistidos.add(f2);
		p.setFilmesAssistidos(filmesAssistidos);
		
		//Criar lista de filme a assistir
		List<Filme> filmesQueroAssistir = new ArrayList<Filme>();
		Filme f3 = new Filme();
		f3.setGenero(g3);
		f3.setNome("PS I Love You");
		filmesQueroAssistir.add(f3);
		p.setFilmesQueroAssistir(filmesQueroAssistir);
		
		//TO-DO: aqui podem ser adicionadas as chamadas aos novos métodos implementados na classe Pessoa
		

	}

}

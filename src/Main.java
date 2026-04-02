import br.com.alura.screenmatch.calculo.Filtrorec;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;

public class Main {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obterMediaDasAvaliacoes());


        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporada(10);
        lost.setEpisodiosPortemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da Série: " + lost.getDuracaoEmMinutos());

        Filme outrofilme = new Filme();
        outrofilme.setNome("Avatar");
        outrofilme.setAnoDeLancamento(2023);
        outrofilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outrofilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Filtrorec filtro = new Filtrorec();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizações(300);
        filtro.filtra(episodio);


    }
}
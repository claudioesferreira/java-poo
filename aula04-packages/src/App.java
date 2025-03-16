import br.com.devflix.gui.*;
import br.com.devflix.gui.botoes.*;
import br.com.devflix.videos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme();
        Filme filme2 = new Filme();

        Novela novela = new Novela();

        Documentario documentario = new Documentario();

        Serie serie = new Serie();

        Janela janelinha = new Janela();
        MiniaturaVideo miniatura = new MiniaturaVideo();

        BotaoPlay botaoPlay = new BotaoPlay();
        BotaoPause botaoPause = new BotaoPause();
        BotaoVoltar botaVoltar = new BotaoVoltar();
        BotaoSair botaoSair = new BotaoSair();
    }
}
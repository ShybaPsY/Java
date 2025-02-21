import java.util.ArrayList;
import java.util.List;


public class Adega {

	private Vinho[][] Vinhos;

	record Posicao (int x, int y){};

	public Adega(){
		filas = 20;
		colunas = 10;
		Vinhos = new Vinho[filas][colunas];
	}

	private int filas;

	private int colunas;

	private Vinho[] vinho;

	private boolean posValida(int fileira, int coluna){
		return fileira >=0 && fileira <= filas && coluna>= 0 && coluna <= colunas && Vinhos[fileira][coluna] == null;
	}

	public boolean addVinho(Vinho vinho, int coluna, int fileira) {
		if(posValida(fileira,coluna)) {
			this.Vinhos[fileira][coluna] = vinho;
			return true;
		}
		return false;
	}

	public boolean addVinho(Vinho vinho) {
		List<Posicao> posicoesLivres = new ArrayList();

		for (int i = 0; i < filas; i++){
			for (int j = 0; j < colunas; j++){
				if(Vinhos[i][j]==null){
					posicoesLivres.add(new Posicao(i,j));
				}
			}
		}
		int posSorteada = (int)(Math.random()*posicoesLivres.size());
		Posicao posicao = posicoesLivres.get(posSorteada);
		Vinhos[posicao.x()][posicao.y()] = vinho;
		return true;
	}

	public int getQtdeTipo(String tipo) {
		int cont = 0;
		for(int i = 0; i < filas; i++){
			for (int j = 0; j < colunas; j++) {
				if(Vinhos[i][j]!=null && Vinhos[i][j].getTipo().equals(tipo.toUpperCase()))
					cont++;
			}
		}

		return cont;
	}

	public Vinho removeVinho(int fileira, int coluna) {
		Vinho aux=null;
		if(fileira >=0 && fileira <= filas && coluna>= 0 && coluna <= colunas && Vinhos[fileira][coluna] != null){
			aux = Vinhos[fileira][coluna];
			Vinhos[fileira][coluna] = null;
		}
		return aux;
	}

	public String toString() {
		String mapa="";
		for(int i = 0; i < filas; i++){
			for (int j = 0; j < colunas; j++) {
				mapa+=(Vinhos[i][j]!=null)?"X":".";
			}
			mapa+="\n";
		}
		return mapa;
	}

	public Vinho getVinhoMaisAntigo(){
		long antigo = -1;
		Vinho aux=null;
		for(int i = 0; i < filas; i++){
			for (int j = 0; j < colunas; j++) {
				if(Vinhos[i][j]!=null && Vinhos[i][j].getIdadeDias() > antigo){
					aux = Vinhos[i][j];
					antigo = Vinhos[i][j].getIdadeDias();
				}
			}
		}
		return aux;
	}
}

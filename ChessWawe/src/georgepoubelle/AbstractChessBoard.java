package georgepoubelle;
import java.util.ArrayList;


/**
 * Classe representant un echiquier 8x8 d'un type generique T quelconque
 * @author clementgeorge
 *
 * @param <T>
 */
public class AbstractChessBoard<T> {

	private ArrayList<ArrayList<T>> board;

	/**
	 * constructeur 
	 * @param defaultValue : une valeur par defaut pour chacune des cases de l'echiquier
	 */
	public AbstractChessBoard(T defaultValue){

		board = new ArrayList<ArrayList<T>>();

		for(int i=0;i<8;i++){
			board.add(new ArrayList<T>());
			for(int j=0;j<8;j++){
				board.get(i).add(defaultValue);
			}
		}
	}
	
	public AbstractChessBoard(){
		this(null);
	}

	/**
	 * retourne le contenu de la case de coordonnee passee en parametre
	 * @param coordinate : la coordonnee
	 * @return
	 */
	public T getSquare(ChessCoordinate coordinate){
		return board.get(coordinate.getColumn()-1).get(coordinate.getRank()-1);
	}
	
	/**
	 * modifie le contenu de la case de coordonnee 'coordinate' en la valeur 'val' 
	 * @param coordinate
	 * @param val
	 */
	public void setSquare(ChessCoordinate coordinate,T val){
		board.get(coordinate.getColumn()-1).set(coordinate.getRank(), val);
	}
	
	/**
	 * verifie qu'une case est vide (ne contient aucune piece)
	 * @param coordinate : La coordonnee echiqueenne de la case
	 * @return
	 */
	public boolean isEmpty(ChessCoordinate coordinate){
		return this.getSquare(coordinate)==null;
	}


}

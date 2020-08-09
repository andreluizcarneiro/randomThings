package exemplo_oo;

public class Sents {

	private Player player;
	private Inimigo inimigo;
	
	
	public Sents() {
		player = new Player();
		inimigo = new Inimigo();
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Inimigo getInimigo() {
		return inimigo;
	}
}

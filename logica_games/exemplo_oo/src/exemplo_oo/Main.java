package exemplo_oo;

public class Main {
	
	public static void main(String[] args) {
		Sents game = new Sents();
		Player player = game.getPlayer();
		player.atacarInimigo(game.getInimigo());
		System.out.println(game.getInimigo().life);
	}
}

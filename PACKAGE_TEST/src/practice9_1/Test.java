package practice9_1;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Game> total_game = new ArrayList<Game>();
		Game g1 = new BattleGround();
		Game g2 = new LeagueOfLegends();
		Game g3 = new Overwatch();
		
		total_game.add(g1);
		total_game.add(g2);
		total_game.add(g3);
		total_game.add(new Game());
	
		for(Game ele : total_game) {
			check_monthly_price(ele);
		}
	}
	
	static void check_monthly_price(Game game) {
		System.out.print("해당 게임의 월사용료는 ");
		if(game instanceof BattleGround || game instanceof LeagueOfLegends || game instanceof Overwatch) {
			game.get_monthly_price();
		}else {
			game.get_monthly_price();
		}
		System.out.println("원 입니다.");
		System.out.println("");
	}
}

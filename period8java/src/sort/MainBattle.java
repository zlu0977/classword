package sort;

public class MainBattle {

	public static void main(String[] args) {
		Pokemon geodude = new Pokemon("Geodude", 45);
		Pokemon magikarp = new Pokemon("Magikarp", 100);
		
		geodude.iChooseYou();
		magikarp.iChooseYou();
		
		System.out.println("ITS TIME TO DUEL");
		
		geodude.attack(magikarp, new Attack() {
			public void attack(Pokemon target) {
				target.setHP(target.getHP()/2);
			}
		});
		
		magikarp.attack(geodude, new Attack() {
			public void attack(Pokemon target) {
				//target.setHP(3 * target.getHP()/4);
				target.setPoisoned(true);
			}
		});
		
		geodude.lapse();
		magikarp.lapse();
		
		printScore(geodude, magikarp);
	}

	private static void printScore(Pokemon pok1, Pokemon pok2) {
		System.out.println(pok1.getName() + " has " + pok1.getHP() + " HP.");
		System.out.println(pok2.getName() + " has " + pok2.getHP() + " HP.");
	}

}


public class Main {

	public static void main(String[] args) {
		System.out.println("start.");
		for(int i = 0; i < 10 ; i++) {
			System.out.println(FruitsMaker.getInstance().getNextFruits());
		}
		System.out.println("end.");
	}
}

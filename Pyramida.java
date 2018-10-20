/* Nakresli (krasnou) pyramidu. */
public class Pyramida {
	public static void main(String[] args) {
		int vyska = Integer.parseInt(args[0]);
		
		for (int y = 0; y < vyska; y++) {
			for (int a = 0; a < vyska - y - 1; a++) {
				System.out.printf(" ");
			}
			for (int b = 0; b < y * 2 + 1; b++) {
				System.out.printf("Z");
			}
			System.out.println();
		}
	}
}

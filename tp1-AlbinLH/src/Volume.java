import java.util.Scanner;
public class Volume {

	public static void main(String[] args) {
		double volume;
		Scanner scan = new Scanner(System.in);
		System.out.println("longueur ?");
		double longueur = scan.nextDouble();
		System.out.println("largeur ?");
		double largeur = scan.nextDouble();
		System.out.println("hauteur ?");
		double hauteur = scan.nextDouble();
		volume = longueur*largeur*hauteur;
		System.out.println("Volume =  "+volume);
	}

}

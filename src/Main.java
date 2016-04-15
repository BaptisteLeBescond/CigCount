import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanIn = new Scanner(System.in);
		
		System.out.println("Bonjour, veuillez écrire le type de cigarette : ");
		String packType = scanIn.nextLine();
		   
		System.out.println("Veuillez écrire la marque de cigarette : ");
		String packBrand = scanIn.nextLine();
		
		System.out.println("Veuillez écrire le prix du paquet de cigarette (en €) : ");
		float packPrice = Float.parseFloat(scanIn.nextLine());
		
		System.out.println("Veuillez écrire le taux de tabac dans la cigarette (en %) : ");
		int packTobaccoRate = Integer.parseInt(scanIn.nextLine());
		
		System.out.println("Veuillez écrire le taux de papier dans la cigarette (en %) : ");
		int packPaperRate = Integer.parseInt(scanIn.nextLine());
		
		System.out.println("Veuillez écrire le taux d'agents de texture et saveur dans la cigarette (en %) : ");
		int packAgentsRate = Integer.parseInt(scanIn.nextLine());
		   
		System.out.println(packType +" "+ packBrand +" "+ packPrice +" "+ packTobaccoRate +" "+ packPaperRate +" "+ packAgentsRate);
		  
		scanIn.close();
		
		Pack pack1 = new Pack(new Type(packType), packBrand, packPrice, packTobaccoRate, packPaperRate, packAgentsRate, null);
		
		System.out.println(pack1);
	}
}

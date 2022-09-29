package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		// değişken isimlendirmeleri camelCase yazılır
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade";
		
		
		System.out.println(ortaMetin);
		
		//integer
		int vade =12;
		
		double dolarDun = 18.14;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = true; // ya da false yazabilirsin şartlı durumları için boolean kullanıyoruz
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //bu condition true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array bir çok veri varsa ben bunları listede tutarım buna array denir
		
		String[] krediler = {"hızlı kredi", "maaşını halkbanktan","mutlu emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		//Elimde binlerce veri varsa hepsi için bu yukarıdaki işlemi yapamam bir şarta bağlamam lazım bunu da döngüler ile yapıyorum
		//i++ =>  i=i+1
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}

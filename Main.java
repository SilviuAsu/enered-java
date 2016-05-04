package ro.enered.exemple;

public class Main {
	public static void main (String[]args){
		//PENTRU AFISARE PE ECRAN
		System.out.println("CEVA");
		//DEFINIREA VARIABILELOR
		int a = 4;
		int b = 3;
		int c;
		c = adunare(a,b);
		//afisare c
		System.out.println(c);
		c = scadere(a,b);
		//afisare c
		System.out.println(c);
		InitializareStudent();
		initializareStoc();
	}
	private static int adunare(int a1, int b1){
		return a1+b1;
	}
	private static int scadere(int a1, int b1){
		return a1-b1;
	}
	private static void InitializareStudent(){
		/*Student nou
		 * un nume
		 * sa invete un nou curs pt un nr de ore
		 * 
		 */
		//instantiere
		Student s = new Student();
		//atribuim un nume studentului
		s.nume = "Vlad";
		//atribuim o clasa studentului
		s.grup = 4;
		//apelam metoda invata
		System.out.println(s.invata("JAVA",5));
		
	}
	public static void initializareNota(){
		/*atribuim studentului cu numele Ion din grupa 2 nota 8
		 * 
		 */
		Student s = new Student();
		s.nume="Ion";
		s.grup = 2;
		nota n = new nota();
		n.atribuie(s, 8);
		System.out.println(n.atribuie(s, 8));
	}
	public static void initializareStoc(){
		Stoc s = new Stoc();
		System.out.println(s.calcNr());
	}
}

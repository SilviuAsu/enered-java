package ro.enered.exemple;

public class Student {
	//proprietatile studentului
	public String nume;
	public int grup;
	public String invata (String numeCurs, int ore){
		String rezultat = "Studentul " + nume + " din grupa " + grup+ " a invatat la " + numeCurs + " timp de " + ore + " ore";
		return rezultat;
	}
}

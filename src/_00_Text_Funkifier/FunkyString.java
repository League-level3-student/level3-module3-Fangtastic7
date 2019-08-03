package _00_Text_Funkifier;

public class FunkyString extends SpecialString {

	public FunkyString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String newstring = "";
		// TODO Auto-generated method stub
		for(int i = 0; i< s.length(); i++) {
			if(i != s.length()-1) {
				String uppercase = s.substring(i, i+1).toUpperCase();
				newstring = newstring + uppercase; 
			}
			else {
				newstring = newstring + s.substring(i, i+1).toLowerCase();
			}
		}
		System.out.println(newstring);
		return newstring;
	}

}

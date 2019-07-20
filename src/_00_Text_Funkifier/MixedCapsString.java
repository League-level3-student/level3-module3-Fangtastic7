package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funky = "";
		for(int i=0; i<s.length(); i++) {
			
			if(i % 2 != 0 && i != 0) {
			//char letter = s.charAt(i);
			//String character = Character.toString(letter);
			String uppercase =  s.substring(i, i+1).toUpperCase();
			// s.replaceFirst(character, uppercase);
			funky = funky + uppercase;
				System.out.println(uppercase);
			}
			else {
				funky = funky + s.substring(i, i+1).toLowerCase();
			}
		}
		System.out.println(funky);
		return funky;
		
	}

}

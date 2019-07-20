package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String s) {
		String text = "";
		for(int i = 0; i <s.length() ;i++) {
			char character = s.charAt(s.length()-1-i);
			String letter = Character.toString(character);
			text = text + letter;
			
		}
		//System.out.println(text);
		return text;
	}

}

package _01_AnimalFarm;

public class Chicken extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		warmblooded();
		Song song = new Song();
		//song.playMusicOnComputer("mooing.mp3");
		song.speak("moo");
	}

}

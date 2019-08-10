package _01_AnimalFarm;

public class Sheep extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		warmblooded();
		Song song = new Song();
		song.speak("moo");
		//song.playMusicOnComputer("mooing.mp3");
		
	}

}


public class Animation2D extends Animation implements Drawable{

		public static void main(String[] args) {
		Animation2D object = new Animation2D();
		object.draw();
		System.out.println(object.getFramerate());
		
	}
		@Override
		public  void draw() {
			// TODO Auto-generated method stub
			System.out.println("drawing");
		}

}

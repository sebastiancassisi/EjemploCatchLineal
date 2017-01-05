package ejemplocatchlineal;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		App app = new App();
		app.mostrar();
		
	}

	
	public void mostrar (){
		
		try {
			throw new IOException("IOException");
			
		} catch (NullPointerException|IOException|NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
}

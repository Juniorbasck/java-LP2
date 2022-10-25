package compose;

import java.util.ArrayList;

public class LinearContainer implements componenteVisual{
	
	ArrayList<componenteVisual> children = new ArrayList<>();
	
	public void add(componenteVisual cv) {
		children.add(cv);
	}
	
	public void remove(componenteVisual cv) {
		children.remove(cv);
	}
	
	@Override 
	public void desenhar() {
		System.out.println("Desenhar o container");
		for (componenteVisual cv : children) {
			cv.desenhar();
		}
	}
}

package pilha;

public class pilhar {
	private Arraylist<T> pilha = new Arraylist<T>();
	
	public void empilhar(T t) {
		pilha.add(t);
	}
	
	public void desempilhar() throws RuntimeException{
		pilha.remove(pilha.size() - 1);
		return pilha;
	}
	
	public boolean vazio(T t) {
		return pilha.size() == 0;
	}
	
	public Arraylist<T> getpilha(){
		return pilha;
	}
	
}

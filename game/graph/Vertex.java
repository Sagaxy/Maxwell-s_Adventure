package game.graph;

import java.util.ArrayList;

public class Vertex<T> {
	
	private T data;
	private ArrayList<T> edgeGo;
	private ArrayList<T> edgeCome;
	
	
	public Vertex(T data, ArrayList<T> edgeGo, ArrayList<T> edgeCome) {
		super();
		this.data = data;
		this.edgeGo = edgeGo;
		this.edgeCome = edgeCome;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public ArrayList<T> getEdgeGo() {
		return edgeGo;
	}


	public void setEdgeGo(ArrayList<T> edgeGo) {
		this.edgeGo = edgeGo;
	}


	public ArrayList<T> getEdgeCome() {
		return edgeCome;
	}


	public void setEdgeCome(ArrayList<T> edgeCome) {
		this.edgeCome = edgeCome;
	}
	
	
	
	

}

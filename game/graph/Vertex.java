package game.graph;

import java.util.ArrayList;

public class Vertex<T> {
	
	private T data;
	private ArrayList<T> edgeGo;
	
	
	
	public Vertex(T data, ArrayList<T> edgeGo) {
		super();
		this.data = data;
		this.edgeGo = edgeGo;
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
}

package game.graph;

import java.util.ArrayList;

public class Vertex<T> {
	
	private T data;
	private ArrayList<T> edgeIn;
	private ArrayList<T> edgeout;
	
	
	public Vertex(T data, ArrayList<T> edgeIn, ArrayList<T> edgeout) {
		super();
		this.data = data;
		this.edgeIn = edgeIn;
		this.edgeout = edgeout;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public ArrayList<T> getEdgeIn() {
		return edgeIn;
	}


	public void setEdgeIn(ArrayList<T> edgeIn) {
		this.edgeIn = edgeIn;
	}


	public ArrayList<T> getEdgeout() {
		return edgeout;
	}


	public void setEdgeout(ArrayList<T> edgeout) {
		this.edgeout = edgeout;
	}
	
	
	
	

}

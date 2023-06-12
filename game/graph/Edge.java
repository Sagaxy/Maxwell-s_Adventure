package game.graph;

public class Edge {
	
	Cidade destino;
    int custo;

    public Aresta(Cidade destino, int custo) {
        this.destino = destino;
        this.custo = custo;
    }

}

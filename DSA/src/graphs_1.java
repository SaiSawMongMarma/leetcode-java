//It is a network of Nodes
//Node=Vertex
//Connection line= Edges
//uni-directional= x->y
//Bi-directional= x-><-y  /x-y
//Weighted= x->y(10)
//Unweighted= x->y

//Storing Graph list
//Adjacency List=list of lists
//Edge List
//2D Matrix(Implicit Graph)

public class graphs_1 {
}

//Adjacency List=List of Lists
//vertex-wise
//0->{0,2} source=0 destination=2
//1->{1,2}, {1,3}
//2->{2,0}, {2,1}, {2,3}
//3->{3,1}, {3,2}
//Using Arraylist or HashMap

//int arr[]
//ArrayList<Edge> graph[v]  //v=4(index)
// static class Edge{
//  int src;
//  int dest;
// }

//graph[0].add(newEdge(0,2));
//graph[1].add(newEdge(1,2));
//graph[1].add(newEdge(1,3));

//Adjacency List use for
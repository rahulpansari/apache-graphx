import org.apache.spark.graphx._
import org.apache.spark._

//Triangles count of all node from facebook Datasets

// Link is: https://snap.stanford.edu/data/ego-Facebook.html
// Load the edges in canonical order and partition the graph for triangle count


val graph = GraphLoader.edgeListFile(sc, "facebook_combined.txt", true)
  .partitionBy(PartitionStrategy.RandomVertexCut)
println("pageRank first value is node and second is probability of its connection with other nodes:")
val ranks = graph.pageRank(0.125).vertices
println(ranks.collect().mkString("\n"))
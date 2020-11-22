import org.apache.spark.graphx._
import org.apache.spark._

//Triangles count of all node from facebook Datasets

// Link is: https://snap.stanford.edu/data/ego-Facebook.html
// Load the edges in canonical order and partition the graph for triangle count


val graph = GraphLoader.edgeListFile(sc, "facebook_combined.txt", true)
  .partitionBy(PartitionStrategy.RandomVertexCut)
val triCounts = graph.triangleCount().vertices
println("Triangle Count where first value is vertext/node and second second value give no of triangles from corrresponding vertex:")
println(triCounts.collect().mkString("\n"));



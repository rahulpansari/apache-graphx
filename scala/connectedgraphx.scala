import org.apache.spark.graphx._
import org.apache.spark._


// Link is: https://snap.stanford.edu/data/ego-Facebook.html
//Connected Componenets of Dataset
val graph = GraphLoader.edgeListFile(sc, "facebook_combined.txt", true)
  .partitionBy(PartitionStrategy.RandomVertexCut)
val cc = graph.connectedComponents().vertices
println("Connected Components first value is node which is connected to the lowest vertex id:")
println(cc.collect().mkString("\n"));
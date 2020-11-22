# Apache Spark
Apache Spark is an open-source distributed cluster-computing framework.  It is 100 times faster than Hadoop MapReduce in memory and 10x faster on disk. It runs on Java, Scala, R, Python and SQL Shells. It has a stack of many libraries like Spark Streaming, SQL and data frames and Mlib for machine learning and GraphX for graph processing. and many others which can be used in applications seamlessly. Apache Spark can run as a standalone cluster on a machine with JVM and Apache Spark framework. To harness complete functionality and control over nodes of a cluster, we run it on cluster computing frameworks like Kubernates, Hadoop Yarn, HDFS or Apache Mesos. 
We will be using Hadoop Yarn as a cluster computing framework.


# GraphX
 It is a component in spark for graphs and graph-parallel computations. At a high level, GraphX extends the Spark RDD by introducing a new Graph abstraction: a directed multigraph with properties attached to each vertex and edge. To support graph computation, GraphX exposes a set of fundamental operators as well as an optimized variant of the Pragel API. In addition, GraphX includes a growing collection of graph algorithms and builders to simplify graph analytics tasks.


#  Graph Algorithms

# i) Connected Components Algorithm:
The connected components algorithm labels each connected component of the graph with the ID of its lowest-numbered vertex.
For example, in a social network, connected components can approximate clusters.
GraphX contains an implementation of the algorithm in the ConnectedComponents object, and we compute the connected components of the example social network dataset from the PageRank section.

# ii) Triangle Counting Algorithm:
Triangle counting gained popularity in social network analysis, where it is used to detect communities and measure the cohesiveness of those communities. It can also be used to determine the stability of a graph, and is often used as part of the computation of network indices, such as the clustering coefficient.
The local clustering coefficient of a node is the likelihood that its neighbours are also connected. The computation of this score involves triangle counting.

There are two types of clustering coefficient:

Local clustering coefficient
    The local clustering coefficient of a node is the likelihood that its neighbours are also connected. The computation of this score involves triangle counting. 
Global clustering coefficient
    The global clustering coefficient is the normalized sum of those local clustering coefficients.
    
    



# iii) Page Rank
PageRank is an algorithm used by Google Search to rank websites in their search engine results PageRank works by counting the number and quality of links to a page to determine a rough estimate of how important the website is. The underlying assumption is that more important websites are likely to receive more links from other websites. The PageRank algorithm outputs a probability distribution used to represent the likelihood that a person randomly clicking on links will arrive at any particular page.  PageRank can be calculated for collections of documents of any size. The PageRank computations require several passes, called “iterations”, through the collection to adjust approximate PageRank values to more closely reflect the theoretical true value.  

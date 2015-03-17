package api

/**
 * Created by andryw on 17/03/15.
 */
abstract class SimilarityType (_type:String)

case object PEARSON_SIMILARITY extends SimilarityType("PEARSON")
case object EUCLIDEAN extends SimilarityType("EUCLIDEAN")

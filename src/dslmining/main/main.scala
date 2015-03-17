import api.{UserBasedRecommenderImpl, PEARSON_SIMILARITY, USER_BASED_RECOMMENDER, train}
import dsl.Implicits.{WithPath2RecommenderHelper,PathRecom2SimilHelper,WithNeighboorhood,Tuple2Recommender}
/**
 * Created by andryw on 17/03/15.
 */
object main {
  def main(args:Array[String]): Unit ={
    val recommender:UserBasedRecommenderImpl = train on_dataset "example.txt" a USER_BASED_RECOMMENDER similarity PEARSON_SIMILARITY neighbourhood 10
    println(recommender.recommender.getDataModel)

  }

}

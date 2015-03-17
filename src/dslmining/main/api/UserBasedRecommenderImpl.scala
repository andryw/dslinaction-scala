package api

import java.io.File

import dsl.Implicits.{NeighbourHoodSize, WithPath}
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity

import org.apache.mahout.cf.taste.model.DataModel
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood
import org.apache.mahout.cf.taste.recommender.Recommender
import org.apache.mahout.cf.taste.similarity.UserSimilarity

/**
 * Created by andryw on 17/03/15.
 */
case class UserBasedRecommenderImpl (val path: WithPath, val recomType: RecommendationType, val similarityType: SimilarityType, val neighbourHoodSize: NeighbourHoodSize){

    var dataModel:DataModel = new FileDataModel(new File(path))

    var similarity:UserSimilarity  =  (similarityType, dataModel);

    var neighborhood : UserNeighborhood  = new NearestNUserNeighborhood (neighbourHoodSize, similarity, dataModel);

    var recommender:Recommender = new GenericUserBasedRecommender (dataModel, neighborhood, similarity);





  implicit def  similarityTypeToSimilarityObject(tuple: (SimilarityType,DataModel)): UserSimilarity ={
    tuple._1 match {
      case PEARSON_SIMILARITY => new PearsonCorrelationSimilarity(tuple._2)
      case EUCLIDEAN => new EuclideanDistanceSimilarity(tuple._2)
    }
  }
}

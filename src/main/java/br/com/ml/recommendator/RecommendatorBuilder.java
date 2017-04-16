package br.com.ml.recommendator;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

/**
 * The Class RecommendatorBuilder.
 */
public class RecommendatorBuilder implements RecommenderBuilder {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.mahout.cf.taste.eval.RecommenderBuilder#buildRecommender(org
	 * .apache.mahout.cf.taste.model.DataModel)
	 */
	public Recommender buildRecommender(DataModel model) throws TasteException {
		UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
		UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);
		return new GenericUserBasedRecommender(model, neighborhood, similarity);
	}

}

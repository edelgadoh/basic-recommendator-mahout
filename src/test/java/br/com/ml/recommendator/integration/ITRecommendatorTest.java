package br.com.ml.recommendator.integration;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.junit.Test;

import br.com.ml.recommendator.Recommendator;
import br.com.ml.recommendator.RecommendatorBuilder;

public class ITRecommendatorTest {

	@Test
	public void testCourseModel() throws IOException, TasteException {
		DataModel courses = new Recommendator().getCourseModel();
		Recommender recommender = new RecommendatorBuilder().buildRecommender(courses);
		List<RecommendedItem> recommendations = recommender.recommend(1, 3);
		for (RecommendedItem recommendation : recommendations) {
			System.out.println(recommendation);
		}
	}

	@Test
	public void testProductModel() throws IOException, TasteException {
		DataModel produtos = new Recommendator().getProductsModel();

		Recommender recommender = new RecommendatorBuilder().buildRecommender(produtos);
		List<RecommendedItem> recommendations = recommender.recommend(3, 4);

		for (RecommendedItem recommendation : recommendations) {
			System.out.println(recommendation);
		}
	}

}

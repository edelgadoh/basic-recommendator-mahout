package br.com.ml.recommendator;

import java.io.IOException;

import junit.framework.Assert;

import org.apache.mahout.cf.taste.common.TasteException;
import org.junit.Test;

import br.com.ml.recommendator.model.RecommenderResult;

public class UnitaryRecommenderResultTest {

	@Test
	public void sampleUnitaryTest() throws IOException, TasteException {

		RecommenderResult evaluateRecommenderResult = new RecommenderResult();
		evaluateRecommenderResult.setRecommendatorName("CourseModel");
		evaluateRecommenderResult.setTrainningPercentage(0.99);
		evaluateRecommenderResult.setEvaluationPercentage(1.0);
		evaluateRecommenderResult.setError(1.5);

		Assert.assertEquals(1.5, evaluateRecommenderResult.getError(), 0.001);
		Assert.assertEquals("CourseModel", evaluateRecommenderResult.getRecommendatorName());
		Assert.assertEquals(0.99, evaluateRecommenderResult.getTrainningPercentage(), 0.001);
		Assert.assertEquals(1.00, evaluateRecommenderResult.getEvaluationPercentage(), 0.001);
		System.out.println(evaluateRecommenderResult);
		
	}

}

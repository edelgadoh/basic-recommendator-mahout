package br.com.ml.recommendator.integration;

import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;
import org.junit.Before;
import org.junit.Test;

import br.com.ml.recommendator.Recommendator;
import br.com.ml.recommendator.RecommendatorBuilder;
import br.com.ml.recommendator.model.RecommenderResult;

public class ITEvaluateTest {

	private RecommenderEvaluator evaluator;
	private RecommenderBuilder builder;
	private double evaluationPercentage = 1.0;
	private double trainingPercentage = 0.9;
	
	@Before
	public void init() {
		RandomUtils.useTestSeed();
		evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
		builder = new RecommendatorBuilder();

	}

	@Test
	public void testEvaluateProductModel() throws IOException, TasteException {
		DataModel dataModel = new Recommendator().getProductsModel();
		double error = evaluator.evaluate(builder, null, dataModel, trainingPercentage, evaluationPercentage);
		
		RecommenderResult recommenderResult = new RecommenderResult();
		recommenderResult.setRecommendatorName("ProductsModel");;
		recommenderResult.setTrainningPercentage(trainingPercentage);
		recommenderResult.setEvaluationPercentage(evaluationPercentage);
		recommenderResult.setError(error);
		System.out.println(recommenderResult);

	}

	@Test
	public void testEvaluateCourseModel() throws IOException, TasteException {
		DataModel dataModel = new Recommendator().getCourseModel();
		double error = evaluator.evaluate(builder, null, dataModel, trainingPercentage, evaluationPercentage);

		RecommenderResult recommenderResult = new RecommenderResult();
		recommenderResult.setRecommendatorName("CourseModel");
		recommenderResult.setTrainningPercentage(trainingPercentage);
		recommenderResult.setEvaluationPercentage(evaluationPercentage);
		recommenderResult.setError(error);
		System.out.println(recommenderResult);

	}
}

package br.com.ml.recommendator.model;

/**
 * The Class RecommenderResult.
 */
public class RecommenderResult {

	/** The recommendator name. */
	private String recommendatorName;

	/** The trainning percentage. */
	private double trainningPercentage;

	/** The evaluation percentage. */
	private double evaluationPercentage;

	/** The error. */
	private double error;

	/**
	 * Gets the recommendator name.
	 *
	 * @return the recommendator name
	 */
	public String getRecommendatorName() {
		return recommendatorName;
	}

	/**
	 * Sets the recommendator name.
	 *
	 * @param recommendatorName
	 *            the new recommendator name
	 */
	public void setRecommendatorName(String recommendatorName) {
		this.recommendatorName = recommendatorName;
	}

	/**
	 * Gets the trainning percentage.
	 *
	 * @return the trainning percentage
	 */
	public double getTrainningPercentage() {
		return trainningPercentage;
	}

	/**
	 * Sets the trainning percentage.
	 *
	 * @param trainningPercentage
	 *            the new trainning percentage
	 */
	public void setTrainningPercentage(double trainningPercentage) {
		this.trainningPercentage = trainningPercentage;
	}

	/**
	 * Gets the evaluation percentage.
	 *
	 * @return the evaluation percentage
	 */
	public double getEvaluationPercentage() {
		return evaluationPercentage;
	}

	/**
	 * Sets the evaluation percentage.
	 *
	 * @param evaluationPercentage
	 *            the new evaluation percentage
	 */
	public void setEvaluationPercentage(double evaluationPercentage) {
		this.evaluationPercentage = evaluationPercentage;
	}

	/**
	 * Gets the error.
	 *
	 * @return the error
	 */
	public double getError() {
		return error;
	}

	/**
	 * Sets the error.
	 *
	 * @param error
	 *            the new error
	 */
	public void setError(double error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "RecommenderResult [recommendatorName=" + recommendatorName + ", trainningPercentage=" + trainningPercentage + ", evaluationPercentage=" + evaluationPercentage + ", error=" + error
				+ "]";
	}

}

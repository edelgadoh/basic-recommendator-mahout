package br.com.ml.recommendator;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

/**
 * The Class Recommendator.
 */
public class Recommendator {

	/**
	 * Gets the products model.
	 *
	 * @return the products model
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public DataModel getProductsModel() throws IOException {
		return getModel("productData.csv");
	}

	/**
	 * Gets the course model.
	 *
	 * @return the course model
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public DataModel getCourseModel() throws IOException {
		return getModel("courseData.csv");
	}

	/**
	 * Gets the model.
	 *
	 * @param path the path
	 * @return the model
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private DataModel getModel(String path) throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(path).getFile());
		return new FileDataModel(file);
	}

}

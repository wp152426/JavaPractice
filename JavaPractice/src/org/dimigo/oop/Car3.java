/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * Car
 *
 * 1. Outline :
 * 2. Date : 2017. 3. 23.
 * </pre>
 *
 * @author ¿”«¸¡ÿ
 * @version : 1.0
 */
public class Car3 {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private long price;
	/**
	 * @return the company
	 */
	
	public Car3(String newCompany, String newModel, String newColor, int newMaxSpeed, long newPrice){
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
	public Car3(String company, String model, String color, int maxSpeed){
		this(company, model, color, maxSpeed, 0);
	}
	
	public Car3(String company, String model, String color){
		this(company, model, color, 0, 0);
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}
	

	
}

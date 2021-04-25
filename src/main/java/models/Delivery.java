package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Delivery {

	private int id;
	private String location;
	private String delivery_time;
	private String description;

	public Delivery() {
	}

	public Delivery(int id) {
		this.id = id;
	}

	public Delivery(int id, String location, String delivery_time, String description) {
		this.id = id;
		this.location = location;
		this.delivery_time = delivery_time;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
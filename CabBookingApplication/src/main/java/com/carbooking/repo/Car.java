package com.carbooking.repo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    private String model;
    @Id
    private String registrationNo;
    private String brand;
    private Double price;
    private String dealerId;
    private boolean availability;
    private Long locationId;

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) throws Exception {
    	if(model.length()<2 || model.length()>6) {
			Exception e=new Exception("Model out of Range");
			throw e;
		}
        this.model = model;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

	public Car(String model, String registrationNo, String brand, Double price, String dealerId, boolean availability,
			Long locationId) {
		super();
		this.model = model;
		this.registrationNo = registrationNo;
		this.brand = brand;
		this.price = price;
		this.dealerId = dealerId;
		this.availability = availability;
		this.locationId = locationId;
	}

	public Car() {
		super();
	}
    
}

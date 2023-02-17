package com.carbooking.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.carbooking.repo.Car;
import com.carbooking.repo.CarRepository;

import com.carbooking.web.CarController;

@SpringBootTest(classes = CarBookingAppTest.class)
public class CarBookingAppTest {
	
	@Mock
	CarRepository carRepository;
	
	@InjectMocks
	CarController carController;
	Car car;
	
	@Test
	public void carModelTesting() {
		Exception ex=assertThrows(Exception.class, ()->this.car.setModel("t"));
		assertEquals("Model out of Range", ex.getMessage());
	}
	
	@Test
	public void testGetAllCars() {
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("f35","TS45C4567","Maruthi Suzuki",1890.0,"1",true, null));
		cars.add(new Car("n90","TS45C7890","Nano",890.0,"4",false, null));
		
		when(carRepository.findAll()).thenReturn(cars);
		
		assertEquals(2, carController.getAllCar().size());
	}
}

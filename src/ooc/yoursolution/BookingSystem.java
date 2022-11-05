/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 91965
 */
public class BookingSystem implements BookingSystemInterface {
    private List<CarInterface> carList;
    private final RentACar rentACar = new RentACar();
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException  {
        carList = new ArrayList();
        String line;
        int totalCar = 0;
         while(( line = in.readLine()) != null) {
            String[] parts = line.split(":");
            Car car = new Car();
            car.carName = parts[0];
            car.rate = Double.parseDouble(parts[1]);
            car.numberOfCars = Integer.parseInt(parts[2]);
            totalCar = Integer.parseInt(parts[2]) + totalCar;
            carList.add(car);      
                }   
        rentACar.setCars(carList);
        rentACar.setNumberOfCars(totalCar) ;
        return rentACar;

    }
    
}

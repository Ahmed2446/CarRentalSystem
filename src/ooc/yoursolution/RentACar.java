/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author 91965
 */
public class RentACar implements RentACarInterface{
    List<CarInterface> carsList;
    public String rentalName;
    public int totalNumberOfCars;

    @Override
    public List<CarInterface> getCars() {
        return carsList;
        
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        carsList = cars;
    }

    @Override
    public String getName() {
        return rentalName;
        
    }

    @Override
    public void setName(String name) {
        if (name != null) {
            rentalName = name;
        }
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        
        return false;
        
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        
        return 0;
        
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        
        return false;
        
    }

    @Override
    public int getNumberOfCars() {
        return totalNumberOfCars;
        
    }
    
    public void setNumberOfCars(int number) {
        totalNumberOfCars = number;
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author 91965
 */
public class Car implements CarInterface {
    
    public int id;
    public String  carName;
    public double rate;
    public int numberOfCars;
    public Make carMake;
    public Map<Month, boolean[]> avalability;
    
    
    @Override
    public Map<Month, boolean[]> createAvailability() {
        
        return null;
        
    }

    @Override
    public Make getMake() {
        if (carName != null) {
            return Make.valueOf(carName);
        }
        
       return null; 
    }

    @Override
    public void setMake(Make make) {
        carMake = make;
    }

    @Override
    public double getRate() {
        
        return rate;
        
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        
        return avalability;
        
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        this.avalability = availability;
    }

    @Override
    public int getId() {
        
        return id;
        
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        boolean[] days;
        days = avalability.get(month);
        
//    Not able to use getIndex of boolean array
//        if (days.getIndex(month) > 0) {
//            
//        }
        return false;
    }

    @Override
    public boolean book(Month month, int day) {
        
        return false;
        
    }
    
}

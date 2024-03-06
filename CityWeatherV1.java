import java.util.ArrayList;

/**
 * Annual Weather object class
 * 
 * @author Richa Limaye
 * @version 02/14/2023
 */


public class CityWeatherV1 {
    // private instance variables - three arrays
    //Array for months in Orlando, FL USA
    private String[] months;
	//Array for temperature in Orlando, FL USA
	private double[] temp;
	//Array for precipitation in Orlando, FL USA
	private double[] precip;
    // constructor with parameters
	public CityWeatherV1(String[] months,double[] temp,double[] precip){
		this.months = months;
		this.temp = temp;
		this.precip = precip;
	}
	// setters and getters for each private instance variable
	public String[] getMonths(){
		return months;
	}
	public void setMonths(String[] months){
		this.months = months;
	}
	public double[] getTemp(){
		return temp;
	}
	public void setTemp(double[] temp){
		this.temp = temp;
	}
	public double[] getPrecip(){
		return precip;
	}
	public void setPrecip(double[] precip){
		this.precip = precip;
	}
    // method to calculate the average of temperature
	public double averagetemp(double[] temp){
		double average = 0.0;
		for(int i = 0; i < temp.length; i++){
			average = ()/(temp.length);
		}
		return average;
	}
    // method to calculate total precipitation array
   
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.rental.system.project;
import java.util.*;

/**
 *
 * @author Abbas Zaheer
 */
public class Movie {
//Data Members    
    private String name;
    private String yearOfRelease;
    private ArrayList<String> stars;
    private String category;
    private int noOfCopies;

    public Movie(String name, String yearOfRelease, ArrayList<String> stars, String category, int noOfCopies) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.stars = stars;
        this.category = category;
        this.noOfCopies = noOfCopies;
    }
    
    private int noOfRentedOutCopies;
    private int noOfAvailableCopies;

//Constructors    
    public Movie()
    {
        stars = new ArrayList<String>();
    }
//Setters And Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfRentedOutCopies() {
        return noOfRentedOutCopies;
    }

    public void setNoOfRentedOutCopies(int noOfRentedOutCopies) {
        this.noOfRentedOutCopies = noOfRentedOutCopies;
    }

    public int getNoOfReturnedCopies() {
        return noOfAvailableCopies;
    }

    public void setNoOfReturnedCopies(int noOfReturnedCopies) {
        this.noOfAvailableCopies = noOfReturnedCopies;
    }
    public ArrayList<String> getStars() {
        return stars;
    }

    public void setStars(ArrayList<String> stars) {
        this.stars = stars;
    }
}


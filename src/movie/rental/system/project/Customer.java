package movie.rental.system.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abbas Zaheer
 */
public class Customer {
    
    private String name;
    private String idCard;
    private String phNo;
    private String email;
    private String userName;

    public Customer(String name, String idCard, String phNo, String email, String userName) {
        this.name = name;
        this.idCard = idCard;
        this.phNo = phNo;
        this.email = email;
        this.userName = userName;
    }
    
    private int noOfRentedMovies;
    private int noOfReturnedMovies;

//Constructor    
    
    public Customer()
    {
        noOfRentedMovies=0;
        noOfReturnedMovies=0;
    }
    
//Functions    
    
    
    
//Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNoOfRentedMovies() {
        return noOfRentedMovies;
    }

    public void setNoOfRentedMovies(int noOfRentedMovies) {
        this.noOfRentedMovies = noOfRentedMovies;
    }

    public int getNoOfReturnedMovies() {
        return noOfReturnedMovies;
    }

    public void setNoOfReturnedMovies(int noOfReturnedMovies) {
        this.noOfReturnedMovies = noOfReturnedMovies;
    }
}

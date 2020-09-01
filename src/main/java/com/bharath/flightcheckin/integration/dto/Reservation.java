package com.bharath.flightcheckin.integration.dto;

public class Reservation  {

	private Long id;
	private Boolean checkedIn;
	private int number_Of_Bag;
	private Passenger passenger;
	private Flight flight;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberofBags() {
		return number_Of_Bag;
	}
	public void setNumberofBags(int numberofBags) {
		this.number_Of_Bag = numberofBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}

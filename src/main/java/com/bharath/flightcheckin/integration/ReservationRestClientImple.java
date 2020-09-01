package com.bharath.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bharath.flightcheckin.integration.dto.Reservation;
import com.bharath.flightcheckin.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImple implements ReservationRestClient {

	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightreservation/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL+id, Reservation.class);
		
		return reservation;
	}

	@Override
	public Reservation UpdateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
		
		return reservation;
	}

}

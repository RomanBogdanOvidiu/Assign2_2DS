// package com.bogdan.assign2.service;
//
// import java.util.List;
//
// import com.bogdan.assign2.model.Flight;
// import com.bogdan.assign2.repository.BaseRepository;
//
// public class FlightService {
//
// BaseRepository baseRepository = new BaseRepository();
//
// public void deleteFlight(Flight flight) {
// baseRepository.delete(flight);
// }
//
// public Flight saveFlight(Flight flight) {
// baseRepository.save(flight);
// return flight;
// }
//
// public List<Flight> getAllFlights(Flight flight) {
// return baseRepository.getAll(Flight.class);
// }
//
// public Flight getFlightById(long id) {
// return baseRepository.get(Flight.class, id);
// }
// }

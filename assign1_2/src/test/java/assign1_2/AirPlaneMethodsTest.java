// package assign1_2;
//
// import java.util.Date;
//
// import org.junit.Test;
//
// import com.bogdan.assign2.model.AirPlaneType;
// import com.bogdan.assign2.model.City;
// import com.bogdan.assign2.model.Flight;
// import com.bogdan.assign2.service.FlightService;
//
// public class AirPlaneMethodsTest {
//
// @Test
// public void saveFlight() {
// FlightService fs = new FlightService();
// City city = new City(new Long(0), "HongKong", 204.322, 102.535);
// City departureCity = new City(new Long(0), "Lachinezareia", -240.423,
// 204.332);
//
// Flight flight = new Flight(new Long(0), city, new Date(2016, 11, 24, 12, 30),
// departureCity,
// new Date(2016, 11, 25, 11, 30), AirPlaneType.BIG);
//
// fs.saveFlight(flight);
// }
// }

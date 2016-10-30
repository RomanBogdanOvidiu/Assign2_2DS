// package com.bogdan.assign2.model;
//
// import java.util.Date;
//
// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.EnumType;
// import javax.persistence.Enumerated;
// import javax.persistence.Table;
//
// @Entity
// @Table(catalog = "flights", name = "flight")
// public class Flight extends BaseEntity {
//
// @Column(name = "departureCity", nullable = false, length = 36, unique =
// false)
// private City departureCity;
// @Column(name = "departureDate", nullable = false, length = 36, unique =
// false)
// private Date departureDate;
// @Column(name = "arrivalCity", nullable = false, length = 36, unique = false)
// private City arrivalCity;
// @Column(name = "arrivalDate", nullable = false, length = 36, unique = false)
// private Date arrivalDate;
//
// @Column(name = "airPlaneType", nullable = false)
// @Enumerated(EnumType.STRING)
// private AirPlaneType airPlaneType;
//
// public Flight(Long id, City departureCity, Date departureDate, City
// arrivalCity, Date arrivalDate,
// AirPlaneType airPlaneType) {
// setId(id);
// this.departureCity = departureCity;
// this.departureDate = departureDate;
// this.arrivalCity = arrivalCity;
// this.arrivalDate = arrivalDate;
// this.airPlaneType = airPlaneType;
//
// }
//
// public Date getDepartureDate() {
// return departureDate;
// }
//
// public void setDepartureDate(Date departureDate) {
// this.departureDate = departureDate;
// }
//
// public Date getArrivalDate() {
// return arrivalDate;
// }
//
// public void setArrivalDate(Date arrivalDate) {
// this.arrivalDate = arrivalDate;
// }
//
// public AirPlaneType getAirPlaneType() {
// return airPlaneType;
// }
//
// public void setAirPlaneType(AirPlaneType airPlaneType) {
// this.airPlaneType = airPlaneType;
// }
//
// public City getDepartureCity() {
// return departureCity;
// }
//
// public void setDepartureCity(City departureCity) {
// this.departureCity = departureCity;
// }
//
// public City getArrivalCity() {
// return arrivalCity;
// }
//
// public void setArrivalCity(City arrivalCity) {
// this.arrivalCity = arrivalCity;
// }
//
// }

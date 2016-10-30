// package com.bogdan.assign2.model;
//
// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.Table;
//
/// **
// *
// * @author Bogdan
// *
// */
// @Entity
// @Table(catalog = "flights", name = "city")
// public class City extends BaseEntity {
//
// @Column(name = "cityName", nullable = false, length = 36, unique = false)
// private String cityName;
//
// @Column(name = "latitude", nullable = false, length = 36, unique = false)
// private double latitude;
//
// @Column(name = "longitude", nullable = false, length = 36, unique = false)
// private double longitude;
//
// public City(Long id, String cityName, double latitude, double longitude) {
// setId(id);
// this.cityName = cityName;
// this.latitude = latitude;
// this.longitude = longitude;
// }
//
// public String getCityName() {
// return cityName;
// }
//
// public void setCityName(String cityName) {
// this.cityName = cityName;
// }
//
// public double getLatitude() {
// return latitude;
// }
//
// public void setLatitude(double latitude) {
// this.latitude = latitude;
// }
//
// public double getLongitude() {
// return longitude;
// }
//
// public void setLongitude(double longitude) {
// this.longitude = longitude;
// }
//
// }

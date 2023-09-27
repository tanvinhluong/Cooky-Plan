/*
 * package com.cookyplan.Cooky.entity;
 * 
 * import javax.persistence.Entity; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="fooddetails")
 * 
 * public class FoodDetails {
 * 
 * Integer id_food; Integer id_ingredients; String unit; Integer quantity;
 * String unitPrice;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name="Id") Ingredients ingredients;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name="Id") Foods foods; public Integer getId_food() { return
 * id_food; } public void setId_food(Integer id_food) { this.id_food = id_food;
 * } public Integer getId_ingredients() { return id_ingredients; } public void
 * setId_ingredients(Integer id_ingredients) { this.id_ingredients =
 * id_ingredients; } public String getUnit() { return unit; } public void
 * setUnit(String unit) { this.unit = unit; } public Integer getQuantity() {
 * return quantity; } public void setQuantity(Integer quantity) { this.quantity
 * = quantity; } public String getUnitPrice() { return unitPrice; } public void
 * setUnitPrice(String unitPrice) { this.unitPrice = unitPrice; }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */
/*
 * package com.cookyplan.Cooky.entity;
 * 
 * import java.util.Collection;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.OneToMany; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="ingredients") public class Ingredients {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) Integer Id; String Name;
 * Integer Price; Integer Calories; String Unit;
 * 
 * @OneToMany(mappedBy="ingredients") Collection<FoodDetails> foodDetails;
 * 
 * public Integer getId() { return Id; }
 * 
 * public void setId(Integer id) { Id = id; }
 * 
 * public String getName() { return Name; }
 * 
 * public void setName(String name) { Name = name; }
 * 
 * public Integer getPrice() { return Price; }
 * 
 * public void setPrice(Integer price) { Price = price; }
 * 
 * public Integer getCalories() { return Calories; }
 * 
 * public void setCalories(Integer calories) { Calories = calories; }
 * 
 * public String getUnit() { return Unit; }
 * 
 * public void setUnit(String unit) { Unit = unit; }
 * 
 * public Collection<FoodDetails> getFoodDetails() { return foodDetails; }
 * 
 * public void setFoodDetails(Collection<FoodDetails> foodDetails) {
 * this.foodDetails = foodDetails; }
 * 
 * 
 * }
 */
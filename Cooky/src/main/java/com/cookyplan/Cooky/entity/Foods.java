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
 * @Table(name="foods") public class Foods {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) Integer Id; String
 * foodName; String prepareTime; String cookingTime; String Difficulty; String
 * Tips; String Recipe; String Details;
 * 
 * 
 * @OneToMany(mappedBy="foods") Collection<CategoryDetails> categoryDetails;
 * 
 * @OneToMany(mappedBy="foods") Collection<FoodDetails> foodDetails; public
 * Integer getId() { return Id; } public void setId(Integer id) { Id = id; }
 * public String getFoodName() { return foodName; } public void
 * setFoodName(String foodName) { this.foodName = foodName; } public String
 * getPrepareTime() { return prepareTime; } public void setPrepareTime(String
 * prepareTime) { this.prepareTime = prepareTime; } public String
 * getCookingTime() { return cookingTime; } public void setCookingTime(String
 * cookingTime) { this.cookingTime = cookingTime; } public String
 * getDifficulty() { return Difficulty; } public void setDifficulty(String
 * difficulty) { Difficulty = difficulty; } public String getTips() { return
 * Tips; } public void setTips(String tips) { Tips = tips; } public String
 * getRecipe() { return Recipe; } public void setRecipe(String recipe) { Recipe
 * = recipe; } public String getDetails() { return Details; } public void
 * setDetails(String details) { Details = details; } public
 * Collection<CategoryDetails> getCategoryDetails() { return categoryDetails; }
 * public void setCategoryDetails(Collection<CategoryDetails> categoryDetails) {
 * this.categoryDetails = categoryDetails; } public Collection<FoodDetails>
 * getFoodDetails() { return foodDetails; } public void
 * setFoodDetails(Collection<FoodDetails> foodDetails) { this.foodDetails =
 * foodDetails; }
 * 
 * }
 */
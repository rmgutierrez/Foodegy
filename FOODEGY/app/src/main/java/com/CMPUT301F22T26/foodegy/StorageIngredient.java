package com.CMPUT301F22T26.foodegy;

/**
 * Base class for the ingredients the user keeps in their storage. There is a conceptual difference
 * between this and RecipeIngredient. Loosely, StorageIngredient is more specific.
 * Very simple class, only getters and setters
 */
public class StorageIngredient {
    private String description;
    private String bestBeforeDate;
    private String location;
    private int amount;
    private String measurementUnit;
    private String category;
    private String id;

    /**
     * Initialize an instance of the StorageIntegirent
     * @param description the brief description, or name, of the ingredient
     * @param bestBeforeDate the date, as a String
     * @param location the location where it is to be stored
     * @param amount how much of the ingredient there is, as an integer
     * @param measurementUnit the units in which the ingredient is measured (ml, g, lbs, cans) as a String
     * @param category the food category that the ingredient belongs to
     */
    StorageIngredient(String description, String bestBeforeDate, String location, int amount, String measurementUnit, String category){
        this.description = description;
        this.bestBeforeDate = bestBeforeDate;
        this.location = location;
        this.amount = amount;
        this.measurementUnit = measurementUnit;
        this.category = category;
        /*
        Note: we don't need id in the constructor because it is generated by the Firestore and is set
        after the ingredient is uploaded to the Firestore
         */
    }

    /**
     * Get the description of the ingredient
     * @return the description, as a string
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description of the ingredient
     * @param description the new description we wish to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the ingredient's best before date
     * @return the date, as a string in "DD-MM-YYYY"
     */
    public String getBestBeforeDate() {
        return this.bestBeforeDate;
    }

    /**
     * Set a new best before date for this ingredient
     * @param bestBeforeDate the new best before date, in "DD-MM-YYYY"
     */
    public void setBestBeforeDate(String bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    /**
     * Get the ingredient's location
     * @return the ingredient's storage location in the kitchen, as a string
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the ingredient's location
     * @param location the new location, as a string
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get how much of an ingredient there is in the kitchen
     * @return the amount, as an integer
     */
    public int getAmount() {
        return this.amount;
    }

    /**
     * Set how much of an ingredient there is in the kitchen
     * @param amount the amount of the ingredient, as an integer
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Get the price of the ingredient per unit
     * @return the unit in which ingredient is measured, as a String
     */
    public String getMeasurementUnit() {
        return this.measurementUnit;
    }

    /**
     * Set the price oof this ingredient per unit
     * @param measurementUnit the unit in which the item is measured, as a String
     */
    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    /**
     * Get the ingredient's category, as a String
     * @return the ingredient category, ie. what food group it belongs to
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Set the category of the ingredient, as a String
     * @param category the ingredient's new food category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Get the ingredient's id in the firebase
     * @return the id in the firebase, represented as a string (usually a
     * meaningless string of characters)
     */
    public String getId() {return this.id;}

    /**
     * Set the ingredient's id in the firebase
     * @param id the new string id we wish the ingredient to have
     */
    public void setId(String id) {this.id = id;}
}

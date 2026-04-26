package com.example.pizzarecipes.models;

public class Pizza {
    private static long nextId = 100;

    private long id;
    private String title;
    private double cost;
    private int photo;
    private String cookTime;
    private String ingredientList;
    private String about;
    private String instructions;

    public Pizza() {
        this.id = nextId++;
    }

    public Pizza(String title, double cost, int photo, String cookTime,
                 String ingredientList, String about, String instructions) {
        this.id = nextId++;
        this.title = title;
        this.cost = cost;
        this.photo = photo;
        this.cookTime = cookTime;
        this.ingredientList = ingredientList;
        this.about = about;
        this.instructions = instructions;
    }

    public long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }
    public int getPhoto() { return photo; }
    public void setPhoto(int photo) { this.photo = photo; }
    public String getCookTime() { return cookTime; }
    public void setCookTime(String cookTime) { this.cookTime = cookTime; }
    public String getIngredientList() { return ingredientList; }
    public void setIngredientList(String ingredientList) { this.ingredientList = ingredientList; }
    public String getAbout() { return about; }
    public void setAbout(String about) { this.about = about; }
    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }

    @Override
    public String toString() {
        return title + " — " + cost + " €";
    }
}
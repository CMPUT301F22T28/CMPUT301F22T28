package com.example.cmput301f22t28;

// Recipe class
public class Recipe {
    private String title;
    private int prepTime;
    private int numServings;
    private String category;
    private String comments;
    private String photograph;
    // private ArrayList<Ingredient> ingredientList;

    // constructor
    public Recipe(
            String title,
            int prepTime,
            int numServings,
            String category,
            String comments,
            String photograph)
    {
        this.title = title;
        this.prepTime = prepTime;
        this.numServings = numServings;
        this.category = category;
        this.comments = comments;
        this.photograph = photograph;
    }

    // title getter
    public String getTitle() {
        return this.title;
    }
    // title setter
    public void setTitle(String title) {
        this.title = title;
    }

    // prepTime getter
    public int getPrepTime() {
        return this.prepTime;
    }
    // prepTime setter
    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    // numServings getter
    public int getNumServings() {
        return this.numServings;
    }
    // numServings setter
    public void setNumServings(String numServings) {
        this.numServings = numServings;
    }

    // category getter
    public String getCategory() {
        return this.category;
    }
    // category setter
    public void setCategory(String category) {
        this.category = category;
    }

    // comments getter
    public String getComments() {
        return this.comments;
    }
    // comments setter
    public void setComments(String comments) {
        this.comments = comments;
    }

    // photograph getter
    public String getPhotograph() {
        return this.photograph;
    }
    // photograph setter
    public void setPhotograph(String photograph) {
        this.photograph = photograph;
    }



}
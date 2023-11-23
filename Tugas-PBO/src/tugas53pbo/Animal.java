package tugas53pbo;

public class Animal {
	 protected boolean vegetarian;
	    protected String food;
	    protected int noOfLegs;

	    public Animal(boolean vegetarian, String food, int noOfLegs) {
	        this.vegetarian = vegetarian;
	        this.food = food;
	        this.noOfLegs = noOfLegs;
	    }

	    public boolean isVegetarian() {
	        return vegetarian;
	    }

	    public String getFood() {
	        return food;
	    }

	    public int getNoOfLegs() {
	        return noOfLegs;
	    }
}

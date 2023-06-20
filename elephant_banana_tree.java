public class HopeForHorses {
 
	public static void main(String[] args) {
 
		// Variables for the program
		int horseCount = 0;
		String horseName = "";
		String horseBreed = "";
		int age = 0;
		String gender = "";
		String color = "";
		boolean isRescued = false;
		boolean isAdopted = false;
 
		// Create an array to store information about the horses
		Horse[] horses = new Horse[1000];
 
		// Add horses to the array
		horses[horseCount] = new Horse("Jane", "Thoroughbred", 10, "Female", "Brown", true, false);
		horseCount++;
		horses[horseCount] = new Horse("Finn", "Quarterhorse", 4, "Male", "White", true, true);
		horseCount++;
		horses[horseCount] = new Horse("Fiona", "Arabian", 15, "Female", "Black", true, false);
		horseCount++;
		horses[horseCount] = new Horse("Bones", "Appaloosa", 23, "Male", "Palomino", false, true);
		horseCount++;
		horses[horseCount] = new Horse("Duke", "Mustang", 7, "Male", "Brown", false, true);
		horseCount++;
		horses[horseCount] = new Horse("Mickey", "Thoroughbred", 6, "Male", "White", false, false);
		horseCount++;
		horses[horseCount] = new Horse("Sophie", "Quarterhorse", 4, "Female", "Grey", true, true);
		horseCount++;
		horses[horseCount] = new Horse("Daisy", "Mustang", 11, "Female", "Chestnut", true, false);
		horseCount++;
		horses[horseCount] = new Horse("Max", "Arabian", 16, "Male", "Grey", false, false);
		horseCount++;
		horses[horseCount] = new Horse("Samson", "Thoroughbred", 8, "Male", "Black", true, true);
		horseCount++;
 
		// Loop through each horse in the array
		for (int i = 0; i < horseCount; i++) {
 
			// Get info about current horse
			horseName = horses[i].getName();
			horseBreed = horses[i].getBreed();
			age = horses[i].getAge();
			gender = horses[i].getGender();
			color = horses[i].getColor();
			isRescued = horses[i].getRescued();
			isAdopted = horses[i].getAdopted();
 
			// Print out info about the horse
			System.out.println("Name: " + horseName);
			System.out.println("Breed: " + horseBreed);
			System.out.println("Age: " + age);
			System.out.println("Gender: " + gender);
			System.out.println("Color: " + color);
			System.out.println("Rescued: " + isRescued);
			System.out.println("Adopted: " + isAdopted);
			System.out.println();
		}
	}
	
	// Create the Horse class
	public class Horse {
	
		// Variables
		String name;
		String breed;
		int age;
		String gender;
		String color;
		boolean rescued;
		boolean adopted;
	
		// Constructor
		public Horse(String name, String breed, int age, String gender, String color, boolean rescued, boolean adopted) {
			this.name = name;
			this.breed = breed;
			this.age = age;
			this.gender = gender;
			this.color = color;
			this.rescued = rescued;
			this.adopted = adopted;
		}
 
		// Getters
		public String getName() {
			return name;
		}
	
		public String getBreed() {
			return breed;
		}
	
		public int getAge() {
			return age;
		}
	
		public String getGender() {
			return gender;
		}
	
		public String getColor() {
			return color;
		}
	
		public boolean getRescued() {
			return rescued;
		}
	
		public boolean getAdopted() {
			return adopted;
		}
	}
}
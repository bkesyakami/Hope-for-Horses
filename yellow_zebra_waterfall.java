public class HopeForHorses { 
	
	public static void main(String[] args) { 
		
		// Variable and Object Declarations 
		String horseName;
		int horseAge;
		int horseHealth;
		long horseId;
		Horse h;
		
		// Horse Object Instantiation
		horseName = "Champion";
		horseAge = 8;
		horseHealth = 100;
		horseId = 1234;
		h = new Horse(horseName, horseAge, horseHealth, horseId); 
		
		// Horse Care Monitoring 
		h.monitorVitals(); // check and monitor horse vitals
		h.doDailyExercises(); // do daily exercises with the horse 
		h.checkHooves(); // check horse hooves
		h.checkTeeth(); // check horse teeth
		h.checkManeAndTail(); // check horse mane and tail 
		h.checkSkin(); // check horse skin 
		
		// Vet Visits Monitoring 
		h.scheduleVetAppointment(); // schedule a vet appointment 
		h.administerVaccine(); // administer a vaccine to the horse 
		h.checkHealthRecords(); // check and update horse health records 
		h.updateVaccinationSchedule(); // update the vaccination schedule
		
		// Horse Feeding 
		h.provideOats(); // provide oats to the horse 
		h.provideTimothyHay(); // provide timothy hay to the horse 
 		h.provideAlfalfa(); // provide alfalfa to the horse 
		h.provideSaltAndMineralBlock(); // provide salt and mineral blocks to the horse 
		
		// Horse Grooming 
		h.brushCoat(); // brush horse coat 
		h.groomManeAndTail(); // groom horse mane and tail 
		h.cleanHooves(); // clean horse hooves 
		h.cleanUnderBelly(); // clean horse underbelly 
		
		// Horse Socialization 
		h.takeOnWalks(); // take the horse on walks 
		h.socializeWithOtherHorses(); // socialize the horse with other horses 
		h.enterHorseShows(); // enter horse shows or contests 
		
		System.out.println("We Hope for Horses to have healthy and happy lives!"); 
	}
} 

// Horse class 
class Horse { 
	
	// instance variables 
	private String name; 
	private int age; 
	private int health; 
	private long id; 
	
	// constructor 
	public Horse(String name, int age, int health, long id) { 
		this.name = name; 
		this.age = age; 
		this.health = health; 
		this.id = id; 
	}
	
	// getters and setters 
	public String getName() { 
		return name; 
	} 
	public void setName(String name) { 
		this.name = name; 
	}
	public int getAge() { 
		return age; 
	} 
	public void setAge(int age) { 
		this.age = age; 
	}
	public int getHealth() { 
		return health; 
	} 
	public void setHealth(int health) { 
		this.health = health; 
	} 
	public long getId() { 
		return id; 
	} 
	public void setId(int id) { 
		this.id = id; 
	} 
	
	// horse care methods 
	public void monitorVitals() { 
		System.out.println("Monitoring horse vitals..."); 
	} 
	public void doDailyExercises() { 
		System.out.println("Doing daily exercises with horse..."); 
	} 
	public void checkHooves() { 
		System.out.println("Checking horse hooves..."); 
	} 
	public void checkTeeth() { 
		System.out.println("Checking horse teeth..."); 
	} 
	public void checkManeAndTail() { 
		System.out.println("Checking horse mane and tail..."); 
	} 
	public void checkSkin() { 
		System.out.println("Checking horse skin..."); 
	} 
	
	// horse vet methods 
	public void scheduleVetAppointment() { 
		System.out.println("Scheduling vet appointment..."); 
	} 
	public void administerVaccine() { 
		System.out.println("Administering vaccine to horse..."); 
	} 
	public void checkHealthRecords() { 
		System.out.println("Checking and updating health records..."); 
	} 
	public void updateVaccinationSchedule() { 
		System.out.println("Updating vaccination schedule..."); 
	} 
	
	// horse feeding methods 
	public void provideOats() { 
		System.out.println("Providing oats to horse..."); 
	} 
	public void provideTimothyHay() { 
		System.out.println("Providing timothy hay to horse..."); 
	} 
	public void provideAlfalfa() { 
		System.out.println("Providing alfalfa to horse..."); 
	} 
	public void provideSaltAndMineralBlock() { 
		System.out.println("Providing salt and mineral block to horse..."); 
	} 
	
	// horse grooming methods 
	public void brushCoat() { 
		System.out.println("Brushing horse coat..."); 
	} 
	public void groomManeAndTail() { 
		System.out.println("Grooming horse mane and tail..."); 
	} 
	public void cleanHooves() { 
		System.out.println("Cleaning horse hooves..."); 
	} 
	public void cleanUnderBelly() { 
		System.out.println("Cleaning horse underbelly..."); 
	} 
	
	// horse socialization methods 
	public void takeOnWalks() { 
		System.out.println("Taking horse on walks..."); 
	} 
	public void socializeWithOtherHorses() { 
		System.out.println("Socializing horse with other horses..."); 
	} 
	public void enterHorseShows() { 
		System.out.println("Entering horse in contest or shows..."); 
	} 
}
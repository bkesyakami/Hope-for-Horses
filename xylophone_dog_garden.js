// Hope for Horses //

//Define function to display message
function outputMessage(message) { 
	console.log(message);
} 

//Print opening message
outputMessage("Hope for Horses");

//Define function to check if horse is healthy
function isHorseHealthy(horse) { 
	if (horse.temperature > 99 && horse.heartRate < 60 && horse.respiration < 30) { 
		return true; 
	} else {
		return false; 
	}
} 

//Define function to check if horse is injured
function isHorseInjured(horse) { 
	if (horse.temperature > 102 || horse.cuts > 0 || horse.scrapes > 0) { 
		return true; 
	} else {
		return false; 
	}
} 

//Define function to give horse a checkup
function giveHorseCheckup(horse) { 
	if (isHorseHealthy(horse) == true) { 
		outputMessage("Horse is healthy");
	} else { 
		outputMessage("Horse is not healthy");
	}
	
	if (isHorseInjured(horse) == true) { 
		outputMessage("Horse is injured");
	} else { 
		outputMessage("Horse is not injured");
	}
} 

//Define function to clean horse's wounds
function cleanHorseWounds(horse) { 
	if (horse.cuts > 0 || horse.scrapes > 0) { 
		outputMessage("Cleaning horse's wounds");
		horse.cuts = 0; 
		horse.scrapes = 0; 
	} else { 
		outputMessage("Horse has no wounds to clean");
	}
} 

//Define function to feed horse
function feedHorse(horse) { 
	if (horse.hunger > 0) { 
		outputMessage("Feeding the horse");
		horse.hunger = 0; 
	} else { 
		outputMessage("Horse is not hungry");
	}
} 

//Define function to give horse exercise
function giveHorseExercise(horse) { 
	outputMessage("Giving horse exercise");
	horse.energy = 100; 
} 

//Define function to groom horse
function groomHorse(horse) { 
	outputMessage("Grooming horse");
	horse.cleanliness = 100; 
} 

//Define function to comfort horse
function comfortHorse(horse) { 
	outputMessage("Comforting horse");
	horse.happiness = 100; 
} 

//Define function to check for any medical issues
function checkMedicalIssues(horse) { 
	if (horse.temperature > 100 || horse.heartRate > 60 || horse.respiration > 30) { 
		outputMessage("Horse has medical issues");
		return true; 
	} else { 
		return false; 
	}
} 

//Define function to treat horse
function treatHorse(horse) { 
	if (checkMedicalIssues(horse) == true) { 
		outputMessage("Treating horse");
		horse.temperature = 99; 
		horse.heartRate = 59; 
		horse.respiration = 29; 
	}
} 

//Define function to give horse medication
function giveHorseMedication(horse, medication) { 
	outputMessage("Giving horse medication");
	horse.medication = medication; 
} 

//Define function to check the horse's status
function checkHorseStatus(horse) { 
	outputMessage("Checking horse's status");
	outputMessage("Horse temperature: " + horse.temperature); 
	outputMessage("Horse heart rate: " + horse.heartRate);
	outputMessage("Horse respiration: " + horse.respiration);  
	outputMessage("Horse hunger: " + horse.hunger);
	outputMessage("Horse energy: " + horse.energy);
	outputMessage("Horse cleanliness: " + horse.cleanliness); 
	outputMessage("Horse happiness: " + horse.happiness); 
	outputMessage("Horse medication: " + horse.medication); 
} 

//Create horse object
var horse = { 
	temperature: 98, 
	heartRate: 62, 
	respiration: 28, 
	hunger: 10, 
	energy: 70, 
	cleanliness: 70, 
	happiness: 70, 
	cuts: 0, 
	scrapes: 0, 
	medication: "" 
}; 

//Perform horse checkup
giveHorseCheckup(horse); 

//Clean any wounds
cleanHorseWounds(horse); 

//Feed the horse
feedHorse(horse); 

//Give the horse exercise
giveHorseExercise(horse); 

//Groom the horse
groomHorse(horse); 

//Comfort the horse
comfortHorse(horse); 

//Check for any medical issues
checkMedicalIssues(horse); 

//Treat the horse if necessary
treatHorse(horse); 

//Give the horse medication if necessary
giveHorseMedication(horse, "antibiotics"); 

//Check the horse's status
checkHorseStatus(horse); 

//Print closing message
outputMessage("Hope for Horses - Done!");
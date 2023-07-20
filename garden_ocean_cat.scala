// Scenario: Hope for Horses

object HopeForHorses { 
  // Define a Horse class
  class Horse(val name: String, val breed: String, val age: Int) { 
    def this(breed: String, age: Int) = this(null, breed, age) 
  } 
  
  // Define a HorseRanch class
  class HorseRanch {
    private var horses: List[Horse] = Nil
    def addHorse(name: String, breed: String, age: Int) {
      horses = horses ::: List(new Horse(name, breed, age))
    }
    def addHorses(breed: String, age: Int, num: Int): Unit = {
      for (i<-1 to num) {
        horses = horses ::: List(new Horse(breed, age))
      }
    }
    def removeHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    }
    def getHorses: List[Horse] = horses
  }
  
  // Define a HorseRescue class
  class HorseRescue {
    private var horses: List[Horse] = Nil
    def addRescuedHorse(name: String, breed: String, age: Int) {
      horses = horses ::: List(new Horse(name, breed, age))
    } 
    def removeRescuedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getRescuedHorses: List[Horse] = horses 
  }
  
  // Define a HorseAdoptionCenter class
  class HorseAdoptionCenter {
    private var horses: List[Horse] = Nil
    def addAdoptableHorse(name: String, breed: String, age: Int) {
      horses = horses ::: List(new Horse(name, breed, age))
    } 
    def removeAdoptableHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getAdoptableHorses: List[Horse] = horses 
  }
  
  // Define a HorseAdopter class
  class HorseAdopter {
    private var horses: List[Horse] = Nil
    def adoptHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeAdoptedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getAdoptedHorses: List[Horse] = horses 
  }
  
  // Define a HorseSeller class
  class HorseSeller {
    private var horses: List[Horse] = Nil
    def addForSaleHorse(name: String, breed: String, age: Int) {
      horses = horses ::: List(new Horse(name, breed, age))
    } 
    def removeForSaleHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getForSaleHorses: List[Horse] = horses 
  }
  
  // Define a HorseBuyer class
  class HorseBuyer {
    private var horses: List[Horse] = Nil
    def buyHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeBoughtHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getBoughtHorses: List[Horse] = horses 
  }
  
  // Define a HorseBreeder class
  class HorseBreeder {
    private var horses: List[Horse] = Nil
    def breedHorse(name: String, breed: String, age: Int) {
      horses = horses ::: List(new Horse(name, breed, age))
    } 
    def removeBredHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getBredHorses: List[Horse] = horses 
  }
  
  // Define a HorseTrainer class
  class HorseTrainer {
    private var horses: List[Horse] = Nil
    def trainHorse(name: String, breed: String, age: Int) {
      horses = horses ::: List(new Horse(name, breed, age))
    } 
    def removeTrainedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getTrainedHorses: List[Horse] = horses 
  }
  
  //Define a HorseRider class
  class HorseRider {
    private var horses: List[Horse] = Nil
    def rideHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeRiddenHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getRiddenHorses: List[Horse] = horses 
  }
  
  // Define an AnimalShelter class
  class AnimalShelter {
    private var horses: List[Horse] = Nil
    def addShelteredHorse(name: String, breed: String, age: Int) {
      horses = horses ::: List(new Horse(name, breed, age))
    } 
    def removeShelteredHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getShelteredHorses: List[Horse] = horses 
  }
  
  //Define a HorseVolunteer class
  class HorseVolunteer {
    private var horses: List[Horse] = Nil
    def helpHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeHelpedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getHelpedHorses: List[Horse] = horses 
  }
  
  //Define a HorseCharity class
  class HorseCharity {
    private var horses: List[Horse] = Nil
    def addCharityHorse(name: String, breed: String, age: Int) {
      horses = horses ::: List(new Horse(name, breed, age))
    } 
    def removeCharityHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getCharityHorses: List[Horse] = horses 
  }
  
  //Define a Customer class
  class Customer {
    private var horses: List[Horse] = Nil
    def buyHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeBoughtHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getBoughtHorses: List[Horse] = horses 
  }
  
  //Define a Vet class
  class Vet {
    private var horses: List[Horse] = Nil
    def checkHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeCheckedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getCheckedHorses: List[Horse] = horses 
  }
  
  //Define a Farrier class
  class Farrier {
    private var horses: List[Horse] = Nil
    def trimHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeTrimmedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getTrimmedHorses: List[Horse] = horses 
  }
  
  //Define a FeedStore class
  class FeedStore {
    private var horses: List[Horse] = Nil
    def feedHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeFedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getFedHorses: List[Horse] = horses 
  }
  
  //Define a Photographer class
  class Photographer {
    private var horses: List[Horse] = Nil
    def photographHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removePhotographedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getPhotographedHorses: List[Horse] = horses 
  }
  
  //Define a Fundraiser class
  class Fundraiser {
    private var horses: List[Horse] = Nil
    def fundraiseForHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeFundraisedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getFundraisedHorses: List[Horse] = horses 
  }
  
  //Define a Sponsor class
  class Sponsor {
    private var horses: List[Horse] = Nil
    def sponsorHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeSponsoredHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getSponsoredHorses: List[Horse] = horses 
  }
  
  //Define a Competitor class
  class Competitor {
    private var horses: List[Horse] = Nil
    def competeWithHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeCompetitionHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getCompetitionHorses: List[Horse] = horses 
  }
  
  //Define a Trainer class
  class Trainer {
    private var horses: List[Horse] = Nil
    def trainHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeTrainedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getTrainedHorses: List[Horse] = horses 
  }
  
  //Define a Supporter class
  class Supporter {
    private var horses: List[Horse] = Nil
    def supportHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeSupportedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getSupportedHorses: List[Horse] = horses 
  }
  
  //Define a Foster class
  class Foster {
    private var horses: List[Horse] = Nil
    def fosterHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeFosteredHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getFosteredHorses: List[Horse] = horses 
  }
  
  //Define a Volunteer class
  class Volunteer {
    private var horses: List[Horse] = Nil
    def volunteerForHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeVolunteeredHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getVolunteeredHorses: List[Horse] = horses 
  }
  
  //Define a Researcher class
  class Researcher {
    private var horses: List[Horse] = Nil
    def researchHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeResearchedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getResearchedHorses: List[Horse] = horses 
  }
  
  //Define a Groomer class
  class Groomer {
    private var horses: List[Horse] = Nil
    def groomHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeGroomedHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getGroomedHorses: List[Horse] = horses 
  }
  
  //Define a Caretaker class
  class Caretaker {
    private var horses: List[Horse] = Nil
    def careForHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeCaredForHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getCaredForHorses: List[Horse] = horses 
  }
  
  //Define a Fundabull class
  class Fundabull {
    private var horses: List[Horse] = Nil
    def fundaHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeFundaHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name)
    } 
    def getFundaHorses: List[Horse] = horses 
  }
  
  //Define a HorseClub class
  class HorseClub {
    private var horses: List[Horse] = Nil
    def registerHorse(horse: Horse) {
      horses = horses ::: List(horse)
    } 
    def removeRegisteredHorse(name: String): Unit = {
      horses = horses.filterNot(_.name == name
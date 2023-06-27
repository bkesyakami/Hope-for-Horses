#This program focuses on bringing resources to horses and providing resources to those in need

class HopeForHorses

  #class attribute to store number of horses in need
  @@horses_in_need = 0

  #method to add new horses to need list
  def self.add_horse
    @@horses_in_need += 1
  end

  #method to remove horses from need list
  def self.remove_horse
    @@horses_in_need -= 1
  end

  #method to get number of horses in need
  def self.horses_in_need
    @@horses_in_need
  end

  #method to find local horse rescue centers
  def self.find_local_rescue_centers
    puts "Searching for local horse rescue centers..."
    #Searches for horse rescue centers near the user
  end

  #method to find resources for horse owners
  def self.find_resources
    puts "Searching for resources available to horse owners..."
    #Searches for resources available to horse owners
  end

  #method to find local horse adoption agencies
  def self.find_adoption_agencies
    puts "Searching for local horse adoption agencies..."
    #Searches for local horse adoption agencies
  end

  #method to create shipping record
  def self.create_shipping_record(name, address, type)
    puts "Creating shipping record for #{name}..."
    #Creates a shipping record for the specified name, address, and type
  end

  #method to find local equine therapy programs
  def self.find_local_therapy_programs
    puts "Searching for local equine therapy programs..."
    #Searches for local equine therapy programs
  end

  #method to find horse care tips
  def self.find_horse_care_tips
    puts "Searching for tips on horse care..."
    #Searches for horse care tips
  end

  #method to request a donation for a horse in need
  def self.request_donation(name, photo, description)
    puts "Requesting a donation for #{name}..."
    #Requests a donation for the specified horse, photo, and description
  end

  #method to create a fundraiser
  def self.create_fundraiser(name, goal, deadline)
    puts "Creating a fundraiser for #{name}..."
    #Creates a fundraiser for the specified name, goal, and deadline
  end

  #method to find local equine vets
  def self.find_local_vets
    puts "Searching for local equine vets..."
    #Searches for local equine vets
  end

  #method to find local equine nutritionists
  def self.find_local_nutritionists
    puts "Searching for local equine nutritionists..."
    #Searches for local equine nutritionists
  end

  #method to find equine-related events
  def self.find_equine_events
    puts "Searching for equine-related events..."
    #Searches for equine-related events
  end

  #method to find horse transportation services
  def self.find_transportation_services
    puts "Searching for horse transportation services..."
    #Searches for horse transportation services
  end

  #method to find horse training programs
  def self.find_training_programs
    puts "Searching for horse training programs..."
    #Searches for horse training programs
  end

  #method to find local horse boarding facilities
  def self.find_boarding_facilities
    puts "Searching for local horse boarding facilities..."
    #Searches for local horse boarding facilities
  end

  #method to find online equine courses
  def self.find_online_courses
    puts "Searching for online equine courses..."
    #Searches for online equine courses
  end

  #method to find horse equipment stores
  def self.find_equipment_stores
    puts "Searching for horse equipment stores..."
    #Searches for horse equipment stores
  end

  #method to find equine insurance providers
  def self.find_insurance_providers
    puts "Searching for equine insurance providers..."
    #Searches for equine insurance providers
  end

  #method to find horse-related jobs
  def self.find_jobs
    puts "Searching for horse-related jobs..."
    #Searches for horse-related jobs
  end

  #method to find animal-friendly lodging
  def self.find_lodging
    puts "Searching for animal-friendly lodging..."
    #Searches for animal-friendly lodging
  end

  #method to find equine-related books
  def self.find_books
    puts "Searching for equine-related books..."
    #Searches for equine-related books
  end

end

puts "Number of horses in need: #{HopeForHorses.horses_in_need}"
HopeForHorses.add_horse
puts "Number of horses in need: #{HopeForHorses.horses_in_need}"
HopeForHorses.find_local_rescue_centers
HopeForHorses.find_resources
HopeForHorses.find_adoption_agencies
HopeForHorses.create_shipping_record("Rocky", "123 Main Street", "Food")
HopeForHorses.find_local_therapy_programs
HopeForHorses.find_horse_care_tips
HopeForHorses.request_donation("Daisy", "daisy.jpg", "Daisy is a gentle and loving horse in need of a loving home")
HopeForHorses.create_fundraiser("Daisy", 1000, Time.now+1.month)
HopeForHorses.find_local_vets
HopeForHorses.find_local_nutritionists
HopeForHorses.find_equine_events
HopeForHorses.find_transportation_services
HopeForHorses.find_training_programs
HopeForHorses.find_boarding_facilities
HopeForHorses.find_online_courses
HopeForHorses.find_equipment_stores
HopeForHorses.find_insurance_providers
HopeForHorses.find_jobs
HopeForHorses.find_lodging
HopeForHorses.find_books
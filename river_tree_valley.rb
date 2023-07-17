# Create a class that will represent a horse
class Horse
  attr_reader :name, :age, :breed
 
  # Give the horse a name and age
  def initialize(name, age, breed)
    @name, @age, @breed = name, age, breed
  end
 
  # Method to provide description of the horse
  def description
    puts "#{name} is a #{age}-year-old #{breed}."
  end
end
 
# Create an array to store horse objects
horses = []
 
# Create new horse objects and store in the array
horses << Horse.new("Pony Boy", 3, "Quarter Horse")
horses << Horse.new("Fancy Dan", 7, "Thoroughbred")
horses << Horse.new("Drifter", 4, "Arabian")
 
# Iterate over the array to print each horse's description
horses.each do |horse|
  horse.description
end
 
# Create a method to provide care for the horses
def provide_care(horses)
  horses.each do |horse|
    puts "Providing care for #{horse.name}..."
  end
end
 
# Call the provide_care method
provide_care(horses)
 
# Create a method to give the horses love
def give_love(horses)
  horses.each do |horse|
    puts "Giving love to #{horse.name}..."
  end
end
 
# Call the give_love method
give_love(horses)
 
# Create a method to show the horses
def show_horses(horses)
  horses.each do |horse|
    puts "#{horse.name} looks beautiful in the show ring!"
  end
end
 
# Call the show_horses method
show_horses(horses)
 
# Create a method to ride the horses
def ride_horses(horses)
  horses.each do |horse|
    puts "Taking #{horse.name} on a beautiful ride..."
  end
end
 
# Call the ride_horses method
ride_horses(horses)
 
# Create a method to brush the horses
def brush_horses(horses)
  horses.each do |horse|
    puts "Brushing #{horse.name}'s beautiful coat..."
  end
end
 
# Call the brush_horses method
brush_horses(horses)
 
# Create a method to feed the horses
def feed_horses(horses)
  horses.each do |horse|
    puts "Feeding #{horse.name} a nutritious meal..."
  end
end
 
# Call the feed_horses method
feed_horses(horses)
 
# Create a method to provide proper shelter for the horses
def provide_shelter(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} is well-sheltered..."
  end
end
 
# Call the provide_shelter method
provide_shelter(horses)
 
# Create a method to give the horses medical attention
def provide_medical(horses)
  horses.each do |horse|
    puts "Giving #{horse.name} the medical attention they need..."
  end
end
 
# Call the provide_medical method
provide_medical(horses)
 
# Create a method to train the horses
def train_horses(horses)
  horses.each do |horse|
    puts "Training #{horse.name} to be the best they can be..."
  end
end
 
# Call the train_horses method
train_horses(horses)
 
# Create a method to give the horses love and affection
def give_love_and_affection(horses)
  horses.each do |horse|
    puts "Giving #{horse.name} the love and affection they need..."
  end
end
 
# Call the give_love_and_affection method
give_love_and_affection(horses)
 
# Create a method to give the horses treats
def give_treats(horses)
  horses.each do |horse|
    puts "Giving #{horse.name} a yummy treat..."
  end
end
 
# Call the give_treats method
give_treats(horses)
 
# Create a method to give the horses proper nutrition
def provide_nutrition(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} is getting proper nutrition..."
  end
end
 
# Call the provide_nutrition method
provide_nutrition(horses)
 
# Create a method to provide the horses with exercise
def provide_exercise(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} is getting plenty of exercise..."
  end
end
 
# Call the provide_exercise method
provide_exercise(horses)
 
# Create a method to give the horses a sense of security
def give_security(horses)
  horses.each do |horse|
    puts "Giving #{horse.name} a sense of security..."
  end
end
 
# Call the give_security method
give_security(horses)
 
# Create a method to give the horses proper bedding
def give_bedding(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} has the proper bedding..."
  end
end
 
# Call the give_bedding method
give_bedding(horses)
 
# Create a method to give the horses a comfortable environment
def provide_comfortable_environment(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} has a comfortable environment..."
  end
end
 
# Call the provide_comfortable_environment method
provide_comfortable_environment(horses)
 
# Create a method to give the horses plenty of water
def give_plenty_of_water(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} has plenty of water..."
  end
end
 
# Call the give_plenty_of_water method
give_plenty_of_water(horses)
 
# Create a method to give the horses the freedom to roam
def give_freedom_to_roam(horses)
  horses.each do |horse|
    puts "Giving #{horse.name} the freedom to roam..."
  end
end
 
# Call the give_freedom_to_roam method
give_freedom_to_roam(horses)
 
# Create a method to train the horses for riding
def ride_training(horses)
  horses.each do |horse|
    puts "Training #{horse.name} for riding..."
  end
end
 
# Call the ride_training method
ride_training(horses)
 
# Create a method to provide the horses with companions
def provide_companionship(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} has other horses to keep them company..."
  end
end
 
# Call the provide_companionship method
provide_companionship(horses)
 
# Create a method to properly groom the horses
def proper_grooming(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} is properly groomed..."
  end
end
 
# Call the proper_grooming method
proper_grooming(horses)
 
# Create a method to give the horses regular checkups
def give_regular_checkups(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} gets regular checkups..."
  end
end
 
# Call the give_regular_checkups method
give_regular_checkups(horses)
 
# Create a method to give the horses a safe and happy living environment
def give_safe_and_happy_living_environment(horses)
  horses.each do |horse|
    puts "Giving #{horse.name} a safe and happy living environment..."
  end
end
 
# Call the give_safe_and_happy_living_environment method
give_safe_and_happy_living_environment(horses)
 
# Create a method to teach the horses proper behaviour
def teach_proper_behaviour(horses)
  horses.each do |horse|
    puts "Teaching #{horse.name} proper behaviour..."
  end
end
 
# Call the teach_proper_behaviour method
teach_proper_behaviour(horses)
 
# Create a method to give the horses access to plenty of fresh air
def give_plenty_of_fresh_air(horses)
  horses.each do |horse|
    puts "Making sure #{horse.name} has access to plenty of fresh air..."
  end
end
 
# Call the give_plenty_of_fresh_air method
give_plenty_of_fresh_air(horses)
 
# Create a method to give the horses plenty of affection
def give_plenty_of_affection(horses)
  horses.each do |horse|
    puts "Giving #{horse.name} plenty of affection..."
  end
end
 
# Call the give_plenty_of_affection method
give_plenty_of_affection(horses)
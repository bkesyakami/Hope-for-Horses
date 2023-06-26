-- Create a window to display the game
local window = love.window.setMode(800, 400, {resizable = false, vsync = true, msaa = 4}) 
local horseImage = love.graphics.newImage('horse.jpg') 

-- Load audio files for background music and sound effects 
local backgroundMusic = love.audio.newSource('bgMusic.mp3', 'stream')
local neighSound = love.audio.newSource('neigh.wav', 'static')

-- Create variables to keep track of the game state 
local backgroundMusicIsPlaying = false
local numHorses = 0

-- Create a variable to count the number of frames that have passed 
local frameCount = 0

-- Create a table to store the horses 
local horses = {}

-- Load the horse images in to the table 
horses[1] = love.graphics.newImage('horse1.jpg')
horses[2] = love.graphics.newImage('horse2.jpg')
horses[3] = love.graphics.newImage('horse3.jpg')

-- Create a table to store the horses' x and y coordinates 
local horseCoords = {x = 0, y = 0}

-- Create a counter to keep track of the number of horses that have been drawn 
local horseCount = 0

-- Function to draw the horses
function drawHorses()
    if horseCount < numHorses then
        love.graphics.draw(horses[horseCount+1], horseCoords.x, horseCoords.y) 
        horseCount = horseCount + 1
    end 
end 

-- Function to update the x and y coordinates of the horses
function updateHorseCoords()
   horseCoords.x = love.math.random(0, window.width) 
   horseCoords.y = love.math.random(0, window.height)
end 

-- Function to control the background music
function startBackgroundMusic()
   if not backgroundMusicIsPlaying then 
    backgroundMusic:play()
    backgroundMusicIsPlaying = true
   end
end

-- Function to play the neigh sound effect
function playNeighSound()
    neighSound:play()
end 

-- Main game function 
function love.draw() 
    love.graphics.setBackgroundColor(0.2, 0.7, 0.2)

    love.graphics.draw(horseImage, 0, 0)

    -- Update the x and y coordinates of the horses
    if frameCount % 15 == 0 then
        updateHorseCoords()
    end 

    drawHorses()

    -- Play background music after 10 seconds
    if frameCount == (10*60) then
        startBackgroundMusic()
    end

    -- Play neigh sound effects after 30 seconds
    if frameCount == (30*60) then
        playNeighSound()
    end

    frameCount = frameCount + 1
end 

-- Update the number of horses to be drawn
function love.update(dt)
    if frameCount % 60 == 0 then
        numHorses = numHorses + 1
    end
end 

-- Increase window size when user clicks mouse
function love.mousepressed() 
    window = love.window.setMode(1000, 500, {resizable = false, vsync = true, msaa = 4})
end
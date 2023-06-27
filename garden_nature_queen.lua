-- Introduction
--
-- This program is written in Lua to simulate a horse racing game.
-- The user is asked to pick a horse to bet on, and then the race begins. 
-- The race finishes with the horse with the most points being the winner.

-- Definitions
--
-- horse1: The first horse in the race
-- horse2: The second horse in the race
-- horse3: The third horse in the race
-- userHorse: The horse picked by the user to bet on
-- points: The points earned during the race

-- Variables
--
local horse1 = 0
local horse2 = 0
local horse3 = 0
local userHorse = 0
local points = 0

-- Functions
--
-- pickHorse()
--
-- Asks the user to pick a horse to bet on
--
function pickHorse()
    io.write("Which horse do you want to bet on? (1,2 or 3): ")
    userHorse = io.read()
end

-- race()
-- 
-- Simulates a three horse race. 
-- Each horse has a chance to earn points 
-- based on a random number generated for each horse. 
--
function race()
    math.randomseed(os.time())
    horse1 = math.random(1,5)
    horse2 = math.random(1,5)
    horse3 = math.random(1,5)
end

-- displayPoints()
--
-- Displays the points earned by each horse
--
function displayPoints()
    print("Horse 1 Points: " .. horse1)
    print("Horse 2 Points: " .. horse2)
    print("Horse 3 Points: " .. horse3)
end

-- determineWinner()
-- 
-- Determine which horse has earned the most points
--
function determineWinner()
    if horse1 > horse2 and horse1 > horse3 then
        points = horse1
        print("Horse 1 is the winner!")
    elseif horse2 > horse1 and horse2 > horse3 then
        points = horse2
        print("Horse 2 is the winner!")
    else
        points = horse3
        print("Horse 3 is the winner!")
    end
end

-- checkBet()
-- 
-- Check if the user bet on the winning horse
--
function checkBet()
    if tonumber(userHorse) == 1 and points == horse1 then
        print("You won!")
    elseif tonumber(userHorse) == 2 and points == horse2 then
        print("You won!")
    elseif tonumber(userHorse) == 3 and points == horse3 then
        print("You won!")
    else
        print("You lost!")
    end
end

-- Main
-- 
pickHorse()
race()
displayPoints()
determineWinner()
checkBet()
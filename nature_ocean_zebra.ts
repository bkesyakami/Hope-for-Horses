import { Horse, Hope } from "./hopeForHorses";

let horses: Horse[] = [];

class HopeForHorses {

    public static addHorse(horse: Horse): void {
        horses.push(horse);
    }

    public static findHorseByName(name: string): Horse | undefined {
        for (let horse of horses) {
            if (horse.name === name) {
                return horse;
            }
        }
    }

    public static updateHorse(horse: Horse): void {
        const index = horses.findIndex(h => h.name === horse.name);
        horses[index] = horse;
    }

    public static deleteHorse(name: string): void {
        horses = horses.filter(h => h.name !== name);
    }

    public static getHorses(): Horse[] {
        return horses;
    }

}

class Horse {
    public name: string;
    public age: number;
    public breed: string;

    constructor(name: string, age: number, breed: string) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public updateName(name: string): void {
        this.name = name;
    }
}

class Hope {
    public static readonly goal: string = "Provide a loving home for every horse that needs one";
    public static readonly slogan: string = "Hope for Horses";
    public static readonly mission: string = "To rescue, rehabilitate and rehome horses in need";
}

HopeForHorses.addHorse(new Horse("Little Legs", 3, "Thoroughbred"));
HopeForHorses.addHorse(new Horse("Bella", 5, "Arabian"));
HopeForHorses.addHorse(new Horse("Sundance", 14, "Mustang"));

let littleLegs = HopeForHorses.findHorseByName("Little Legs");
if (littleLegs) {
    littleLegs.updateName("Big Legs");
    HopeForHorses.updateHorse(littleLegs);
}

HopeForHorses.deleteHorse("Bella");

console.log(HopeForHorses.getHorses());
console.log(Hope.goal);
console.log(Hope.slogan);
console.log(Hope.mission);
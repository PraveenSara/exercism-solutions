public class GameMaster {

    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(), destination.getInhabitants());
    }

    public String describe(TravelMethod travelMode) {
        return travelMode == TravelMethod.HORSEBACK ? "You're traveling to your destination on horseback." : "You're traveling to your destination by walking.";
    }

    public String describe(Character character, Destination destination, TravelMethod travelMode) {
        return describe(character) + " " + describe(travelMode) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
    
}

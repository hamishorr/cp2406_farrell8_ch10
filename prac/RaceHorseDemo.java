public class RaceHorseDemo {

    public static void main(String[] args){
        RaceHorse horse = new RaceHorse("Fido", "Black", 2010, 4);
        System.out.println("Horse " + horse.getName() + ", colour " + horse.getColour() + ", Birth Year " +
                horse.getBirthYear() + " has had " + horse.getRaces() + " races" );

    }



}

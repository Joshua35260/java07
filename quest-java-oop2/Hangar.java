public class Hangar {

  public static void main(String[] args) {
    Car peugeot = new Car("Peugeot");
    peugeot.setKilometers(258000);
    Boat titanic = new Boat("Titanic");
    titanic.setKilometers(152000);
    System.out.println("je suis " + peugeot.getBrand() + " et je fais " + peugeot.doStuff() + " et j'ai " + peugeot.getKilometers() + " kilomètres au compteur");
    System.out.println("je suis " + titanic.getBrand() + " et je fais "+ titanic.doStuff() + " et j'ai " + titanic.getKilometers() + " kilomètres au compteur");
  }
  
}

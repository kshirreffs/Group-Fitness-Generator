import java.util.ArrayList;

/**
 * Class storing/organizing all of our meditations
 */
public class MeditationOrganizer {
  
  //static fields
  private static ArrayList<Meditation> mindfulness = new ArrayList<Meditation>();
  private static ArrayList<Meditation> relaxation = new ArrayList<Meditation>();
  private static ArrayList<Meditation> allMeditations = new ArrayList<Meditation>();
  
  //static methods
  /**
  * adds a meditation to its respective category
  * 
  * @param m - meditation to add
  * @throws IllegalArgumentException if the meditation is already in MeditationOrganizer
  * @throws IllegalArgumentException if the meditation to add is neither of Mindfulness or Relaxation type
  */
   public static void add(Meditation m) {
     if (MeditationOrganizer.contains(m)) throw new IllegalArgumentException("No duplicates allowed");
   
     if (m instanceof Mindfulness) {
       mindfulness.add(m);
     }
     else if (m instanceof Relaxation) {
       relaxation.add(m);
     }
     else throw new IllegalArgumentException("Meditation must be of type Mindfulness or Relaxation");
     
     allMeditations.add(m); // auto adds to allMeditations if no errors are thrown
   }
   
   /**
    * checks if MeditationOrganizer contains a Meditation
    * 
    * @param m - Meditation to find in either Meditation ArrayList
    * @return true if allMeditations contains this Meditation (only title needs to match)
    */
   public static boolean contains(Meditation m) {
     for (int i = 0; i < allMeditations.size(); i++) {
       if (allMeditations.get(i).equals(m)) return true;
     }
     return false;
   }
   
   /**
    * removes a Meditation from MeditationOrganizer
    * 
    * @param m - Meditation to remove in either Meditation ArrayList
    * @throws IllegalArgumentException if no such meditation exists
    */
   public static void remove(Meditation m) {
     if (!MeditationOrganizer.contains(m)) {
       throw new IllegalArgumentException("No such Meditation was found to remove");
     }
     
     // remove meditation from allMeditations
     allMeditations.remove(m);
     
     // remove meditation from other ArrayLists, depending on type:
     
     // if type Mindfulness
     if (m instanceof Mindfulness) {
       mindfulness.remove(m);
     }
     // if type Relaxation
     else if (m instanceof Relaxation) {
       relaxation.remove(m);
     }
   }
   
   /**
    * clears the entire MeditationOrganizer
    */
   public static void clear() {
     allMeditations = new ArrayList<Meditation>();
     mindfulness = new ArrayList<Meditation>();
     relaxation = new ArrayList<Meditation>();
   }
   
  // getter methods
  public static ArrayList<Meditation> getAllMeditations() {
    return allMeditations;
  }
  
  public static ArrayList<Meditation> getMindfulness() {
    return mindfulness;
  }
  
  public static ArrayList<Meditation> getRelaxation() {
    return relaxation;
  }
  
  //random meditation methods
   /**
    * randomly selects and returns a meditation
    * 
    * @throws IllegalStateException if there are no meditations to choose from
    * @return
    */
   public static Meditation randomMeditation() {
     int size = allMeditations.size();
     if (size == 0) throw new IllegalStateException("No meditations available");
     
     int randIndex = (int) (Math.random() * size);
     // returns number from 0 (inclusive) to size (exclusive)
     
     return allMeditations.get(randIndex);
   }
   
   /**
    * randomly selects and returns a mindfulness meditation
    * 
    * @throws IllegalStateException if there are no meditations to choose from
    * @return
    */
   public static Meditation randomMindfulness() {
     int size = mindfulness.size();
     if (size == 0) throw new IllegalStateException("No meditations available");
     
     int randIndex = (int) (Math.random() * size);
     // returns number from 0 (inclusive) to size (exclusive)
     
     return mindfulness.get(randIndex);
   }
   
   /**
    * randomly selects and returns a relaxation meditation
    * 
    * @throws IllegalStateException if there are no meditations to choose from
    * @return
    */
   public static Meditation randomRelaxation() {
     int size = relaxation.size();
     if (size == 0) throw new IllegalStateException("No meditations available");
     
     int randIndex = (int) (Math.random() * size);
     // returns number from 0 (inclusive) to size (exclusive)
     
     return relaxation.get(randIndex);
   }

}

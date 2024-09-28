import java.util.ArrayList;

/**
 * Class storing/organizing all of our poses
 */
public class PoseOrganizer {
  
  // static fields
  private static ArrayList<Pose> warmUpPoses = new ArrayList<Pose>();
  private static ArrayList<Pose> workoutPoses = new ArrayList<Pose>();
  private static ArrayList<Pose> stretchPoses = new ArrayList<Pose>();
  private static ArrayList<Pose> pilatesWarmUp = new ArrayList<Pose>();
  private static ArrayList<Pose> pilatesExercises = new ArrayList<Pose>();
  private static ArrayList<Pose> sideKicks = new ArrayList<Pose>();
  private static ArrayList<Pose> allPoses = new ArrayList<Pose>();
  
  // static methods
  /**
   * adds a pose to its respective category
   * 
   * @param p - pose to add
   * @throws IllegalArgumentException if the pose is already in PoseOrganizer
   * @throws IllegalArgumentException if the pose to add is neither of YogaPose or Pilates type
   */
  public static void add(Pose p) {
    if (PoseOrganizer.contains(p)) throw new IllegalArgumentException("No duplicates allowed");
    
    if (p instanceof YogaPose) {
      YogaPose y = (YogaPose) p; // cast to YogaPose
      // check what kind of yoga pose we have, add accordingly
      if (y.isSpineStretch()) warmUpPoses.add(p);
      else if (y.isDeepStretch()) stretchPoses.add(p);
      else workoutPoses.add(p);
    }
    else if (p instanceof Pilates) {
      pilatesExercises.add(p); // no matter if warmup, will be added to pilatesExercises
      // check if side kick exercise
      if (p.getName().contains("Side Kicks")) {
        sideKicks.add(p);
      }
      Pilates pil = (Pilates) p;
      if (pil.isWarmUp()) pilatesWarmUp.add(p); // check if warmup
    }
    else throw new IllegalArgumentException("Pose must be of type YogaPose or Pilates");
    
    allPoses.add(p); // auto adds to allPoses if no errors are thrown
  }
  
  /**
   * checks if PoseOrganizer contains a Pose
   * 
   * @param p - pose to find in either pose ArrayList
   * @return true if allPoses contains this pose (only name needs to match)
   */
  public static boolean contains(Pose p) {
    for (int i = 0; i < allPoses.size(); i++) {
      if (allPoses.get(i).equals(p)) return true;
    }
    return false;
  }
  
  /**
   * removes a Pose from PoseOrganizer
   * 
   * @param p - pose to remove in either pose ArrayList
   * @throws IllegalArgumentException if no such pose exists
   */
  public static void remove(Pose p) {
    if (!PoseOrganizer.contains(p)) {
      throw new IllegalArgumentException("No such Pose was found to remove");
    }
    
    // remove pose from allPoses
    allPoses.remove(p);
    
    // remove pose from other ArrayLists, depending on type:
    
    // if type YogaPose
    if (p instanceof YogaPose) {
      YogaPose y = (YogaPose) p; // cast to YogaPose
      // check what kind of yoga pose we have, remove accordingly
      if (y.isSpineStretch()) {
        warmUpPoses.remove(p);
      }
      else if (y.isDeepStretch()) {
        stretchPoses.remove(p);
      }
      else workoutPoses.remove(p);
    }
    
    // if type Pilates
    else if (p instanceof Pilates) {
      pilatesExercises.remove(p);
      if (p.getName().contains("Side Kicks")) { // check if side kick
        sideKicks.remove(p);
      }
      Pilates pil = (Pilates) p;
      if (pil.isWarmUp()) pilatesWarmUp.remove(p); // check if warmup
    }
  }
  
  /**
   * clears the entire PoseOrganizer
   */
  public static void clear() {
    warmUpPoses = new ArrayList<Pose>();
    workoutPoses = new ArrayList<Pose>();
    stretchPoses = new ArrayList<Pose>();
    pilatesWarmUp = new ArrayList<Pose>();
    pilatesExercises = new ArrayList<Pose>();
    sideKicks = new ArrayList<Pose>();
    allPoses = new ArrayList<Pose>();
  }
  
  // getter methods
  public static ArrayList<Pose> getAllPoses() {
    return allPoses;
  }
  
  public static ArrayList<Pose> getWarmUpPoses() {
    return warmUpPoses;
  }
  
  public static ArrayList<Pose> getWorkoutPoses() {
    return workoutPoses;
  }
  
  public static ArrayList<Pose> getStretchPoses() {
    return stretchPoses;
  }
  
  public static ArrayList<Pose> getPilatesWarmUp() {
    return pilatesWarmUp;
  }
  
  public static ArrayList<Pose> getPilatesExercises() {
    return pilatesExercises;
  }
  
  // random pose methods
  /**
   * randomly selects and returns a pose
   * 
   * @throws IllegalStateException if there are no poses to choose from
   * @return
   */
  public static Pose randomPose() {
    int size = allPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    return allPoses.get(randIndex);
  }
  
  /**
   * randomly selects and returns a pose
   * 
   * @throws IllegalStateException if there are no poses to choose from
   * @return
   */
  public static Pose randomWarmUpPose() {
    int size = warmUpPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    return warmUpPoses.get(randIndex);
  }
  
  /**
   * randomly selects and returns a pose
   * 
   * @throws IllegalStateException if there are no poses to choose from
   * @return
   */
  public static Pose randomWorkoutPose() {
    int size = workoutPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    return workoutPoses.get(randIndex);
  }
  
  /**
   * randomly selects and returns a pose that matches the StartingPosition
   * assumes there exists a pose with that StartingPosition added to PoseOrganizer
   * 
   * @param position - the desired StartingPosition
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random pose meeting the criteria
   */
  public static Pose randomWorkoutPose(StartingPosition position) {
    int size = workoutPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    Pose toReturn = workoutPoses.get(randIndex);
    
    // ensures we have a pose with the desired StartingPosition
    while (toReturn.getPosition() != position) {
      randIndex = (int) (Math.random() * size);
      toReturn = workoutPoses.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * randomly selects and returns a pose that matches the StartingPosition and PoseIntensity
   * assumes there exists a pose with that StartingPosition and Intensity added to PoseOrganizer
   * 
   * @param position - the desired StartingPosition
   * @param intensity - the desired PoseIntensity
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random pose meeting the criteria
   */
  public static Pose randomWorkoutPose(StartingPosition position, PoseIntensity intensity) {
    int size = workoutPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    Pose toReturn = workoutPoses.get(randIndex);
    
    // ensures we have a pose with the desired StartingPosition and PoseIntensity
    while (toReturn.getPosition() != position || toReturn.getIntensity() != intensity) {
      randIndex = (int) (Math.random() * size);
      toReturn = workoutPoses.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * randomly selects and returns a pose that matches either StartingPosition
   * assumes there exists a pose with that StartingPosition added to PoseOrganizer
   * 
   * @param position1 - a permissible StartingPositions
   * @param position2 - a permissible StartingPositions
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random pose meeting the criteria
   */
  public static Pose randomWorkoutPose(StartingPosition position1, StartingPosition position2) {
    int size = workoutPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    Pose toReturn = workoutPoses.get(randIndex);
    
    // ensures we have a pose with either of the permissible StartingPositions
    while (toReturn.getPosition() != position1 && toReturn.getPosition() != position2) {
      randIndex = (int) (Math.random() * size);
      toReturn = workoutPoses.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * randomly selects and returns a pose using dumbbells
   * 
   * @throws IllegalStateException if there are no poses to choose from
   * @return
   */
  public static Pose randomWorkoutDumbbellPose() {
    int size = workoutPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    YogaPose toReturn = (YogaPose) workoutPoses.get(randIndex); 
    // must cast to YogaPose to access dumbbell information
    
    // ensures we have a pose with dumbbell option
    while (!toReturn.hasDumbbellOption()) {
      randIndex = (int) (Math.random() * size);
      toReturn = (YogaPose) workoutPoses.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * randomly selects and returns a dumbbell pose that matches the StartingPosition
   * assumes there exists a pose with that StartingPosition added to PoseOrganizer
   * 
   * @param position - the desired StartingPosition
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random pose meeting the criteria
   */
  public static Pose randomWorkoutDumbbellPose(StartingPosition position) {
    int size = workoutPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    YogaPose toReturn = (YogaPose) workoutPoses.get(randIndex); 
    // must cast to YogaPose to access dumbbell information
    
    // ensures we have a pose with dumbbell option and correct position
    while (!toReturn.hasDumbbellOption() || toReturn.getPosition() != position) {
      randIndex = (int) (Math.random() * size);
      toReturn = (YogaPose) workoutPoses.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * randomly selects and returns a pose that matches the StartingPosition and PoseIntensity
   * assumes there exists a pose with that StartingPosition and Intensity added to PoseOrganizer
   * 
   * @param position - the desired StartingPosition
   * @param intensity - the desired PoseIntensity
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random pose meeting the criteria
   */
  public static Pose randomWorkoutDumbbellPose(StartingPosition position, PoseIntensity intensity) {
    int size = workoutPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    YogaPose toReturn = (YogaPose) workoutPoses.get(randIndex); 
    // must cast to YogaPose to access dumbbell information
    
    // ensures we have a pose with dumbbell option
    while (!toReturn.hasDumbbellOption() || 
            toReturn.getPosition() != position || 
            toReturn.getIntensity() != intensity) {
      randIndex = (int) (Math.random() * size);
      toReturn = (YogaPose) workoutPoses.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * randomly selects and returns a pose
   * 
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random stretch pose
   */
  public static Pose randomStretchPose() {
    int size = stretchPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    return stretchPoses.get(randIndex);
  }
  
  /**
   * randomly selects and returns a pose that matches the StartingPosition
   * assumes there exists a pose with that StartingPosition added to PoseOrganizer
   * 
   * @param position - the desired StartingPosition
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random pose meeting the criteria
   */
  public static Pose randomStretchPose(StartingPosition position) {
    int size = stretchPoses.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    Pose toReturn = stretchPoses.get(randIndex);
    
    // ensures we have a pose with the desired StartingPosition
    while (toReturn.getPosition() != position) {
      randIndex = (int) (Math.random() * size);
      toReturn = stretchPoses.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * randomly selects and returns a pose
   * 
   * @throws IllegalStateException if there are no poses to choose from
   * @return
   */
  public static Pose randomPilatesWarmUp() {
    int size = pilatesWarmUp.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    return pilatesWarmUp.get(randIndex);
  }
  
  /**
   * randomly selects and returns a pose that matches the PoseIntensity
   * assumes there exists a pose with that PoseIntensity added to PoseOrganizer
   * 
   * @param intensity - the desired PoseIntensity
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random pose meeting the criteria
   */
  public static Pose randomPilatesWarmUp(PoseIntensity intensity) {
    int size = pilatesWarmUp.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    Pose toReturn = pilatesWarmUp.get(randIndex);
    
    // ensures we have a pose with the desired PoseIntensity
    while (toReturn.getIntensity() != intensity) {
      randIndex = (int) (Math.random() * size);
      toReturn = pilatesWarmUp.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * randomly selects and returns a pose
   * 
   * @throws IllegalStateException if there are no poses to choose from
   * @return
   */
  public static Pose randomPilatesExercise() {
    int size = pilatesExercises.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    return pilatesExercises.get(randIndex);
  }
  
  /**
   * randomly selects and returns a pose that matches the StartingPosition
   * assumes there exists a pose with that StartingPosition added to PoseOrganizer
   * 
   * @param position - the desired StartingPosition
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random pose meeting the criteria
   */
  public static Pose randomPilatesExercise(StartingPosition position) {
    int size = pilatesExercises.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    Pose toReturn = pilatesExercises.get(randIndex);
    
    // ensures we have a pose with the desired StartingPosition
    while (toReturn.getPosition() != position) {
      randIndex = (int) (Math.random() * size);
      toReturn = pilatesExercises.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * randomly selects and returns a pose that matches either StartingPosition
   * assumes there exists a pose with that StartingPosition added to PoseOrganizer
   * 
   * @param position1 - a permissible StartingPositions
   * @param position2 - a permissible StartingPositions
   * @throws IllegalStateException if there are no poses to choose from
   * @return a random pose meeting the criteria
   */
  public static Pose randomPilatesExercise(StartingPosition position1, StartingPosition position2) {
    int size = pilatesExercises.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    Pose toReturn = pilatesExercises.get(randIndex);
    
    // ensures we have a pose with either of the permissible StartingPositions
    while (toReturn.getPosition() != position1 && toReturn.getPosition() != position2) {
      randIndex = (int) (Math.random() * size);
      toReturn = pilatesExercises.get(randIndex);
    }
    
    return toReturn;
  }
  
  /**
   * 
   * @return the side kicks prep pose
   */
  public static Pose getSideKicksWarmUp() {
    for (int i = 0; i < sideKicks.size(); i++) {
      if (sideKicks.get(i).getName().equals("Side Kicks Prep")) {
        return sideKicks.get(i);
      }
    }
    return null;
  }
  
  /**
   * 
   * @return a side kick exercise (that isn't the prep exercise)
   */
  public static Pose randomSideKicksExercise() {
    int size = sideKicks.size();
    if (size == 0) throw new IllegalStateException("No poses available");
    
    int randIndex = (int) (Math.random() * size);
    // returns number from 0 (inclusive) to size (exclusive)
    
    Pose toReturn = sideKicks.get(randIndex);
    
    // ensures we have a side kick that isn't the warmup
    while (toReturn.getName().equals("Side Kicks Prep")) {
      randIndex = (int) (Math.random() * size);
      toReturn = sideKicks.get(randIndex);
    }
    
    return toReturn;
  }
  
}

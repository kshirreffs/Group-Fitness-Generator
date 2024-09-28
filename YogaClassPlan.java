import java.util.ArrayList;

/**
 * Class representing a Yoga class plan
 */
public class YogaClassPlan {

  // instance fields
  private ClassType type;
  private int length;
  private ArrayList<ArrayList<Object>> plan; // can be made up of Poses, Meditations, and Strings
  
  // static fields
  private final static int MINDFULNESS = 0;
  private final static int WARMUP = 1;
  private final static int WORKOUT = 2;
  private final static int STRETCHES = 3;
  private final static int RELAXATION = 4;
  
  /*
   * NOTES ON CLASS PLANS:
   * 
   * increasing intensity as the workout progresses
   */
  
  // constructor
  /**
   * Creates the object for the new class plan
   * 
   * @param type - type of class
   * @param length - length of class (45 or 60)
   * @throws IllegalArgumentException if class length isn't 45 or 60 minutes
   */
  public YogaClassPlan(ClassType type, int length) {
    if (length != 45 && length != 60) throw new IllegalArgumentException("Class length must be 45 or 60 minutes");
    this.type = type;
    this.length = length;
    this.plan = new ArrayList<ArrayList<Object>>(5);
    
    // initialize each index of the plan with a new ArrayList
    for (int i = 0; i < 5; i++) {
      plan.add(new ArrayList<Object>());
    }
    
    // generate our plan
    generatePlan();
  }
  
  /**
   * Generates a class plan, directly edits plan instance field (via helper methods)
   * Assumes we have enough poses to choose from
   * 
   * @return the new class plan
   */
  public void generatePlan() {
    if (type == ClassType.YOGA) generateYoga();
    else if (type == ClassType.POWERFLOW) generatePowerflow();
    else if (type == ClassType.STRESS_RELIEF) generateStressRelief();
    else generateYogaStrength();
  }
  
  // helper methods for specific class types
  
  private void generateYoga() {
    
    if (length == 45) {
      
      // (1) MINDFULNESS
      
      // select random mindfulness
      Meditation m = MeditationOrganizer.randomMindfulness();
      addMindfulness(m);
      
      // (2) WARM-UP
      
      // select 2 spine stretches
      Pose spine1 = PoseOrganizer.randomWarmUpPose();
      Pose spine2 = PoseOrganizer.randomWarmUpPose();
      while (spine2.equals(spine1)) { // makes sure we have no duplicates
        spine2 = PoseOrganizer.randomWarmUpPose();
      }
      
      // add the stretches
      addWarmUp(spine1);
      addWarmUp(spine2);
      
      // add sun sals (x2)
      addWarmUp("Sun salutation x 2");
      
      // (3) WORKOUT
      
      // FLOW 1: (should only have Beginner intensity)
      addWorkout("*Flow 1*");
      // 3 standing exercises (R)
      Pose stand1 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand1); // can no longer select this pose for this class plan
      Pose stand2 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand2);
      Pose stand3 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand3);
      
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      // same 3 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      
      // FLOW 2:
      addWorkout("\n*Flow 2*");
      // 2 standing exercises (R)
      Pose stand4 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand4); // can no longer select this pose for this class plan
      Pose stand5 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand5);
      
      addWorkout(stand4);
      addWorkout(stand5);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand4);
      addWorkout(stand5);
      
      // re-add the poses we removed (so they can be used again for other class plans)
      PoseOrganizer.add(stand1);
      PoseOrganizer.add(stand2);
      PoseOrganizer.add(stand3);
      PoseOrganizer.add(stand4);
      PoseOrganizer.add(stand5);
      
      
      // (4) DEEP STRETCH
      
      // select 2 deep stretches
      Pose stretch1 = PoseOrganizer.randomStretchPose();
      Pose stretch2 = PoseOrganizer.randomStretchPose();
      while (stretch2.equals(stretch1)) { // makes sure we have no duplicates
        stretch2 = PoseOrganizer.randomStretchPose();
      }
      
      // add the stretches
      addDeepStretch(stretch1);
      addDeepStretch(stretch2);
            
      // (5) FINAL RELAXATION
      
      // select random relaxation
      Meditation r = MeditationOrganizer.randomRelaxation();
      addRelaxation(r);
      
      
    } else if (length == 60) {
      
      // (1) MINDFULNESS
      
      // select random mindfulness
      Meditation m = MeditationOrganizer.randomMindfulness();
      addMindfulness(m);
      
      // (2) WARM-UP
      
      // select 2 spine stretches
      Pose spine1 = PoseOrganizer.randomWarmUpPose();
      Pose spine2 = PoseOrganizer.randomWarmUpPose();
      while (spine2.equals(spine1)) { // makes sure we have no duplicates
        spine2 = PoseOrganizer.randomWarmUpPose();
      }
      
      // add the stretches
      addWarmUp(spine1);
      addWarmUp(spine2);
      
      // add sun sals (x2)
      addWarmUp("Sun salutation x 3");
      
      // (3) WORKOUT
      
      // FLOW 1:
      addWorkout("*Flow 1*");
      // 3 standing exercises (R)
      Pose stand1 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand1); // can no longer select this pose for this class plan
      Pose stand2 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand2);
      Pose stand3 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand3);
      
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      // same 3 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      
      // FLOW 2:
      addWorkout("\n*Flow 2*");
      // 2 standing exercises (R)
      Pose stand4 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand4); // can no longer select this pose for this class plan
      Pose stand5 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand5);
      
      addWorkout(stand4);
      addWorkout(stand5);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand4);
      addWorkout(stand5);
      
      // FLOW 3:
      addWorkout("\n*Flow 3*");
      // 1 all-fours and 1 prone exercise
      Pose down1 = PoseOrganizer.randomWorkoutPose(StartingPosition.ALLFOURS);
      Pose down2 = PoseOrganizer.randomWorkoutPose(StartingPosition.PRONE);
      
      addWorkout(down1);
      addWorkout(down2);
      
      
      // re-add the poses we removed (so they can be used again for other class plans)
      PoseOrganizer.add(stand1);
      PoseOrganizer.add(stand2);
      PoseOrganizer.add(stand3);
      PoseOrganizer.add(stand4);
      PoseOrganizer.add(stand5);
      
      // (4) DEEP STRETCH
      
      // select 2 deep stretches
      Pose stretch1 = PoseOrganizer.randomStretchPose();
      Pose stretch2 = PoseOrganizer.randomStretchPose();
      while (stretch2.equals(stretch1)) { // makes sure we have no duplicates
        stretch2 = PoseOrganizer.randomStretchPose();
      }
      
      // add the stretches
      addDeepStretch(stretch1);
      addDeepStretch(stretch2);
            
      // (5) FINAL RELAXATION
      
      // select random relaxation
      Meditation r = MeditationOrganizer.randomRelaxation();
      addRelaxation(r);
      
    }
  }
  
  private void generatePowerflow() {
    if (length == 45) {
      
      // (1) MINDFULNESS
      
      // select random mindfulness
      Meditation m = MeditationOrganizer.randomMindfulness();
      addMindfulness(m);
      
      // (2) WARM-UP
        
      // select 2 spine stretches
      Pose spine1 = PoseOrganizer.randomWarmUpPose();
      Pose spine2 = PoseOrganizer.randomWarmUpPose();
      while (spine2.equals(spine1)) { // makes sure we have no duplicates
        spine2 = PoseOrganizer.randomWarmUpPose();
      }
      
      // add the stretches
      addWarmUp(spine1);
      addWarmUp(spine2);
      
      // select pilates warmup
      // 2 beginner pilates warmup, 1 intermediate
      Pose pilWarmup1 = PoseOrganizer.randomPilatesWarmUp(PoseIntensity.BEGINNER);
      PoseOrganizer.remove(pilWarmup1);
      Pose pilWarmup2 = PoseOrganizer.randomPilatesWarmUp(PoseIntensity.BEGINNER);
      PoseOrganizer.remove(pilWarmup2);
      Pose pilWarmup3 = PoseOrganizer.randomPilatesWarmUp(PoseIntensity.INTERMEDIATE);
      PoseOrganizer.remove(pilWarmup3);
      
      // add pilates warmup
      addWarmUp("Pilates warm up:");
      addWarmUp("- " + pilWarmup1);
      addWarmUp("- " + pilWarmup2);
      addWarmUp("- " + pilWarmup3);
      
      // add sun sals (x2)
      addWarmUp("Sun salutation x 2");
      
      // (3) WORKOUT
      
      // FLOW 1 (YOGA): (should only have Beginner intensity)
      addWorkout("*Yoga Flow 1*");
      // 3 standing exercises (R)
      Pose stand1 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand1); // can no longer select this pose for this class plan
      Pose stand2 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand2);
      Pose stand3 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand3);
      
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      // same 3 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      
      // FLOW 2 (PILATES):
      addWorkout("\n*Pilates 1*");
      // set up ALL pilates exercises (we don't know if supine or prone will come first)
      // setting up supine/seated
      Pose pilatesSup1 = PoseOrganizer.randomPilatesExercise(StartingPosition.SUPINE);
      PoseOrganizer.remove(pilatesSup1);
      Pose pilatesSup2 = PoseOrganizer.randomPilatesExercise(StartingPosition.SUPINE);
      PoseOrganizer.remove(pilatesSup2);
      Pose pilatesSup3 = PoseOrganizer.randomPilatesExercise(StartingPosition.SUPINE, StartingPosition.SEATED);
      PoseOrganizer.remove(pilatesSup3);
      // setting up prone/all-fours
      Pose pilatesProne1 = PoseOrganizer.randomPilatesExercise(StartingPosition.PRONE);
      PoseOrganizer.remove(pilatesProne1);
      Pose pilatesProne2 = PoseOrganizer.randomPilatesExercise(StartingPosition.PRONE);
      PoseOrganizer.remove(pilatesProne2);
      Pose pilatesProne3 = PoseOrganizer.randomPilatesExercise(StartingPosition.PRONE, StartingPosition.ALLFOURS);
      PoseOrganizer.remove(pilatesProne3);
      
      // either supine/seated or prone/all-fours pilates will be chosen
      int randNum = (int) (Math.random() * 2); // returns 0 or 1
      boolean supineFirst = randNum == 0 ? true : false; // 50/50 chance
      
      if (supineFirst) {
        addWorkout(pilatesSup1);
        addWorkout(pilatesSup2);
        addWorkout(pilatesSup3);
      } else {
        addWorkout(pilatesProne1);
        addWorkout(pilatesProne2);
        addWorkout(pilatesProne3);
      }
      
      // repeat Pilates 1
      addWorkout(" - Rest, repeat -");
      
      // FLOW 3 (YOGA):
      addWorkout("\n*Yoga Flow 2*");
      // 2 standing exercises (R)
      Pose stand4 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand4); // can no longer select this pose for this class plan
      Pose stand5 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand5);
      
      addWorkout(stand4);
      addWorkout(stand5);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand4);
      addWorkout(stand5);
      
      // re-add the poses we removed (so they can be used again for other class plans)
      PoseOrganizer.add(pilWarmup1);
      PoseOrganizer.add(pilWarmup2);
      PoseOrganizer.add(pilWarmup3);
      PoseOrganizer.add(stand1);
      PoseOrganizer.add(stand2);
      PoseOrganizer.add(stand3);
      PoseOrganizer.add(pilatesSup1);
      PoseOrganizer.add(pilatesSup2);
      PoseOrganizer.add(pilatesSup3);
      PoseOrganizer.add(pilatesProne1);
      PoseOrganizer.add(pilatesProne2);
      PoseOrganizer.add(pilatesProne3);
      PoseOrganizer.add(stand4);
      PoseOrganizer.add(stand5);
      
      
      // (4) DEEP STRETCH
      
      // select 2 deep stretches
      Pose stretch1 = PoseOrganizer.randomStretchPose();
      Pose stretch2 = PoseOrganizer.randomStretchPose();
      while (stretch2.equals(stretch1)) { // makes sure we have no duplicates
        stretch2 = PoseOrganizer.randomStretchPose();
      }
      
      // add the stretches
      addDeepStretch(stretch1);
      addDeepStretch(stretch2);
            
      // (5) FINAL RELAXATION
      
      // select random relaxation
      Meditation r = MeditationOrganizer.randomRelaxation();
      addRelaxation(r);
      
      
    } else if (length == 60) {
      
      // (1) MINDFULNESS
      
      // select random mindfulness
      Meditation m = MeditationOrganizer.randomMindfulness();
      addMindfulness(m);
      
      // (2) WARM-UP
        
      // select 2 spine stretches
      Pose spine1 = PoseOrganizer.randomWarmUpPose();
      Pose spine2 = PoseOrganizer.randomWarmUpPose();
      while (spine2.equals(spine1)) { // makes sure we have no duplicates
        spine2 = PoseOrganizer.randomWarmUpPose();
      }
      
      // add the stretches
      addWarmUp(spine1);
      addWarmUp(spine2);
      
      // select pilates warmup
      // 2 beginner pilates warmup, 1 intermediate
      Pose pilWarmup1 = PoseOrganizer.randomPilatesWarmUp(PoseIntensity.BEGINNER);
      PoseOrganizer.remove(pilWarmup1);
      Pose pilWarmup2 = PoseOrganizer.randomPilatesWarmUp(PoseIntensity.BEGINNER);
      PoseOrganizer.remove(pilWarmup2);
      Pose pilWarmup3 = PoseOrganizer.randomPilatesWarmUp(PoseIntensity.INTERMEDIATE);
      PoseOrganizer.remove(pilWarmup3);
      
      // add pilates warmup
      addWarmUp("Pilates warm up:");
      addWarmUp("- " + pilWarmup1);
      addWarmUp("- " + pilWarmup2);
      addWarmUp("- " + pilWarmup3);
      
      // add sun sals (x2)
      addWarmUp("Sun salutation x 2");
      
      // (3) WORKOUT
      
      // FLOW 1 (YOGA): (should only have Beginner intensity)
      addWorkout("*Yoga Flow 1*");
      // 3 standing exercises (R)
      Pose stand1 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand1); // can no longer select this pose for this class plan
      Pose stand2 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand2);
      Pose stand3 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand3);
      
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      // same 3 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      
      // FLOW 2 (PILATES):
      addWorkout("\n*Pilates 1*");
      // set up ALL pilates exercises (we don't know if supine or prone will come first)
      // setting up supine/seated
      Pose pilatesSup1 = PoseOrganizer.randomPilatesExercise(StartingPosition.SUPINE);
      PoseOrganizer.remove(pilatesSup1);
      Pose pilatesSup2 = PoseOrganizer.randomPilatesExercise(StartingPosition.SUPINE);
      PoseOrganizer.remove(pilatesSup2);
      Pose pilatesSup3 = PoseOrganizer.randomPilatesExercise(StartingPosition.SUPINE, StartingPosition.SEATED);
      PoseOrganizer.remove(pilatesSup3);
      // setting up prone/all-fours
      Pose pilatesProne1 = PoseOrganizer.randomPilatesExercise(StartingPosition.PRONE);
      PoseOrganizer.remove(pilatesProne1);
      Pose pilatesProne2 = PoseOrganizer.randomPilatesExercise(StartingPosition.PRONE);
      PoseOrganizer.remove(pilatesProne2);
      Pose pilatesProne3 = PoseOrganizer.randomPilatesExercise(StartingPosition.PRONE, StartingPosition.ALLFOURS);
      PoseOrganizer.remove(pilatesProne3);
      
      // either supine/seated or prone/all-fours pilates comes first
      int randNum = (int) (Math.random() * 2); // returns 0 or 1
      boolean supineFirst = randNum == 0 ? true : false; // 50/50 chance
      
      if (supineFirst) {
        addWorkout(pilatesSup1);
        addWorkout(pilatesSup2);
        addWorkout(pilatesSup3);
      } else {
        addWorkout(pilatesProne1);
        addWorkout(pilatesProne2);
        addWorkout(pilatesProne3);
      }
      
      // repeat Pilates 1
      addWorkout(" - Rest, repeat -");
      
      // FLOW 3 (YOGA):
      addWorkout("\n*Yoga Flow 2*");
      // 2 standing exercises (R)
      Pose stand4 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand4); // can no longer select this pose for this class plan
      Pose stand5 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand5);
      
      addWorkout(stand4);
      addWorkout(stand5);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand4);
      addWorkout(stand5);
      
      // FLOW 4 (PILATES):
      addWorkout("\n*Pilates 2*");
      
      // 1/5 chance that we'll do the side kicks series
      randNum = (int) (Math.random() * 6); // returns integer 0-5
      boolean includeSideKicks = randNum == 0 ? true : false; // 20% chance
      
      // set up the side kick exercises, in case they'll be used
      Pose pilatesSidePrep = PoseOrganizer.getSideKicksWarmUp();
      PoseOrganizer.remove(pilatesSidePrep);
      Pose pilatesSideKick1 = PoseOrganizer.randomSideKicksExercise();
      PoseOrganizer.remove(pilatesSideKick1);
      Pose pilatesSideKick2 = PoseOrganizer.randomSideKicksExercise();
      PoseOrganizer.remove(pilatesSideKick2);
      
      if (includeSideKicks) {        
        // add side kick exercises to our workout
        addWorkout(pilatesSidePrep);
        addWorkout(pilatesSideKick1);
        addWorkout(pilatesSideKick2);
      } 
      // no side kicks, so do supine or prone (whichever we didn't do in Pilates 1)
      else {
        if (!supineFirst) {
          addWorkout(pilatesSup1);
          addWorkout(pilatesSup2);
          addWorkout(pilatesSup3);
        } else {
          addWorkout(pilatesProne1);
          addWorkout(pilatesProne2);
          addWorkout(pilatesProne3);
        }
      }
      
      // repeat Pilates 2
      addWorkout(" - Rest, repeat -");
      
      // re-add the poses we removed (so they can be used again for other class plans)
      PoseOrganizer.add(pilWarmup1);
      PoseOrganizer.add(pilWarmup2);
      PoseOrganizer.add(pilWarmup3);
      PoseOrganizer.add(stand1);
      PoseOrganizer.add(stand2);
      PoseOrganizer.add(stand3);
      PoseOrganizer.add(pilatesSup1);
      PoseOrganizer.add(pilatesSup2);
      PoseOrganizer.add(pilatesSup3);
      PoseOrganizer.add(pilatesProne1);
      PoseOrganizer.add(pilatesProne2);
      PoseOrganizer.add(pilatesProne3);
      PoseOrganizer.add(pilatesSidePrep);
      PoseOrganizer.add(pilatesSideKick1);
      PoseOrganizer.add(pilatesSideKick2);
      PoseOrganizer.add(stand4);
      PoseOrganizer.add(stand5);
      
      
      // (4) DEEP STRETCH
      
      // select 2 deep stretches
      Pose stretch1 = PoseOrganizer.randomStretchPose();
      Pose stretch2 = PoseOrganizer.randomStretchPose();
      while (stretch2.equals(stretch1)) { // makes sure we have no duplicates
        stretch2 = PoseOrganizer.randomStretchPose();
      }
      
      // add the stretches
      addDeepStretch(stretch1);
      addDeepStretch(stretch2);
            
      // (5) FINAL RELAXATION
      
      // select random relaxation
      Meditation r = MeditationOrganizer.randomRelaxation();
      addRelaxation(r);
      
    }
  }

  private void generateStressRelief() {
    if (length == 45) {
      
      // (1) MINDFULNESS
      
      // select random mindfulness
      addMindfulness(" - longer than typical -"); // for stress relief
      Meditation m = MeditationOrganizer.randomMindfulness();
      addMindfulness(m);
      
      // (2) WARM-UP
      
      // select 2 spine stretches
      Pose spine1 = PoseOrganizer.randomWarmUpPose();
      Pose spine2 = PoseOrganizer.randomWarmUpPose();
      while (spine2.equals(spine1)) { // makes sure we have no duplicates
        spine2 = PoseOrganizer.randomWarmUpPose();
      }
      
      // add the stretches
      addWarmUp(spine1);
      addWarmUp(spine2);
      
      // add sun sals (x2)
      addWarmUp("Sun salutation x 2");
      
      // (3) WORKOUT (should only have Beginner intensity)
      
      // FLOW 1: 
      addWorkout("*Flow 1*");
      // 3 standing exercises (R)
      Pose stand1 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand1); // can no longer select this pose for this class plan
      Pose stand2 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand2);
      Pose stand3 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand3);
      
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      // same 3 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      
      // FLOW 2:
      addWorkout("\n*Flow 2*");
      // 2 standing exercises (R)
      Pose stand4 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand4); // can no longer select this pose for this class plan
      Pose stand5 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand5);
      
      addWorkout(stand4);
      addWorkout(stand5);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand4);
      addWorkout(stand5);
      
      
      // (4) DEEP STRETCH
      
      // select 4 deep stretches
      // 1 all fours
      Pose stretch1 = PoseOrganizer.randomStretchPose(StartingPosition.ALLFOURS);
      PoseOrganizer.remove(stretch1);
      // 2 seated
      Pose stretch2 = PoseOrganizer.randomStretchPose(StartingPosition.SEATED);
      PoseOrganizer.remove(stretch2);
      Pose stretch3 = PoseOrganizer.randomStretchPose(StartingPosition.SEATED);
      PoseOrganizer.remove(stretch3);
      // 1 supine
      Pose stretch4 = PoseOrganizer.randomStretchPose(StartingPosition.SUPINE);
      PoseOrganizer.remove(stretch4);
      
      // add the stretches
      addDeepStretch(stretch1);
      addDeepStretch(stretch2);
      addDeepStretch(stretch3);
      addDeepStretch(stretch4);
      
      // re-add the poses/stretches we removed (so they can be used again for other class plans)
      PoseOrganizer.add(stand1);
      PoseOrganizer.add(stand2);
      PoseOrganizer.add(stand3);
      PoseOrganizer.add(stand4);
      PoseOrganizer.add(stand5);
      PoseOrganizer.add(stretch1);
      PoseOrganizer.add(stretch2);
      PoseOrganizer.add(stretch3);
      PoseOrganizer.add(stretch4);
            
      // (5) FINAL RELAXATION
      
      // select random relaxation
      addRelaxation(" - longer than typical -"); // for stress relief
      Meditation r = MeditationOrganizer.randomRelaxation();
      addRelaxation(r);
      
      
    } else if (length == 60) {
      
      // (1) MINDFULNESS
      
      // select random mindfulness
      addMindfulness(" - longer than typical -"); // for stress relief
      Meditation m = MeditationOrganizer.randomMindfulness();
      addMindfulness(m);
      
      // (2) WARM-UP
      
      // select 2 spine stretches
      Pose spine1 = PoseOrganizer.randomWarmUpPose();
      Pose spine2 = PoseOrganizer.randomWarmUpPose();
      while (spine2.equals(spine1)) { // makes sure we have no duplicates
        spine2 = PoseOrganizer.randomWarmUpPose();
      }
      
      // add the stretches
      addWarmUp(spine1);
      addWarmUp(spine2);
      
      // add sun sals (x2)
      addWarmUp("Sun salutation x 3");
      
      // (3) WORKOUT (should only have Beginner intensity)
      
      // FLOW 1: 
      addWorkout("*Flow 1*");
      // 3 standing exercises (R)
      Pose stand1 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand1); // can no longer select this pose for this class plan
      Pose stand2 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand2);
      Pose stand3 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand3);
      
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      // same 3 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      
      // FLOW 2:
      addWorkout("\n*Flow 2*");
      // 2 standing exercises (R)
      Pose stand4 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand4); // can no longer select this pose for this class plan
      Pose stand5 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand5);
      
      addWorkout(stand4);
      addWorkout(stand5);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand4);
      addWorkout(stand5);
      
      // FLOW 3:
      addWorkout("\n*Flow 3*");
      // 2 standing exercises (R)
      Pose stand6 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand6); // can no longer select this pose for this class plan
      Pose stand7 = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand7);
      
      addWorkout(stand6);
      addWorkout(stand7);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand6);
      addWorkout(stand7);
      
      
      // (4) DEEP STRETCH
      
      // select 5 deep stretches
      // 1 all fours
      Pose stretch1 = PoseOrganizer.randomStretchPose(StartingPosition.ALLFOURS);
      PoseOrganizer.remove(stretch1);
      // 3 seated
      Pose stretch2 = PoseOrganizer.randomStretchPose(StartingPosition.SEATED);
      PoseOrganizer.remove(stretch2);
      Pose stretch3 = PoseOrganizer.randomStretchPose(StartingPosition.SEATED);
      PoseOrganizer.remove(stretch3);
      Pose stretch4 = PoseOrganizer.randomStretchPose(StartingPosition.SEATED);
      PoseOrganizer.remove(stretch4);
      // 1 supine
      Pose stretch5 = PoseOrganizer.randomStretchPose(StartingPosition.SUPINE);
      PoseOrganizer.remove(stretch5);
      
      // add the stretches
      addDeepStretch(stretch1);
      addDeepStretch(stretch2);
      addDeepStretch(stretch3);
      addDeepStretch(stretch4);
      addDeepStretch(stretch5);
      
      // re-add the poses/stretches we removed (so they can be used again for other class plans)
      PoseOrganizer.add(stand1);
      PoseOrganizer.add(stand2);
      PoseOrganizer.add(stand3);
      PoseOrganizer.add(stand4);
      PoseOrganizer.add(stand5);
      PoseOrganizer.add(stand6);
      PoseOrganizer.add(stand7);
      PoseOrganizer.add(stretch1);
      PoseOrganizer.add(stretch2);
      PoseOrganizer.add(stretch3);
      PoseOrganizer.add(stretch4);
      PoseOrganizer.add(stretch5);
            
      // (5) FINAL RELAXATION
      
      // select random relaxation
      addRelaxation(" - longer than typical -"); // for stress relief
      Meditation r = MeditationOrganizer.randomRelaxation();
      addRelaxation(r);
      
    }

  }
  
  private void generateYogaStrength() {
    if (length == 45) {
      
      // (1) MINDFULNESS
      
      // select random mindfulness
      Meditation m = MeditationOrganizer.randomMindfulness();
      addMindfulness(m);
      
      // (2) WARM-UP
      
      // select 2 spine stretches
      Pose spine1 = PoseOrganizer.randomWarmUpPose();
      Pose spine2 = PoseOrganizer.randomWarmUpPose();
      while (spine2.equals(spine1)) { // makes sure we have no duplicates
        spine2 = PoseOrganizer.randomWarmUpPose();
      }
      
      // add the stretches
      addWarmUp(spine1);
      addWarmUp(spine2);
      
      // add sun sals (x2)
      addWarmUp("Sun salutation x 2");
      
      // (3) WORKOUT
      
      // FLOW 1: (should only have Beginner intensity)
      addWorkout("*Flow 1 w/ dumbbells*");
      // 3 standing exercises (R)
      Pose stand1 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand1); // can no longer select this pose for this class plan
      Pose stand2 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand2);
      Pose stand3 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand3);
      
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      // same 3 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      
      // FLOW 2:
      addWorkout("\n*Flow 2 w/ dumbbells*");
      // 2 standing exercises (R)
      Pose stand4 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand4); // can no longer select this pose for this class plan
      Pose stand5 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand5);
      
      addWorkout(stand4);
      addWorkout(stand5);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand4);
      addWorkout(stand5);
      
      // re-add the poses we removed (so they can be used again for other class plans)
      PoseOrganizer.add(stand1);
      PoseOrganizer.add(stand2);
      PoseOrganizer.add(stand3);
      PoseOrganizer.add(stand4);
      PoseOrganizer.add(stand5);
      
      
      // (4) DEEP STRETCH
      
      addDeepStretch(" - move dumbbells to side -");
      // select 2 deep stretches
      Pose stretch1 = PoseOrganizer.randomStretchPose();
      Pose stretch2 = PoseOrganizer.randomStretchPose();
      while (stretch2.equals(stretch1)) { // makes sure we have no duplicates
        stretch2 = PoseOrganizer.randomStretchPose();
      }
      
      // add the stretches
      addDeepStretch(stretch1);
      addDeepStretch(stretch2);
            
      // (5) FINAL RELAXATION
      
      // select random relaxation
      Meditation r = MeditationOrganizer.randomRelaxation();
      addRelaxation(r);
      
      
    } else if (length == 60) {
      
      // (1) MINDFULNESS
      
      // select random mindfulness
      Meditation m = MeditationOrganizer.randomMindfulness();
      addMindfulness(m);
      
      // (2) WARM-UP
      
      // select 2 spine stretches
      Pose spine1 = PoseOrganizer.randomWarmUpPose();
      Pose spine2 = PoseOrganizer.randomWarmUpPose();
      while (spine2.equals(spine1)) { // makes sure we have no duplicates
        spine2 = PoseOrganizer.randomWarmUpPose();
      }
      
      // add the stretches
      addWarmUp(spine1);
      addWarmUp(spine2);
      
      // add sun sals (x2)
      addWarmUp("Sun salutation x 2");
      
      // (3) WORKOUT
      
      // FLOW 1: (should only have Beginner intensity)
      addWorkout("*Flow 1 w/ dumbbells*");
      // 3 standing exercises (R)
      Pose stand1 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand1); // can no longer select this pose for this class plan
      Pose stand2 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand2);
      Pose stand3 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING, PoseIntensity.BEGINNER);
      PoseOrganizer.remove(stand3);
      
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      // same 3 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand1);
      addWorkout(stand2);
      addWorkout(stand3);
      
      
      // FLOW 2:
      addWorkout("\n*Flow 2 w/ dumbbells*");
      // 2 standing exercises (R)
      Pose stand4 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand4); // can no longer select this pose for this class plan
      Pose stand5 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.STANDING);
      PoseOrganizer.remove(stand5);
      
      addWorkout(stand4);
      addWorkout(stand5);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(stand4);
      addWorkout(stand5);
      
      // FLOW 3:
      addWorkout("\n*Flow 3 w/ dumbbells*");
      // 2 standing exercises (R)
      Pose down1 = PoseOrganizer.randomWorkoutDumbbellPose(StartingPosition.ALLFOURS);
      PoseOrganizer.remove(down1); // can no longer select this pose for this class plan
      Pose down2 = PoseOrganizer.randomWorkoutPose(StartingPosition.ALLFOURS, StartingPosition.PRONE);
      PoseOrganizer.remove(down2);
      
      addWorkout(down1);
      addWorkout(down2);
      
      // same 2 standing exercises (L)
      addWorkout(" - Repeat L - ");
      addWorkout(down1);
      addWorkout(down2);
      
      // re-add the poses we removed (so they can be used again for other class plans)
      PoseOrganizer.add(stand1);
      PoseOrganizer.add(stand2);
      PoseOrganizer.add(stand3);
      PoseOrganizer.add(stand4);
      PoseOrganizer.add(stand5);
      PoseOrganizer.add(down1);
      PoseOrganizer.add(down2);
      
      // (4) DEEP STRETCH
      
      addDeepStretch(" - move dumbbells to side -");
      // select 2 deep stretches
      Pose stretch1 = PoseOrganizer.randomStretchPose();
      Pose stretch2 = PoseOrganizer.randomStretchPose();
      while (stretch2.equals(stretch1)) { // makes sure we have no duplicates
        stretch2 = PoseOrganizer.randomStretchPose();
      }
      
      // add the stretches
      addDeepStretch(stretch1);
      addDeepStretch(stretch2);
            
      // (5) FINAL RELAXATION
      
      // select random relaxation
      Meditation r = MeditationOrganizer.randomRelaxation();
      addRelaxation(r);
      
    }
  }
  
  // adding helper methods
  private void addMindfulness(Object o) {
    plan.get(MINDFULNESS).add(o);
  }
  
  private void addWarmUp(Object o) {
    plan.get(WARMUP).add(o);
  }
  
  private void addWorkout(Object o) {
    plan.get(WORKOUT).add(o);
  }
  
  private void addDeepStretch(Object o) {
    plan.get(STRETCHES).add(o);
  }
  
  private void addRelaxation(Object o) {
    plan.get(RELAXATION).add(o);
  }
  
  // additional helper methods
  private void addSunSals() {
    // add sun sals to the warm up
  }
  
  // getters
  
  // printing
  public String toString() {
    String s = "MINDFULNESS\n";
    for (int i = 0; i < plan.get(MINDFULNESS).size(); i++) {
      s += plan.get(MINDFULNESS).get(i) + "\n";
    }
    
    s += "\nWARM UP\n";
    for (int i = 0; i < plan.get(WARMUP).size(); i++) {
      s += plan.get(WARMUP).get(i) + "\n";
    }
    
    s += "\nWORK OUT\n\n";
    for (int i = 0; i < plan.get(WORKOUT).size(); i++) {
      s += plan.get(WORKOUT).get(i) + "\n";
    }
    
    s += "\nDEEP STRETCHES\n";
    for (int i = 0; i < plan.get(STRETCHES).size(); i++) {
      s += plan.get(STRETCHES).get(i) + "\n";
    }
    
    s += "\nFINAL RELAXATION\n";
    for (int i = 0; i < plan.get(RELAXATION).size(); i++) {
      s += plan.get(RELAXATION).get(i) + "\n";
    }
    
    return s;
  }
  
  public String printWithCues() {
    String s = "MINDFULNESS\n";
    Pose poseTemp;
    Meditation medTemp;
    for (int i = 0; i < plan.get(MINDFULNESS).size(); i++) {
      if (plan.get(MINDFULNESS).get(i) instanceof Meditation) {
        medTemp = (Meditation) plan.get(MINDFULNESS).get(i);
        s += medTemp.planPrint() + "\n\n";
      } else {
        s += plan.get(MINDFULNESS).get(i) + "\n";
      }
    }
    
    s += "\nWARM UP\n";
    for (int i = 0; i < plan.get(WARMUP).size(); i++) {
      if (plan.get(WARMUP).get(i) instanceof Pose) {
        poseTemp = (Pose) plan.get(WARMUP).get(i);
        s += poseTemp.planPrint() + "\n\n";
      } else {
        s += plan.get(WARMUP).get(i) + "\n";
      }
    }
    
    s += "\nWORK OUT\n\n";
    for (int i = 0; i < plan.get(WORKOUT).size(); i++) {
      if (plan.get(WORKOUT).get(i) instanceof Pose) {
        poseTemp = (Pose) plan.get(WORKOUT).get(i);
        s += poseTemp.planPrint() + "\n\n";
      } else {
        s += plan.get(WORKOUT).get(i) + "\n";
      }
    }
    
    s += "\nDEEP STRETCHES\n";
    for (int i = 0; i < plan.get(STRETCHES).size(); i++) {
      if (plan.get(STRETCHES).get(i) instanceof Pose) {
        poseTemp = (Pose) plan.get(STRETCHES).get(i);
        s += poseTemp.planPrint() + "\n\n";
      } else {
        s += plan.get(STRETCHES).get(i) + "\n";
      }
    }
    
    s += "\nFINAL RELAXATION\n";
    for (int i = 0; i < plan.get(RELAXATION).size(); i++) {
      if (plan.get(RELAXATION).get(i) instanceof Meditation) {
        medTemp = (Meditation) plan.get(RELAXATION).get(i);
        s += medTemp.planPrint() + "\n\n";
      } else {
        s += plan.get(RELAXATION).get(i) + "\n";
      }
    }
    
    return s;
  }
  
  

  
}

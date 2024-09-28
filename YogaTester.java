import java.util.ArrayList;

public class YogaTester {

  /**
   * Tests validity of all Pose-related constructors
   * 
   * @return true if all tests pass
   */
  public static boolean testPoseConstructor() {
    
    // TEST 1: Pose constructor
    Pose p = new Pose("Downdog", "Hips up and back", 
                      StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false);
    if (!p.getName().equals("Downdog")) return false;
    if (p.getPosition() != StartingPosition.ALLFOURS) return false;
    if (p.getIntensity() != PoseIntensity.BEGINNER) return false;
    if (p.hasSides()) return false;
    
    // TEST 2: YogaPose constructor
    YogaPose y = new YogaPose("Crescent lunge", "R knee over R ankle, L heel towards the ceiling",
                              StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
                              false);
    if (!y.getName().equals("Crescent lunge")) return false;
    if (y.getPosition() != StartingPosition.STANDING) return false;
    if (y.getIntensity() != PoseIntensity.BEGINNER) return false;
    if (!y.hasSides()) return false;
    if (!y.hasDumbbellOption()) return false;
    if (y.isDeepStretch()) return false;
    if (y.isSpineStretch()) return false;
    
    // TEST 3: Pilates constructor
    Pilates pL = new Pilates("Toe taps", "Knees over hips", StartingPosition.SUPINE, 
                             PoseIntensity.BEGINNER, false, true);
    if (!pL.getName().equals("Toe taps")) return false;
    if (pL.getPosition() != StartingPosition.SUPINE) return false;
    if (pL.getIntensity() != PoseIntensity.BEGINNER) return false;
    if (pL.hasSides()) return false;
    if (!pL.isWarmUp()) return false;
    
    return true;
  }
  
  /**
   * Tests validity of PoseOrganizer add() and relevant error-catching capabilities
   * 
   * @return true if all tests pass
   */
  public static boolean testPoseOrganizerAdd() {
    
    // TEST 1: add(Pose p) function
    // 1a: adding should add the Pose to allPoses, hence PoseOrganizer "contains" the Pose
    YogaPose y = new YogaPose("Warrior 2", "R knee over R ankle, L heel pivots down",
                              StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
                              false); // auto adds to PoseOrganizer
    if (!PoseOrganizer.contains(y)) return false;
    
    // 1b: test if a YogaPose is added to the correct ArrayList
    // y should be added to workoutPoses, and no other YogaPose-related ArrayLists
    if (PoseOrganizer.getWarmUpPoses().contains(y)) return false;
    if (PoseOrganizer.getStretchPoses().contains(y)) return false;
    if (!PoseOrganizer.getWorkoutPoses().contains(y)) return false;
    
    // 1c: test if another YogaPose is added to the correct ArrayList
    YogaPose y2 = new YogaPose("Cat Cow", "Wrists under shoulders, knees under hips",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false, false, false,
        true);
    // y2 should be added to warmUpPoses, and no other YogaPose-related ArrayLists
    if (!PoseOrganizer.getWarmUpPoses().contains(y2)) return false;
    if (PoseOrganizer.getStretchPoses().contains(y2)) return false;
    if (PoseOrganizer.getWorkoutPoses().contains(y2)) return false;
    
    // 1d: test if a Pilates exercise is added to the correct ArrayList
    Pilates pL = new Pilates("Lateral breathing", "Hands rest on ribcage", StartingPosition.SUPINE, 
        PoseIntensity.BEGINNER, false, true);
    // pL should be added to pilatesExercises AND pilatesWarmUp
    if (!PoseOrganizer.getPilatesExercises().contains(pL)) return false;
    if (!PoseOrganizer.getPilatesWarmUp().contains(pL)) return false;
        
    
    // TEST 2: errors in adding pose
    
    // 2a: no duplicates are allowed
    try {
      PoseOrganizer.add(y);
      return false; // no exception was thrown when it should have been; it's a broken implementation
    } catch (IllegalArgumentException e) {
      // make sure we caught the right kind of error, if so we can continue with our other tests
      // nothing happens
    }
 
    // 2b: only YogaPose or Pilates type can be added (not generic Pose)
    Pose p = new Pose("Downdog", "Hips up and back", 
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false);
    try {
      PoseOrganizer.add(p);
      return false; // no exception was thrown when it should have been; it's a broken implementation
    } catch (IllegalArgumentException e) {
      // make sure we caught the right kind of error, if so we can continue with our other tests
      // nothing happens
    }
    
    return true;
  }
  
  /**
   * Tests validity of PoseOrganizer remove(), clear() methods
   * and relevant error-catching capabilities
   * 
   * @return true if all tests pass
   */
  public static boolean testPoseOrganizerRemoveClear() {
    
    // TEST 1: remove(Pose p)
    YogaPose warrior3 = new YogaPose("Warrior 3", "Transfer weight into R leg",
        StartingPosition.STANDING, PoseIntensity.INTERMEDIATE, true, true, false,
        false);
    
    // 1a: check if removing truly removes
    PoseOrganizer.remove(warrior3);
    if (PoseOrganizer.contains(warrior3)) return false;
    
    // warrior 3 would have been added to workoutPoses, make sure it isn't here either after removal
    if (PoseOrganizer.getWorkoutPoses().contains(warrior3)) return false;
    
    // 1b: errors in removing pose
    try {
      PoseOrganizer.remove(warrior3); // warrior3 was already removed, should throw error
      return false; // no exception was thrown when it should have been; it's a broken implementation
    } catch (IllegalArgumentException e) {
      // make sure we caught the right kind of error, if so we can continue with our other tests
      // nothing happens
    }
    
    // TEST 2; clear()
    PoseOrganizer.clear(); // all PoseOrganizer ArrayLists should be empty now
    if (PoseOrganizer.getWarmUpPoses().size() != 0) return false;
    if (PoseOrganizer.getStretchPoses().size() != 0) return false;
    if (PoseOrganizer.getWorkoutPoses().size() != 0) return false;
    if (PoseOrganizer.getPilatesWarmUp().size() != 0) return false;
    if (PoseOrganizer.getPilatesExercises().size() != 0) return false;
    if (PoseOrganizer.getAllPoses().size() != 0) return false;
    
    return true;
  }
  
  /**
   * tests random generators for PoseOrganizer class
   * 
   * @return true if all tests pass
   */
  public static boolean testPoseOrganizerRandomGenerating() {
    PoseOrganizer.clear();
    
    // set up poses (will automatically be added to PoseOrganizer)
    YogaPose warrior3 = new YogaPose("Warrior 3", "Transfer weight into R leg",
        StartingPosition.STANDING, PoseIntensity.INTERMEDIATE, true, true, false,
        false);
    
    YogaPose y = new YogaPose("Warrior 2", "R knee over R ankle, L heel pivots down",
        StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
        false);
    
    YogaPose plank = new YogaPose("Plank", "Wrists under shoulders",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false, false, false,
        false);
    
    YogaPose y2 = new YogaPose("Cat Cow", "Wrists under shoulders, knees under hips",
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false, false, false,
        true);
    
    // TEST 1: tests if randomPose selects only from what we've added
    Pose rand1 = PoseOrganizer.randomPose();
    if (!(rand1.equals(warrior3) || rand1.equals(y) || rand1.equals(y2) || rand1.equals(plank))) return false;
    
    // TEST 2: testing specific random generators
    Pose workoutRand = PoseOrganizer.randomWorkoutPose();
    if (!(workoutRand.equals(warrior3) || workoutRand.equals(y) || workoutRand.equals(plank))) return false;
    
    Pose warmUpRand = PoseOrganizer.randomWarmUpPose();
    if (!(warmUpRand.equals(y2))) return false;
    
    // TEST 3: testing random workoutPose generator for specific StartingPosition
    Pose standing = PoseOrganizer.randomWorkoutPose(StartingPosition.STANDING);
    if (!(standing.equals(warrior3) || standing.equals(y))) return false;
    
    Pose allFours = PoseOrganizer.randomWorkoutPose(StartingPosition.ALLFOURS);
    if (!(allFours.equals(plank))) return false;
    
    // TEST 4: error throwing - when there are no poses to choose from
    PoseOrganizer.clear();
    try {
      PoseOrganizer.randomPose(); // can't generate a pose (there are none to choose from)
      return false; // no exception was thrown when it should have been; it's a broken implementation
    } catch (IllegalStateException e) {
      // make sure we caught the right kind of error, if so we can continue with our other tests
      // nothing happens
    }
    
    return true;
  }
  
  /**
   * tests basic functionality for MeditationOrganizer class
   * 
   * @return true if all tests pass
   */
  public static boolean testMeditationOrganizer() {
    
    // TEST 1: testing add() function
    Mindfulness m = new Mindfulness("Deep breathing", "Inhale, exhale");
    // auto adds to MeditationOrganizer
    if (!MeditationOrganizer.contains(m)) return false;
    // check if in correct arraylist
    if (!MeditationOrganizer.getMindfulness().contains(m)) return false;
    if (MeditationOrganizer.getRelaxation().contains(m)) return false;
    
    // 1b: testing add() error catching
    try {
      Mindfulness mDup = new Mindfulness("Deep breathing", "Inhale, exhale"); // no duplicates allowed
      return false; // no exception was thrown when it should have been; it's a broken implementation
    } catch (IllegalArgumentException e) {
      // make sure we caught the right kind of error, if so we can continue with our other tests
      // nothing happens
    }
    
    // TEST 2: testing random generating function
    Mindfulness m2 = new Mindfulness("Body awareness", "Inhale, exhale");
    Relaxation r = new Relaxation("Body relaxation", "Check in with body");
    
    Meditation rand1 = MeditationOrganizer.randomMeditation();
    if (!(rand1.equals(m) || rand1.equals(m2) || rand1.equals(r))) return false;
    
    Meditation randRelax = MeditationOrganizer.randomRelaxation();
    if (!(randRelax.equals(r))) return false;
    
    return true;
  }
  
  /**
   * tests getters and setters for Pose, YogaPose, and Pilates
   * 
   * @return true if all tests pass
   */
  public static boolean testGetterSetters() {
    
    // TEST 1: Pose
    Pose p = new Pose("Downdog", "Hips up and back", 
        StartingPosition.ALLFOURS, PoseIntensity.BEGINNER, false);
    if (p.getIntensity() != PoseIntensity.BEGINNER) return false;
    
    // change intensity and hasSides
    p.setIntensity(PoseIntensity.INTERMEDIATE);
    p.setHasSides(true);
    if (p.getIntensity() != PoseIntensity.INTERMEDIATE) return false;
    if (p.hasSides() != true) return false;

    // TEST 2: YogaPose
    YogaPose y = new YogaPose("Crescent lunge", "R knee over R ankle, L heel towards the ceiling",
                    StartingPosition.STANDING, PoseIntensity.BEGINNER, true, true, false,
                    false);
    y.setDumbbellOption(false);
    y.setSpineStretch(true);
    if (y.hasDumbbellOption() != false) return false;
    if (y.isSpineStretch() != true) return false;
    
    // TEST 3: Pilates
    Pilates pL = new Pilates("Toe taps", "Knees over hips", StartingPosition.SUPINE, 
                   PoseIntensity.BEGINNER, false, true);
    pL.setWarmUp(false);
    if (pL.isWarmUp() != false) return false;

    return true;
  }
  
  /**
   * tests constructor, getters and setters, and clear() methods for Cues class
   * 
   * @return true if all tests pass
   */
  public static boolean testCues() {
    
    // TEST 1: test constructor
    // 1a: constructor works properly
    String setUp = "Hips up and back";
    String eA = "Palms pressing into mat, slight bend in knees. Reach heels to the ground, neck is long.";
    String breathing = "none";
    String options = "bend knees more, 3-legged dog";
    String cuesToCreate = setUp + "/" + eA + "/" + breathing + "/" + options;
    Cues c = new Cues(cuesToCreate);
    
    if (!c.getSetup().equals(setUp)) return false;
    if (!c.getExecutionAlignment().equals(eA)) return false;
    if (!c.getBreathing().equals(breathing)) return false;
    if (!c.getOptions().equals(options)) return false;
    
    
    // 1b: constructor error throwing
    String tooManyCues = setUp + "/" + eA + "/" + breathing + "/" + options + "/Extra cue";
    try {
      Cues cError = new Cues(tooManyCues);
      return false; // no exception was thrown when it should have been; it's a broken implementation
    } catch (IllegalArgumentException e) {
      // make sure we caught the right kind of error, if so we can continue with our other tests
      // nothing happens
    }
    
    // TEST 2: getters and setters "none" functionality
    c.setBreathing(null);
    if (!c.getBreathing().equals("n/a")) return false;
    
    // TEST 3: clear() method should make sure cues array is empty
    c.clearCues();
    if (!c.getSetup().equals("n/a")) return false;
    if (!c.getExecutionAlignment().equals("n/a")) return false;
    if (!c.getBreathing().equals("n/a")) return false;
    if (!c.getOptions().equals("n/a")) return false;
    
    return true;
  }
  
  public static void setUpForGenerator() {
    
    Input.inputAll();    
    
  }
  
  /**
   * Simply makes sure the class plan generator for Yoga works without throwing errors
   * Can check out the printed plan to manually check, if need be
   * 
   * @return true if all tests pass
   */
  public static boolean testYogaPlanGenerator() {
    try {
      YogaClassPlan plan = new YogaClassPlan(ClassType.YOGA, 45);
      // System.out.println(plan);
      
      YogaClassPlan plan2 = new YogaClassPlan(ClassType.YOGA, 60);
      // System.out.println(plan2);
      
    } catch (Exception e) {
      return false; // no errors should be caught
    }
    
    return true;
  }
  
  /**
   * Simply makes sure the class plan generator for Powerflow works without throwing errors
   * Can check out the printed plan to manually check, if need be
   * 
   * @return true if all tests pass
   */
  public static boolean testPFPlanGenerator() {
    try {
      YogaClassPlan plan = new YogaClassPlan(ClassType.POWERFLOW, 45);
      // System.out.println(plan.printWithCues());
      
      YogaClassPlan plan2 = new YogaClassPlan(ClassType.POWERFLOW, 60);
      // System.out.println(plan2);
      
    } catch (Exception e) {
      return false; // no errors should be thrown
    }
    
    return true;
  }
  
  /**
   * Simply makes sure the class plan generator for Yoga Stress Relief works without throwing errors
   * Can check out the printed plan to manually check, if need be
   * 
   * @return true if all tests pass
   */
  public static boolean testYSRPlanGenerator() {
    try {
      YogaClassPlan plan = new YogaClassPlan(ClassType.STRESS_RELIEF, 45);
      // System.out.println(plan);
      
      YogaClassPlan plan2 = new YogaClassPlan(ClassType.STRESS_RELIEF, 60);
      // System.out.println(plan2);
      
    } catch (Exception e) {
      return false; // no errors should be thrown
    }
    
    return true;
  }
  
  /**
   * Simply makes sure the class plan generator for Yoga Strength works without throwing errors
   * Can check out the printed plan to manually check, if need be
   * 
   * @return true if all tests pass
   */
  public static boolean testYSPlanGenerator() {
    try {
      YogaClassPlan plan = new YogaClassPlan(ClassType.YOGA_STRENGTH, 45);
      // System.out.println(plan.printWithCues());
      
      YogaClassPlan plan2 = new YogaClassPlan(ClassType.YOGA_STRENGTH, 60);
      // System.out.println(plan2);
      
    } catch (Exception e) {
      return false; // no errors should be thrown
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    // TESTS
    /*
    System.out.println("testPoseConstructor(): " + testPoseConstructor());
    System.out.println("testPoseOrganizerAdd(): " + testPoseOrganizerAdd());
    System.out.println("testPoseOrganizerRemoveClear(): " + testPoseOrganizerRemoveClear());
    System.out.println("testPoseOrganizerRandomGenerating(): " + testPoseOrganizerRandomGenerating());
    System.out.println("testMeditationOrganizer(): " + testMeditationOrganizer());
    System.out.println("testGetterSetters(): " + testGetterSetters());
    System.out.println("testCues(): " + testCues());
    setUpForGenerator(); // sets up all our poses we need for the generator testing
    System.out.println("testYogaPlanGenerator(): " + testYogaPlanGenerator());
    System.out.println("testPFPlanGenerator(): " + testPFPlanGenerator());
    System.out.println("testYSRPlanGenerator(): " + testYSRPlanGenerator());
    System.out.println("testYSPlanGenerator(): " + testYSPlanGenerator());
    */
    
    // ACTUAL CLASS GENERATING
    setUpForGenerator();
    YogaClassPlan plan = new YogaClassPlan(ClassType.POWERFLOW, 45);
    System.out.println(plan.printWithCues());
    
  }

}

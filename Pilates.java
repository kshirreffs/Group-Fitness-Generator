
/**
 * Class representing a pilates exercise
 */
public class Pilates extends Pose {

  // instance fields
  /**
   * indicates whether the Pilates exercise is a warmup movement
   */
  private boolean warmUp;
  
  // constructor
  public Pilates(String name, String cues, StartingPosition position, PoseIntensity intensity,
                 boolean hasSides, boolean warmUp) {
    super(name, cues, position, intensity, hasSides);
    this.warmUp = warmUp;
    
    // add this pose to PoseOrganizer
    PoseOrganizer.add(this);
  }
  
  // getters
  public boolean isWarmUp() {
    return warmUp;
  }
  
  // setters
  public void setWarmUp(boolean warmUp) {
    this.warmUp = warmUp;
  }
  
}
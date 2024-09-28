
/**
 * Class representing a yoga or pilates pose
 */
public class Pose {
  
  // instance fields
  private String name;
  private Cues cues;
  private PoseIntensity intensity;
  private StartingPosition position;
  /**
   * indicates whether the pose has a left and right side that are performed SEPARATELY
   *    (with different starting positions)
   * ex. toe taps WOULD NOT have sides (because the left and right are performed together)
   * ex. side kicks WOULD have sides (because must transition starting position to perform)
   */
  private boolean hasSides;
  
  // constructors
  /**
   * Creates a new yoga pose
   * Defaults are:
   * intensity: intermediate
   * pilates option: false
   * dumbbellOption: false
   * 
   * @param name - name of pose
   * @param setUpCue - first cue
   * @param position - starting position of pose
   */
  public Pose(String name, String cues, StartingPosition position, PoseIntensity intensity,
              boolean hasSides) {    
    this.name = name;
    this.cues = new Cues(cues);
    this.position = position;
    this.intensity = intensity;
    this.hasSides = hasSides;
  }
  
  // getters
  public String getName() {
    return name;
  }
  
  public Cues getCues() {
    return cues;
  }
  
  public PoseIntensity getIntensity() {
    return intensity;
  }
  
  public StartingPosition getPosition() {
    return position;
  }
  
  public boolean hasSides() {
    return hasSides;
  }
  
  // setters
  public void setName(String name) {
    this.name = name;
  }
  
  public void setCues(Cues cues) {
    this.cues = cues;
  }
  
  public void setIntensity(PoseIntensity intensity) {
    this.intensity = intensity;
  }
  
  public void setPosition(StartingPosition position) {
    this.position = position;
  }
  
  public void setHasSides(boolean hasSides) {
    this.hasSides = hasSides;
  }
  
  // other
  public boolean equals(Pose p) {
    if (p.getName().equals(this.name)) return true;
    return false;
  }
  
  // printing methods
  /**
   * only returns Pose name
   */
  public String toString() {
    return name;
  }
  
  /**
   * prints Pose basic info (except cues)
   */
  public String printBasicInfo() {
    return "Name: " + name + "\n"
        + "Starting position: " + position + "\n"
        + "Intensity: " + intensity + "\n"
        + "Has sides: " + hasSides;
  }
  
  /**
   * prints Pose info as it would appear in a class plan
   */
  public String planPrint() {
    return name + "\n"
        + cues;
  }

}

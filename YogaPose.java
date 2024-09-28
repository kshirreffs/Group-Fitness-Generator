
/**
 * Class representing a yoga pose
 */
public class YogaPose extends Pose {

  // instance fields
  private boolean dumbbellOption;
  private boolean deepStretch;
  private boolean spineStretch;

  // constructor
  public YogaPose(String name, String cues, StartingPosition position, PoseIntensity intensity,
                  boolean hasSides, boolean dumbbellOption, boolean deepStretch, 
                  boolean spineStretch) {
    super(name, cues, position, intensity, hasSides);
    this.dumbbellOption = dumbbellOption;
    this.deepStretch = deepStretch;
    this.spineStretch = spineStretch;
    
    // add this pose to PoseOrganizer
    PoseOrganizer.add(this);
  }
  
  // getters
  public boolean hasDumbbellOption() {
    return dumbbellOption;
  }
  
  public boolean isDeepStretch() {
    return deepStretch;
  }
  
  public boolean isSpineStretch() {
    return spineStretch;
  }
  
  // setters
  public void setDumbbellOption(boolean d) {
    dumbbellOption = d;
  }
  
  public void setDeepStretch(boolean d) {
    deepStretch = d;
  }
  
  public void setSpineStretch(boolean s) {
    spineStretch = s;
  }
  
}


/**
 * Class representing cues for a pose
 */
public class Cues {
  
  // instance fields
  private String[] cues = new String[5];
  
  // static fields
  private final static int SETUP_INDEX = 0;
  private final static int EXECUTION_ALIGNMENT_INDEX = 1;
  private final static int BREATHING_INDEX = 2;
  private final static int OPTIONS_INDEX = 3;
  
  /**
   * splits up cues by semicolon
   * 
   * @param cuesToAdd
   * @throws IllegalArgumentException if more than 4 cue "sections"
   */
  public Cues(String cuesToAdd) {
    String[] cuesArray = cuesToAdd.split("/"); // if no slash, it's only the setup cue
    if (cuesArray.length > 4) throw new IllegalArgumentException("Too many cues");
    for (int i = 0; i < cuesArray.length; i++) {
      cues[i] = cuesArray[i];
    }
  }
  
  // getters
  public String getSetup() {
    if (cues[SETUP_INDEX] == null) return "n/a";
    return cues[SETUP_INDEX];
  }
  
  public String getExecutionAlignment() {
    if (cues[EXECUTION_ALIGNMENT_INDEX] == null) return "n/a";
    return cues[EXECUTION_ALIGNMENT_INDEX];
  }
  
  public String getBreathing() {
    if (cues[BREATHING_INDEX] == null) return "n/a";
    return cues[BREATHING_INDEX];
  }
  
  public String getOptions() {
    if (cues[OPTIONS_INDEX] == null) return "n/a";
    return cues[OPTIONS_INDEX];
  }
  
  // setters
  public void setSetup(String s) {
    cues[SETUP_INDEX] = s;
  }
  
  public void setExecutionAlignment(String s) {
    cues[EXECUTION_ALIGNMENT_INDEX] = s;
  }
  
  public void setBreathing(String s) {
    cues[BREATHING_INDEX] = s;
  }
  
  public void setOptions(String s) {
    cues[OPTIONS_INDEX] = s;
  }
  
  // other  
  /**
   * prints out all cues
   */
  public String toString() {
    return "Set up: " + getSetup() + "\n"
        + "Execution/Alignment: " + getExecutionAlignment() + "\n"
        + "Breathing: " + getBreathing() + "\n"
        + "Options: " + getOptions();
  }
  
  /**
   * clears all cues
   */
  public void clearCues() {
    cues = new String[5];
  }
  
}

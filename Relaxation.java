
/**
 * Class representing a final relaxation meditation (for end of class)
 */
public class Relaxation extends Meditation {
  
  // constructor
  public Relaxation(String title, String script) {
    super(title, script);
    MeditationOrganizer.add(this);
  }

}

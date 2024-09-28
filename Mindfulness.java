
/**
 * Class representing a mindfulness meditation (for beginning of class)
 */
public class Mindfulness extends Meditation {

  //constructor
 public Mindfulness(String title, String script) {
   super(title, script);
   MeditationOrganizer.add(this);
 }
  
}

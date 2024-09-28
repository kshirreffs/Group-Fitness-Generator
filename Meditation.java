
/**
 * Class representing any sort of meditation (mindfulness or final relaxation)
 */
public class Meditation {
  
  //instance fields
  private String title;
  private String script;
  
  // constructor
  public Meditation(String title, String script) {
    this.title = title;
    this.script = script;
  }
  
  // getters
  public String getTitle() {
    return title;
  }
  
  public String getScript() {
    return script;
  }
  
  // setters
  public void setTitle(String title) {
    this.title = title;
  }
  
  public void setScript(String script) {
    this.script = script;
  }
  
  // other
  public boolean equals(Meditation m) {
    if (m.getTitle().equals(this.title)) return true;
    return false;
   }
  
  // printing
  public String toString() {
    return title;
  }
  
  public String planPrint() {
    return title + "\n" + script;
  }
}

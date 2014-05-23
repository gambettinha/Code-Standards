

trait Person

class Man extends Person
class Woman extends Person

// Wrong way because there is more boilerplate syntax 
// than anything else!! We want to only see the logic
object PersonSex {

  // This is the wrong way to do it. This is the same
  // as if(m instanceOf ...) in java. 
  def sex(person:Person):String = person match {
    case m:Man => "M"
    case w:Woman => "F"
  }
}


// This way is a lot less verbose and logic is consequently
// easier to read
object PersonSexNoPatternMatching {
  def sex(m:Man):String = "M"
  def sex(w:Woman):String = "W"
}

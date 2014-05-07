/**
 * In Scala it is a good practice to keep configuration in traits.
 * The main reason is that you can easily override them programmatically
 * using the fact that the last trait imported to a class will win in case of override
 */

// Default configuration
trait Configuration {
     lazy val defaultName:String = "default"
}

// Class using configuration
class Person extends Configuration {
     def getDefaultName:String = defaultName
}


// Configuration I want to use in a specific case, test for example
trait ConfigurationOverride extends Configuration{
     override lazy val defaultName:String = "override"
}


class PersonWithNewConfiguration extends Person with ConfigurationOverride

object OverrideConfiguration {
  new Person().getDefaultName                       //> res0: String = default
  new PersonWithNewConfiguration().getDefaultName   //> res1: String = override
}

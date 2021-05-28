import java.lang.Exception

/**
 * Often we need to represent a limited set of possibilites - A web request either succeed or fails ,
 * other ex user can only be a pro user or standard user
 * To model this we could use an enum but this carries a numner of limitations
 * Enum classes only allow a single instance of each value and can't encode more information on each type So for example,
 * For the error case - We can't have an associated exception
 * You could use an abstract class and number of extensions but this loses the restricted set of type advantage brought by enums
 * Sealed class provide the best of both worlds the freedom of representation of abstract classes and restricted set of
 * types of enums
 */

/**
 * Enum this carrier no of limitations  Enum class only allow single instance of each value and can't encode more information on each type
 */
enum class ResultEnum {
    Success,
    // Error(val exception : Exception) // we can't have an associated with exception
}

/**
 * Abstract Impl we could use an abstract class and a number of extensions but this loses the restricted set of type advantage by enums
 */
abstract  class Result<out T : Any>{
}

data class Success<out T : Any>(val data : T) : Result<T>()
data class Error(val exception: Exception) : Result<Nothing>()


/**
 * Sealed Classes
 * How to use sealed classes about autocomplete power brought by the ID under the hood at how sealed classes are implemented
 * in the decompiled java code
 * Like abstract classes sealed classes allow you to represent hierarchies. The child classes can be any type of class
 */

/**
 * Like Abstract classes sealed classes allow you to represent hierarchies. The child classes can be any type of classes
 * a data class, an object , a regular class or even another sealed class But unlike abstract classes, you have to define these
 * hierarchies in the same file or as nested classes. Trying to extend the sealed class outside the file. It was defined in yields a compiler
 * error
 * But what if we need to add a new type of result
 */

sealed class ResultSealed<out T : Any>{

    data class Success<out T : Any>(val data : T) : ResultSealed<T>()
    sealed class Error(val exception: Exception) : ResultSealed<Nothing>() {
        class RecoverableError(exception: Exception) : Error(exception)
        class NonRecoverableError(exception: Exception) : Error(exception)
    }
    object InProgress : ResultSealed<Nothing>()

}

/**
 * the compiler can give us an error if a branch is uncovered in sealed classes when we use when keyword
 * so to be exhaustive by producing a compiler error when it is used as an expression
 * As all subtypes of a sealed class are know the id can fill all possible branches of a when statement for us
 * SDID ca recognize all branches The id will generate all of these branches. This is type of functionality that can't be
 * implement in abstract classes as the compiler doesn't know the inheritance, hierarchy therefore the
 * id can't generate the branches
 * so what make sealed class internal structure allowing the compiler to use private default constructor and , metadata keeps child classes abstract class
 * use synthetic constructor that can only be used by the kotlin compiler. so this means no other class coll the constructor from outside.
 */
fun handleResult(result: ResultSealed<Int>) {
    val actions = when(result) {

        is ResultSealed.Success -> {
        }
        ResultSealed.InProgress -> {
        }
        is ResultSealed.Error.NonRecoverableError -> {
        }

        is ResultSealed.Error.RecoverableError -> {

        }
    }
    actions.exhaustive // if the branch is missing compiler give an error
}


val <T> T.exhaustive : T
    get() = this

package kt.oops

fun main(args:Array<String>){

    var user= user("iniyan", "iniyan455@gmail.com", "9894591650")
    var name=user.username
    println(name)
}


class user(name:String,email:String,mobileno:String){

    private var _name:String?=null
    private var _email:String?=null
    private var _mobileno:String?=null
     init {
         _name=name
         _email=email
         _mobileno=mobileno
     }
    var username:String?
    get() =_name
    set(value){
            _name=value
    }

    var emailaddress:String?
    get()=_email
    set(value){
        _email=value
    }
    var mobileNumber :String?
    get()=_mobileno
    set(value){
        _mobileno=value
    }
}
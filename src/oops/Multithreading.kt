package oops

fun main(args:Array<String>){
    /**
     * Multithreading
     * In computer architecture multithreading is the ability of central processing unit or a single core in a
     * multi core processor to exceute multiple process or threads concurrently or appropriately supported by
     * the operating system
     */

    
    /**
     * What is thread
     * In computer science, a thread of execution of smallest sequence of programmed instructions that can be managed by
     * schedular which typically a part of the operating system
     *
     * My Threading simply means
     * executing multiple thread simulataneously
     *
     * why multithreading
     * Multithreading provides simulateaneous execution of two or more parts of a program to maximum utilize the cpu time
     *
     * why synchronous programming
     * In synchronous prrogramming the program is executed line by line one line at a time
     *
     * what is asyncronous programming
     *  we allow multiple threads to be executed at the same time (ex Railway track at a time two train will run )
     */

    var lion= AnimalThread("Lion")
    lion.start()

  //  lion.join() // this method will all the lion values first next it will go to other threads

    var tiger= AnimalThread("oops.Tiger")
    tiger.start()


    var elephant= AnimalThread("Elephant")
    elephant.start()

}

class AnimalThread :Thread{

    var animalName:String?=null
    constructor(name:String){

        animalName=name
    }

    override fun run() {
        super.run()
       var counter=0
        while (counter<5 ){
            println("$animalName"+"-"+counter)
            counter++
            try {
                Thread.sleep(2000)
            }catch (e:InterruptedException){
                e.printStackTrace()
            }

        }


    }

}

class Async<T, U, V>(){
//
//    inner  class DownloadingDataTask:AsyncTask<String,Int,List<String>>(){
//
//        override  fun doInBackground (vararg params :String?):List<String>{
//         // can access background thread not oops.user interface thread
//        }
//
//        override  fun onPostExecute (result: List<T>){
//        // can access oops.user interface thread Not a background thread
//        }
//    }

}
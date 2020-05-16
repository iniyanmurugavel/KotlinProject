import java.util.*;
import java.util.stream.Collectors;

public class findDuplicateOccurance {
  public static  ArrayList<User> userList=new ArrayList<User>();
    public static  ArrayList<User> duplicateList = new ArrayList<User>();
    public static void main(String args[]){

        userList.add(new User("Iniyan",25));
        userList.add(new User("Karthick",25));
        userList.add(new User("Ashok",25));
        // Remove duplicates

       ArrayList<User> templist= new ArrayList<>();
       templist.add(new User("Iniyan",25));
       templist.add(new User("Iniyan",25));
        templist.add(new User("Kavya",25));
        List<User> originalList = removeDuplicates(templist);
        System.out.println("Original data withhout duplicate List");
        for(User user:originalList){
            System.out.println(user.getName() +"-" + user.getAge());
        }
      //  System.out.println("duplicate List");
//        for(User user:duplicateList){
//            System.out.println(user.getName() +"-" + user.getAge());
//        }
    }

    // Function to remove duplicates from an ArrayList
//    public static <T> List<User> removeDuplicates(ArrayList<User> list)
//    {
//        // Create a new LinkedHashSet
//        Set<User> set = new LinkedHashSet<>(userList);
//        // Add the elements to set
//       for(User t:list)
//       {
//           if(!set.add(t)){
//               System.out.println("iterate== > "+t.getName() +"-" + t.getAge());
//             //  set.add(t);
//              // duplicateList.add(t);
//           }
//
////           List<Integer> newList = list.stream()
////                   .distinct()
////                   .collect(Collectors.toList());
//
////           else
////               set.add(t);
//
//       }
//        userList.clear();
//        userList.addAll(set);
//        // return the list
//        return userList;
//    }


    public static List<User> removeDuplicates(ArrayList<User> list) {
        // Set set1 = new LinkedHashSet(list);
        Set set=new LinkedHashSet(userList);
         set = new TreeSet(new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (((User) o1).getName().equalsIgnoreCase(((User) o2).getName()) /*&&
                    ((Blog)o1).getName().equalsIgnoreCase(((Blog)o2).getName())*/) {
                    return 0;
                }
                return 1;
            }
        });
        set.addAll(list);

        final List newList = new ArrayList(set);
        return newList;
    }
}

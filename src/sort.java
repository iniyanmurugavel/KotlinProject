import jdk.nashorn.api.scripting.JSObject;

import java.util.*;

public class sort {
    public static List<User> userList=new ArrayList<User>();


    public static String jsonString="{\n" +
            "\t\"txnId\": \"85378935997\",\n" +
            "\t\"errorCode\": \"ESP-944\",\n" +
            "\t\"errorMsg\": \"User terminated eKYC process.\"\n" +
            "}";
    public static void main(String args[]){
        userList.add(new User("Iniyan",25));
        userList.add(new User("Karthick",25));
        userList.add(new User("Ashok",25));
     TreeSet<User> ts1 = new TreeSet<User>(userList);
       // Collections.sort(userList);
        for(User user:ts1){
            System.out.println(user.getName()+"=="+user.getAge());
        }

        /* Sort statement*/

//        Collections.sort(userList, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return Integer.compare(o2.getName(), o1.getName());
//            }
//        });

       // JSONObject jsonObject=new JSObject()
    }
}

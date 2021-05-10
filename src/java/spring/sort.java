package java.spring;

import java.util.*;

public class sort {
    public static List<User> userList=new ArrayList<User>();


    public static String jsonString="{\n" +
            "\t\"txnId\": \"85378935997\",\n" +
            "\t\"errorCode\": \"ESP-944\",\n" +
            "\t\"errorMsg\": \"java.spring.User terminated eKYC process.\"\n" +
            "}";
    public static void main(String args[]){
        userList.add(new User("Iniyan",25));
        userList.add(new User("Karthick",25));
        userList.add(new User("Ashok",25));
     TreeSet<User> ts1 = new TreeSet<User>(userList);
       // Collections.java.spring.sort(userList);
        for(User user:ts1){
            System.out.println(user.getName()+"=="+user.getAge());
        }

        /* Sort statement*/

//        Collections.java.spring.sort(userList, new Comparator<java.spring.User>() {
//            @Override
//            public int compare(java.spring.User o1, java.spring.User o2) {
//                return Integer.compare(o2.getName(), o1.getName());
//            }
//        });

       // JSONObject jsonObject=new JSObject()
    }
}

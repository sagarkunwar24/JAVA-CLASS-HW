

import java.util.ArrayList;

public class ArrayAndLoop{

public static void main(String[] args){

ArrayList<String> people = new ArrayList<String>();

people.add("John");
people.add("James");
people.add("jack");
people.add("Josh");
people.add("Jian");

for (int i=0; i < people.size();i++){

if (people.get(i).equals("James")) {

System.out.println(people.get(i)+ " is present here. His roll no is "+ (i+1)+ ".");

break;
    }
}
  }
}



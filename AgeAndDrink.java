#ArrayList with if and else

import java.util.ArrayList;

public class AgeAndDrink{

public static void main(String[] args){

ArrayList<String> names = new ArrayList<String>();

names.add("Krishna");
names.add("Jamuna");
names.add("Sarika");
names.add("Sangita");
names.add("Sharmila");
names.add("Sagar");
names.add("Suraxya");

ArrayList<Integer> ages = new ArrayList<Integer>();

ages.add(61);
ages.add(60);
ages.add(39);
ages.add(20);
ages.add(35);
ages.add(17);
ages.add(15);

for (int i =0; i <= ages.size();i++){

if (ages.get(i) >= 21) {

System.out.println(names.get(i) + " are "+ ages.get(i) + " old. You can drink and drive.");
}

else if (ages.get(i) < 21 && ages.get(i) >= 16){

System.out.println(names.get(i)+ " are "+ ages.get(i)+ " old. You can drive but not drink.");

}
else {
System.out.println(names.get(i)+ " are "+ ages.get(i) + " old. You can not neither drink nor drive.");

  }
}
System.out.println("");

  }

}

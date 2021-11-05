package CollectionsAndGenerics;

public class TestArraySimple {

    public static void main (String args[]){

    int values [] = new int [2];
    Object valuesTwo[] = new Object[2];

        valuesTwo[0]="Opp";
        valuesTwo[1]=7;

        for (Object value:valuesTwo){

            System.out.println("value object in 0 :"+value);

        }



    }

}

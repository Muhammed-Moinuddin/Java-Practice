import java.util.*;
//By M.Moinuddin
public class Hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        System.out.println("\t\t\t\tCountries Population in crores!\n");
        countryPopulation.put("Pakistan", 24);
        countryPopulation.put("Iran", 9);
        countryPopulation.put("India", 130);
        countryPopulation.put("China", 150);
        countryPopulation.put("Afghanistan", 4);
        System.out.println("\t\t\t\tAdded countries with their respective population.");
        System.out.println("\t\t\t\tCurrent Country Populations:" + countryPopulation + "\n");
        System.out.println("\t\t\t\tRetrieving Population of specific countries.");
        System.out.println("\t\t\t\tPakistan population is: " + countryPopulation.get("Pakistan") + "\n");
        String country1 = "India";
        String country2 = "Indonesia";
        if(countryPopulation.containsKey(country1)){
            System.out.println("\t\t\t\t" + country1 + " population is "+ countryPopulation.get(country1) + " crores");
        } else {
            System.out.println("\t\t\t\t" + country1 + " population NOT FOUND ");
        }
        if(countryPopulation.containsKey(country2)){
            System.out.println("\t\t\t\t" + country2 + " population is "+ countryPopulation.get(country2) + " crores");
        } else {
            System.out.println("\t\t\t\t" + country2 + " population NOT FOUND ");
        }
        System.out.println("\t\t\t\tUpdating Countries's population");
        countryPopulation.put("Afghanistan", 5);
        System.out.println("\t\t\t\tUpdated Country Populations:" + countryPopulation + "\n");
        System.out.println("\t\t\t\tDeleting some data");
        countryPopulation.remove("Iran");
        System.out.println("\t\t\t\tUpdated Country Populations:" + countryPopulation + "\n");
        //checking both key and value..
        boolean isRemoved = countryPopulation.remove("Pakistan", 10);
        System.out.println("\t\t\t\tWas Pakistan removed from data? " + isRemoved);
        for(HashMap.Entry<String, Integer> entry : countryPopulation.entrySet()){
            System.out.println("\t\t\t\tCountry: " + entry.getKey() + ", Population: " + entry.getValue() + " crores");
        }
        boolean hasPopulation100 = countryPopulation.containsValue(100);
        System.out.println("\t\t\t\tDoes data contain country having population of 100crores? " + hasPopulation100);
        System.out.println("\t\t\t\tFinal number of entries in the Data: " + countryPopulation.size());
    }   
}

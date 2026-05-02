/*
Question: 1
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package 
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAge.0ncies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
have more than one package type. Travel agency and package type combination is unique. All the searches should 
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
4

123
A2Z Agency
Platinum
50000
true

345
SSS Agency
Gold
30000
false

987
Cox and Kings
Diamond
40000
true

888
Global Tours
Silver
20000
false

987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000
urp-frsu-mwy
*/

import java.util.Scanner;

class TravelAgencies {
    private int regno;
    private String agency_name;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regno, String agency_name, String packageType, int price, boolean flightFacility) {
        this.regno = regno;
        this.agency_name = agency_name;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getAgency_name() {
        return agency_name;
    }

    public void setAgency_name(String agency_name) {
        this.agency_name = agency_name;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

    
}
public class Travel {

      static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
        int max = 0;

        for (TravelAgencies agency : arr) {
            if (agency.getPrice() > max) {
                max = agency.getPrice();
            }
        }

        return max;

      }

      static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] arr,int regNo,String packageType){

             for(TravelAgencies agency : arr){

                if (agency.isFlightFacility() && agency.getRegno() == regNo && agency.getPackageType().equalsIgnoreCase(packageType)){

                    return agency;
                }
            }
            return null;
      }
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TravelAgencies[] arr = new TravelAgencies[n];
        for (int i = 0 ;i < n;i++){

            int regNo = sc.nextInt();
            sc.nextLine();
            String agency_name = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();

            TravelAgencies t = new TravelAgencies(regNo,agency_name,packageType,price,flightFacility);

            arr[i] = t;


        }

          int regNo = sc.nextInt();
          sc.nextLine();
          String packageType = sc.nextLine();
          System.out.println("--------------------\nOUTPUT\n--------------------");

          int highestPrice = findAgencyWithHighestPackagePrice(arr);
          TravelAgencies agency = agencyDetailsForGivenldAndType(arr, regNo, packageType);

          System.out.println(highestPrice);

          if(agency!= null){
            System.out.println(agency.getAgency_name()+":" + agency.getPrice());
          }



   
    }
}

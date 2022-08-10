public class VehicleDemo
{
   public static void process(Vehicle v, String plateNumber)
   {
      // This example shows the syntax of instanceof and casting
      if (v instanceof Car) 
      {
         Car c = (Car) v; // Vehicle has no setLicensePlateNumber method--must cast
         c.setLicensePlateNumber(plateNumber);
      }

      System.out.println(v); // calls v.toString()
   }

}

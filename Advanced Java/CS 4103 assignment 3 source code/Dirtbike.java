public class Dirtbike extends Motorcycle
{
    String make;
    String model;
    public Dirtbike()
    {
        make = "honda";
        model = "sport";
    }

    public String getModel()
    {
        return make;
    }

    public String gettype()
    {
        return model;
    }
    public String toString() 
   {
      return super.toString() + "[make=" + make + "]" + " " + "[model=" + model + "}";
      // This is a good way of implementing toString in a subclass--see Special Topic 9.6
   }

    public static void main(String[] args)
    {
        //VehicleDemo s = new VehicleDemo();
       Vehicle aCar = new Car(); 
       VehicleDemo.process(aCar, "XYX123"); 
 
       Vehicle aLimo = new Car(); 
       aLimo.setNumberOfTires(8);
       VehicleDemo.process(aLimo, "W00H00");
 
       VehicleDemo.process(new Motorcycle(), "MT1729");
       VehicleDemo.process(new Dirtbike(), "000000");
    }
}
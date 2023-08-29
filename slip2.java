 // Write a program to read the First Name and Last Name of a person, his weight and height using command line arguments. Calculate the BMI Index which is defined as the individual's body mass divided by the square of their height.
// (Hint : BMI = Wts. In kgs / (ht)2) 
class md
{
   public static void main(String arg[])
   {
     String fname=arg[0],lname=arg[1];
      double weight=Double.parseDouble(arg[2]);
    double height=Double.parseDouble(arg[3]);
  double bmi=weight/(height*height);
  System.out.println("persons BMI is:-"+bmi);
  }
}
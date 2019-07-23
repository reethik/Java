 public static void main (String [] args){
    //prompt user to input a number

    String input = JOptionPane.showInputDialog("Enter number "); 
    // change string to int
        int number = Integer.parseInt(input); 

    //display message to user of their results
        BigInteger num = new BigInteger(input); 

        String output = number + " is" + (BigInteger(input) ? " " : " not ") + "a prime number: " + BigInteger(input);

            JOptionPane.showMessageDialog (null, output);

}   



public static Boolean IsPrime(BigInteger num) {
    // check if number is a multiple of 2
    if (num.mod(new BigInteger("2")).compareTo(BigInteger.ZERO) == 0) {
      return false;
    }// if not, then just check the odds
    for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(num) <= 0; i =
        i.add(new BigInteger("2"))) {
      if (num.mod(i).compareTo(BigInteger.ZERO) == 0) {

       return false;
      }
    }
    return true;
  }

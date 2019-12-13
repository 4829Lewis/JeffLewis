public class claimDOB {
        public static String returnRandom() {

            // This needs to be redone to take in a DOB and convert it according to the Story, which is to date the DOB ( Subscriber or Dependent)
            // to a date + or - 1 to 10 days - that has not been done with this class.

            String[]name = {""};

            int randomVal = (int) (Math.random() * name.length);
            return name[randomVal];
        }
    }

public class patientControlNumber {
        public static String returnRandom() {

            // This needs to change the Patient Control Number - need to verify how this is going to have to change

            String[]controlNumber = {"1234567890"};

            int randomVal = (int) (Math.random() * controlNumber.length);
            return controlNumber[randomVal];
        }
    }

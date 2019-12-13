import java.util.Random;

public class claimMemberID {
        public static int getRandomNumberInRange(int min, int max){

            // This Class will need to be able to ensure what it returns will work for all payers/claims/situations, if not,
            // this will have to be modified.  IG states that max characters for this field are 20, characters beyond the max are not
            // required to be stored nor returned by any 837 receiving system.

            Random r = new Random();

            return r.ints(min, (max - 1)).findFirst().getAsInt();
        }
    }


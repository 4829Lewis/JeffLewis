import java.util.*;

public class claimState {

    // By changing the state, isn't this going to make existing Zip codes to be invalid??  Not sure if this is going to be needed

        public static String returnRandom() {

            String[]state = {"IA", "OK", "GA", "OH", "CA", "FL", "NY"};

            int randomVal = (int) (Math.random() * state.length);
            return state[randomVal];
        }
    }

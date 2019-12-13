public class claimCityStateZip {

    public static String returnRandom() {

        String[]state = {
                "IA", "OK", "FL", "MA", "CA"};

        int randomVal = (int) (Math.random() * state.length);
        return state[randomVal];
    }
}

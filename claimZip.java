import java.util.Random;

public class claimZip {

    public static String returnRandom() {

        // By changing the Zip this will cause problems, regarding the state which the zip is associated with

        String[]zip = {""};

        int randomVal = (int) (Math.random() * zip.length);
        return zip[randomVal];
    }
}


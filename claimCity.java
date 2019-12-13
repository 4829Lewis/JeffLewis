public class claimCity {

    public static String returnRandom() {

        String[]city = {"Dubuque", "Tulsa", "Miami", "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford",
                "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort",
                "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln",
                "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismark", "Columbus", "Oklahoma City",
                "Salem", "Harrisburg", "Providence", "Cp;i,boa", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond",
                "Olympia", "Charleston", "Madison", "Cheyenne"};

        int randomVal = (int) (Math.random() * city.length);
        return city[randomVal];
    }
}

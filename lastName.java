import java.util.Random;

public class lastName {

    public static String returnRandom() {

        String[]name = {"Ampersand", "Abebe", "Abner", "Abby", "Abbot", "Aberman", "Abney", "Abdallah", "Abbitt", "Abbey",
                        "Babbitt", "Backus", "Barkley", "Bachmeier", "Baker", "Beacher", "Barron", "Brache", "Branson", "Barrymon",
                        "Cabbot", "Carrington", "Criss", "Cross", "Charlamain", "Carry", "Closs", "Church", "Chastain", "Curry",
                        "Disick", "Davis", "Dunkin", "Dumond", "Derby", "Derbison", "Darrington", "Dutzen", "Darlington", "Detrich",
                        "Franklin", "Ferrous", "Fabich", "Fabio", "Fabor", "Facenda", "Fachini", "Facciolo", "Fagan", "Flaherty",
                        "Lichen", "Loras", "Loracrat", "Lowery", "Lamb", "Liquid", "Lorrid", "Lansky", "Loredo", "Lebon",
                        "Michelin", "Michaels", "Marin", "Mackeral", "Monteray"," McKinley", "Minnow", "Mannon", "Mason", "Mandalin",
                        "Norris", "Nathans", "Numsky", "Norad", "Namibia", "Netherland", "Nevils", "Nipsy", "Northshire", "Numb",
                        "Otis", "Orion", "Orca", "Oman", "Omay", "Ohsnap", "Onard", "Osprey", "Oppenheimer", "Odell", "Omar",
                        "Purcell", "Pinkerton", "Pandora", "Pentax", "Primal", "Primary", "Purpleish", "Princket", "Poshee", "Plink"};

        int randomVal = (int) (Math.random() * name.length);
        return name[randomVal];
    }
}

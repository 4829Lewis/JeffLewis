import java.util.*;

public class firstName {

    public static String returnRandom() {

        String[]name = {"Jo", "Jeoff", "Joni", "Jand", "Jaren", "Andy", "Anthen", "Antiny", "Andre", "Ashton",
                        "Bo", "Bodi", "Benji", "Bondi", "Buthi", "Caton", "Charlie", "Charlton", "Candon", "Cerolon",
                        "Danton", "Dayton", "Danny", "Darinton", "Darison", "Easton", "Erinton", "Earean", "Evan", "England",
                        "Francis", "Franky", "France", "Ferrington", "Frangon", "Graceton", "Garrington", "Garrison", "Gerry", "Geriton",
                        "Harington", "Haris", "Hushton", "Happinton", "Hareson", "Iean", "Itteron", "Ipsolin", "Iman", "Ilian",
                        "Jeron", "Jerry", "Jaston", "Jixton", "Jazzy", "Keean", "Karean", "Kareem", "Kerry", "Kaerington",
                        "Lexi", "Lexicon", "Lira", "Lemore", "Lemur", "Maurice", "Marlon", "Mercury", "Mason", "Madison",
                        "North", "Naurtine", "Nantuck", "Nadon", "Nissa", "Orian", "Ora", "Oracine", "Octavian", "Orsoni",
                        "Paris", "Parson", "Perrington", "Pegasus", "Pariah", "Quent", "Quarry", "Qiwi", "Quorton", "Quince",
                        "Ray", "Ratio", "Rayon", "Ruden", "Randerson", "Stormi", "Stanson", "Searson", "Siri", "Saron"};

        int randomVal = (int) (Math.random() * name.length);
        return name[randomVal];
    }
}

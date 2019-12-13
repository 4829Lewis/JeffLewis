public class claimAddress {
        public static String returnRandom() {

            String[]address = {
                    "123 Cotton Tail", "123 Peter Rabbit", "123 Bugs lane", "123 Aldridge Ave", "123 Swanpool",
                    "123 Aberman", "123 Buzzard", "123 Total Control", "123 Happy day lane", "123 New Mexco",
                    "123 Tyrion Ln", "123 Stark Ln", "123 Flayed man lane", "123 Little Finger lane", "123 Drogo lane",
                    "123 Santa Lane", "123 Snow Coming Lane", "123 Tomorrow Snow", "123 Swimlane", "123 Swanky",
                    "123 Maple Lane", "123 Oak Lane", "123 Lilac Lane", "123 Spruce", "123 Japanese Maple Lane",
                    "123 Beige Lane", "123 Magenta Lane", "123 Orange Lane", "123 Cadmium Lane", "123 Start Over",
                    "123 Banana Lane", "123 Clementine Lane", "123 Lemon St", "123 Strawberry Fields", "123 Fig Lane"};

            int randomVal = (int) (Math.random() * address.length);
            return address[randomVal];
        }
    }

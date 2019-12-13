import java.io.IOException;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.xml.stream.events.Characters;
import java.io.*;

//ISA*00*

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

//import static com.sun.jmx.snmp.ThreadContext.contains;
import static jdk.nashorn.internal.parser.TokenType.BREAK;
import static jdk.nashorn.internal.parser.TokenType.IF;

public class Main {

    public static void main(String[] args) throws IOException {

        // Need directory handling and possibly a front end.  Right now that does not exist.  Need one working correctly
        // before moving on.  This is where the directory structure and it's processing will begin.

        String filename = "files/837I.5010.BaseFile.OK.DependentClaimFileCascade.none";
        String realData = null;

        String firstSubscriberName = "";
        String lastSubscriberName = "";
        String subscriberAddress = "";
        String firstPatientName = "";
        String lastPatientName = "";
        String patientAddress = "";
        String patientCNTRLNumber = "";
        String memberID = "";
        String DateOfBirth = "";
        String PatientDMG = "";
        String characterDMG = "";
        String strCurrentLine;


        BufferedReader objReader = new BufferedReader(new FileReader("files/Testing"));
        //Assuming you have a text file in D drive


        // This is just one file now, this needs to be modified to read a folder of files and process them sequentially until complete.
        //This part needs to be modified and moved !!

        System.out.println("Heading into filename");

        realData = filename;

        System.out.println(filename);

        System.out.println("length: " + realData.length());

        System.out.println(realData);

        //Add data from file to the strOrig variable

        String strOrig = realData;
        int actualSubLastPointer = strOrig.indexOf("NM1*IL*1*") + 9;
        int actualMemberIDPointer = strOrig.indexOf("*MI*") + 4;

        //Gather Dependent first and last names from the EDI string
        int actualPatLastPointer = strOrig.indexOf("NM1*QC*1*") + 9;

        //Gather Subscriber first and last names from the EDI string


        while ((strCurrentLine = objReader.readLine()) != null) {
            System.out.println(strCurrentLine);
            System.out.println("Iterating thru");

            // start with nameLastPointer and go for 35 or until you hit an *
            if (actualSubLastPointer == actualSubLastPointer) ;
            {
                int testing = actualSubLastPointer;
                System.out.print(testing);
                String strOrigCopy = strOrig;

                char aChar = strOrigCopy.charAt(actualSubLastPointer);
                System.out.print(aChar);

                //initially add one to the pointer
                actualSubLastPointer = actualSubLastPointer + 1;

                // now loop through the last name, looking for characters - need to look for special characters

                System.out.print(actualSubLastPointer);

                int loc = strOrig.indexOf("NM1*IL*1*") + 9;
                int i = 1;

                //char[] lastNameArray = new char[60];
                //char[] firstNameArray = new char[35];

                while (actualSubLastPointer > loc) {
                    strOrigCopy = strOrig;

                    System.out.println(aChar);

                    if (aChar != '*') {
                        lastSubscriberName = lastSubscriberName + aChar;
                        System.out.println(" last subscriber name -> " + lastSubscriberName);
                    } else {
                        System.out.println(" hit the area I'm looking for the N3 address field for the Subscriber ");
                    }

                    if (aChar == '*') {
                        System.out.println("hit the * character and need to stop looking for last name ");
                        // now get the first name
                        i = 1;  // set pointer to 1
                        while (strOrigCopy.charAt(actualSubLastPointer) != '*') {
                            aChar = strOrigCopy.charAt(actualSubLastPointer);
                            // last name array i
                            firstSubscriberName = firstSubscriberName + aChar;
                            System.out.println("first subscriber name -> " + firstSubscriberName);
                            actualSubLastPointer += 1;
                        }
                        actualSubLastPointer += 1;
                        if (strOrigCopy.charAt(actualSubLastPointer) == 'N') {
                            // N3 Address exists for subscriber
                            // find the address and put into string
                            if (strOrigCopy.charAt(actualSubLastPointer) == '3') {
                                // N3 address exists for subscriber
                                // find the address and put into string
                            } else {
                                // N3 Address does not exist
                                System.out.println("Subscriber Address doesn't exist 1");
                            }
                        } else {
                            // N3 Address does not exist
                            System.out.println(" Subscriber Address doesn't exist 2 ");
                        }

                        while (loc > actualSubLastPointer) {
                            // TO DO - change strOrigCopy from loc to actual SubLastPointer -1 to a random character name
                            System.out.println(" verify looping is correct ");
                            break;
                        }
                        break;
                    }
                    //lastNameArray[i] = aChar;
                    if (i > 60) {
                        System.out.println("Helping me test");
                        break;
                    }
                    i = i + 1;
                    if (strOrigCopy.charAt(actualSubLastPointer) == '~') {
                        System.out.println(" hit the end of segment or file");
                        // start here and fix this issue
                    }
                    aChar = strOrigCopy.charAt(actualSubLastPointer);
                    System.out.print(aChar);
                    actualSubLastPointer += 1; // look at this working correctly
                    if (actualSubLastPointer >= (realData.length() - 1)) {
                        System.out.println("Hit the If where actual subLastPointer > real data length");
                        System.out.println(actualSubLastPointer);
                        System.out.println(realData.length());
                        break;
                    } else {
                        System.out.print("Hit the else I wanted");
                    }
                }
                // getting the Member ID next
                System.out.println("Now going to get the Member ID Name");

                int loc2 = strOrig.indexOf("*MI*") + 4;

                System.out.println(" actualMemberIDPointer = " + actualMemberIDPointer);
                System.out.println(" loc2 = " + loc2);


                while (strOrigCopy.charAt(actualMemberIDPointer) != '~') {
                    aChar = strOrigCopy.charAt(actualMemberIDPointer);
                    //memberID find
                    memberID = memberID + aChar;
                    System.out.println(" Member ID -> " + memberID);
                    actualMemberIDPointer += 1;
                }

                System.out.println("Actual Pointer for actualPatLastPointer = " + actualPatLastPointer);

                while (strOrigCopy.charAt(actualPatLastPointer) != '*') {
                    System.out.println("Looping to find Patient Last name");
                    aChar = strOrigCopy.charAt(actualPatLastPointer);
                    lastPatientName = lastPatientName + aChar;
                    System.out.println("Patient Last Name -> " + lastPatientName);
                    actualPatLastPointer += 1;
                }
                //actualPatLastPointer = actualPatLastPointer + 1;
                aChar = strOrigCopy.charAt(actualPatLastPointer);
                System.out.println("aChar prior to starting to look for patient first name = " + aChar);

                if (aChar == '*') {
                    System.out.println("hit the * character and need to stop looking for patient last name");
                    // now get the first name
                    //i = 1; reset the pointer to 1
                    //actualPatLastPointer = actualPatLastPointer);

                    //The below statement is incorrect - need to fix
                    // --> Error aChar = strOrigCopy.charAt(actualPatLastPointer);
                    System.out.println("aChar prior to starting to look for patient first name = " + actualPatLastPointer);
                    actualPatLastPointer = actualPatLastPointer + 1;
                    System.out.println("actualPatLastPointer prior to looking for patient first name = " + actualPatLastPointer);

                    while (strOrigCopy.charAt(actualPatLastPointer) != '*') {
                        if (strOrigCopy.charAt(actualPatLastPointer) == '~') {
                            //hit end of segment, break out of while
                            break;
                        }
                        aChar = strOrigCopy.charAt(actualPatLastPointer);
                        //lastNameArray[i] = aChar;
                        firstPatientName = firstPatientName + aChar;
                        System.out.println("first patient name => " + firstPatientName);
                        actualPatLastPointer += 1;
                    }
                    //actualPatLastPointer += 1;
                    System.out.println("actualPatLastPointer = " + actualPatLastPointer);
                    aChar = strOrigCopy.charAt(actualPatLastPointer);
                    System.out.println("aChar prior to starting to look for patient address = " + aChar);
                    actualPatLastPointer = actualPatLastPointer + 1;

                    if (strOrigCopy.charAt(actualPatLastPointer) == 'N') {
                        System.out.println("hit N as the next character");
                        actualPatLastPointer = actualPatLastPointer + 1;
                        if (strOrigCopy.charAt(actualPatLastPointer) == '3') {
                            //N3 address exists for patient
                            System.out.println("Patient Address exists - now need to find it");
                            // find the address and put into string
                            // patientAddress
                            actualPatLastPointer = actualPatLastPointer + 1;
                            aChar = strOrigCopy.charAt(actualPatLastPointer);
                            System.out.println("actualPatLastPointer value = " + actualPatLastPointer);
                            System.out.println("aChar prior to looking and looping for address " + aChar);
                            System.out.println("aChar value in the string = " + strOrigCopy.charAt(actualPatLastPointer));
                            if (aChar == '*') {
                                actualPatLastPointer = actualPatLastPointer + 1;
                                // looping through address and saving it
                                System.out.println("starting to loop for address");
                                while (strOrigCopy.charAt(actualPatLastPointer) != '*') {
                                    System.out.println("in while loop for address");
                                    if (strOrigCopy.charAt(actualPatLastPointer) == '~') {
                                        //hit end of segment, break out of while
                                        break;
                                    }
                                    aChar = strOrigCopy.charAt(actualPatLastPointer);
                                    //lastName[i] = aChar;
                                    patientAddress = patientAddress + aChar;
                                    System.out.println("patient address -> " + patientAddress);
                                    actualPatLastPointer += 1;
                                }
                                // now find the DMG segment which contains the Patient Data of birth - search from the ~ to the DMG*D8
                                System.out.println("actualPatLastPointer value = " + actualPatLastPointer);
                                System.out.println("aChar prior to looking and looping for DOB " + aChar);
                                System.out.println("aChar value in the string = " + strOrigCopy.charAt(actualPatLastPointer));
                                // need to create a DMG string and use that to get the DOB
                                // start here character characterDMG
                                while (strOrigCopy.charAt(actualPatLastPointer) != '*') {
                                    System.out.println("inside while loop looking for DMG");
                                    System.out.println("characterDMG = " + characterDMG);
                                    if (strOrigCopy.charAt(actualPatLastPointer) == '~') {
                                        System.out.println(" in the while loop and found ~");
                                        actualPatLastPointer = actualPatLastPointer + 1;
                                        System.out.println(" aChar value in the string = " + strOrigCopy.charAt(actualPatLastPointer));
                                    } else {
                                        System.out.println(" where is the pointer at " + strOrigCopy.charAt(actualPatLastPointer));
                                        System.out.println(" in the Else trying to find the DMG");
                                        System.out.println(" characterDMG " + characterDMG);
                                        if (strOrigCopy.charAt(actualPatLastPointer) == 'D') {
                                            System.out.println(" inside the while loop - found D, adding this to the characterDMG");
                                            actualPatLastPointer = actualPatLastPointer + 1;
                                            aChar = strOrigCopy.charAt(actualPatLastPointer);
                                            characterDMG = characterDMG + aChar;
                                            System.out.println("characterDMG = " + characterDMG);
                                        } else {
                                            System.out.println(" where is the pointer at " + strOrigCopy.charAt(actualPatLastPointer));
                                            System.out.println(" in the Else trying to find the DMG");
                                            System.out.println(" characterDMG " + characterDMG);
                                            if (strOrigCopy.charAt(actualPatLastPointer) == 'M') {
                                                System.out.println(" inside the while loop - found M, adding this to the characterDMG");
                                                actualPatLastPointer = actualPatLastPointer + 1;
                                                aChar = strOrigCopy.charAt(actualPatLastPointer);
                                                characterDMG = characterDMG + aChar;
                                                System.out.println("characterDMG = " + characterDMG);
                                            } else {
                                                System.out.println(" where is the pointer at " + strOrigCopy.charAt(actualPatLastPointer));
                                                System.out.println(" in the Else trying to find the DMG");
                                                System.out.println(" characterDMG " + characterDMG);
                                                if (strOrigCopy.charAt(actualPatLastPointer) == 'G') {
                                                    System.out.println(" inside the while loop - found G, adding this to the characterDMG");
                                                    actualPatLastPointer = actualPatLastPointer + 1;
                                                    aChar = strOrigCopy.charAt(actualPatLastPointer);
                                                    characterDMG = characterDMG + aChar;
                                                    System.out.println("characterDMG = " + characterDMG);
                                                } else {
                                                    System.out.println(" where is the pointer at " + strOrigCopy.charAt(actualPatLastPointer));
                                                    System.out.println(" in the Else trying to find the DMG");
                                                    System.out.println(" characterDMG " + characterDMG);
                                                    if (strOrigCopy.charAt(actualPatLastPointer) == '*') {
                                                        System.out.println(" inside the while loop - found *, adding this to the characterDMG");
                                                        actualPatLastPointer = actualPatLastPointer + 1;
                                                        aChar = strOrigCopy.charAt(actualPatLastPointer);
                                                        characterDMG = characterDMG + aChar;
                                                        System.out.println("characterDMG = " + characterDMG);
                                                    } else {
                                                        System.out.println(" where is the pointer at " + strOrigCopy.charAt(actualPatLastPointer));
                                                        System.out.println(" in the Else trying to find the DMG");
                                                        System.out.println(" characterDMG " + characterDMG);
                                                        if (strOrigCopy.charAt(actualPatLastPointer) == 'D') {
                                                            System.out.println(" inside the while loop - found D, adding this to the characterDMG");
                                                            actualPatLastPointer = actualPatLastPointer + 1;
                                                            aChar = strOrigCopy.charAt(actualPatLastPointer);
                                                            characterDMG = characterDMG + aChar;
                                                            System.out.println("characterDMG = " + characterDMG);
                                                        } else {
                                                            System.out.println(" where is the pointer at " + strOrigCopy.charAt(actualPatLastPointer));
                                                            System.out.println(" in the Else trying to find the DMG");
                                                            System.out.println(" characterDMG " + characterDMG);
                                                            if (strOrigCopy.charAt(actualPatLastPointer) == '8') {
                                                                System.out.println(" inside the while loop - found 8, adding this to the characterDMG");
                                                                actualPatLastPointer = actualPatLastPointer + 1;
                                                                aChar = strOrigCopy.charAt(actualPatLastPointer);
                                                                characterDMG = characterDMG + aChar;
                                                                System.out.println("characterDMG = " + characterDMG);
                                                            } else {
                                                                System.out.println(" where is the pointer at " + strOrigCopy.charAt(actualPatLastPointer));
                                                                System.out.println(" in the Else trying to find the DMG");
                                                                System.out.println(" characterDMG " + characterDMG);
                                                                if (strOrigCopy.charAt(actualPatLastPointer) == '*') {
                                                                    while (DateOfBirth.length() < 8) {
                                                                        // put the DOB into DateOfBirth String
                                                                        System.out.println(" inside the while loop - found *, adding this to the characterDMG");
                                                                        actualPatLastPointer = actualPatLastPointer + 1;
                                                                        aChar = strOrigCopy.charAt(actualPatLastPointer);
                                                                        DateOfBirth = DateOfBirth + aChar;
                                                                        System.out.println("DateOfBirth = " + DateOfBirth);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                //populate the new de-identified data to the string which will be written to the new folder
                                //firstSubscriberName, lastSubscriberName, memberID, firstPatientName, lastPatientName, subscriberAddress, patientAddress, PatientDMG, DateOfBirth,
                                //Replace the de-identified data in the string
                                // strOrig.replace(CharSequence target, CharSequence replacement)
                                //call WriteEDIString to write out the new string
                            }
                        }
                    }
                }
            }
        }
        System.out.println(firstName.returnRandom());
        System.out.println(lastName.returnRandom());
    }
}
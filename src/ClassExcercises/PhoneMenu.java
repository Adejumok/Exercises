package ClassExcercises;

import java.util.Scanner;

public class PhoneMenu {
    static Scanner phone = new Scanner(System.in);
    static int click;
    public static void main(String[] args) {
        runPhone();

    }
public static void runPhone(){
        System.out.println("1 -- Phone Book");
        System.out.println("2 -- Messages");
        System.out.println("3 -- Chat");
        System.out.println("4 -- Call Register");
        System.out.println("5 -- Tones");
        System.out.println("6 -- Settings");
        System.out.println("7 -- Call Divert");
        System.out.println("8 -- Games");
        System.out.println("9 -- Calculator");
        System.out.println("10 -- Reminders");
        System.out.println("11 -- Clock");
        System.out.println("12 -- Profiles");
        System.out.println("13 -- SIM Services");
        System.out.println("0 -- Exit");
        System.out.println("Enter a number: ");
        click = phone.nextInt();

        switch (click) {
            case 1:
                phoneBook();
                runPhone();
                break;
            case 2:
                message();
                runPhone();
                break;
            case 3:
                chat();
                runPhone();
                break;
            case 4:
               callRegister();
               runPhone();
               break;
            case 5:
                tones();
                runPhone();
                break;

            case 6:
               settings();
               runPhone();
                break;

            case 7:
               callDivert();
               runPhone();
                break;

            case 8:
               games();
               runPhone();
               break;

            case 9:
                calculator();
                runPhone();
                break;

            case 10:
               reminders();
               runPhone();
                break;

            case 11:
                clock();
                runPhone();
                break;

            case 12:
                profile();
                runPhone();
                break;

            case 13:
               simServices();
               runPhone();
                break;
            case 0:
                System.exit(0);

            default:
                System.out.println("Invalid entry");
                runPhone();
                break;
                }
        }
        public static void phoneBook(){
            System.out.println("1 -- Search");
            System.out.println("2 -- Service Nos.");
            System.out.println("3 -- Add name");
            System.out.println("4 -- Erase");
            System.out.println("5 -- Edit");
            System.out.println("6 -- Assign tone");
            System.out.println("7 -- Send b'card");
            System.out.println("8 -- Options");
            System.out.println("9 -- Speed dials");
            System.out.println("10 -- Voice tags");
            System.out.println("0 -- Back to Phone Menu");
            System.out.println("Enter a number: ");
            click = phone.nextInt();

            switch (click) {
                case 1:
                    System.out.println("Search");

                    break;
                case 2:
                    System.out.println("Service Nos.");

                    break;
                case 3:
                    System.out.println("Add name");

                    break;
                case 4:
                    System.out.println("Erase");

                    break;
                case 5:
                    System.out.println("Edit");
                case 6:
                    System.out.println("Assign tone");
                    break;
                case 7:
                    System.out.println("Send b'card");
                    break;
                case 8:
                    System.out.println("1 -- for Type of view");
                    System.out.println("2 -- for Memory status");
                    System.out.println("Enter a number: ");
                    click = phone.nextInt();
                    switch (click) {
                        case 1:
                            System.out.println("Type of view");
                            break;
                        case 2:
                            System.out.println("Memory status");
                            break;
                        default:
                            System.out.println("Invalid entry");
                    }
                    phoneBook();
                    break;
                case 9:
                    System.out.println("Speed dials");
                    break;
                case 10:
                    System.out.println("Voice tags");
                    break;
                case 0:
                    runPhone();
                    break;
                default:
                    System.out.println("Invalid entry");
                    runPhone();
            }

        }
        public static void message(){
            System.out.println("1 -- Write messages");
            System.out.println("2 -- Inbox");
            System.out.println("3 -- Outbox");
            System.out.println("4 -- Picture messages");
            System.out.println("5 -- Templates");
            System.out.println("6 -- Smileys");
            System.out.println("7 -- Message settings");
            System.out.println("8 -- Info service");
            System.out.println("9 -- Voice mailbox number");
            System.out.println("10 -- Service command editor");
            System.out.println("0 -- Back to Phone Menu");
            System.out.println("Enter a number: ");
            click = phone.nextInt();

            switch (click) {
                case 1:
                    System.out.println("Write messages");
                    break;
                case 2:
                    System.out.println("Inbox");
                    break;
                case 3:
                    System.out.println("Outbox");
                    break;
                case 4:
                    System.out.println("Picture messages");
                    break;
                case 5:
                    System.out.println("Templates");
                case 6:
                    System.out.println("Smileys");
                    break;
                case 7:
                    System.out.println("1 -- Set 1");
                    System.out.println("2 -- Common");
                    System.out.println("Enter a number: ");
                    click = phone.nextInt();
                    switch (click) {
                        case 1:
                            System.out.println("1 -- Message centre number");
                            System.out.println("2 -- Messages sent as");
                            System.out.println("3 -- Message validity");
                            System.out.println("Enter a number: ");
                            click = phone.nextInt();
                            switch (click) {
                                case 1:
                                    System.out.println("Message centre number");
                                    break;
                                case 2:
                                    System.out.println("Messages sent as");
                                    break;
                                case 3:
                                    System.out.println("Message validity");
                                    break;
                                default:
                                    System.out.println("Invalid entry");
                            }
                            message();
                            break;

                        case 2:
                            System.out.println("1 -- Delivery reports");
                            System.out.println("2 -- Reply via same centre");
                            System.out.println("3 -- Character support");
                            System.out.println("Enter a number: ");
                            click = phone.nextInt();
                            switch (click) {
                                case 1:
                                    System.out.println("Delivery reports");
                                    break;
                                case 2:
                                    System.out.println("Reply via same centre");
                                    break;
                                case 3:
                                    System.out.println("Character support");
                                    break;
                                default:
                                    System.out.println("Invalid entry");
                                    break;
                            }
                            message();
                            break;
                        case 8:
                            System.out.println("Info service");
                            break;
                        case 9:
                            System.out.println("Voice mailbox number");
                            break;
                        case 10:
                            System.out.println("Service command editor");
                            break;
                        case 0:
                            runPhone();
                            break;
                        default:
                            System.out.println("Invalid entry");
                            runPhone();
                            break;

                    }


            }
        }
        public static void chat(){
            System.out.println("Chat");
        }
        public static void callRegister(){
            System.out.println("1 -- Missed calls");
            System.out.println("2 -- Received calls");
            System.out.println("3 -- Dialled numbers");
            System.out.println("4 -- Erased recent call lists");
            System.out.println("5 -- Show call duration");
            System.out.println("6 -- Show call costs");
            System.out.println("7 -- Call cost settings");
            System.out.println("8 -- Prepaid credit");
            System.out.println("0 -- Back to Phone Menu");

            System.out.println("Enter a number: ");
            click = phone.nextInt();

            switch (click) {
                case 1:
                    System.out.println("Missed calls");
                    break;
                case 2:
                    System.out.println("Received calls");
                    break;
                case 3:
                    System.out.println("Dialled numbers");
                    break;
                case 4:
                    System.out.println("Erase recent call lists");
                    break;
                case 5:
                    System.out.println("1 -- Last call duration");
                    System.out.println("2 -- All calls' duration");
                    System.out.println("3 -- Received calls' duration");
                    System.out.println("4 -- Dialled calls' duration");
                    System.out.println("5 -- Clear timers");
                    System.out.println("Enter a number: ");
                    click = phone.nextInt();
                    switch (click) {
                        case 1:
                            System.out.println("Last call duration");
                            break;
                        case 2:
                            System.out.println("All calls' duration");
                            break;
                        case 3:
                            System.out.println("Received calls' duration");
                            break;
                        case 4:
                            System.out.println("Dialled calls' duration");
                            break;
                        case 5:
                            System.out.println("Clear timers");
                            break;
                        default:
                            System.out.println("Invalid entry");
                    }
                    callRegister();
                    break;

                case 6:
                    System.out.println("1 -- Last call cost");
                    System.out.println("2 -- All calls' cost");
                    System.out.println("3 -- Clear counters");
                    System.out.println("Enter a number: ");
                    click = phone.nextInt();
                    switch (click) {
                        case 1:
                            System.out.println("Last call cost");
                            break;
                        case 2:
                            System.out.println("All calls' cost");
                            break;
                        case 3:
                            System.out.println("Clear counters");
                            break;
                        default:
                            System.out.println("Invalid entry");
                    }
                    callRegister();
                    break;

                case 7:
                    System.out.println("1 -- Call cost limit");
                    System.out.println("2 -- Show costs in");
                    System.out.println("Enter a number: ");
                    click = phone.nextInt();
                    switch (click) {
                        case 1:
                            System.out.println("Call cost limit");
                            break;

                        case 2:
                            System.out.println("Show costs in");
                            break;

                        default:
                            System.out.println("Invalid entry");

                    }
                    callRegister();
                    break;
                case 8:
                    System.out.println("Prepaid credit");
                    break;
                case 0:
                    runPhone();
                    break;

                default:
                    System.out.println("Invalid entry");
                    runPhone();
                    break;

            }
        }
        public static void tones(){
            System.out.println("1 -- Ringing tone");
            System.out.println("2 -- Ringing volume");
            System.out.println("3 -- Incoming call alert");
            System.out.println("4 -- Composer");
            System.out.println("5 -- Message alert tone");
            System.out.println("6 -- Keypad tones");
            System.out.println("7 -- Warning and game tones");
            System.out.println("8 -- Vibrating alert");
            System.out.println("9 -- Screen saver");
            System.out.println("Enter a number: ");
            click = phone.nextInt();
            switch (click) {
                case 1:
                    System.out.println("Ringing tone");
                    break;
                case 2:
                    System.out.println("Ringing volume");
                    break;
                case 3:
                    System.out.println("Incoming call alert");
                    break;
                case 4:
                    System.out.println("Composer");
                    break;
                case 5:
                    System.out.println("Message alert tone");
                    break;
                case 6:
                    System.out.println("Keypad tones");
                    break;
                case 7:
                    System.out.println("Warning and game tones");
                    break;
                case 8:
                    System.out.println("Vibrating alert");
                    break;
                case 9:
                    System.out.println("Screen saver");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
        public static void settings(){
            System.out.println("1 -- Call settings");
            System.out.println("2 -- Phone settings");
            System.out.println("3 -- Security settings");
            System.out.println("4 -- Restore factory settings");
            System.out.println("0 -- Back to Phone Menu");
            System.out.println("Enter a number: ");
            click = phone.nextInt();
            switch (click) {
                case 1:
                    System.out.println("1 -- Automatic redial");
                    System.out.println("2 -- Speed dialling");
                    System.out.println("3 -- Call waiting options");
                    System.out.println("4 -- Own number sending");
                    System.out.println("5 -- Phone line in use");
                    System.out.println("6 -- Automatic answer");
                    System.out.println("Enter a number: ");
                    click = phone.nextInt();
                    switch (click) {
                        case 1:
                            System.out.println("Automatic redial");
                            break;
                        case 2:
                            System.out.println("Speed dialling");
                            break;
                        case 3:
                            System.out.println("Call waiting options");
                            break;
                        case 4:
                            System.out.println("Own number sending");
                            break;
                        case 5:
                            System.out.println("Phone line in use");
                            break;
                        case 6:
                            System.out.println("Automatic answer");
                            break;
                        default:
                            System.out.println("Invalid entry");
                            break;
                    }
                    settings();
                    break;

                case 2:
                    System.out.println("1 -- Language");
                    System.out.println("2 -- Cell info display");
                    System.out.println("3 -- Welcome note");
                    System.out.println("4 -- Network selection");
                    System.out.println("5 -- Lights");
                    System.out.println("6 -- Confirm SIM service actions");
                    System.out.println("Enter a number: ");
                    click = phone.nextInt();
                    switch (click) {
                        case 1:
                            System.out.println("Language");
                            runPhone();
                            break;
                        case 2:
                            System.out.println("Cell info display");
                            break;
                        case 3:
                            System.out.println("Welcome note");
                            break;
                        case 4:
                            System.out.println("Network selection");
                            break;
                        case 5:
                            System.out.println("Lights");
                            break;
                        case 6:
                            System.out.println("Confirm SIM service actions");
                            break;
                        default:
                            System.out.println("Invalid entry");
                    }
                    settings();
                    break;

                case 3:
                    System.out.println("1 -- PIN code request");
                    System.out.println("2 -- Call barring service");
                    System.out.println("3 -- Fixed dialling");
                    System.out.println("4 -- Closed user group");
                    System.out.println("5 -- Phone security");
                    System.out.println("6 -- Change access codes");
                    System.out.println("Enter a number: ");
                    click = phone.nextInt();
                    switch (click) {
                        case 1:
                            System.out.println("PIN code request");
                            break;
                        case 2:
                            System.out.println("Call barring service");
                            break;
                        case 3:
                            System.out.println("Fixed dialling");
                            break;
                        case 4:
                            System.out.println("Closed user group");
                            break;
                        case 5:
                            System.out.println("Phone security");
                            break;
                        case 6:
                            System.out.println("Change access codes");
                            break;
                        default:
                            System.out.println("Invalid entry");
                    }
                    settings();
                    break;

                case 4:
                    System.out.println("Restore factory settings");
                    break;
                case 0:
                    runPhone();
                    break;
                default:
                    System.out.println("Invalid entry");
                    runPhone();
            }
        }
        public static void callDivert(){
            System.out.println("Call Divert");
        }
        public static void games(){
            System.out.println("Games");
        }
        public static void calculator(){
            System.out.println("Calculator");
        }
        public static void reminders(){
            System.out.println("Reminders");
        }
        public static void clock(){
            System.out.println("1 -- Alarm clock");
            System.out.println("2 -- Clock settings");
            System.out.println("3 -- Date setting");
            System.out.println("4 -- Stopwatch");
            System.out.println("5 -- Countdown timer");
            System.out.println("6 -- Auto update of date and time");
            System.out.println("Enter a number: ");
            click = phone.nextInt();
            switch (click) {
                case 1:
                    System.out.println("Alarm clock");
                    break;
                case 2:
                    System.out.println("Clock settings");
                    break;
                case 3:
                    System.out.println("Date setting");
                    break;
                case 4:
                    System.out.println("Stopwatch");
                    break;
                case 5:
                    System.out.println("Countdown timer");
                    break;
                case 6:
                    System.out.println("Auto update of date and time");
                    break;
                default:
                    System.out.println("Invalid entry");
                    runPhone();
            }
        }
        public static void profile(){
            System.out.println("Profiles");
        }
        public static void simServices(){
            System.out.println("SIM services");
        }


    }
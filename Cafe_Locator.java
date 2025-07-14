import java.util.*;

// Base class for common attributes

class Location
{
    String name;
    String address;
    String contact;

    // Constructor to initialize location details
    Location(String name, String address, String contact)
    {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
}

// Cafe class inheriting from Location
class Cafe extends Location
{
    double rating;
    double averageBill; // New attribute for average bill

    // Constructor to initialize cafe details
    Cafe(String name, String address, String contact, double rating, double averageBill)
    {
        super(name, address, contact); // Call to the parent constructor
        this.rating = rating;
        this.averageBill = averageBill; // Initialize average bill
    }

    // Display cafe details in a formatted way
    void displayDetails()
    {
        System.out.println("");
        System.out.println("======================================================");
        System.out.println("");
        System.out.println(">>> Cafe Name: " + name);
        System.out.println(">>> Address: " + address);
        System.out.println(">>> Contact: " + contact);
        System.out.println(">>> Rating: " + rating);
        System.out.println(">>> Average Bill: " + averageBill);
        System.out.println("");
        System.out.println("======================================================");
        System.out.println("");
    }
}

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // City options
        String[] cities = {"Ahmedabad", "Surat", "Vadodara"};

        // Areas for each city
        String[][] areas = {
                {"Nikol", "Bapunagar", "Bopal", "Sindhubhavan"},  // Ahmedabad areas
                {"Vesu", "Varachha", "Katargam", "Dummas"},       // Surat areas
                {"Alkapuri", "PunitNagar", "Akota", "Karelibaug"}  // Vadodara areas
        };

        // Arrays of cafes for each city and area
        Cafe[][][] cafes =
                {
                        {
                                {   // Ahmedabad - Nikol
                                        new Cafe("Venom's Cafe", "101, Sai Heaven Complex, Haridarsan Rd, Nikol, Ahmedabad", "99043 65598", 5.0, 300),
                                        new Cafe("The Sorra", "Akshar Arcade, 502, Nikol - Naroda Rd, opp. SHYAM VILLA-2, near kiran motor, Nikol, Ahmedabad", "93277 77789", 4.3, 250),
                                        new Cafe("Sapori D'Italia", "Shop No-8, Aradhana Residency, Nr. Gangotri Circle, Nikol, Ahmedabad", "73597 55500", 4.2, 400),
                                        new Cafe("John's 7 Cafe", "Sai Heaven Residency, 101, Haridarsan Rd, near D-Mart, Nikol, Ahmedabad", "98986 74532", 4.9, 350),
                                        new Cafe("The Knights Cafe", "2nd Floor, Shreem Heights, opp. Kelvni Dham, Ankur Chokadi, Nikol, Ahmedabad", "72260 21260", 4.2, 200)
                                },
                                {
                                        // Ahmedabad - Bapunagar
                                        new Cafe("Cafe 8154", "A/Z, Arvind Estate, Nr. Puskar Business Park, opp. Cine Square Cinemas, Bapunagar, Ahmedabad", "63533 54736", 4.6, 150),
                                        new Cafe("Rose buds cafe", "Block-H, Sumel 8, Rehmat Nagar, Bapunagar, Ahmedabad", "95124 76134", 4.4, 200),
                                        new Cafe("Tealogy", "Shaktidhara Society, Bapunagar, Ahmedabad", "81413 37360", 4.8, 250),
                                        new Cafe("The Celebration Cafe", "203, Pushkar Business Park, near Star Hospital, Bapunagar, Ahmedabad", "93543 67972", 4.9, 300),
                                        new Cafe("CAFE SELFIE", "GF/21-23, Platinum Plaza, opp. Rajhans Cinema, New India Colony, Nikol, Ahmedabad", "8469153256", 4.6, 180)
                                },
                                {
                                        // Ahmedabad - Bopal
                                        new Cafe("At Good Place", "Ahead of Arose Foods, besides Vince Cafe, YMCA, to, S Bopal Rd, Ahmedabad", "9909509517", 4.4, 220),
                                        new Cafe("Belle Cafe", "SHOP NO. 15, Praharsh Highland, near Merigold Circle, South Bopal, Ahmedabad", "9867665774", 3.8, 200),
                                        new Cafe("Smash Cafe", "Karnavati club road Bopal Main Rd, next to sandesh bunglow, Mumatpura, Ahmedabad", "9601884994", 4.2, 300),
                                        new Cafe("Terra Cafe", "Club Mumatpura, Opposit YMC, VIP Rd, Bopal, Ahmedabad", "97277 51006", 4.5, 350),
                                        new Cafe("Spice Hub Restro Cafe", "VIP Rd, near Bharat petrol pump, Bopal, Ahmedabad", "8469153256", 4.9, 400)
                                },
                                {
                                        // Ahmedabad - Sindhubhavan
                                        new Cafe("Table Tales", "Shilp Epitome, B/H,103, Sindhubhavan Rd, opp. Nayara Petrol Pump, Bodakdev, Ahmedabad", "9925225218", 4.5, 300),
                                        new Cafe("Pepito", "Plot no. 88/1, Shott gaming zone, B/h, Sindhu Bhavan Marg, opp. MonteCristo banquet, PRL Colony, Thaltej, Ahmedabad", "8858857878", 3.9, 250),
                                        new Cafe("Ares cafe", "Sindhubhavan Marg, PRL Colony, Thaltej, Ahmedabad", "7984843172", 4.2, 280),
                                        new Cafe("COFFEE CARNIVAL cafe", "Bogie chef Near ornet park, 3, Sindhu Bhavan Marg, Ahmedabad", "09879777414", 4.1, 220),
                                        new Cafe("triton", "BILLIONAIRE STREET, Sindhubhavan Rd, PRL Colony, Bodakdev, Ahmedabad", "9825166126", 4.3, 300)
                                }
                        },
                        {
                                {
                                        // Surat - Vesu
                                        new Cafe("Meraki Cafe", "SNS Platina, Vesu, Surat", "9737794366", 4.5, 350),
                                        new Cafe("Engine Cafe", "4, Vesu Main Road, Piplod, Surat", "9327777789", 4.3, 300),
                                        new Cafe("At the rate Cafe", "1st Floor, MileStone LEONE, Athwa Gate Cir, Kharwawad, Vesu, Surat", "7990966479", 4.8, 400),
                                        new Cafe("White Eye cafe", "206, Cafe White Eye International Finance Center, VIP Road, Vesu, Surat", "635635353", 4.5, 350),
                                        new Cafe("cafe de meet", "109, First Floor, International Business Centre IBC, Piplod, Surat", "8980913000", 4.3, 300)
                                },
                                {
                                        // Surat - Varachha
                                        new Cafe("La fresko Cafe", "AR MALL, Mota Varachha, Surat", "9754694366", 4.9, 450),
                                        new Cafe("Noon2night Cafe", "8th Floor, Use Lift 1 & 2, AR mall, Panvel Point, Mota Varachha, Surat", "9345658745", 4.8, 400),
                                        new Cafe("HOH Cafe", "AR MALL, Mota Varachha, Surat", "9754694366", 4.9, 450),
                                        new Cafe("Nexus cafe", "Pragati IT Park, B- 13-14, opp. AR Mall, Mota Varachha, Surat", "8754987612", 5.0, 500),
                                        new Cafe("Cafe Beat", "G13,14, AR Mall, Panvel Point, above AR Mall, Mota Varachha, Surat", "8878787567", 4.5, 350)
                                },
                                {
                                        // Surat - Katargam
                                        new Cafe("Good stuff cafe", "Sunday Hub, 201, near ankur school, Aamba Talavadi, Aadarsh Society, Katargam, Surat", "9913341313", 4.8, 300),
                                        new Cafe("Epiquria - at The Roof cafe", "5th Floor, Unique Square Causeway, Dabholi link road, katargam, Singanpor, Surat", "9685989487", 4.7, 350),
                                        new Cafe("Cave Cafe", "255,256, School 257Laxmi Enclave 2, opposite Gajera Road, Rajanand Society, Ram Nagar Society, Katargam, Surat", "9967578745", 4.3, 250),
                                        new Cafe("coffe culture cafe", "S 29-30 Laxmi Enclave-2, opposite Gajera School, Surat", "9913341313", 4.2, 200),
                                        new Cafe("SnowEra cafe", "Sunday Hub, 108, Gajera Rd, Aamba Talavadi, Haridham Society, Katargam, Surat", "9913341313", 5.0, 400)
                                },
                                {
                                        // Surat - Dummas
                                        new Cafe("Nomads cafe", "Dumas Village Rd, Surat", "9913341313", 4.8, 350),
                                        new Cafe("Kinnara the cafe", "Behind S D Jain Modern School, Adajan, Piplod, Surat", "6358750033", 4.2, 300),
                                        new Cafe("Social blend", "Right from Langar Circle, Sultanabad - Dumas Rd, near Jukamata temple, Surat", "8766789875", 4.3, 250),
                                        new Cafe("Flames cafe", "Dumas neli street, Gujarat 395007", "9925200006", 4.1, 200),
                                        new Cafe("Dummas cafe", "Dumas Rd, Ambawadi, Sultanabad, Surat", "9987778756", 4.3, 300)
                                }
                        },
                        {
                                {
                                        // Vadodara - Alkapuri
                                        new Cafe("Charmet-The Heritage Cafe", "RC Dutt Rd, Alkapuri, Vadodara", "9978881313", 4.4, 300),
                                        new Cafe("Varietea", "103A, Alkapuri Rd, Sampatrao Colony, Jetalpur, Vadodara", "9316565359", 4.3, 250),
                                        new Cafe("Tyagi's Eatery", "SGF-01/02 Shagun Exotica, RC Dutt Rd, near Bank of Baroda head office, Alkapuri, Vadodara", "7359755500", 4.2, 200),
                                        new Cafe("ThatPlace", "33, Jetalpur Rd, Near Chandan Dental Hospital, Sampatrao Colony, Alkapuri, Vadodara", "2652310222", 4.9, 350),
                                        new Cafe("Lazeez", "Vishal Chambers, 34, RC Dutt Rd, Aradhana Society, Vishwas Colony, Alkapuri, Vadodara", "9510688453", 3.0, 150)
                                },
                                {
                                        // Vadodara - PunitNagar
                                        new Cafe("Finca Restro&Cafe", "Sevasi, Vadodara", "90811 11402", 4.0, 200),
                                        new Cafe("Thyme & Whisk Cafe", "RC Dutt Rd, Alkapuri, Vadodara", "9978881313", 4.4, 250),
                                        new Cafe("Restro Bistro", "SF-204, The Emerald, Race Course Rd, near Chakli Circle, Paris Nagar, Diwalipura, Vadodara", "89800 88877", 4.3, 300),
                                        new Cafe("The Morsel", "1st Floor, 105, The Emerald, Near Chakli Circle, Race Course Rd, Vadodara", "9978881313", 4.3, 250),
                                        new Cafe("Cafe Fitoor", "2,3, Landmark Complex, SB 1, below Thomas Cook, Vadodara", "82009 05405", 4.6, 300)
                                },
                                {
                                        // Vadodara - Akota
                                        new Cafe("Zeste Cafe", "Dinesh Mill Rd, Near Urmi Char Rasta Behind, Purushottam Nagar, Akota, Vadodara", "72280 17785", 3.8, 200),
                                        new Cafe("Times Cafe", "Prafull Society, Tarangan Society, Haripura, Vadodara", "96626 89707", 4.8, 300),
                                        new Cafe("The Dugout Cafe", "RC Dutt Rd, Alkapuri, Vadodara", "9978881313", 4.2, 250),
                                        new Cafe("Cafe Appetito", "13 & 14 BASEMENT, EMPEROR COMPLEX, Abbas Tyabji Rd, Jayesh Colony, Fatehgunj, Vadodara", "79900 41728", 3.1, 180)
                                },
                                {
                                        // Vadodara - Karelibaug
                                        new Cafe("Bogo Cafe & Lounge", "Karelibagh, Vadodara", "72028 23333", 3.1, 150),
                                        new Cafe("Cafe Brewito", "GF-1, Earth EON, Sama-Savli Rd, opp. Urmi School, Karelibagh, Vadodara", "99254 23826", 4.1, 200),
                                        new Cafe("La ville Cafe", "Abbas Tyabji Rd, near Methodist Church, Jayesh Colony, Fatehgunj, Vadodara", "76000 31580", 3.9, 180)
                                }
                        }
                };

        // Display Welcome message
        System.out.println("**************************************************");
        System.out.println("*          Welcome to the Cafe Locator!          *");
        System.out.println("**************************************************");

        // Choose city
        System.out.println(">>> Select a city:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i]);
        }

        int cityChoice = sc.nextInt();

        // Input validation for city choice
        if (cityChoice < 1 || cityChoice > cities.length)
        {

            System.out.println("======================================================");
            System.out.println("     Invalid choice! Please choose a valid city.      ");
            System.out.println("======================================================");

            return;
        }

        String selectedCity = cities[cityChoice - 1];
        System.out.println("======================================================");
        System.out.println("         Welcome to " + selectedCity + "!\n         ");
        System.out.println("======================================================");
        // Display areas for the selected city
        System.out.println("======================================================");
        System.out.println("   >>> Select an area in " + selectedCity + ":"        );
        System.out.println("======================================================");
        for (int i = 0; i < areas[cityChoice - 1].length; i++)
        {
            System.out.println((i + 1) + ". " + areas[cityChoice - 1][i]);
        }

        int areaChoice = sc.nextInt();

        // Input validation for area choice
        if (areaChoice < 1 || areaChoice > areas[cityChoice - 1].length)
        {
            System.out.println();
            System.out.println("======================================================");
            System.out.println("    Invalid choice! Please choose a valid area.       ");
            System.out.println("======================================================");
            return;
        }

        String selectedArea = areas[cityChoice - 1][areaChoice - 1];
        System.out.println("======================================================");
        System.out.println("  >>>  You selected the area: " + selectedArea + "\n"  );
        System.out.println("======================================================");
        // Display cafes in the selected area of the selected city
        Cafe[] selectedCafes = cafes[cityChoice - 1][areaChoice - 1];

        // Loop to keep showing the menu until the user decides to exit
        boolean continueMenu = true;
        while (continueMenu)
        {
            // Menu for sorting and displaying cafes
            System.out.println();

            System.out.println();
            System.out.println("======================================================");
            System.out.println();
            System.out.println(">>> Select an option:");
            System.out.println();
            System.out.println("1. Sort cafes by rating");
            System.out.println("2. Sort cafes by name");
            System.out.println("3. Select a cafe to see details");
            System.out.println("4. Show average bill for each cafe");
            System.out.println("0. Exit");
            System.out.println();
            System.out.println("======================================================");
            System.out.println();

            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    Arrays.sort(selectedCafes, Comparator.comparingDouble(cafe -> -cafe.rating)); // Sort by rating descending
                    System.out.println(">>> Cafes sorted by rating...");
                    break;
                case 2:
                    Arrays.sort(selectedCafes, Comparator.comparing(cafe -> cafe.name)); // Sort by name ascending
                    System.out.println(">>> Cafes sorted by name...");
                    break;
                case 3:
                    System.out.println(">>> Select a cafe from the list below...");
                    for (int i = 0; i < selectedCafes.length; i++)
                    {
                        System.out.println((i + 1) + ". " + selectedCafes[i].name);
                    }
                    int cafeChoice = sc.nextInt();
                    // Input validation for cafe choice
                    if (cafeChoice < 1 || cafeChoice > selectedCafes.length)
                    {
                        System.out.println("==============================================");
                        System.out.println("       Invalid choice! Please try again.      ");
                        System.out.println("==============================================");
                        continue; // Continue to the menu
                    }
                    // Display details of the selected cafe
                    selectedCafes[cafeChoice - 1].displayDetails();
                    break;
                case 4:
                    System.out.println(">>> Average bill for each cafe : ");
                    for (Cafe cafe : selectedCafes) {
                        System.out.println(cafe.name + ": " + cafe.averageBill);
                    }
                    break;
                case 0:
                    continueMenu = false;
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    System.out.println("    Exiting... Thanks ! for visiting   ");
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    // Exit the loop
                    break;
                default:
                    System.out.println("==============================================");
                    System.out.println("      Invalid option! Please try again.       ");
                    System.out.println("==============================================");
                    break;
            }

            // After sorting by name
            if (option == 2)
            {
                System.out.println();
                System.out.println();
                System.out.println(">>> Enter  the cafe name  (or part of them) to search:");
                sc.nextLine(); // Consume newline
                String searchTerm = sc.nextLine().toLowerCase();
                boolean found = false;
                for (Cafe cafe : selectedCafes)
                {
                    if (cafe.name.toLowerCase().contains(searchTerm))
                    {
                        cafe.displayDetails();
                        found = true;
                    }
                }
                if (!found)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("==============================================");
                    System.out.println("       No cafes found with that name.         ");
                    System.out.println("==============================================");
                }
            }

            // After sorting by rating
            if (option == 1)
            {
                System.out.println();
                System.out.println();
                System.out.println(">>> Enter minimum rating to filter cafes : ");
                double minRating = sc.nextDouble();
                boolean found = false;
                for (Cafe cafe : selectedCafes) {
                    if (cafe.rating >= minRating) {

                        cafe.displayDetails();
                        found = true;
                    }
                }
                if (!found)
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("==============================================");
                    System.out.println("   No cafes found with the specified rating.  ");
                    System.out.println("==============================================");
                }
            }

            // Display sorted cafes if sorted
            if (option == 1 || option == 2)
            {
                for (Cafe cafe : selectedCafes) {
                    System.out.println(cafe.name + " - Rating: " + cafe.rating);
                }
            }
        }

        // Close the scanner
        sc.close();
    }
}
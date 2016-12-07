package byui.cit260.whereismybone.view;

/**
 *
 * @author Maxine Cutler
 */
public class SceneView extends View {

    public SceneView() {

       super(
              "==================================================" +
            "\n               WHERE IS MY BONE?                  " +
            "\n              Scene Descriptions                  " +
            "\n==================================================" +
            "\n             .-.               .-.                " +
            "\n            (   `-._________.-'   )               " +
            "\n             >=     _______     =<                " +
            "\n            (   ,-'`       `'-,   )               " +
            "\n             `-'               `-'                " +
            "\n                                                  " + 
            "\n                A  =  ParkLand                    " + 
            "\n                B  =  K9 Precinct                 " + 
            "\n                C  =  Animal Care                 " + 
            "\n                D  =  Animal Shelter              " + 
            "\n                E  =  Jones Bakery                " + 
            "\n                F  =  Steak Heaven                " + 
            "\n                G  =  Tex Mix Drive Inn           " +  
            "\n                H  =  Senior Care                 " +  
            "\n                I  =  The Smiths Home             " + 
            "\n                J  =  Home Sweet Home             " + 
            "\n                K  =  ZooLand                     " +            
            "\n                L  =  Seafood Eatery              " +
            "\n                M  =  Trump School                " + 
            "\n                N  =  Cat Alley                   " +
            "\n                O  =  Fishmonger                  " +
            "\n                P  =  SuperMax Store              " +                      
            "\n                                                  " +
            "\n        To begin, please enter your choice:       " +  
            "\n                                                  " +
            "\n                   X   =  Exit                    " +
            "\n                                                  " +
            "\n==================================================" +
            "\n     Find out who we are and Are we suspects?     " +
            "\n==================================================" );        
    }
    
    @Override
    public boolean doAction(String choice){   
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A": 
                this.console.println(
                        " Parkland it is very beautiful and spacious. It " +
                        "\n has very old oak trees, a large ponds with ducks " +
                        "\n and birds, and a children's playground with lots " +
                        "\n of benches to sit on. It is a good place to play " +
                        "\n run, and meet lots of animals and people.");
                break;
            case "B":
               this.console.println(
                       " K9 Precinct and Training Center. This is the most " +
                       "\n prestegious K9 Unit training in the nation. Your " +
                       "\n are the top K9 police officer and with Ben, who " +
                       "\n is your handler and a police officer, you both " +
                       "\n are the top crime fighting team in the nation!");
                break;
            case "C":
                this.console.println(
                        " The only animal hospital in the city. When you get" +
                        "\n hurt, you see Dr. Mice. You are very loved and " +
                        "\n recieve excellent care as well as all the other" +
                        "\n animals in the city.");
                break;
            case "D":
                this.console.println(
                        " Beware of the local pound. The city has a law that " +
                        "\n says if you don't have a colar or roaming the  " +
                        "\n city without a lease, you will get caught and " +
                        "\n locked up. This is also where you can adopt a " +
                        "\n pet.");
                break; 
            case "E":
                this.console.println(
                        " The local bakery bakes the most savory Bacon Donuts " +
                        "\n in the world. Ben loves to come here everyday to" +
                        "\n to have coffee and donuts. It is your favorite " +
                        "\n place for bacon and Cat DeVil's too.");
                break;
            case "F": 
               this.console.println(
                       " This is the best steakhouse in the city. They will " +
                       "\n cook your steak the way you like it. Ben loves to" +
                       "\n take Nancy here once a month. Recently, the owner" +
                       "\n gave you the biggest, savory bone, that got stolen.");
                break;
            case "G":
                this.console.println(
                        " Your favorite place to get a quick bite to eat with" +
                        "\n with Ben. Cat DeVil likes to hangout in the back.");
                break;
            case "H":
                this.console.println(
                        " The elderly are friendly and loves to pet you. It " +
                        "\n a place where you make sure all is well.");
                break;
            case "I":
               this.console.println(
                       " The Smiths live two houses down the street from your" +
                       "\n house. This where Cat DeVil's gang lives.");
                break; 
            case "J":
                this.console.println(
                        " This is your home. You live with Ben and Nancy." +
                        "\n You have a big backyard and have your own bed" +
                        "\n to sleep in your own room. Ben and Nancy has no" +
                        "\n children living at home.");
                break;
            case "K": 
                this.console.println(
                        " Zooland, the largest Zoo in the city. You love to " +
                        "\n to come here and check out all the differant " +
                        "\n animals. The elephants and girraffes are your" +
                        "\n friends, but stay away from the Tigers.");
                break;
            case "L":
                this.console.println(
                        " Cat DeVils favorite place to eat. The owner loves" +
                        "\n cats and dislikes dogs and police officers. He is" +
                        "\n under investigation of money laundering.");
                break;
            case "M":
                this.console.println(
                        " Local neighborhood elementry school and it is on " +
                        "\n your route. You come everyday to make sure all is" +
                        "\n well and safe for the children.");
                break;
            case "N":
                this.console.println(
                        " Cat DeVils and her gangs, hangout here in the alley." +
                        "\n It is near the fishmonger and Seafood Eatery. You" +
                        "\n are careful in this area. There are so many cats" +
                        "\n here.");
                break;
            case "O":
                this.console.println(
                        " The largest fishmonger in the city. You can find " +
                        "\n all differant fishes, lobster, clams, shrimps, and" +
                        "\n can be cleaned. Almost as famous as Fisherman's" +
                        "\n Warf in Seattle, Washingotn.");
                break;
            case "P":
                this.console.println(
                        " SuperMax Super Market, the largest grocery store in" +
                        "\n the city. The deli section is your favorite place" +
                        "\n that Nancy loves to shop at. She buys you all your" +
                        "\n specialty meats to eat. Cat DeVil and her gang " +
                        "\n hangs out in the back.");
                break;
            default:
                this.console.println("\n***Invalid Selection*** Try again");
                break;         
        }
        return false;  
    }  
}

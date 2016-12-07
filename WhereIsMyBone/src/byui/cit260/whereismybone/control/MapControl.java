package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.exception.MapControlException;
import byui.cit260.whereismybone.model.Actor;
import byui.cit260.whereismybone.model.BackpackItem;
import byui.cit260.whereismybone.model.Clue;
import byui.cit260.whereismybone.model.Location;
import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Player;
import byui.cit260.whereismybone.model.Scene;
import byui.cit260.whereismybone.enums.SceneType;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Rick Smith-original creator coder
 * 
 * 11/18/16 added all 25 scenes with name,mapSymbol,description,dialog,
 * actor,backpackItem, and minute = time limit for each scene
 * 
 * 11/26/16 Maxi fixed errors BackpackItem, and added the 14 clues
 * 
 * 11/26/16 Maxi fixed 11 items for Backpack requirement
 * 14 clues plus 11 items for the Backpack = 25 scenes
 * 
 * 
 */
public class MapControl {

    public static Map createMap() throws MapControlException {
        
        Map map = null;
        
        try{
            //Create and initialize new map
            map = new Map (5, 5);

            //Create all of the scenes for the map
            Scene[] scenes = createScenes();

            //Assign each scene to a location in the map
            GameControl.assignScenesToLocations(map, scenes);    
            map.setCurrentLocation(map.getLocations()[2][2]);
        }
        catch(Exception ex){
                                    
            throw new MapControlException("ERROR: There was a problem with create Map.");
        }
        
        return map;
    }

    public static void moveActorsToStartingLocation(Map map) throws MapControlException
    {
        try{
            movePlayer(map, 2, 2);
        }
        catch(Exception ex){
                                    
            throw new MapControlException("ERROR: There was a problem with create Map.");
        }
        
    }

    private static Scene[] createScenes() throws MapControlException{
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        
        try{
            
            Scene currentScene = null;
            //location 0,0
            currentScene = new Scene();
            currentScene.setName("Parkland");
            currentScene.setMapSymbol("PK");      
            currentScene.setDescription("A beautiful city park with mature oak trees, grass, and picnic tables.");
            currentScene.setDialog("I saw Cat DeVil and he went that way.");
            currentScene.setActor(Actor.Tommy);
            currentScene.setClue(Clue.Clue1);
            currentScene.setBackpack(BackpackItem.CatHairballs);
            currentScene.setMinute(0.25);

            scenes[SceneType.Parkland.ordinal()] = currentScene;

            //location 0,1
            currentScene = new Scene();
            currentScene.setName("VacantHouse");
            currentScene.setMapSymbol("VH");      
            currentScene.setDescription("An old abandon house, very creepy.");
            currentScene.setDialog("My bone must be hear. I can smell it.");
            currentScene.setActor(Actor.Toby);
            currentScene.setClue(Clue.Clue9);
            currentScene.setBackpack(BackpackItem.FishBones);
            currentScene.setMinute(0.25);

            scenes[SceneType.VacantHouse.ordinal()] = currentScene;

            //location 0,2
            currentScene = new Scene();
            currentScene.setName("K9Precinct");
            currentScene.setMapSymbol("K9");      
            currentScene.setDescription("K9 Police Headquarters and Training Center.");
            currentScene.setDialog("Hi Buddy how you doing? On the hunt for Cat DeVil?");
            currentScene.setActor(Actor.Pete);
            currentScene.setBackpack(BackpackItem.Badge);
            currentScene.setMinute(0.25);

            scenes[SceneType.K9Precinct.ordinal()] = currentScene;

            //location 0,3
            currentScene = new Scene();
            currentScene.setName("AnimalCare");
            currentScene.setMapSymbol("AC");      
            currentScene.setDescription("The only animal emergency hospital in the city.");
            currentScene.setDialog("Hello there? Looking for that darn cat?");
            currentScene.setActor(Actor.DrMice);
            currentScene.setClue(Clue.Clue5);
            currentScene.setBackpack(BackpackItem.Bell);
            currentScene.setMinute(0.25);

            scenes[SceneType.AnimalCare.ordinal()] = currentScene;

            //location 0,4
            currentScene = new Scene();
            currentScene.setName("AnimalShelter");
            currentScene.setMapSymbol("AS");      
            currentScene.setDescription("This is the pound where stray animals are kept.");
            currentScene.setDialog("I saw Cat DeVil. He was looking for his gang and left.");
            currentScene.setActor(Actor.MrSam);
            currentScene.setClue(Clue.Clue13);
            currentScene.setMinute(0.25);

            scenes[SceneType.AnimalShelter.ordinal()] = currentScene;

            //location 1, 0
            currentScene = new Scene();
            currentScene.setName("JonesBakery");
            currentScene.setMapSymbol("JB");      
            currentScene.setDescription("Fresh baked goods and your favorite plase for bacon donuts.");
            currentScene.setDialog("Would you like some bacon?");
            currentScene.setActor(Actor.MrJones);
            currentScene.setClue(Clue.Clue4);
            currentScene.setBackpack(BackpackItem.Bacon);
            currentScene.setMinute(0.25);

            scenes[SceneType.JonesBakery.ordinal()] = currentScene;

            //location 1, 1
            currentScene = new Scene();
            currentScene.setName("SeafoodEatery");
            currentScene.setMapSymbol("SE");      
            currentScene.setDescription("A seafood resturant and Cat Devils favorite place to dine.");
            currentScene.setDialog("If that cat was here, I would tell you. I never saw him.");
            currentScene.setActor(Actor.MrCatch);
            currentScene.setClue(Clue.Clue11);
            currentScene.setBackpack(BackpackItem.FishBones);
            currentScene.setMinute(0.25);

            scenes[SceneType.SeafoodEatery.ordinal()] = currentScene;

            //location 1, 2
            currentScene = new Scene();
            currentScene.setName("TexMixDriveInn");
            currentScene.setMapSymbol("TM");      
            currentScene.setDescription("A fast food establishment and a good source for snacks.");
            currentScene.setDialog("Yes, Cat DeVil and his gang was here and went that way.");
            currentScene.setActor(Actor.MsCoCo);
            currentScene.setClue(Clue.Clue3);
            currentScene.setBackpack(BackpackItem.CatHairballs);
            currentScene.setMinute(0.25);

            scenes[SceneType.TexMixDriveInn.ordinal()] = currentScene;

            //location 1, 3
            currentScene = new Scene();
            currentScene.setName("Pond");
            currentScene.setMapSymbol("PD");      
            currentScene.setDescription("Ducks and fishes love the pond at Parkland.");
            currentScene.setDialog("Quack, Quack, I saw that cat.");
            currentScene.setActor(Actor.Ducks);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpack(BackpackItem.CatHairballs);
            currentScene.setMinute(0.25);

            scenes[SceneType.Pond.ordinal()] = currentScene;

            //location 1, 4
            currentScene = new Scene();
            currentScene.setName("CatsAlley");
            currentScene.setMapSymbol("CA");      
            currentScene.setDescription("This is Cat DeVil's and the bad cats hangout.");
            currentScene.setDialog("You came alone...the boss is not here.");
            currentScene.setActor(Actor.Rex);
            currentScene.setClue(Clue.Clue5);
            currentScene.setBackpack(BackpackItem.CatColar);
            currentScene.setMinute(0.25);

            scenes[SceneType.CatsAlley.ordinal()] = currentScene;

            //location 2, 0
            currentScene = new Scene();
            currentScene.setName("SeniorCare");
            currentScene.setMapSymbol("SC");      
            currentScene.setDescription("Elderly Care Home, the best in town.");
            currentScene.setDialog("Hi there Officer, would like some water?");
            currentScene.setActor(Actor.MissEllie);
            currentScene.setClue(Clue.Clue9);
            currentScene.setBackpack(BackpackItem.CatHair);
            currentScene.setMinute(0.25);

            scenes[SceneType.SeniorCare.ordinal()] = currentScene;

            //location 2, 1
            currentScene = new Scene();
            currentScene.setName("SmithHouse");
            currentScene.setMapSymbol("SH");      
            currentScene.setDescription("The Smiths live here, very nice family.");
            currentScene.setDialog("Hi, there off to catch her I see? Good Luck Officer.");
            currentScene.setActor(Actor.TheSmiths);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpack(BackpackItem.CatHairballs);
            currentScene.setMinute(0.25);

            scenes[SceneType.SmithHouse.ordinal()] = currentScene;

            //location 2, 2
            currentScene = new Scene();
            currentScene.setName("Home");
            currentScene.setMapSymbol("HM");      
            currentScene.setDescription("Ben and Nancy provides you with all the comforts of home.");
            currentScene.setDialog("Lets go buddy, off to find your bone.");
            currentScene.setActor(Actor.BenAndNancy);
            currentScene.setClue(Clue.Clue1);
            currentScene.setBackpack(BackpackItem.Bone);
            currentScene.setMinute(0.25);

            scenes[SceneType.Home.ordinal()] = currentScene;

            //location 2, 3
            currentScene = new Scene();
            currentScene.setName("DeVilHouse");
            currentScene.setMapSymbol("DH");      
            currentScene.setDescription("Cat DeVil lives here just two houses away.");
            currentScene.setDialog("Ruff, Ruff, Where are you? What are you doing here?");
            currentScene.setActor(Actor.Rats);
            currentScene.setClue(Clue.Clue3);
            currentScene.setBackpack(BackpackItem.CatHairballs);
            currentScene.setMinute(0.25);

            scenes[SceneType.DeVilHouse.ordinal()] = currentScene;

            //location 2, 4
            currentScene = new Scene();
            currentScene.setName("SuperMax");
            currentScene.setMapSymbol("SM");      
            currentScene.setDescription("Local grocery store where you find evidence that Cat DeVil was there.");
            currentScene.setDialog("I saw Cat DeVil and she went that way.");
            currentScene.setActor(Actor.Scarface);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpack(BackpackItem.CatHair);
            currentScene.setMinute(0.25);

            scenes[SceneType.SuperMax.ordinal()] = currentScene;

            //location 3, 0
            currentScene = new Scene();
            currentScene.setName("Fishmonger");
            currentScene.setMapSymbol("FM");      
            currentScene.setDescription("Cat DeVil's favorite dining place and the largest in the city.");
            currentScene.setDialog("She was here, bones and hairballs all over the place.");
            currentScene.setActor(Actor.MrCatch);
            currentScene.setClue(Clue.Clue11);
            currentScene.setBackpack(BackpackItem.FishBones);
            currentScene.setMinute(0.25);

            scenes[SceneType.Fishmonger.ordinal()] = currentScene;

            //location 3, 1
            currentScene = new Scene();
            currentScene.setName("Zoo");
            currentScene.setMapSymbol("ZO");      
            currentScene.setDescription("This is the local zoo, Mr. Nono is a zookeeper.");
            currentScene.setDialog("I saw Cat DeVil and she around here and has a bone.");
            currentScene.setActor(Actor.MrNono);
            currentScene.setClue(Clue.Clue7);
            currentScene.setBackpack(BackpackItem.CatHair);
            currentScene.setMinute(0.25);

            scenes[SceneType.Zoo.ordinal()] = currentScene;

            //location 3, 2
            currentScene = new Scene();
            currentScene.setName("ElephantsCage");
            currentScene.setMapSymbol("EC");      
            currentScene.setDescription("There are three afircan elephants at Zooland.");
            currentScene.setDialog("I see a box over there, maybe shes hiding in it.");
            currentScene.setActor(Actor.Elephants);
            currentScene.setClue(Clue.Clue6);
            currentScene.setBackpack(BackpackItem.Box);
            currentScene.setMinute(0.25);

            scenes[SceneType.ElephantsCage.ordinal()] = currentScene;

            //location 3, 3
            currentScene = new Scene();
            currentScene.setName("GiraffesCage");
            currentScene.setMapSymbol("GC");      
            currentScene.setDescription("The girrafes are so tall with long legs at Zooland.");
            currentScene.setDialog("I saw Cat DeVil. Quickly, she's in the pipe.");
            currentScene.setActor(Actor.Giraffes);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpack(BackpackItem.CatHair);
            currentScene.setMinute(0.25);

            scenes[SceneType.GiraffesCage.ordinal()] = currentScene;

            //location 3, 4
            currentScene = new Scene();
            currentScene.setName("TigerCage");
            currentScene.setMapSymbol("TC");      
            currentScene.setDescription("The Bengal tigers hangout in Zooland and can roar so loud.");
            currentScene.setDialog("Umm, you look good to eat. If she was here she would of made a tasty treat.");
            currentScene.setActor(Actor.Tigers);
            currentScene.setClue(Clue.Clue9);
            currentScene.setBackpack(BackpackItem.Pipe);
            currentScene.setMinute(0.25);

            scenes[SceneType.TigerCage.ordinal()] = currentScene;

            //location 4, 0
            currentScene = new Scene();
            currentScene.setName("SchoolFront");
            currentScene.setMapSymbol("SF");      
            currentScene.setDescription("Trump Elementry School where you spend your days guarding the children.");
            currentScene.setDialog("Oh, you missed her this morning. She's in the Cat Alley.");
            currentScene.setActor(Actor.Felix);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpack(BackpackItem.CatHair);
            currentScene.setMinute(0.25);

            scenes[SceneType.SchoolFront.ordinal()] = currentScene;

            //location 4, 1
            currentScene = new Scene();
            currentScene.setName("SchoolCafe");
            currentScene.setMapSymbol("SL");      
            currentScene.setDescription("The children loves to feed Cat DeVil and his gang. You too!");
            currentScene.setDialog("You are are my Hero.");
            currentScene.setActor(Actor.Brad);
            currentScene.setClue(Clue.Clue13);
            currentScene.setBackpack(BackpackItem.CatHair);
            currentScene.setMinute(0.25);

            scenes[SceneType.SchoolCafe.ordinal()] = currentScene;

            //location 4, 2
            currentScene = new Scene();
            currentScene.setName("PlayGround");
            currentScene.setMapSymbol("PG");      
            currentScene.setDescription("This is where you meet MrSneed.");
            currentScene.setDialog("How are you today? Ready to work? Do need a drink of water?");
            currentScene.setActor(Actor.MrSneed);
            currentScene.setClue(Clue.Clue3);
            currentScene.setBackpack(BackpackItem.CatHairballs);
            currentScene.setMinute(0.25);

            scenes[SceneType.PlayGround.ordinal()] = currentScene;

            //location 4, 3
            currentScene = new Scene();
            currentScene.setName("TrumpElementry");
            currentScene.setMapSymbol("TE");      
            currentScene.setDescription("K9's love the attention the children gives them.");
            currentScene.setDialog("Come here doggy.");
            currentScene.setActor(Actor.Brad);
            currentScene.setClue(Clue.Clue8);
            currentScene.setBackpack(BackpackItem.CatColar);
            currentScene.setMinute(0.25);

            scenes[SceneType.TrumpElementry.ordinal()] = currentScene;

            //location 4, 4
            currentScene = new Scene();
            currentScene.setName("SteakHeaven");
            currentScene.setMapSymbol("SK");      
            currentScene.setDescription("Famous cuts of meats. This is where you got that bone.");
            currentScene.setDialog("Here's a bone for my favorite K9 dog. Enjoy!");
            currentScene.setActor(Actor.MrSteele);
            currentScene.setClue(Clue.Clue2);
            currentScene.setBackpack(BackpackItem.Bone);
            currentScene.setMinute(0.25);

            scenes[SceneType.SteakHeaven.ordinal()] = currentScene;
        }
        catch(Exception ex){         
            throw new MapControlException("\nERROR: THere was a problem with\r"
                    + "creating scenes.");
        } return scenes;
    }

    public static boolean validLocation(int row,int column) throws MapControlException {
        try{
            if (row < 0 || row > 4) {
                return false;
            }            
        } catch(Exception ex){                                    
            throw new MapControlException("\nERROR: There was a problem with\r "
                    + "validating location.");
        }        
        return !(column < 0 || row > 4);
    }
    
    public static void movePlayerToStartingLocation(Map map) throws MapControlException
    {
        try{
            movePlayer(map, 2, 2);
        }
        catch(Exception ex){
                                    
            throw new MapControlException("\nERROR: There was a problem with\r "
                    + "Moving player to starting location.");
        }
    }
    
    public static int[] movePlayer(int nRow, int nCol) throws MapControlException {// get player location and add the items here from the backpack
        int[] newLoc = null;
        
        try{
            if(!validLocation(nRow, nCol))
            {
                //int[] resultFail = null;
                return newLoc; //returns null
            }
            newLoc = new int[] {nRow, nCol};
        }catch(Exception ex){                          
            throw new MapControlException("ERROR: There was a problem with "
                    + "Moving the player.");
        }
        return newLoc;
       
     }
     public static void movePlayer(Map map, Location location) 
        throws MapControlException {
        Player player = WhereIsMyBone.getCurrentGame().getPlayer();
        
        try{
            player.setLocation(location);
        }
        catch(Exception ex){
                                    
            throw new MapControlException("ERROR: There was a problem with "
                    + "moving the player.");
        }  
    }

    public static void movePlayer(Map map, int row, int column) throws MapControlException {
        
        try{                             
            map.setCurrentLocation(map.getLocations()[row][column]);
            map.getCurrentLocation().setVisited(true);

            map.setCurrentRow(row);
            map.setCurrentColumn(column);

            WhereIsMyBone.getCurrentGame().getPlayer().setLocation(map.getCurrentLocation());
        }
        catch(Exception ex){             
            throw new MapControlException("ERROR: There was a problem with "
                    + "moving the player.");
        }
    }
        
}

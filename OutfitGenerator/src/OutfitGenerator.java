import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;

public class OutfitGenerator {

    public static final String DEFAULTURL = "https://w1.weather.gov/xml/current_obs/display.php?stid=KOSU";

    /**
     * Add accents feature
     *
     * Add the option to keep a piece of clothing and just cycle the other
     * articles of clothing. And also add the laundry timeline component
     *
     */

    public static List<List<Item>> createOutfitWDetails(boolean workout,
            boolean formal, boolean normal) {
        List<List<Item>> clothes = new LinkedList<>();
        List<Item> tops = new LinkedList<>();
        List<Item> bottoms = new LinkedList<>();
        List<Item> shoes = new LinkedList<>();
        List<Item> layers = new LinkedList<>();
        List<Item> empty = new LinkedList<>();
        //List<Object> shoeColors = new LinkedList<>();

        if (normal) {

            Item jacket1 = new Item("blue", "jacket", 4, "all", false,
                    "data/layers/BlueBlueJeanLayer.png", empty,
                    "BlueBlueJeanLayer", true, false);
            Item jacket2 = new Item("blue", "jacket", 3, "all", false,
                    "data/layers/BlueHaymakerLayer.png", empty,
                    "BlueHaymakerLayer", true, true);
            Item jacket3 = new Item("blue", "jacket", 4, "all", false,
                    "data/layers/BlueHoodieFlanelLayer.png", empty,
                    "BlueHoodieFlanelLayer", true, true);
            Item jacket4 = new Item("creme", "jacket", 2, "all", false,
                    "data/layers/CremeDopeLayer.png", empty, "CremeDopeLayer",
                    true, true);
            Item jacket5 = new Item("gray", "jacket", 4, "all", false,
                    "data/layers/GrayCardiganLayer.png", empty,
                    "GrayCardiganLayer", false, false);
            Item jacket6 = new Item("gray", "jacket", 3, "all", false,
                    "data/layers/GrayNikeRehabLayer.png", empty,
                    "GrayNikeRehabLayer", false, true);
            Item jacket7 = new Item("green", "jacket", 4, "all", false,
                    "data/layers/GreenLongHoodieLayer.png", empty,
                    "GreenLongHoodieLayer", true, true);
            Item jacket8 = new Item("yellow", "jacket", 3, "all", false,
                    "data/layers/YellowOakleyFlanelLayer.png", empty,
                    "YellowOakleyFlanelLayer", true, false);
            Item jacket9 = new Item("blue", "jacket", 4, "all", false,
                    "data/layers/AbercrombieBlueJeanJacket.png", empty,
                    "AbercrombieBlueJeanJacket", true, true);
            Item jacket10 = new Item("black", "jacket", 2, "messy", false,
                    "data/layers/AdidasBlackWindBreaker.png", empty,
                    "AdidasBlackWindBreaker", true, false);
            Item jacket11 = new Item("black", "jacket", 5, "all", false,
                    "data/layers/BlackPeaCoat.png", empty, "BlackPeaCoat", true,
                    false);
            Item jacket12 = new Item("green", "jacket", 8, "messy", false,
                    "data/layers/GreenParkaWarm.png", empty, "GreenParkaWarm",
                    true, true);
            // Item jacket13 = new Item("khaki", "jacket", 6, "all", false,
            //       "data/layers/KhakiOvercoat.png", empty, "KhakiOvercoat",
            //     true, false);
            Item jacket14 = new Item("black", "jacket", 3, "all", false,
                    "data/layers/LeatherJacket.png", empty, "LeatherJacket",
                    true, true);
            Item jacket15 = new Item("black", "jacket", 3, "messy", true,
                    "data/layers/LightLuluJacketBlack.png", empty,
                    "LightLuluJacketBlack", true, true);

            layers.add(jacket1);
            layers.add(jacket2);
            layers.add(jacket3);
            layers.add(jacket4);
            layers.add(jacket5);
            layers.add(jacket6);
            layers.add(jacket7);
            layers.add(jacket8);
            layers.add(jacket9);
            layers.add(jacket10);
            layers.add(jacket11);
            layers.add(jacket12);
            //layers.add(jacket13);
            layers.add(jacket14);
            layers.add(jacket15);

            /**
             * start of shirts
             */

            Item shirt1 = new Item("light blue", "top", 1, "all", false,
                    "data/tops/LightBluePrideOfPacificShirt.png", layers,
                    "LightBluePrideOfPacificShirt", true, false);
            Item shirt2 = new Item("gray", "top", 1, "all", false,
                    "data/tops/GraySeizeDesistShirt.png", layers,
                    "GraySeizeDesistShirt", false, false);

            Item shirt4 = new Item("navy", "top", 1, "all", false,
                    "data/tops/NavySeizeDesistShirt.png", layers,
                    "NavySeizeDesistShirt", false, false);

            Item shirt8 = new Item("black", "top", 3, "all", false,
                    "data/tops/BlackLuluWaffleLayer.png", layers,
                    "BlackLuluWaffleLayer", false, false);
            Item shirt9 = new Item("black", "top", 1, "all", false,
                    "data/tops/BlackOhioThetaTop.png", layers,
                    "BlackOhioThetaTop", false, false);
            Item shirt10 = new Item("black", "top", 2, "all", false,
                    "data/tops/BlackPlainLongTop.png", layers,
                    "BlackPlainLongTop", false, false);
            Item shirt11 = new Item("black", "top", 3, "all", false,
                    "data/tops/BlackStripeTop.png", empty, "BlackStripeTop",
                    false, false);
            Item shirt12 = new Item("black", "top", 4, "all", false,
                    "data/tops/BlackTrueGritTop.png", empty, "BlackTrueGritTop",
                    false, false);

            Item shirt13 = new Item("black", "top", 3, "all", false,
                    "data/tops/BlackWaffleLongTop.png", layers,
                    "BlackWaffleLongTop", false, false);
            Item shirt14 = new Item("navy", "top", 1, "all", false,
                    "data/tops/BlueShortSleeveHoodieTop.png", layers,
                    "BlueShortSleeveHoodieTop", false, true);
            Item shirt15 = new Item("navy", "top", 1, "all", false,
                    "data/tops/BlueTatteredShortSleeveTop.png", layers,
                    "BlueTatteredShortSleeveTop", false, false);
            Item shirt16 = new Item("creme", "top", 3, "all", false,
                    "data/tops/CremeInsideOutHoodieTop.png", empty,
                    "CremeInsideOutHoodieTop", true, true);
            Item shirt17 = new Item("creme", "top", 2, "all", false,
                    "data/tops/CremeWaffleGraySweaterTop.png", layers,
                    "CremeWaffleGraySweaterTop", true, false);
            Item shirt18 = new Item("gray", "top", 3, "all", false,
                    "data/tops/GrayCowlNeckTop.png", layers, "GrayCowlNeckTop",
                    false, true);

            Item shirt19 = new Item("gray", "top", 1, "all", false,
                    "data/tops/GrayCurtisTop.png", layers, "GrayCurtisTop",
                    true, false);
            Item shirt20 = new Item("red", "top", 1, "all", false,
                    "data/tops/GrayJacksonHoleTop.png", layers,
                    "GrayJacksonHoleTop", false, false);
            Item shirt21 = new Item("gray", "top", 3, "all", false,
                    "data/tops/GrayLoveUglyTop.png", empty, "GrayLoveUglyTop",
                    false, true);
            Item shirt22 = new Item("gray", "top", 2, "all", false,
                    "data/tops/GrayLuluHoodieThermalTop.png", layers,
                    "GrayLuluHoodieThermalTop", true, true);
            Item shirt23 = new Item("gray", "top", 4, "all", false,
                    "data/tops/GrayNikeHoodieTop.png", empty,
                    "GrayNikeHoodieTop", false, true);

            Item shirt24 = new Item("gray", "top", 3, "all", false,
                    "data/tops/GrayLuluSweatshirtTop.png", empty,
                    "GrayLuluSweatshirtTop", true, true);
            Item shirt25 = new Item("gray", "top", 2, "all", false,
                    "data/tops/GrayPlainLongTop.png", layers,
                    "GrayPlainLongTop", true, false);
            Item shirt26 = new Item("gray", "top", 1, "all", false,
                    "data/tops/GrayStripeTop.png", layers, "GrayStripeTop",
                    true, false);
            Item shirt27 = new Item("gray", "top", 1, "all", false,
                    "data/tops/GrayWaffleShortTop.png", layers,
                    "GrayWaffleShortTop", true, false);
            Item shirt28 = new Item("khaki", "top", 3, "all", false,
                    "data/tops/KhakiWaffleTop.png", layers, "KhakiWaffleTop",
                    true, false);
            Item shirt29 = new Item("maroon", "top", 1, "all", false,
                    "data/tops/MaroonEucyoseTop.png", layers,
                    "MaroonEucyoseTop", true, false);

            Item shirt30 = new Item("white", "top", 2, "all", false,
                    "data/tops/WhiteHanesLongTop.png", layers,
                    "WhiteHanesLongTop", true, false);

            Item shirt32 = new Item("yellow", "top", 4, "all", false,
                    "data/tops/YellowSabreJerseyTop.png", empty,
                    "YellowSabreJerseyTop", true, false);

            Item shirt33 = new Item("maroon", "top", 2, "all", false,
                    "data/tops/MaroonLongChineseTop.png", layers,
                    "MaroonLongChineseTop", true, false);

            Item shirt35 = new Item("olive", "top", 2, "all", false,
                    "data/tops/OliveKanyeTop.png", layers, "OliveKanyeTop",
                    true, false);
            Item shirt36 = new Item("orange", "top", 4, "all", false,
                    "data/tops/OrangeSweatshirtTop.png", empty,
                    "OrangeSweatshirtTop", true, true);

            Item shirt38 = new Item("red", "top", 1, "all", false,
                    "data/tops/RedBuckeyeJerseyTop.png", layers,
                    "RedBuckeyeJerseyTop", true, false);
            Item shirt39 = new Item("green", "top", 1, "all", false,
                    "data/tops/GreenShortFadeTop.png", layers,
                    "GreenShortFadeTop", true, false);
            Item shirt40 = new Item("blue", "top", 1, "all", false,
                    "data/tops/BlueNorthFaceTop.png", layers,
                    "BlueNorthFaceTop", true, false);

            Item shirt41 = new Item("blue", "top", 3, "all", false,
                    "data/tops/BluePenguinPlaidButtonDown.png", empty,
                    "BluePenguinPlaidButtonDown", true, false);

            Item shirt42 = new Item("blue", "top", 1, "all", false,
                    "data/tops/BlueTieDyePublicOpinion.png", layers,
                    "BlueTieDyePublicOpinion", true, false);
            Item shirt43 = new Item("white", "top", 1, "all", false,
                    "data/tops/BombaTieDye.png", layers, "BombaTieDye", true,
                    false);
            Item shirt44 = new Item("brown", "top", 4, "all", false,
                    "data/tops/BrownWhiteHoodie.png", layers,
                    "BrownWhiteHoodie", true, true);
            Item shirt45 = new Item("creme", "top", 1, "all", false,
                    "data/tops/CremeAbercrombieTeeShortSleeve.png", empty,
                    "CremeAbercrombieTeeShortSleeve", true, false);
            Item shirt46 = new Item("creme", "top", 3, "all", false,
                    "data/tops/CremeStripedLongSleeve.png", layers,
                    "CremeStripedLongSleeve", false, false);

            Item shirt48 = new Item("green", "top", 3, "all", false,
                    "data/tops/OlivePenguinPlaidButtonDown.png", layers,
                    "OlivePenguinPlaidButtonDown", true, false);
            Item shirt49 = new Item("purple", "top", 4, "all", false,
                    "data/tops/PurpleNRackHoodie.png", layers,
                    "PurpleNRackHoodie", true, false);

            tops.add(shirt1);
            tops.add(shirt2);

            tops.add(shirt4);

            tops.add(shirt8);
            tops.add(shirt9);
            tops.add(shirt10);
            tops.add(shirt11);
            tops.add(shirt12);
            tops.add(shirt13);
            tops.add(shirt14);
            tops.add(shirt15);
            tops.add(shirt16);
            tops.add(shirt17);
            tops.add(shirt18);
            tops.add(shirt19);
            tops.add(shirt20);
            tops.add(shirt21);
            tops.add(shirt22);
            tops.add(shirt23);
            tops.add(shirt24);
            tops.add(shirt25);
            tops.add(shirt26);
            tops.add(shirt27);
            tops.add(shirt28);
            tops.add(shirt29);
            tops.add(shirt30);

            tops.add(shirt32);
            tops.add(shirt33);

            tops.add(shirt35);
            tops.add(shirt36);
            tops.add(shirt38);
            tops.add(shirt39);
            tops.add(shirt40);
            tops.add(shirt41);
            tops.add(shirt42);
            tops.add(shirt43);
            tops.add(shirt44);
            tops.add(shirt45);
            tops.add(shirt46);
            tops.add(shirt48);
            tops.add(shirt49);

            /**
             * start of pants
             */

            Item pant1 = new Item("gray", "bottom", 3, "all", false,
                    "data/bottoms/GrayLuluPants.png", empty, "GrayLuluPants",
                    false, false);

            Item pant2 = new Item("silver", "bottom", 3, "all", false,
                    "data/bottoms/SilverLuluPants.png", empty,
                    "SilverLuluPants", true, false);

            Item pant4 = new Item("blue", "bottom", 4, "all", false,
                    "data/bottoms/BlueLuluBottom.png", empty, "BlueLuluBottom",
                    false, false);

            Item pant5 = new Item("gray", "bottom", 3, "all", false,
                    "data/bottoms/GrayLuluBottom.png", empty, "GrayLuluBottom",
                    false, false);

            Item pant7 = new Item("khaki", "bottom", 3, "all", false,
                    "data/bottoms/KhakiLuluBottom.png", empty,
                    "KhakiLuluBottom", true, false);

            Item pant8 = new Item("khaki", "bottom", 3, "all", false,
                    "data/bottoms/KhakiWranglerBottom.png", empty,
                    "KhakiWranglerBottom", true, false);
            Item pant9 = new Item("orange", "bottom", 3, "all", false,
                    "data/bottoms/OrangeLuluBottom.png", empty,
                    "OrangeLuluBottom", true, false);
            Item pant10 = new Item("black", "bottom", 3, "all", false,
                    "data/bottoms/BlackLuluPants.png", empty, "BlackLuluPants",
                    false, false);

            bottoms.add(pant1);
            bottoms.add(pant2);
            //bottoms.add(pant3);
            bottoms.add(pant4);
            bottoms.add(pant5);

            bottoms.add(pant7);
            bottoms.add(pant8);
            bottoms.add(pant9);
            bottoms.add(pant10);

            /**
             * start of shoe
             */

            Item shoe2 = new Item("maroon", "shoe", 3, "all", false,
                    "data/shoes/MaroonAllBirdsShoes.png", empty,
                    "MaroonAllBirdsShoes", true, false);
            Item shoe3 = new Item("black", "shoe", 3, "messy", false,
                    "data/shoes/RedUGGBoots.png", empty, "RedUGGBoots", true,
                    false);
            Item shoe4 = new Item("white", "shoe", 3, "all", false,
                    "data/shoes/WhiteNewBalanceShoes.png", empty,
                    "WhiteNewBalanceShoes", true, false);
            Item shoe5 = new Item("white", "shoe", 3, "all", false,
                    "data/shoes/WhiteNikeShoes.png", empty, "WhiteNikeShoes",
                    true, false);
            Item shoe6 = new Item("yellow", "shoe", 3, "all", false,
                    "data/shoes/CheckeredVans.png", empty, "CheckeredVans",
                    true, false);

            Item shoe7 = new Item("orange", "shoe", 3, "all", false,
                    "data/shoes/OrangeLoaferShoe.png", empty,
                    "OrangeLoaferShoe", true, false);
            Item shoe8 = new Item("blue", "shoe", 3, "all", false,
                    "data/shoes/NavyGraySneakers.png", empty,
                    "NavyGraySneakers", true, false);
            Item shoe9 = new Item("white", "shoe", 3, "all", false,
                    "data/shoes/WhiteHighNikeTop.png", empty,
                    "WhiteHighNikeTop", true, false);

            shoes.add(shoe2);
            shoes.add(shoe3);
            shoes.add(shoe4);
            shoes.add(shoe5);
            shoes.add(shoe6);
            shoes.add(shoe7);
            shoes.add(shoe8);
            shoes.add(shoe9);
            clothes.add(tops);
            clothes.add(bottoms);
            clothes.add(shoes);

        } //end of normal conditional

        else if (formal) {

        }

        else if (workout) {

        }
        return clothes;

    }

    public static int modIndex(int a, int b) {
        return -1;
    }

    public static Map<String, String> getTemp(String s) {
        Map<String, String> weatherAndTemp = new HashMap<>();
        XMLTree xml = new XMLTree1(s);
        String temperature = "";
        String weather = "";
        for (int i = 0; i < xml.numberOfChildren(); i++) {
            if (xml.child(i).label().equals("temp_f")) {
                temperature = xml.child(i).child(0).toString();
            }
            if (xml.child(i).label().equals("weather")) {
                weather = xml.child(i).child(0).toString();
            }
        }
        weatherAndTemp.put("temp", temperature);
        weatherAndTemp.put("weather", weather);
        return weatherAndTemp;
    }

    public static HashSet<String> makeRulesAndClassifications(String... args) {

        HashSet<String> set = new HashSet<>();
        for (String s : args) {
            set.add(s);
        }

        return set;
    }

    public static List<Item> getOutfit(List<List<Item>> clothes,
            Map<String, String> tempAndWeather, boolean formal,
            List<Item> topsLaundry, List<Item> bottomsLaundry) {

        Scanner input = new Scanner(System.in);

        HashSet<String> colors = makeRulesAndClassifications("red", "blue",
                "light blue", "green", "orange", "purple", "yellow", "navy",
                "olive", "maroon");
        HashSet<String> lights = makeRulesAndClassifications("red", "orange",
                "khaki", "yellow", "olive", "gray", "light blue");
        HashSet<String> shades = makeRulesAndClassifications("Creme", "khaki",
                "black", "gray", "white", "navy");

        HashSet<String> badWeatherShoes = makeRulesAndClassifications(
                "put bad weather shoes here");

        List<Object> shoeColors = new LinkedList<>();

        for (int i = 0; i < clothes.get(2).size(); i++) {

            shoeColors.add(clothes.get(2).get(i).color);

        }

        int rand = (int) (Math.random() * clothes.size());

        boolean topComplete = false;
        boolean bottomComplete = false;
        boolean shoeComplete = false;
        boolean pantsColor = true;
        int temperature = 5;
        int tempTemperature = (int) Double
                .parseDouble(tempAndWeather.get("temp"));

        if (tempTemperature <= 55) {
            if (tempTemperature < 15) {
                temperature = 10;
            } else if (tempTemperature < 40) {
                temperature = 8;
            } else {
                temperature = 7;
            }
        } else if (tempTemperature > 60) {
            if (tempTemperature > 80) {
                temperature = 1;
            } else if (tempTemperature > 70) {
                temperature = 2;
            } else {
                temperature = 3;
            }
        } else {
            temperature = 5;
        }

        String tempWeather = tempAndWeather.get("weather");
        String weather;
        if (tempWeather.toLowerCase().contains("rain")
                || tempWeather.toLowerCase().contains("snow")
                || tempWeather.toLowerCase().contains("mist")) {
            weather = "messy";
        } else {
            weather = "all";
        }

        boolean override = false;
        Item top = null;
        Item bottom = null;
        Item shoe = null;
        Item layer = null;

        System.out.println("temp: " + temperature + "\n\n");
        List<Item> tops = getTop(clothes.get(0), tempAndWeather, formal,
                temperature, topsLaundry, colors);

        top = tops.get(0);
        if (tops.size() > 1) {
            System.out.println("Layer found:");

            layer = tops.get(1);
            System.out.println(layer.getItemName());
        }

        System.out.println("\nTop Found:");
        System.out.println(top.itemName);
        List<Item> outfit = new LinkedList<>();
        outfit.add(top);

        bottom = getBottom(clothes.get(1), tempAndWeather, formal, pantsColor,
                colors, lights, shades, outfit, bottomsLaundry);

        outfit.add(bottom);

        System.out.println("\nBottom Found:");
        System.out.println(bottom.itemName);

        shoe = getShoes(clothes.get(2), tempAndWeather, formal, weather, colors,
                lights, shades, top, bottom, outfit);

        System.out.println("\nShoe Found:");
        System.out.println(shoe.itemName);
        outfit.add(shoe);

        List<Boolean> vetoes = veto();
        HashSet<Item> tempSet = new HashSet<>();

        for (int i = 0; i < vetoes.size(); i++) {
            if (vetoes.get(0) == true && i == 0) {
                while (vetoes.get(i) == true) {
                    tempSet.add(outfit.remove(i));

                    tops = getTop(clothes.get(0), tempAndWeather, formal,
                            temperature, topsLaundry, colors);
                    top = tops.get(0);
                    if (tops.size() > 1) {
                        layer = tops.get(1);
                    }
                    while (tempSet.contains(top)) {
                        tops = getTop(clothes.get(0), tempAndWeather, formal,
                                temperature, topsLaundry, colors);
                        top = tops.get(0);
                        if (tops.size() > 1) {
                            layer = tops.get(1);
                        }

                    }
                    System.out.println("\n\n" + top.itemName);
                    if (tops.size() > 1) {
                        System.out.println("With layer: " + layer.itemName);
                    }
                    System.out.println("\nVeto shirt? Y or N");

                    String shirtVeto = input.nextLine();
                    Boolean shirt = shirtVeto.equals("y");

                    vetoes.remove(i);
                    vetoes.add(i, shirt);
                    outfit.add(i, top);

                }
            }
            tempSet.clear();
            if (vetoes.get(1) == true && i == 1) {
                while (vetoes.get(i) == true) {
                    tempSet.add(outfit.remove(i));
                    bottom = getBottom(clothes.get(1), tempAndWeather, formal,
                            pantsColor, colors, lights, shades, outfit,
                            bottomsLaundry);
                    while (tempSet.contains(bottom)) {
                        bottom = getBottom(clothes.get(1), tempAndWeather,
                                formal, pantsColor, colors, lights, shades,
                                outfit, bottomsLaundry);

                    }
                    System.out.println(bottom.itemName);
                    System.out.println("Veto bottoms? Y or N");
                    String bottomVeto = input.nextLine();
                    Boolean bottoms = bottomVeto.equals("y");
                    vetoes.remove(i);
                    vetoes.add(i, bottoms);
                    outfit.add(i, bottom);
                }
            }
            tempSet.clear();
            if (vetoes.get(2) == true && i == 2) {
                while (vetoes.get(i) == true) {

                    tempSet.add(outfit.remove(i));
                    shoe = getShoes(clothes.get(2), tempAndWeather, formal,
                            weather, colors, lights, shades, top, bottom,
                            outfit);
                    while (tempSet.contains(shoe)) {
                        shoe = getShoes(clothes.get(2), tempAndWeather, formal,
                                weather, colors, lights, shades, top, bottom,
                                outfit);

                    }
                    System.out.println(shoe.itemName);
                    System.out.println("Veto shoe? Y or N");
                    String shoeVeto = input.nextLine();
                    Boolean shoes = shoeVeto.equals("y");
                    vetoes.remove(i);
                    vetoes.add(i, shoes);

                    outfit.add(i, shoe);

                }
            }
        }

        if (tops.size() > 1) {
            outfit.add(layer);
        }
        topsLaundry.add(top);
        bottomsLaundry.add(bottom);

        return outfit;
    }

    public static List<Item> getTop(List<Item> clothes,
            Map<String, String> tempAndWeather, boolean formal, int temp,
            List<Item> topsLaundry, HashSet<String> colors) {
        List<Item> tops = new LinkedList<>();

        int rand = (int) (Math.random() * clothes.size());

        boolean topComplete = false;
        int temperature = temp;

        String tempWeather = tempAndWeather.get("weather");
        String weather;
        if (tempWeather.equals("Rain") || tempWeather.equals("Snow")) {
            weather = "messy";
        } else {
            weather = "all";
        }

        boolean override = false;
        Item top = null;
        Item layer = null;

        while (!topComplete) {

            top = clothes.get(rand);

            topComplete = true;

            if (temperature > 4) {
                if ((top.heatRating + 1) < temperature
                        && top.layeringOptions.size() > 0) {

                    int j = top.layeringOptions.size();
                    if (j < 1) {
                        topComplete = false;
                    }
                    while (j > 0 && !override) {
                        int heatRatingTotal = top.heatRating
                                + top.layeringOptions.get(j - 1).heatRating;

                        if (temperature - heatRatingTotal < 2) {

                            layer = top.layeringOptions.get(j - 1);
                            if (!(colors.contains(layer.color)
                                    && colors.contains(top.color))) {
                                override = true;
                                topComplete = true;
                            } else {
                                topComplete = false;
                            }
                            if (top.hood && layer.hood) {
                                topComplete = false;
                            }
                            if ((layer.formal && !formal)
                                    || (!layer.formal && formal)) {
                                topComplete = false;
                            }
                            if ((!colors.contains(layer.color)
                                    && !colors.contains(top.color))) {
                                topComplete = false;
                            }

                        } else {
                            topComplete = false;

                        }
                        j--;
                    }

                } else {
                    topComplete = false;

                }
            } else if (temperature <= 3) {

                if ((top.heatRating + 1) < temperature
                        || (top.heatRating - 1) > temperature) {
                    topComplete = false;
                }
            }

            if (topsLaundry.contains(top)) {
                topComplete = false;
            }

            if (formal && !top.formal || !formal && top.formal) {
                override = false;
                topComplete = false;
            }

            rand = (rand < clothes.size() - 1) ? rand + 1 : 0;

        } //end of while

        if (override) {
            tops.add(top);
            tops.add(layer);
        } else {
            tops.add(top);
        }

        return tops;

    }

    public static Item getBottom(List<Item> clothes,
            Map<String, String> tempAndWeather, boolean formal,
            boolean pantsColor, HashSet<String> colors, HashSet<String> lights,
            HashSet<String> shades, List<Item> outfit,
            List<Item> bottomsLaundry) {

        int rand = (int) (Math.random() * clothes.size());

        boolean bottomComplete = false;

        Item top = outfit.get(0);
        Item bottom = null;

        while (!bottomComplete) {

            bottom = clothes.get(rand);

            bottomComplete = true;

            if (top.bright && bottom.bright) {

                bottomComplete = false;
            }
            if (!top.bright && !bottom.bright) {

                bottomComplete = false;
            }
            //Create discrepancy between pant and short threshold

            if (!pantsColor && colors.contains(bottom.color)) {
                bottomComplete = false;
            }

            if (formal && !bottom.formal) {
                bottomComplete = false;
            }
            if (bottomsLaundry.contains(bottom)) {
                bottomComplete = false;
            }
            if ((top.color.equals("gray") || top.color.equals("blue"))
                    && (bottom.color.equals("gray")
                            || bottom.color.equals("blue"))) {
                bottomComplete = false;
            }

            rand = (rand < clothes.size() - 1) ? rand + 1 : 0;

        } //end of while

        return bottom;

    }

    public static Item getShoes(List<Item> clothes,
            Map<String, String> tempAndWeather, boolean formal, String weather,
            HashSet<String> colors, HashSet<String> lights,
            HashSet<String> shades, Item top, Item bottom, List<Item> outfit) {

        List<Object> shoeColors = new LinkedList<>();

        for (int i = 0; i < clothes.size(); i++) {
            if (clothes.get(i).type.equals("shoe")) {
                shoeColors.add(clothes.get(i).color);
            }
        }

        int rand = (int) (Math.random() * clothes.size());

        Item shoe = null;

        boolean shoeComplete = false;
        boolean pantsColor = colors.contains(bottom.color);

        while (!shoeComplete) {

            shoe = clothes.get(rand);

            shoeComplete = true;

            if (pantsColor && colors.contains(shoe.color)) {
                shoeComplete = false;
            }

            if (bottom.color.equals(shoe.color)) {
                shoeComplete = false;
            }
            if (!shoe.weather.equals(weather)) {
                shoeComplete = false;
            }
            if (colors.contains(top) && !top.color.equals(shoe.color)) {
                shoeComplete = false;
            }

            rand = (rand < clothes.size() - 1) ? rand + 1 : 0;

        } //end of while

        return shoe;

    }

    public static List<Boolean> veto() {
        System.out.println("\nVeto shirt? Y/N");
        Scanner input = new Scanner(System.in);
        String shirtVeto = input.nextLine();
        Boolean shirt = shirtVeto.equals("y");
        System.out.println("Veto Bottoms?");
        String bottomVeto = input.nextLine();
        Boolean bottom = bottomVeto.equals("y");
        System.out.println("Veto Shoes?");
        String shoesVeto = input.nextLine();
        Boolean shoes = shoesVeto.equals("y");
        LinkedList<Boolean> list = new LinkedList<>();
        list.add(shirt);
        list.add(bottom);
        list.add(shoes);

        return list;

    }

    public static void clearLaundry(List<Item> topsLaundry,
            List<Item> bottomsLaundry) {

        topsLaundry.clear();
        bottomsLaundry.clear();

    }

    public static void main(String[] args) {
        List<Item> topsLaundry = new LinkedList<>();
        List<Item> bottomsLaundry = new LinkedList<>();
        Map<String, String> tempAndWeather = getTemp(
                "https://w1.weather.gov/xml/current_obs/display.php?stid=KOSU");
        SimpleWriter out = new SimpleWriter1L("index.html");
        //SimpleReader in = new SimpleReader1L("data/indexTemplate");
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Enter mode(w for workout, f for formal or n for normal): ");
        String answer = input.nextLine();

        int lastLaundry = 0;

        System.out.print("Have you done the laundry since " + lastLaundry
                + " days ago?(y/n): ");
        boolean laundry = input.nextLine().equals("y");

        boolean workout = (answer.equals("w"));
        boolean formal = (answer.equals("f"));
        boolean normal = (answer.equals("n"));

        List<List<Item>> clothes = createOutfitWDetails(workout, formal,
                normal);

        if (laundry) {
            clearLaundry(topsLaundry, bottomsLaundry);
        }

        List<Item> output = getOutfit(clothes, tempAndWeather, formal,
                topsLaundry, bottomsLaundry);
        System.out.println(tempAndWeather);
        output.forEach(e -> System.out.println(e.itemName));
        input.close();

        SimpleReader in = new SimpleReader1L("data/indexTemplate");
        while (!in.atEOS()) {

            String next = in.nextLine();
            if (next.contains("here")) {
                while (output.size() > 0) {

                    Item temp = output.remove(0);

                    out.println("<img src=\"" + temp.itemPath
                            + "\"alt=\"picture of me\"></img><br />("
                            + temp.itemName + ")");

                    out.println("<ul> </ul><ul> </ul>");
                }

            } else {
                out.println(next);
            }
        }

        in.close();
        out.close();

    }

}//end of RSSReader class

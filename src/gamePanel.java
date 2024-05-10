import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class gamePanel extends JPanel {
    ArrayList<gameButton> array = new ArrayList<gameButton>();
    public static gameButton correct;
public static int score;


    public gamePanel() {
        super(new GridLayout(12, 16));
        score = 0;
        array.add(new gameButton(new Color(10, 143, 80), "Leprechaun", 0));
        array.add(new gameButton(new Color(11, 159, 88), "Sea", 1));
        array.add(new gameButton(new Color(10, 177, 97), "Lime", 2));
        array.add(new gameButton(new Color(36, 189, 118), "Jungle", 3));
        array.add(new gameButton(new Color(67, 201, 140), "Teal", 4));
        array.add(new gameButton(new Color(102, 203, 156), "Mint", 5));
        array.add(new gameButton(new Color(147, 222, 189), "Turquoise", 6));
        array.add(new gameButton(new Color(196, 233, 215), "Doctor's Office", 7));
        array.add(new gameButton(new Color(245, 213, 206), "Salmon", 8));
        array.add(new gameButton(new Color(243, 178, 164), "Dusty Rose", 9));
        array.add(new gameButton(new Color(243, 146, 125), "Peach Skin", 10));
        array.add(new gameButton(new Color(244, 115, 82), "Indian Red", 11));
        array.add(new gameButton(new Color(243, 80, 42), "Vermilion", 12));
        array.add(new gameButton(new Color(244, 52, 8), "Scarlet", 13));
        array.add(new gameButton(new Color(221, 44, 7), "Burnt Orange", 14));
        array.add(new gameButton(new Color(198, 39, 6), "Crimson", 15));
        array.add(new gameButton(new Color(18, 133, 6), "Forest", 16));
        array.add(new gameButton(new Color(21, 149, 5), "Clover", 17));
        array.add(new gameButton(new Color(21, 166, 10), "Alien", 18));
        array.add(new gameButton(new Color(48, 180, 32), "Leaf", 19));
        array.add(new gameButton(new Color(76, 191, 67), "Fake Grass", 20));
        array.add(new gameButton(new Color(112, 205, 103), "Sage", 21));
        array.add(new gameButton(new Color(151, 219, 146), "Ultramarine", 22));
        array.add(new gameButton(new Color(196, 231, 195), "Honeydew", 23));
        array.add(new gameButton(new Color(246, 204, 205), "Baby Girl", 24));
        array.add(new gameButton(new Color(245, 163, 166), "Millenial Pink", 25));
        array.add(new gameButton(new Color(243, 124, 124), "Blush", 26));
        array.add(new gameButton(new Color(246, 82, 83), "Flamingo", 27));
        array.add(new gameButton(new Color(245, 44, 43), "Strawberry", 28));
        array.add(new gameButton(new Color(245, 10, 10), "Blood", 29));
        array.add(new gameButton(new Color(223, 9, 8), "Candy Apple", 30));
        array.add(new gameButton(new Color(196, 6, 5), "Carmine", 31));
        array.add(new gameButton(new Color(57, 143, 6), "Shamrock Shake", 32));
        array.add(new gameButton(new Color(65, 161, 10), "Lawn", 33));
        array.add(new gameButton(new Color(74, 178, 8), "Green", 34));
        array.add(new gameButton(new Color(96, 189, 35), "Slime", 35));
        array.add(new gameButton(new Color(120, 201, 69), "Mantis", 36));
        array.add(new gameButton(new Color(150, 212, 106), "Fresh Pear", 37));
        array.add(new gameButton(new Color(175, 223, 150), "Pistachio", 38));
        array.add(new gameButton(new Color(209, 235, 196), "Ivy", 39));
        array.add(new gameButton(new Color(238, 201, 213), "Piggy Bank", 40));
        array.add(new gameButton(new Color(236, 159, 185), "Carnation", 41));
        array.add(new gameButton(new Color(231, 118, 153), "Rouge", 42));
        array.add(new gameButton(new Color(227, 78, 126), "Fucsia", 43));
        array.add(new gameButton(new Color(225, 38, 99), "Ruby", 44));
        array.add(new gameButton(new Color(218, 6, 70), "Barbie", 45));
        array.add(new gameButton(new Color(195, 4, 65), "Amaranth", 46));
        array.add(new gameButton(new Color(176, 6, 58), "Rose", 47));
        array.add(new gameButton(new Color(109, 154, 8), "Mold", 48));
        array.add(new gameButton(new Color(122, 172, 8), "Moss", 49));
        array.add(new gameButton(new Color(135, 191, 13), "Lime", 50));
        array.add(new gameButton(new Color(151, 200, 38), "Booger", 51));
        array.add(new gameButton(new Color(168, 208, 72), "Lizard", 52));
        array.add(new gameButton(new Color(184, 218, 110), "Tea Leaf", 53));
        array.add(new gameButton(new Color(206, 227, 152), "Fennel", 54));
        array.add(new gameButton(new Color(224, 236, 198), "Cloud", 55));
        array.add(new gameButton(new Color(236, 199, 222), "Pink Lace", 56));
        array.add(new gameButton(new Color(228, 152, 198), "Wild Orchid", 57));
        array.add(new gameButton(new Color(218, 110, 179), "Mulberry", 58));
        array.add(new gameButton(new Color(209, 70, 160), "Magenta", 59));
        array.add(new gameButton(new Color(200, 37, 140), "Fandango", 60));
        array.add(new gameButton(new Color(191, 4, 120), "Mulberry", 61));
        array.add(new gameButton(new Color(191, 4, 120), "Barbie", 62));
        array.add(new gameButton(new Color(173, 5, 109), "Jazzberry", 63));
        array.add(new gameButton(new Color(149, 175, 13), "Aloe", 64));
        array.add(new gameButton(new Color(167, 197, 10), "Alligator", 65));
        array.add(new gameButton(new Color(185, 220, 10), "Avocado", 66));
        array.add(new gameButton(new Color(196, 224, 40), "Succulent", 67));
        array.add(new gameButton(new Color(205, 228, 76), "Brussels Sprouts", 68));
        array.add(new gameButton(new Color(215, 230, 118), "Tennis Ball", 69));
        array.add(new gameButton(new Color(222, 236, 160), "Unripe Strawberry", 70));
        array.add(new gameButton(new Color(234, 240, 202), "Cauliflower", 71));
        array.add(new gameButton(new Color(232, 195, 234), "Lavender", 72));
        array.add(new gameButton(new Color(220, 146, 221), "Lilac", 73));
        array.add(new gameButton(new Color(206, 106, 210), "African Violet", 74));
        array.add(new gameButton(new Color(196, 67, 196), "Munsell", 75));
        array.add(new gameButton(new Color(183, 34, 187), "Plum", 76));
        array.add(new gameButton(new Color(171, 5, 176), "Mardi Gras", 77));
        array.add(new gameButton(new Color(153, 6, 157), "Byzantine", 78));
        array.add(new gameButton(new Color(138, 5, 139), "Eminence", 79));
        array.add(new gameButton(new Color(197, 196, 13), "Flaxen", 80));
        array.add(new gameButton(new Color(222, 221, 13), "Chartreuse", 81));
        array.add(new gameButton(new Color(244, 244, 13), "Lemon", 82));
        array.add(new gameButton(new Color(244, 244, 47), "Highlighter", 83));
        array.add(new gameButton(new Color(244, 244, 84), "Electricity", 84));
        array.add(new gameButton(new Color(244, 244, 125), "Lightning", 85));
        array.add(new gameButton(new Color(244, 244, 163), "Banana", 86));
        array.add(new gameButton(new Color(243, 244, 204), "Pearl", 87));
        array.add(new gameButton(new Color(213, 191, 231), "Thistle", 88));
        array.add(new gameButton(new Color(188, 143, 216), "Periwinkle", 89));
        array.add(new gameButton(new Color(159, 100, 201), "Amethyst", 90));
        array.add(new gameButton(new Color(137, 64, 185), "Violet", 91));
        array.add(new gameButton(new Color(116, 29, 171), "Grape", 92));
        array.add(new gameButton(new Color(94, 2, 157), "Indigo", 93));
        array.add(new gameButton(new Color(86, 2, 143), "Velour", 94));
        array.add(new gameButton(new Color(78, 2, 125), "Eggplant", 95));
        array.add(new gameButton(new Color(197, 175, 6), "Mustard", 96));
        array.add(new gameButton(new Color(221, 195, 9), "Bumblebee", 97));
        array.add(new gameButton(new Color(245, 217, 15), "Melted Butter", 98));
        array.add(new gameButton(new Color(244, 222, 44), "Pineapple", 99));
        array.add(new gameButton(new Color(246, 224, 84), "Macaroon", 100));
        array.add(new gameButton(new Color(245, 229, 125), "Canary", 101));
        array.add(new gameButton(new Color(244, 238, 163), "Sugar Cookie", 102));
        array.add(new gameButton(new Color(241, 236, 203), "Buttermilk", 103));
        array.add(new gameButton(new Color(202, 193, 230), "Dusk", 104));
        array.add(new gameButton(new Color(162, 145, 213), "Mauve", 105));
        array.add(new gameButton(new Color(127, 101, 201), "Wisteria", 106));
        array.add(new gameButton(new Color(96, 64, 187), "Ultraviolet", 107));
        array.add(new gameButton(new Color(67, 30, 174), "Berry", 108));
        array.add(new gameButton(new Color(41, 2, 162), "Navy", 109));
        array.add(new gameButton(new Color(38, 1, 146), "Dark Denim", 110));
        array.add(new gameButton(new Color(34, 2, 126), "Admiral", 111));
        array.add(new gameButton(new Color(195, 157, 12), "Goldenrod", 112));
        array.add(new gameButton(new Color(222, 172, 10), "Golden Coin", 113));
        array.add(new gameButton(new Color(245, 192, 14), "Treasure Chest", 114));
        array.add(new gameButton(new Color(244, 201, 44), "Sunflower", 115));
        array.add(new gameButton(new Color(245, 210, 83), "Laguna", 116));
        array.add(new gameButton(new Color(245, 217, 124), "Eggnog", 117));
        array.add(new gameButton(new Color(244, 226, 163), "Cream", 118));
        array.add(new gameButton(new Color(244, 237, 205), "Off-white", 119));
        array.add(new gameButton(new Color(194, 195, 231), "Thick Ice", 120));
        array.add(new gameButton(new Color(146, 152, 219), "Ube", 121));
        array.add(new gameButton(new Color(105, 111, 204), "Iris", 122));
        array.add(new gameButton(new Color(65, 76, 191), "Majorelle", 123));
        array.add(new gameButton(new Color(25, 39, 155), "Azure", 124));
        array.add(new gameButton(new Color(2, 19, 162), "Trypan", 125));
        array.add(new gameButton(new Color(2, 16, 145), "Air force", 126));
        array.add(new gameButton(new Color(2, 16, 129), "French Navy", 127));
        array.add(new gameButton(new Color(195, 133, 7), "Mango", 128));
        array.add(new gameButton(new Color(219, 149, 10), "Corn", 129));
        array.add(new gameButton(new Color(243, 166, 8), "Tangerine", 130));
        array.add(new gameButton(new Color(244, 179, 43), "Amber", 131));
        array.add(new gameButton(new Color(244, 192, 82), "School Bus", 132));
        array.add(new gameButton(new Color(244, 206, 126), "Peach", 133));
        array.add(new gameButton(new Color(244, 218, 163), "Champagne", 134));
        array.add(new gameButton(new Color(244, 230, 204), "Ivory", 135));
        array.add(new gameButton(new Color(194, 205, 229), "Egg Shell", 136));
        array.add(new gameButton(new Color(146, 168, 218), "Sky", 137));
        array.add(new gameButton(new Color(105, 135, 207), "Baby Boy", 138));
        array.add(new gameButton(new Color(64, 107, 192), "Cerulean", 139));
        array.add(new gameButton(new Color(33, 78, 181), "Blue Jeans", 140));
        array.add(new gameButton(new Color(2, 55, 168), "Persian", 141));
        array.add(new gameButton(new Color(2, 49, 152), "American Flag", 142));
        array.add(new gameButton(new Color(2, 45, 135), "Royal", 143));
        array.add(new gameButton(new Color(196, 112, 7), "Honey", 144));
        array.add(new gameButton(new Color(222, 126, 6), "Fresh Orange", 145));
        array.add(new gameButton(new Color(246, 139, 9), "Kumquat", 146));
        array.add(new gameButton(new Color(246, 157, 44), "Deep Safron", 147));
        array.add(new gameButton(new Color(244, 174, 83), "Melon", 148));
        array.add(new gameButton(new Color(246, 191, 123), "Navajo White", 149));
        array.add(new gameButton(new Color(245, 208, 165), "Pumpkin Seeds", 150));
        array.add(new gameButton(new Color(243, 226, 205), "Bone", 151));
        array.add(new gameButton(new Color(194, 215, 231), "Powder Blue", 152));
        array.add(new gameButton(new Color(150, 186, 221), "Uranian", 153));
        array.add(new gameButton(new Color(105, 159, 206), "Nurse Scrubs", 154));
        array.add(new gameButton(new Color(68, 135, 196), "Carolina", 155));
        array.add(new gameButton(new Color(35, 114, 184), "Steel", 156));
        array.add(new gameButton(new Color(4, 93, 174), "Cornflower", 157));
        array.add(new gameButton(new Color(4, 82, 155), "Honolulu", 158));
        array.add(new gameButton(new Color(5, 75, 135), "Imperial Blue", 159));
        array.add(new gameButton(new Color(197, 94, 10), "Burnt Orange", 160));
        array.add(new gameButton(new Color(221, 106, 9), "Pumpkin", 161));
        array.add(new gameButton(new Color(244, 117, 9), "Tiger", 162));
        array.add(new gameButton(new Color(244, 138, 47), "Apricot", 163));
        array.add(new gameButton(new Color(244, 159, 83), "Sunrise", 164));
        array.add(new gameButton(new Color(244, 180, 125), "Cantaloupe", 165));
        array.add(new gameButton(new Color(245, 202, 163), "Wheat", 166));
        array.add(new gameButton(new Color(243, 223, 205), "Coconut", 167));
        array.add(new gameButton(new Color(194, 221, 232), "Mist", 168));
        array.add(new gameButton(new Color(150, 198, 223), "Maya Blue", 169));
        array.add(new gameButton(new Color(109, 178, 211), "French Shore", 170));
        array.add(new gameButton(new Color(68, 159, 203), "Pacific Ocean", 171));
        array.add(new gameButton(new Color(35, 139, 190), "Blue Whale", 172));
        array.add(new gameButton(new Color(5, 122, 181), "Azure", 173));
        array.add(new gameButton(new Color(8, 110, 163), "Spanish Blue", 174));
        array.add(new gameButton(new Color(3, 100, 145), "Pacific Ocean", 175));
        array.add(new gameButton(new Color(196, 77, 7), "Ginger", 176));
        array.add(new gameButton(new Color(221, 86, 8), "Fire", 177));
        array.add(new gameButton(new Color(244, 96, 7), "Carrot", 178));
        array.add(new gameButton(new Color(245, 120, 43), "Tangerine", 179));
        array.add(new gameButton(new Color(246, 144, 83), "Mandarin", 180));
        array.add(new gameButton(new Color(245, 169, 124), "Warm Sand", 181));
        array.add(new gameButton(new Color(244, 194, 164), "Morning Sunshine", 182));
        array.add(new gameButton(new Color(244, 221, 206), "Antique White", 183));
        array.add(new gameButton(new Color(196, 228, 237), "Melted Ice", 184));
        array.add(new gameButton(new Color(150, 212, 226), "Glacier", 185));
        array.add(new gameButton(new Color(107, 196, 216), "Surfer", 186));
        array.add(new gameButton(new Color(72, 181, 207), "Blizzard", 187));
        array.add(new gameButton(new Color(37, 167, 201), "Cyan", 188));
        array.add(new gameButton(new Color(14, 154, 190), "Teal", 189));
        array.add(new gameButton(new Color(6, 138, 170), "Maximum Blue", 190));
        array.add(new gameButton(new Color(5, 124, 152), "Celadon", 191));

         correct = getButton((int)(Math.random()*191));

        for (int i = 0; i < array.size(); i++) {
            add(array.get(i));
            int arb = i;
            array.get(i).addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    Main.select =  array.get(arb).getIndex();
System.out.println(Main.select);
System.out.println(correct.getIndex());

                    if (Main.select == correct.getIndex()) {
                        System.out.println(3);
                        setScore(3);
                    }
                    else if((Main.select-1)==correct.getIndex() || (Main.select-15)==correct.getIndex() || (Main.select-16)==correct.getIndex() || (Main.select-17)==correct.getIndex() || (Main.select+1)==correct.getIndex() || (Main.select+15)==correct.getIndex() || (Main.select+16)==correct.getIndex() || (Main.select+17)==correct.getIndex()){
                        System.out.println(1);
                        setScore(1);
                    }
                    else { setScore(0);}

                    correct = getButton((int)(Math.random()*191));
                    Main.hintLabel.setText(correct.getHint()+"           Score: " + score);
                }
            });
        }
        setBackground(Color.BLACK);
    }

    public gameButton getButton(int index) {
        return array.get(index);
    }
public void setScore(int add){
        score+=add;
        Main.hintLabel.setText(correct.getHint()+"           Score: " + score);
}

    }



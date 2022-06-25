package com.angxd.enhancedcraft.utilities;

import java.util.Random;

public class GenericUtils {
    public static boolean getRandPercent(int percent) {
        Random rand = new Random();
        return rand.nextInt(100) <= percent;
    }

    public static String convertToRealName(String regName){
        String str = regName.substring(regName.indexOf(":") + 1);
        str = str.trim().replace("_", " ").replace(":", "");
        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        }
        return capitalizeWord;
    }
}

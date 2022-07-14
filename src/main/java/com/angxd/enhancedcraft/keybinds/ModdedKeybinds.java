package com.angxd.enhancedcraft.keybinds;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.gui.screens.controls.KeyBindsList;
import net.minecraftforge.client.settings.KeyConflictContext;

import javax.swing.text.JTextComponent;

public class ModdedKeybinds {
    public static final KeyMapping flyKey = new KeyMapping("key.enhancedcraft.fly", InputConstants.Type.KEYSYM, 88, "key.enchancedcraft.items");
}

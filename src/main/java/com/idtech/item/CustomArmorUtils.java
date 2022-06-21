package com.idtech.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;

public class CustomArmorUtils {

    public static ArmorMaterial customMaterial = ItemUtils.buildArmorMaterial("gel", 22, new int[]{5, 8, 6, 4}, 5, SoundEvents.ARMOR_EQUIP_IRON, 4f, 0.3f, "examplemod:gelore");

    //name - lowercase
    //max damage. armor will lose one durability for 4 hearts of damage (22)
    //defense points - half armor icons given to player for each item
    //enchantaability - how easy it is to enchant
    //equpi sound
    //toughness - extrad defense points
    //kb resistance - between 0-1 (higher means less kb)
    //repair ingredient --
}

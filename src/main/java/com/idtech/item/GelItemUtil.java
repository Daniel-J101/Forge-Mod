package com.idtech.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class GelItemUtil {

    public static Tier tier = new ForgeTier(4, 2000, 10.0f,
            10.0f, 16, null,
            () -> {
                return Ingredient.of(ItemMod.STRUCTURE_GEL);
            });

    //what level of blocks it can break
    //durability
    //mining speed
    //damage
    //encahnatability (how easily it shows up? idk)
    //ingredient that you can repair the pickaxe with

}

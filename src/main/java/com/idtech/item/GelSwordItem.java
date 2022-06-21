package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;


public class GelSwordItem extends SwordItem {



    private static Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_COMBAT);
    public static Item INSTANCE = new GelSwordItem(GelItemUtil.tier, 1, 2, properties)
            .setRegistryName(BaseMod.MODID, "gelsword");

    public GelSwordItem(Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties) {
        super(tier, attackDamageIn, attackSpeedIn, properties);

    }

}

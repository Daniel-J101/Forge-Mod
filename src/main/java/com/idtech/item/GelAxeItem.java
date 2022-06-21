package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class GelAxeItem extends AxeItem {

    private static Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_TOOLS);
    public static Item INSTANCE = new GelAxeItem(GelItemUtil.tier, 3, 1, properties)
            .setRegistryName(BaseMod.MODID, "gelaxe");



    public GelAxeItem(Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties) {
        super(tier, attackDamageIn, attackSpeedIn, properties);
    }
}

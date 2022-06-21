package com.idtech.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemMod {

    //BASIC ITEMS
    public static final Item STRUCTURE_GEL = ItemUtils.buildBasicItem("structuregel", CreativeModeTab.TAB_MISC);
    public static final Item GEL_ORE = ItemUtils.buildBasicItem("gelore", CreativeModeTab.TAB_MISC);
    public static final Item AMETHYST_ORE = ItemUtils.buildBasicItem("amethyst", CreativeModeTab.TAB_MISC);
    //name is what you put in items f: generated <name>


    //FOODS
    public static FoodProperties steroid = (new FoodProperties.Builder().nutrition(20).saturationMod(20f)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 500, 3), 1.0f).alwaysEat().build());
    // nutrition - value of half hunger bars it fills
    //saturation - how long you wont be hungry
    //effect MobEffects.<any effect>, <millisecond duration> <strength> <chance of affecting player>
    public static Item steroidItem = ItemUtils.buildFoodItem("steroid", steroid);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //BASIC ITEMS
        event.getRegistry().register(GEL_ORE);
        event.getRegistry().register(AMETHYST_ORE);

        // ITEMS
        event.getRegistry().register(STRUCTURE_GEL);
        event.getRegistry().register(TeleportRodItem.INSTANCE);

        // TOOLS
        event.getRegistry().register(LightningHammerItem.INSTANCE);
        event.getRegistry().register(GelPickaxeItem.INSTANCE);
        event.getRegistry().register(GelShovelItem.INSTANCE);
        event.getRegistry().register(GelSwordItem.INSTANCE);
        event.getRegistry().register(GelAxeItem.INSTANCE);
        event.getRegistry().register(GelHoeItem.INSTANCE);

        // FOOD
        event.getRegistry().register(steroidItem);

        // ARMOR
        event.getRegistry().register(CustomArmorItem.HELM);
        event.getRegistry().register(CustomArmorItem.CHEST);
        event.getRegistry().register(CustomArmorItem.LEGS);
        event.getRegistry().register(CustomArmorItem.BOOTS);


        //PROJECTILES

    }
}

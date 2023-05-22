package at.mindofemi.betterfoodmod.item;

import at.mindofemi.betterfoodmod.BetterfoodMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterfoodMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB)));

    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB)));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB)));

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.BANANA)));

    public static final RegistryObject<Item> GREEN_LEAVES = ITEMS.register("green_leaves",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.GREEN_LEAVES)));

    public static final RegistryObject<Item> POMMES = ITEMS.register("pommes",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.POMMES)));

    public static final RegistryObject<Item> PATTY = ITEMS.register("patty",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.PATTY)));

    public static final RegistryObject<Item> HAM = ITEMS.register("ham",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.HAM)));

    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.HAMBURGER)));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.TOMATO)));

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.PIZZA)));

    public static final RegistryObject<Item> TORTILLIA = ITEMS.register("tortillia",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.TORTILLIA)));

    public static final RegistryObject<Item> WRAP = ITEMS.register("wrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.WRAP)));

    public static final RegistryObject<Item> RICEBOWL = ITEMS.register("ricebowl",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BETTERFOOD_TAB).food(ModFoods.RICEBOWL)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
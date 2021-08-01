package com.oyosite.ticon.toastermod.item;

import com.google.common.collect.ImmutableList;
import com.oyosite.ticon.toastermod.ToasterMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemRegistry {
    public static final Map<String, Item> ITEM_REGISTRY = new HashMap<>();

    public static final LimbItem COLORIZER = r("colorizer", new LimbItem(new FabricItemSettings(), List.of("fur_color","trim_color","light_color")));


    public static <I extends Item> I r(String id, I item){
        ITEM_REGISTRY.put(id, item);
        return item;
    }
    public static void register(){
        for(String key : ITEM_REGISTRY.keySet()) Registry.register(Registry.ITEM, new Identifier(ToasterMod.MODID, key), ITEM_REGISTRY.get(key));
    }
}
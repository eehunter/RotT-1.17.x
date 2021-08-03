package com.oyosite.ticon.toastermod;

import com.oyosite.ticon.toastermod.block.BlockRegistry;
import com.oyosite.ticon.toastermod.client.gui.LimbForgingScreenHandler;
import com.oyosite.ticon.toastermod.client.gui.LimbScreenHandler;
import com.oyosite.ticon.toastermod.item.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ToasterMod implements ModInitializer {

    public static final String MODID = "toastermod";
    public static final ScreenHandlerType<LimbScreenHandler> LIMB_SCREEN_HANDLER;
    public static final ScreenHandlerType<LimbForgingScreenHandler> LIMB_FORGE_SCREEN_HANDLER;
    public static final Identifier OPEN_LIMB_SCREEN_CHANNEL_ID = new Identifier(MODID, "open_limb_screen");



    static {
        LIMB_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(MODID, "limb_screen"),LimbScreenHandler::new);
        LIMB_FORGE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(MODID, "limb_forge_screen"), LimbForgingScreenHandler::new);
    }

    @Override
    public void onInitialize() {
        BlockRegistry.register();
        ItemRegistry.register();
        Util.registerMisc();
    }
}

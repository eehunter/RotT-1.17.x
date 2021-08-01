package com.oyosite.ticon.toastermod.client;

import com.google.common.collect.ImmutableList;
import com.oyosite.ticon.toastermod.ToasterMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.NonnullDefault;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.ArrayList;
import java.util.List;

public interface ProtoModelController extends IAnimatable {

    @Nullable List<Pair<String, Identifier>> getTextures();

    class DefaultImpl implements ProtoModelController{
        protected static final List<Pair<String, Identifier>> texLocs = ImmutableList.of(new Pair<>("fur", new Identifier(ToasterMod.MODID, "textures/models/default_protogen_fur.png")), new Pair<>("trim", new Identifier(ToasterMod.MODID, "textures/models/default_protogen_trim.png")), new Pair<>("lights", new Identifier(ToasterMod.MODID, "textures/models/default_protogen_lights.png")));

        private final AnimationFactory factory = new AnimationFactory(this);

        @Override
        public void registerControllers(AnimationData animationData) {

        }

        @Override
        public AnimationFactory getFactory() {
            return factory;
        }


        /**
        * DefaultImpl.getTextures should never return null
        * ProtoModelController.getTextures is @Nullable so that other model controllers can return null and default to this one
        */
        @Override
        @NonnullDefault
        public List<Pair<String, Identifier>> getTextures() {
            return texLocs;
        }
    }
}

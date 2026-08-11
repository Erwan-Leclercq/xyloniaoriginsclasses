package com.example.examplemod;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(basicoriginsclasses.MODID)
public class basicoriginsclasses {
    public static final String MODID = "basicoriginsclasses";
    public static final Logger LOGGER = LogUtils.getLogger();

    public basicoriginsclasses(IEventBus modEventBus) {
        LOGGER.info("basicorigins classes initializing");
    }
}

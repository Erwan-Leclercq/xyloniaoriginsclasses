package io.github.kopse;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(xyloniaoriginsclasses.MODID)
public class xyloniaoriginsclasses {
    public static final String MODID = "xyloniaoriginsclasses";
    public static final Logger LOGGER = LogUtils.getLogger();

    public xyloniaoriginsclasses(IEventBus modEventBus) {
        LOGGER.info("basicorigins classes initializing");
    }
}

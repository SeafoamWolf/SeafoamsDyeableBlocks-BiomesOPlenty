package seafoamwolf.seafoamsdyeablebop;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import seafoamwolf.seafoamsdyeableblocks.item.DyeableBlockItem;
import seafoamwolf.seafoamsdyeablebop.block.DyeableBlocksBOP;
import seafoamwolf.seafoamsdyeableblocks.SeafoamsDyeableBlocks;
import seafoamwolf.seafoamsdyeableblocks.block.DyeableBlockEntity;

@Mod(SeafoamsDyeableBOP.MODID)
public class SeafoamsDyeableBOP {
	public static final String MODID = "seafoamsdyeablebop";

	public static List<Block> DYEABLE_BLOCKS = new ArrayList<>();
	public static List<DyeableBlockItem> DYEABLE_BLOCK_ITEMS = new ArrayList<>();

	public SeafoamsDyeableBOP() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		DyeableBlocksBOP.BLOCKS.register(modEventBus);
		DyeableBlocksBOP.BLOCK_ENTITY_TYPES.register(modEventBus);
        
		MinecraftForge.EVENT_BUS.register(this);
        
        DyeableBlocksBOP.setup();
    }
    
    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ColorRegisterHandler {
        @SubscribeEvent
        public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
            DYEABLE_BLOCKS.forEach(block -> event.register((state, blockAndTintGetter, pos, tintIndex) -> {
                if (blockAndTintGetter == null)
                    return 0;
                
                BlockEntity blockEntity = blockAndTintGetter.getBlockEntity(pos);

                if (blockEntity != null && blockEntity instanceof DyeableBlockEntity)
                    return ((DyeableBlockEntity)blockEntity).getColor();
                
                return 16777215;
            }, block));
        }

        @SubscribeEvent
        public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
            DYEABLE_BLOCK_ITEMS.forEach(blockItem -> event.register((stack, tintIndex) -> {
                return ((DyeableBlockItem)stack.getItem()).getColor(stack);
            }, blockItem));
        }
    }
    
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class BlockInit {
        @SubscribeEvent
        public static void onRegisterItems(final RegisterEvent event) {
            if (event.getRegistryKey().equals(ForgeRegistries.Keys.ITEMS)){
                DyeableBlocksBOP.BLOCKS.getEntries().forEach((blockRegistryObject) -> {
                    Block block = blockRegistryObject.get();
                    Item.Properties properties = new Item.Properties().tab(SeafoamsDyeableBlocks.ITEM_TAB);
                    DyeableBlockItem item = new DyeableBlockItem(block, properties);
                    event.register(ForgeRegistries.Keys.ITEMS, blockRegistryObject.getId(), () -> item);
                    DYEABLE_BLOCK_ITEMS.add(item);
                });
            }
        }
    }
}

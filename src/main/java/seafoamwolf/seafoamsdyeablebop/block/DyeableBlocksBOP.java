package seafoamwolf.seafoamsdyeablebop.block;

import java.util.function.Supplier;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import seafoamwolf.seafoamsdyeableblocks.block.*;
import seafoamwolf.seafoamsdyeablebop.SeafoamsDyeableBOP;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DyeableBlocksBOP {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SeafoamsDyeableBOP.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SeafoamsDyeableBOP.MODID);

	public static RegistryObject<Block> DYEABLE_WHITE_SANDSTONE;
	public static RegistryObject<Block> DYEABLE_WHITE_SANDSTONE_STAIRS;
	public static RegistryObject<Block> DYEABLE_WHITE_SANDSTONE_SLAB;
	
	public static RegistryObject<Block> DYEABLE_SMOOTH_WHITE_SANDSTONE;
	public static RegistryObject<Block> DYEABLE_SMOOTH_WHITE_SANDSTONE_STAIRS;
	public static RegistryObject<Block> DYEABLE_SMOOTH_WHITE_SANDSTONE_SLAB;
	
	public static RegistryObject<Block> DYEABLE_CUT_WHITE_SANDSTONE;
	public static RegistryObject<Block> DYEABLE_CUT_WHITE_SANDSTONE_SLAB;
	public static RegistryObject<Block> DYEABLE_CHISELED_WHITE_SANDSTONE;
	
	public static RegistryObject<Block> DYEABLE_BRIMSTONE;
	
	public static RegistryObject<BlockEntityType<DyeableBlockEntity>> DYEABLE_BLOCK_ENTITY_BOP;
	
    public static void setup() {
        registerBlocks();
        registerBlockEntities();
    }
	
    public static void registerBlocks() {
		DYEABLE_WHITE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE.get())), "dyeable_white_sandstone");
		DYEABLE_WHITE_SANDSTONE_STAIRS = registerBlock(() -> new DyeableStairBlock(BOPBlocks.WHITE_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE_STAIRS.get())), "dyeable_white_sandstone_stairs");
		DYEABLE_WHITE_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE_SLAB.get())), "dyeable_white_sandstone_slab");
		
		DYEABLE_SMOOTH_WHITE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_WHITE_SANDSTONE.get())), "dyeable_smooth_white_sandstone");
		DYEABLE_SMOOTH_WHITE_SANDSTONE_STAIRS = registerBlock(() -> new DyeableStairBlock(BOPBlocks.SMOOTH_WHITE_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS.get())), "dyeable_smooth_white_sandstone_stairs");
		DYEABLE_SMOOTH_WHITE_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_WHITE_SANDSTONE_SLAB.get())), "dyeable_smooth_white_sandstone_slab");
		
		DYEABLE_CUT_WHITE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.CUT_WHITE_SANDSTONE.get())), "dyeable_cut_white_sandstone");
		DYEABLE_CUT_WHITE_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.CUT_WHITE_SANDSTONE_SLAB.get())), "dyeable_cut_white_sandstone_slab");
		DYEABLE_CHISELED_WHITE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_WHITE_SANDSTONE.get())), "dyeable_chiseled_white_sandstone");
		
		DYEABLE_BRIMSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.BRIMSTONE.get())), "dyeable_brimstone");
	}

	public static void registerBlockEntities() {
		DYEABLE_BLOCK_ENTITY_BOP = BLOCK_ENTITY_TYPES.register("dyeable_block_entity_bop", () -> BlockEntityType.Builder.of(DyeableBlockEntity::new,
			DYEABLE_WHITE_SANDSTONE.get(),
			DYEABLE_WHITE_SANDSTONE_STAIRS.get(),
			DYEABLE_WHITE_SANDSTONE_SLAB.get(),
			
			DYEABLE_SMOOTH_WHITE_SANDSTONE.get(),
			DYEABLE_SMOOTH_WHITE_SANDSTONE_STAIRS.get(),
			DYEABLE_SMOOTH_WHITE_SANDSTONE_SLAB.get(),
			
			DYEABLE_CUT_WHITE_SANDSTONE.get(),
			DYEABLE_CUT_WHITE_SANDSTONE_SLAB.get(),
			DYEABLE_CHISELED_WHITE_SANDSTONE.get(),

			DYEABLE_BRIMSTONE.get()
		).build(null));
	}

    public static RegistryObject<Block> registerBlock(Supplier<Block> blockSupplier, String name) {
        return BLOCKS.register(name, blockSupplier);
    }
}
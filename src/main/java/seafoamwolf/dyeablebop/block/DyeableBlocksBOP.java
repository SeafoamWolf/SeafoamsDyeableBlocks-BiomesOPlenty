package seafoamwolf.dyeablebop.block;

import java.util.Collection;
import java.util.function.Supplier;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.core.BiomesOPlenty;
import biomesoplenty.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import seafoamwolf.dyeablebop.SeafoamsDyeableBOP;
import seafoamwolf.seafoamsdyeableblocks.SeafoamsDyeableBlocks;
import seafoamwolf.seafoamsdyeableblocks.block.*;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DyeableBlocksBOP {
    public static void setup() {
        registerBlocks();
        registerBlockEntities();
    }
	
    public static void registerBlocks() {
		Collection<RegistryObject<Block>> entries = BiomesOPlenty.BLOCK_REGISTER.getEntries();

		DYEABLE_WHITE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE.get())), "white_sandstone");
		DYEABLE_WHITE_SANDSTONE_STAIRS = registerBlock(() -> new DyeableStairBlock(DYEABLE_WHITE_SANDSTONE.get()::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE_STAIRS.get())), "white_sandstone_stairs");
		DYEABLE_WHITE_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE_SLAB.get())), "white_sandstone_slab");
		
		DYEABLE_SMOOTH_WHITE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_WHITE_SANDSTONE.get())), "smooth_white_sandstone");
		DYEABLE_SMOOTH_WHITE_SANDSTONE_STAIRS = registerBlock(() -> new DyeableStairBlock(DYEABLE_SMOOTH_WHITE_SANDSTONE.get()::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS.get())), "smooth_white_sandstone_stairs");
		DYEABLE_SMOOTH_WHITE_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_WHITE_SANDSTONE_SLAB.get())), "smooth_white_sandstone_slab");
		
		DYEABLE_CUT_WHITE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.CUT_WHITE_SANDSTONE.get())), "cut_white_sandstone");
		DYEABLE_CUT_WHITE_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.CUT_WHITE_SANDSTONE_SLAB.get())), "cut_white_sandstone_slab");
		DYEABLE_CHISELED_WHITE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_WHITE_SANDSTONE.get())), "chiseled_white_sandstone");
		

		DYEABLE_ORANGE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SANDSTONE.get())), "orange_sandstone");
		DYEABLE_ORANGE_SANDSTONE_STAIRS = registerBlock(() -> new DyeableStairBlock(DYEABLE_ORANGE_SANDSTONE.get()::defaultBlockState, BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SANDSTONE_STAIRS.get())), "orange_sandstone_stairs");
		DYEABLE_ORANGE_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SANDSTONE_SLAB.get())), "orange_sandstone_slab");
		
		/*DYEABLE_SMOOTH_ORANGE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), "smooth_orange_sandstone");
		DYEABLE_SMOOTH_ORANGE_SANDSTONE_STAIRS = registerBlock(() -> new DyeableStairBlock(ORANGE_SANDSTONE.get()::defaultBlockState, Block.Properties.copy(SMOOTH_ORANGE_SANDSTONE.get())), "smooth_orange_sandstone_stairs");
		DYEABLE_SMOOTH_ORANGE_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(Block.Properties.copy(SMOOTH_ORANGE_SANDSTONE.get())), "smooth_orange_sandstone_slab");
		
		DYEABLE_CUT_ORANGE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)), "cut_orange_sandstone");
		DYEABLE_CUT_ORANGE_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(Block.Properties.copy(CUT_ORANGE_SANDSTONE.get())), "cut_orange_sandstone_slab");
		DYEABLE_CHISELED_ORANGE_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)), "chiseled_orange_sandstone");
		

		DYEABLE_BLACK_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)), "black_sandstone");
		DYEABLE_BLACK_SANDSTONE_STAIRS = registerBlock(() -> new DyeableStairBlock(BLACK_SANDSTONE.get()::defaultBlockState, Block.Properties.copy(BLACK_SANDSTONE.get())), "black_sandstone_stairs");
		DYEABLE_BLACK_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(Block.Properties.copy(BLACK_SANDSTONE.get())), "black_sandstone_slab");
		
		DYEABLE_SMOOTH_BLACK_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.0F, 6.0F)), "smooth_black_sandstone");
		DYEABLE_SMOOTH_BLACK_SANDSTONE_STAIRS = registerBlock(() -> new DyeableStairBlock(BLACK_SANDSTONE.get()::defaultBlockState, Block.Properties.copy(SMOOTH_BLACK_SANDSTONE.get())), "smooth_black_sandstone_stairs");
		DYEABLE_SMOOTH_BLACK_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(Block.Properties.copy(SMOOTH_BLACK_SANDSTONE.get())), "smooth_black_sandstone_slab");
		
		DYEABLE_CUT_BLACK_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)), "cut_black_sandstone");
		DYEABLE_CUT_BLACK_SANDSTONE_SLAB = registerBlock(() -> new DyeableSlabBlock(Block.Properties.copy(CUT_BLACK_SANDSTONE.get())), "cut_black_sandstone_slab");
		DYEABLE_CHISELED_BLACK_SANDSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)), "chiseled_black_sandstone");
		

		DYEABLE_BRIMSTONE = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(0.5F)), "brimstone");
		DYEABLE_BRIMSTONE_BRICKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(1.0F, 3.0F)), "brimstone_bricks");
		DYEABLE_BRIMSTONE_BRICK_STAIRS = registerBlock(() -> new DyeableStairBlock(BRIMSTONE_BRICKS.get()::defaultBlockState, Block.Properties.copy(BRIMSTONE_BRICKS.get())), "brimstone_brick_stairs");
		DYEABLE_BRIMSTONE_BRICK_SLAB = registerBlock(() -> new DyeableSlabBlock(Block.Properties.copy(BRIMSTONE_BRICKS.get())), "brimstone_brick_slab");
		DYEABLE_CHISELED_BRIMSTONE_BRICKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(1.0F, 3.0F)), "chiseled_brimstone_bricks");
		
		DYEABLE_FIR_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "fir_planks");
		DYEABLE_FIR_STAIRS = registerBlock(() -> new DyeableStairBlock(FIR_PLANKS.get()::defaultBlockState, Block.Properties.copy(FIR_PLANKS.get())), "fir_stairs");
		DYEABLE_FIR_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "fir_slab");
		
		DYEABLE_REDWOOD_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_ORANGE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "redwood_planks");
		DYEABLE_REDWOOD_STAIRS = registerBlock(() -> new DyeableStairBlock(REDWOOD_PLANKS.get()::defaultBlockState, Block.Properties.copy(REDWOOD_PLANKS.get())), "redwood_stairs");
		DYEABLE_REDWOOD_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_ORANGE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "redwood_slab");
		
		DYEABLE_CHERRY_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "cherry_planks");
		DYEABLE_CHERRY_STAIRS = registerBlock(() -> new DyeableStairBlock(CHERRY_PLANKS.get()::defaultBlockState, Block.Properties.copy(CHERRY_PLANKS.get())), "cherry_stairs");
		DYEABLE_CHERRY_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "cherry_slab");
		
		DYEABLE_MAHOGANY_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "mahogany_planks");
		DYEABLE_MAHOGANY_STAIRS = registerBlock(() -> new DyeableStairBlock(MAHOGANY_PLANKS.get()::defaultBlockState, Block.Properties.copy(MAHOGANY_PLANKS.get())), "mahogany_stairs");
		DYEABLE_MAHOGANY_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "mahogany_slab");
		
		DYEABLE_JACARANDA_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.QUARTZ).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "jacaranda_planks");
		DYEABLE_JACARANDA_STAIRS = registerBlock(() -> new DyeableStairBlock(JACARANDA_PLANKS.get()::defaultBlockState, Block.Properties.copy(JACARANDA_PLANKS.get())), "jacaranda_stairs");
		DYEABLE_JACARANDA_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.QUARTZ).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "jacaranda_slab");
		
		DYEABLE_PALM_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "palm_planks");
		DYEABLE_PALM_STAIRS = registerBlock(() -> new DyeableStairBlock(PALM_PLANKS.get()::defaultBlockState, Block.Properties.copy(PALM_PLANKS.get())), "palm_stairs");
		DYEABLE_PALM_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "palm_slab");
		
		DYEABLE_WILLOW_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "willow_planks");
		DYEABLE_WILLOW_STAIRS = registerBlock(() -> new DyeableStairBlock(WILLOW_PLANKS.get()::defaultBlockState, Block.Properties.copy(WILLOW_PLANKS.get())), "willow_stairs");
		DYEABLE_WILLOW_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "willow_slab");
		
		DYEABLE_DEAD_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.STONE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "dead_planks");
		DYEABLE_DEAD_STAIRS = registerBlock(() -> new DyeableStairBlock(DEAD_PLANKS.get()::defaultBlockState, Block.Properties.copy(DEAD_PLANKS.get())), "dead_stairs");
		DYEABLE_DEAD_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.STONE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "dead_slab");
		
		DYEABLE_MAGIC_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "magic_planks");
		DYEABLE_MAGIC_STAIRS = registerBlock(() -> new DyeableStairBlock(MAGIC_PLANKS.get()::defaultBlockState, Block.Properties.copy(MAGIC_PLANKS.get())), "magic_stairs");
		DYEABLE_MAGIC_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "magic_slab");
		
		DYEABLE_UMBRAN_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "umbran_planks");
		DYEABLE_UMBRAN_STAIRS = registerBlock(() -> new DyeableStairBlock(UMBRAN_PLANKS.get()::defaultBlockState, Block.Properties.copy(UMBRAN_PLANKS.get())), "umbran_stairs");
		DYEABLE_UMBRAN_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLUE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "umbran_slab");
		
		DYEABLE_HELLBARK_PLANKS = registerBlock(() -> new DyeableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "hellbark_planks");
		DYEABLE_HELLBARK_STAIRS = registerBlock(() -> new DyeableStairBlock(HELLBARK_PLANKS.get()::defaultBlockState, Block.Properties.copy(HELLBARK_PLANKS.get())), "hellbark_stairs");
		DYEABLE_HELLBARK_SLAB = registerBlock(() -> new DyeableSlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "hellbark_slab");*/
	}

	public static void registerBlockEntities() {
		
    }

    public static RegistryObject<Block> registerBlock(Supplier<Block> blockSupplier, String name) {
        RegistryObject<Block> blockRegistryObject = DyeableBlocks.BLOCKS.register(name, blockSupplier);
        return blockRegistryObject;
    }
}
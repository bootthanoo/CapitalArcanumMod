
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.carcanum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.carcanum.block.entity.GoodtableBlockEntity;
import net.mcreator.carcanum.CarcanumMod;

public class CarcanumModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CarcanumMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GOODTABLE = register("goodtable", CarcanumModBlocks.GOODTABLE, GoodtableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

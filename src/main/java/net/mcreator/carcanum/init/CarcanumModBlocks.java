
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.carcanum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.carcanum.block.GoodtableBlock;
import net.mcreator.carcanum.CarcanumMod;

public class CarcanumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CarcanumMod.MODID);
	public static final RegistryObject<Block> GOODTABLE = REGISTRY.register("goodtable", () -> new GoodtableBlock());
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.carcanum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.carcanum.item.ObsidianPickaxeItem;
import net.mcreator.carcanum.CarcanumMod;

public class CarcanumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CarcanumMod.MODID);
	public static final RegistryObject<Item> GOODTABLE = block(CarcanumModBlocks.GOODTABLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = REGISTRY.register("obsidian_pickaxe", () -> new ObsidianPickaxeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

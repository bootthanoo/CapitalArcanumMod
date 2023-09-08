
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.carcanum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.carcanum.world.inventory.ConstructTableMenu;
import net.mcreator.carcanum.CarcanumMod;

public class CarcanumModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CarcanumMod.MODID);
	public static final RegistryObject<MenuType<ConstructTableMenu>> CONSTRUCT_TABLE = REGISTRY.register("construct_table", () -> IForgeMenuType.create(ConstructTableMenu::new));
}

package net.ims.concern;

import static net.minecraft.block.Blocks.BEDROCK;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class concern implements ModInitializer {
	@Override
	public void onInitialize() {
		Block CONCERNING = register("concern", new Block(FabricBlockSettings.copy(BEDROCK)));
		final Item CONCERN = new BlockItem(CONCERNING, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
		Registry.register(Registry.ITEM, new Identifier("concern", "concern"), CONCERN);
	}


	private Block register(String concern, Block block) {
			return Registry.register(Registry.BLOCK, new Identifier("concern", "concern"), block);
	}


}

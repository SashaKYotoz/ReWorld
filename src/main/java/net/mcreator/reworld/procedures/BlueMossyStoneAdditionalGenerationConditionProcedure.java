package net.mcreator.reworld.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.init.ReworldModBlocks;

public class BlueMossyStoneAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			sx = -4;
			for (int index0 = 0; index0 < 8; index0++) {
				sy = -3;
				for (int index1 = 0; index1 < 6; index1++) {
					sz = -4;
					for (int index2 = 0; index2 < 8; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ReworldModBlocks.BLUE_MOSSY_STONE.get() && world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()
								&& world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz)).canOcclude() && world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1)).canOcclude() && world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)).canOcclude()) {
							if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), ReworldModBlocks.BLUE_MYCENAE_BLOCK.get().defaultBlockState(), 3);
							} else if (Math.random() < 0.15) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), ReworldModBlocks.BLUE_MYCENAE.get().defaultBlockState(), 3);
							} else if (Math.random() < 0.125) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("reworld", "blue_mycenae_mushroom"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y + 1, z - 4), BlockPos.containing(x - 4, y + 1, z - 4),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
		return true;
	}
}

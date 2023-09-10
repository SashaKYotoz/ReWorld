package net.mcreator.reworld.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.reworld.init.ReworldModBlocks;

import java.util.Map;

public class BluePomegranateAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ReworldModBlocks.BLUE_MOSSY_STONE.get()) {
			sx = -4;
			for (int index0 = 0; index0 < 7; index0++) {
				sy = -4;
				for (int index1 = 0; index1 < 7; index1++) {
					sz = -4;
					for (int index2 = 0; index2 < 7; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ReworldModBlocks.BLUE_POMEGRANATE.get() && !world.getBlockState(BlockPos.containing(x + sx, y + sy - 1, z + sz)).canOcclude()) {
							if (Math.random() < 0.25) {
								{
									BlockPos _bp = BlockPos.containing(x + sx, y + sy - 1, z + sz);
									BlockState _bs = ReworldModBlocks.BLUE_MYCENAE_HANGING.get().defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == ReworldModBlocks.BLUE_MOSSY_STONE.get() && !world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz)).canOcclude()) {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("reworld", "blue_mycenae_mushroom"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x + sx, y + sy + 1, z + sz), BlockPos.containing(x + sx, y + sy + 1, z + sz),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (Math.random() < 0.25) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("reworld", "pomegranate_golem_dungeon"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x + sx, y + sy + 1, z + sz), BlockPos.containing(x + sx, y + sy + 1, z + sz),
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

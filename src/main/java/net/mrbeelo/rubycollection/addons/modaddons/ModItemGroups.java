package net.mrbeelo.rubycollection.addons.modaddons;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.mrbeelo.rubycollection.Rubycollection;

import java.util.Optional;




public class ModItemGroups {

    //REGISTERING

    public static final Text RUBY_TITLE = Text.translatable("itemGroup." + Rubycollection.MOD_ID + ".ruby_group");
    public static final ItemGroup RUBY_GROUP = register("ruby_group", FabricItemGroup.builder()
            .displayName(RUBY_TITLE)
            .icon(ModItems.RUBY::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(Rubycollection.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    //METHODS

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, Rubycollection.id(name), itemGroup);
    }

    public static void load() {

    }
}

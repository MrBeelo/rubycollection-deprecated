package net.mrbeelo.rubycollection.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.mrbeelo.rubycollection.Rubycollection;

import java.util.Optional;

public class ItemGroupInit {
    private static final Text RUBY_TITLE = Text.translatable("itemGroup." + Rubycollection.MOD_ID + ".ruby_group");
    public static final ItemGroup RUBY_GROUP = register("ruby_group", FabricItemGroup.builder()
            .displayName(RUBY_TITLE)
            .icon(ItemInit.RUBY::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(Rubycollection.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, Rubycollection.id(name), itemGroup);
    }

    public static void load() {

    }
}

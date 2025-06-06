package net.takeout.takeoutsmoreores.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.takeout.takeoutsmoreores.TakeoutsMoreOres;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    RUBY("ruby", 25, new int[] {3, 8, 6, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.RUBY)),
    SAPPHIRE("sapphire", 25, new int[] {3, 8, 6, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    ZIRCON("zircon", 25, new int[] {3, 8, 6, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ZIRCON)),
    REFINED_DIAMOND("refined_diamond", 25, new int[] {3, 8, 7, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.REFINED_DIAMOND)),
    OCARITE("ocarite", 25, new int[] {3, 8, 6, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.OCARITE)),
    GLITCHITE("glitchite", 25, new int[] {3, 8, 6, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.GLITCHITE));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantabillity;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantabillity, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantabillity = enchantabillity;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantabillity;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return TakeoutsMoreOres.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

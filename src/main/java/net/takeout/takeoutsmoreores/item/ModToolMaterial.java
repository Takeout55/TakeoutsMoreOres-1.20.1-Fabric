package net.takeout.takeoutsmoreores.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    SAPPHIRE(5, 2000, 4.5f, 3.4f, 26, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    RUBY(5, 2000, 4.5f, 3.4f, 26, () -> Ingredient.ofItems(ModItems.RUBY)),
    ZIRCON(5, 2000, 4.5f, 3.4f, 26, () -> Ingredient.ofItems(ModItems.ZIRCON)),
    REFINED_DIAMOND(5, 2000, 4.5f, 3.4f, 26, () -> Ingredient.ofItems(ModItems.REFINED_DIAMOND)),
    THIMEITE(5, 2000, 4.5f, 3.4f, 26, () -> Ingredient.ofItems(ModItems.THIMEITE)),
    PLUNGITE(5, 2000, 4.5f, 3.4f, 26, () -> Ingredient.ofItems(ModItems.THIMEITE)),
    CHEEKIUM(5, 2000, 4.5f, 3.4f, 26, () -> Ingredient.ofItems(ModItems.THIMEITE));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

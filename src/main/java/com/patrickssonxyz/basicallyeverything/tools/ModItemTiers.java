package com.patrickssonxyz.basicallyeverything.tools;

import com.patrickssonxyz.basicallyeverything.util.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTiers implements IItemTier {

    // int harvestLevel, int maxUses, float efficiency, float attackDamage, int
    // enchantability, Supplier<Ingredient> repairMaterial
    RUBY(4, 3162, 19.0F, 7.0F, 40, () -> {
        return Ingredient.fromItems(ItemInit.RUBY.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    private ModItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }


    @Override
    public int getMaxUses() {
        return maxUses;
    }
    @Override
    public float getEfficiency() {
        return efficiency;
    }
    @Override
    public float getAttackDamage() {
        return attackDamage;
    }
    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }
    @Override
    public int getEnchantability() { return enchantability; }
    @Override
    public Ingredient getRepairMaterial() { return repairMaterial.get(); }
}

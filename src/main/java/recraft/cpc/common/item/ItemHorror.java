package recraft.cpc.common.item;

import net.minecraft.item.Item;

public class ItemHorror extends Item {
	public ItemHorror(int i) {
		super(i);
		super.maxStackSize = 1;
		this.setMaxDamage(0);
		this.setTextureName("cpc:tabCPC");
		this.setUnlocalizedName("horror");
	}

	public boolean requiresMultipleRenderPasses() {
		return false;
	}

	public boolean isFull3D() {
		return false;
	}

}

package matgm50.twarden.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.items.TWItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TWTab extends CreativeTabs {
	
	public TWTab(String label) {
		
		super(label);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
		
		return TWItems.TWSigil.itemID;
		
	}
	
}
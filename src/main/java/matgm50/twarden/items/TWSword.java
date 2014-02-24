package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.misc.TWTab;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWSword extends ItemSword {

	public TWSword(int ID, EnumToolMaterial Material) {

		super(ID, Material);
		setUnlocalizedName(TWItemConfig.TWSWORD_UN_NAME);
		setCreativeTab(TWarden.TWTab);

	}

	@Override
	public EnumRarity getRarity(ItemStack Sword) {

		return EnumRarity.epic;

	}

	@Override
	public boolean getIsRepairable(ItemStack Weapon, ItemStack ItemInSlot) {

		return ItemInSlot.isItemEqual(new ItemStack(TWItems.TWResource, 1, 0)) ? true : super.getIsRepairable(Weapon, ItemInSlot);

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister Register) {

		itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardensword");

	}

}
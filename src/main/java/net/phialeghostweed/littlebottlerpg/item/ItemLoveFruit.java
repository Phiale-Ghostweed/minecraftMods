package net.phialeghostweed.littlebottlerpg.item;

//import net.minecraft.tags.ItemTags;
//import net.minecraft.world.InteractionHand;
//import net.minecraft.world.InteractionResultHolder;
//import net.minecraft.world.effect.MobEffectInstance;
//import net.minecraft.world.effect.MobEffects;
//import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
//import net.minecraft.world.level.Level;

public class ItemLoveFruit extends Item {

    public ItemLoveFruit() {
        super(new Properties()
                .rarity(Rarity.RARE)
                .stacksTo(64)
        );
    }

//    @Override
//    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
//        ItemStack stack = player.getItemInHand(hand);
//        if (stack.is(ItemTags.CAT_FOOD)){
//            player.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20*60*3, 0));
//        }else {
//            player.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20*60*3, 0));
//        }
//        return InteractionResultHolder.consume(stack);
//    }
}

package net.fabricmc.example.mixin;

import net.minecraft.class_2263;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(class_2263.class)
public class ExampleMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        System.out.println("This line is printed by an example mod mixin!");
    }

//    @ModifyArg(
//            method = {"render"},
//            at = @At(
//                    value = "INVOKE",
//                    target = "Lnet/minecraft/class_2263;drawWithShadow(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)V"
//            )
//    )
//    private String fixFabricBranding(String text) {
//        if (text.contains("Minecraft")) {
//            text = text + "/Fabric";
//        }
//
//        return text;
//    }
}
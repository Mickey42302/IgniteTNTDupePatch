package com.mickey42302.tntdupe.mixin;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({SharedConstants.class})
public abstract class SharedConstantsMixin {
  @Final
  @Shadow
  @Mutable
  public static boolean FIX_TNT_DUPE;

  @Inject(method = {"<clinit>"}, at = {@At("TAIL")})
  private static void setFixTntDupe$clinit(CallbackInfo ci) {
    FIX_TNT_DUPE = true;
  }
}

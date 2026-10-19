package dev.xqedii.ultimateUI.service.bossbar;

import dev.xqedii.ultimateUI.Xqedii_2vk7cdd;
import dev.xqedii.ultimateUI.Xqedii_30g0ulj;

public final class BossbarHudSnapshot {
   public static final String Xqedii_1iw8uglrgsybt = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final int ALIGN_LEFT = 0;
   public static final int ALIGN_CENTER = 1;
   public static final int ALIGN_RIGHT = 2;
   public final String id;
   public final double anchorX;
   public final double anchorY;
   public final double layer;
   public final double scaleX;
   public final double scaleY;
   public final String text;
   public final int alignment;
   public final int opacity;
   public final int lineWidth;
   public final int clip;
   public final boolean entityOnly;
   public final int anchor;
   public final int quarterTurns;

   public BossbarHudSnapshot(
      String var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      String var12,
      int var13,
      int var14,
      int var15,
      int var16,
      boolean var17,
      int var18,
      int var19
   ) {
      this.id = var1;
      this.anchorX = var2;
      this.anchorY = var4;
      this.layer = var6;
      this.scaleX = var8;
      this.scaleY = var10;
      this.text = var12;
      this.alignment = var13;
      this.opacity = var14;
      this.lineWidth = var15;
      this.clip = var16;
      this.entityOnly = var17;
      this.anchor = Xqedii_30g0ulj.Xqedii_28kokdu(var18);
      this.quarterTurns = var19 & Xqedii_2vk7cdd.Xqedii_31nqhdejyato5(-669196717, 14);
   }
}

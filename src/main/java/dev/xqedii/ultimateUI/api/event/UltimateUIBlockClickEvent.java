package dev.xqedii.ultimateUI.api.event;

import dev.xqedii.ultimateUI.Xqedii_1ybtgvo;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public final class UltimateUIBlockClickEvent extends UltimateUIEvent implements Cancellable {
   public static final String Xqedii_23jepge88cual = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final HandlerList Xqedii_3ngmx5c;
   public final double Xqedii_3tfoj83;
   public final UltimateUIBlockClickEvent.ClickType Xqedii_3qcqdkz;
   public boolean Xqedii_37j219m;

   public UltimateUIBlockClickEvent(Player var1, String var2, String var3, double var4, double var6, double var8, UltimateUIBlockClickEvent.ClickType var10) {
      this(var1, var2, var3, var4, var6, var8, var6, var8, var10);
   }

   public UltimateUIBlockClickEvent(
      Player var1, String var2, String var3, double var4, double var6, double var8, double var10, double var12, UltimateUIBlockClickEvent.ClickType var14
   ) {
      super(var1, var2, var3, var6, var8, var10, var12);
      this.Xqedii_3tfoj83 = finite(var4);
      this.Xqedii_3qcqdkz = var14 == null ? UltimateUIBlockClickEvent.ClickType.LEFT : var14;
   }

   public double getBlockLayer() {
      if (((-1564868984 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3tfoj83;
      }
   }

   public UltimateUIBlockClickEvent.ClickType getClickType() {
      if ((-1064709505 ^ -1064709505) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3qcqdkz;
      }
   }

   public boolean isLeftClick() {
      if ((372397502 * 372397502 - 372397502 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_3qcqdkz == UltimateUIBlockClickEvent.ClickType.LEFT
            ? Xqedii_1ybtgvo.Xqedii_1d67bvumttnat(-1057192551, 6)
            : Xqedii_1ybtgvo.Xqedii_1n4un3y8wzouz(-897012075, 27)) != 0);
      }
   }

   public boolean isRightClick() {
      if ((1284672177 * (1284672177 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_3qcqdkz == UltimateUIBlockClickEvent.ClickType.RIGHT
            ? Xqedii_1ybtgvo.Xqedii_34sv3mwl82reu(-310270577, 27)
            : Xqedii_1ybtgvo.Xqedii_34sv3mwl82reu(-27780520, 23)) != 0);
      }
   }

   public boolean isScroll() {
      if (((-226729507 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_3qcqdkz != UltimateUIBlockClickEvent.ClickType.SCROLL_UP
               && this.Xqedii_3qcqdkz != UltimateUIBlockClickEvent.ClickType.SCROLL_DOWN
            ? Xqedii_1ybtgvo.Xqedii_25oxam6932jel(-1214451448, 12)
            : Xqedii_1ybtgvo.Xqedii_34sv3mwl82reu(1677418601, 17)) != 0);
      }
   }

   public boolean isShiftClick() {
      if (((-1197613203 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.getPlayer().isSneaking();
      }
   }

   public boolean isCancelled() {
      if ((261402139 * (261402139 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_37j219m;
      }
   }

   public void setCancelled(boolean var1) {
      if (((-2016183676 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_37j219m = var1;
      }
   }

   public HandlerList getHandlers() {
      if (((751018334 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_3ngmx5c;
      }
   }

   public static HandlerList getHandlerList() {
      if ((-1640289620 * -1640289620 + -1640289620 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_3ngmx5c;
      }
   }

   static {
      if ((-1163070103 * -1163070103 + -1163070103 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3ngmx5c = new HandlerList();
      }
   }

   public static enum ClickType {
      LEFT,
      RIGHT,
      SCROLL_UP,
      SCROLL_DOWN;
      public static final String Xqedii_fhyb8wad4lsu = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   }
}

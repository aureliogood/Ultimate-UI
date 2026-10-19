package dev.xqedii.ultimateUI.api.event;

import dev.xqedii.ultimateUI.Xqedii_1qmlm39;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public final class UltimateUIInputSubmitEvent extends UltimateUIEvent implements Cancellable {
   public static final String Xqedii_1lmyv4ua4z5az = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final HandlerList Xqedii_kiyvl6f;
   public final String Xqedii_1veedqm;
   public final String Xqedii_1p2hbwb;
   public final String Xqedii_1a3fh14;
   public String Xqedii_iwslmax;
   public boolean Xqedii_3qzrjms;

   public UltimateUIInputSubmitEvent(Player var1, String var2, String var3, String var4, String var5, String var6) {
      this(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         Double.longBitsToDouble(Xqedii_1qmlm39.Xqedii_2dnk8ok6iqkog(7839091304423022809L, 44)),
         Double.longBitsToDouble(Xqedii_1qmlm39.Xqedii_1sm9ac5p20mli(3165255857935745311L, 29)),
         Double.longBitsToDouble(Xqedii_1qmlm39.Xqedii_2um5890acq8d0(-1427047686341278803L, 6)),
         Double.longBitsToDouble(Xqedii_1qmlm39.Xqedii_2dnk8ok6iqkog(2592316034427131908L, 13))
      );
   }

   public UltimateUIInputSubmitEvent(
      Player var1, String var2, String var3, String var4, String var5, String var6, double var7, double var9, double var11, double var13
   ) {
      super(var1, var2, var3, var7, var9, var11, var13);
      this.Xqedii_1veedqm = var3 == null ? Xqedii_1qmlm39.Xqedii_3ourd8rcjycht("ght0lvNVk8GJFWgloQjY2mVA4GgYgmeeUZBfqg==") : var3;
      this.Xqedii_1p2hbwb = var4 != null && !var4.isBlank() ? var4 : this.Xqedii_1veedqm;
      this.Xqedii_1a3fh14 = var5 == null ? Xqedii_1qmlm39.Xqedii_3ourd8rcjycht("ght0lvNVk8GJFWgloQjY2mVA4GgYgmeeUZBfqg==") : var5;
      this.Xqedii_iwslmax = var6 == null ? Xqedii_1qmlm39.Xqedii_3ourd8rcjycht("ght0lvNVk8GJFWgloQjY2mVA4GgYgmeeUZBfqg==") : var6;
   }

   public String getInputId() {
      if ((-456134739 ^ -456134739) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1veedqm;
      }
   }

   public String getVariable() {
      if ((1278095417 * 1278095417 - 1278095417 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1p2hbwb;
      }
   }

   public String getPreviousValue() {
      if (((1969886229 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1a3fh14;
      }
   }

   public String getValue() {
      if ((1277141539 ^ 1277141539) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_iwslmax;
      }
   }

   public void setValue(String var1) {
      if ((746905543 * (746905543 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_iwslmax = var1 == null ? Xqedii_1qmlm39.Xqedii_3ourd8rcjycht("ght0lvNVk8GJFWgloQjY2mVA4GgYgmeeUZBfqg==") : var1;
      }
   }

   public boolean isCancelled() {
      if (((-2134384641 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3qzrjms;
      }
   }

   public void setCancelled(boolean var1) {
      if ((-1976183314 * -1976183314 - -1976183314 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3qzrjms = var1;
      }
   }

   public HandlerList getHandlers() {
      if ((-1202259272 ^ -1202259272) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_kiyvl6f;
      }
   }

   public static HandlerList getHandlerList() {
      if (((-1625907994 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_kiyvl6f;
      }
   }

   static {
      if (((-421052494 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_kiyvl6f = new HandlerList();
      }
   }
}

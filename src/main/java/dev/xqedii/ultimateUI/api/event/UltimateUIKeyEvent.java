package dev.xqedii.ultimateUI.api.event;

import dev.xqedii.ultimateUI.Xqedii_1vvlmnj;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public final class UltimateUIKeyEvent extends UltimateUIEvent implements Cancellable {
   public static final String Xqedii_zxisihzdhz4v = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final HandlerList Xqedii_36ytfh2;
   public final String Xqedii_1nb8x28;
   public boolean Xqedii_sf6pfvi;

   public UltimateUIKeyEvent(Player var1, String var2, String var3, String var4, double var5, double var7, double var9, double var11) {
      super(var1, var2, var3, var5, var7, var9, var11);
      this.Xqedii_1nb8x28 = var4 == null ? Xqedii_1vvlmnj.Xqedii_2pn4301mqfe7o("Q2rwvC91hLn4bn5kC70XG4xWfqJ/BgNQBtw50w==") : var4;
   }

   public String getKey() {
      if ((214640837 ^ 214640837) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1nb8x28;
      }
   }

   public String getBaseKey() {
      if (((-1454241063 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1nb8x28.startsWith(Xqedii_1vvlmnj.Xqedii_2pn4301mqfe7o("/DZFr2dZyHWxENcJBwxnRWTD6aEDNJBlGFikAomgYoItLNYy8StXKQ=="))
            ? this.Xqedii_1nb8x28.substring(Xqedii_1vvlmnj.Xqedii_1lm5e6xpx979g(-306615162, 18))
            : this.Xqedii_1nb8x28;
      }
   }

   public boolean isShift() {
      if (((-759636579 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1nb8x28.startsWith(Xqedii_1vvlmnj.Xqedii_2pn4301mqfe7o("/DZFr2dZyHWxENcJBwxnRWTD6aEDNJBlGFikAomgYoItLNYy8StXKQ=="));
      }
   }

   public boolean isCancelled() {
      if ((1031131426 ^ 1031131426) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_sf6pfvi;
      }
   }

   public void setCancelled(boolean var1) {
      if ((618431981 * (618431981 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_sf6pfvi = var1;
      }
   }

   public HandlerList getHandlers() {
      if (((-1271169888 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_36ytfh2;
      }
   }

   public static HandlerList getHandlerList() {
      if (((-495607612 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_36ytfh2;
      }
   }

   static {
      if ((-1427868810 * -1427868810 - -1427868810 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36ytfh2 = new HandlerList();
      }
   }
}

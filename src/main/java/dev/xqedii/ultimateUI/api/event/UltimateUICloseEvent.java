package dev.xqedii.ultimateUI.api.event;

import dev.xqedii.ultimateUI.Xqedii_2s7nlej;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public final class UltimateUICloseEvent extends UltimateUIEvent {
   public static final String Xqedii_2xpj55aaobws5 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final HandlerList Xqedii_1sduzn4;
   public final boolean Xqedii_tcbphzy;

   public UltimateUICloseEvent(Player var1, String var2, boolean var3) {
      super(
         var1,
         var2,
         Xqedii_2s7nlej.Xqedii_3cp3u8hfycl32("3K66QthFWu7cwFdPNfOWE9m7gAQtOFTUbLMQmw=="),
         Double.longBitsToDouble(Xqedii_2s7nlej.Xqedii_130u1n4mqfbjf(-4771582377753391502L, 36)),
         Double.longBitsToDouble(Xqedii_2s7nlej.Xqedii_1zixicq4zlfyo(-1749464766335289575L, 58)),
         Double.longBitsToDouble(Xqedii_2s7nlej.Xqedii_1k0hai9klj65g(8967929850450995145L, 20)),
         Double.longBitsToDouble(Xqedii_2s7nlej.Xqedii_130u1n4mqfbjf(-4771582377753391502L, 34))
      );
      this.Xqedii_tcbphzy = var3;
   }

   public boolean isWholeSession() {
      if ((23262388 ^ 23262388) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_tcbphzy;
      }
   }

   public HandlerList getHandlers() {
      if ((1054313261 ^ 1054313261) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1sduzn4;
      }
   }

   public static HandlerList getHandlerList() {
      if (((1674167926 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1sduzn4;
      }
   }

   static {
      if (((-212433893 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1sduzn4 = new HandlerList();
      }
   }
}

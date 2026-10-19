package dev.xqedii.ultimateUI.service.input;

import dev.xqedii.ultimateUI.Xqedii_2g3vmys;
import java.util.UUID;

public final class AnvilInputSession {
   public static final String Xqedii_30ilvijhyini7 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final UUID Xqedii_3gnfpmg;
   public final AnvilInputRequest Xqedii_1qi075i;
   public final String Xqedii_2uxavc8;
   public volatile String Xqedii_2f5t9hn;
   public volatile boolean Xqedii_470tr00;
   public volatile boolean Xqedii_3k3pf1d;
   public volatile boolean Xqedii_3fr4aqx;
   public volatile long Xqedii_2g9taw5;

   public AnvilInputSession(UUID var1, AnvilInputRequest var2, String var3) {
      this.Xqedii_3gnfpmg = var1;
      this.Xqedii_1qi075i = var2;
      this.Xqedii_2uxavc8 = var3 == null ? Xqedii_2g3vmys.Xqedii_2he7ankp7nmt5("C89Q81kuXGfeKYlavtDAueA1T2LBD8ALga/Xdw==") : var3;
      this.Xqedii_2f5t9hn = this.Xqedii_2uxavc8;
      this.Xqedii_2g9taw5 = System.nanoTime();
   }

   public UUID playerId() {
      if ((911494816 * (911494816 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3gnfpmg;
      }
   }

   public AnvilInputRequest request() {
      if (((895738268 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1qi075i;
      }
   }

   public String value() {
      if ((-578072847 * (-578072847 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2f5t9hn;
      }
   }

   public String Xqedii_2qoba9h() {
      if ((-1864738973 * -1864738973 - -1864738973 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2uxavc8;
      }
   }

   public boolean isOpen() {
      if ((-1877404509 * (-1877404509 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_470tr00;
      }
   }

   public boolean isWritable() {
      if (((-205330570 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3k3pf1d;
      }
   }

   public boolean Xqedii_2epgyl0() {
      if ((255567822 * 255567822 - 255567822 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3fr4aqx;
      }
   }

   public void Xqedii_2x5elu3(boolean var1) {
      if ((-623031623 * (-623031623 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3fr4aqx = var1;
      }
   }

   public void Xqedii_14p58hk(String var1) {
      if ((1724405846 * (1724405846 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2f5t9hn = var1 == null ? Xqedii_2g3vmys.Xqedii_2he7ankp7nmt5("C89Q81kuXGfeKYlavtDAueA1T2LBD8ALga/Xdw==") : var1;
      }
   }

   public void Xqedii_3md9ie3(boolean var1) {
      if ((907787307 * 907787307 + 907787307 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_470tr00 = var1;
      }
   }

   public void Xqedii_308m5bt(boolean var1) {
      if ((-1317485420 * (-1317485420 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3k3pf1d = var1;
      }
   }

   public void Xqedii_3f5pgij() {
      if ((-1141040602 * (-1141040602 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2g9taw5 = System.nanoTime();
      }
   }

   public long Xqedii_ajuydy5() {
      if (((949049316 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (System.nanoTime() - this.Xqedii_2g9taw5) / Xqedii_2g3vmys.Xqedii_1ba0jxwoeni5c(-5477266757501910080L, 53);
      }
   }
}

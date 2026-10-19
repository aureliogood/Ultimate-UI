package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.util.PlatformCompat;
import org.bukkit.scheduler.BukkitTask;

public final class Xqedii_z0t7eh7 implements PlatformCompat.CancellableTask {
   public static final String Xqedii_2q2knvv24b545 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public volatile Object Xqedii_3rh4n53;
   public volatile BukkitTask Xqedii_3mk6dk4;
   public volatile boolean Xqedii_2mrfj8p;

   public void Xqedii_oc0hnm3(Object var1) {
      if ((-648212865 * -648212865 + -648212865 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3rh4n53 = var1;
      }
   }

   public void Xqedii_2hpi5bz(BukkitTask var1) {
      if ((260646805 * 260646805 - 260646805 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3mk6dk4 = var1;
      }
   }

   @Override
   public void cancel() {
      if (((-195531853 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2mrfj8p = (Xqedii_3qt1z6k.Xqedii_2zm2zox4m1t9s(156625425, 4) != 0);
         Object var1 = this.Xqedii_3rh4n53;
         if (var1 != null) {
            try {
               var1.getClass().getMethod(Xqedii_3qt1z6k.Xqedii_23iz0pzwqoxke("D3u5rnVl/LmQ/DrLq2yrlzEBoiYnljo6e5+jmQ46WNDY9uX8mGPE9g==")).invoke(var1);
            } catch (Throwable var5) {
            }
         }

         BukkitTask var2 = this.Xqedii_3mk6dk4;
         if (var2 != null) {
            try {
               var2.cancel();
            } catch (Throwable var4) {
            }
         }
      }
   }

   @Override
   public boolean isCancelled() {
      if ((1025480577 * 1025480577 - 1025480577 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_2mrfj8p) {
         return (Xqedii_3qt1z6k.Xqedii_1baisfwz1mx89(-1109811506, 18) != 0);
      } else {
         BukkitTask var1 = this.Xqedii_3mk6dk4;
         if (var1 != null) {
            try {
               return var1.isCancelled();
            } catch (Throwable var3) {
            }
         }

         return (Xqedii_3qt1z6k.Xqedii_2zm2zox4m1t9s(313250818, 5) != 0);
      }
   }
}

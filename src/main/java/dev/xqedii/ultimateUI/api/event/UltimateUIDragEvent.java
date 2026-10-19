package dev.xqedii.ultimateUI.api.event;

import dev.xqedii.ultimateUI.Xqedii_mzur6oo;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public final class UltimateUIDragEvent extends UltimateUIEvent implements Cancellable {
   public static final String Xqedii_3jbnir1qfwsb4 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final HandlerList Xqedii_2g7p8we;
   public final UltimateUIDragEvent.Phase Xqedii_zx5sir1;
   public final double Xqedii_1jk9bgr;
   public final double Xqedii_2u45shk;
   public final double Xqedii_h9z79ll;
   public final double Xqedii_2eebxrl;
   public final String Xqedii_m11i0vc;
   public final boolean Xqedii_3beqnav;
   public final String Xqedii_3buf7ef;
   public boolean Xqedii_3nd458c;

   public UltimateUIDragEvent(
      Player var1,
      String var2,
      String var3,
      UltimateUIDragEvent.Phase var4,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      String var21,
      boolean var22
   ) {
      this(
         var1,
         var2,
         var3,
         var4,
         var5,
         var7,
         var9,
         var11,
         var13,
         var15,
         var17,
         var19,
         var21,
         Xqedii_mzur6oo.Xqedii_2035n8bhzw7v5("YlbSGvK/vs2DO+RrKFfYKnNfuYK2piYvwQ2WMQ=="),
         var22
      );
   }

   public UltimateUIDragEvent(
      Player var1,
      String var2,
      String var3,
      UltimateUIDragEvent.Phase var4,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      String var21,
      String var22,
      boolean var23
   ) {
      super(var1, var2, var3, var5, var7, var9, var11);
      this.Xqedii_3buf7ef = var22 == null ? Xqedii_mzur6oo.Xqedii_2035n8bhzw7v5("YlbSGvK/vs2DO+RrKFfYKnNfuYK2piYvwQ2WMQ==") : var22;
      this.Xqedii_zx5sir1 = var4 == null ? UltimateUIDragEvent.Phase.MOVE : var4;
      this.Xqedii_1jk9bgr = finite(var13);
      this.Xqedii_2u45shk = finite(var15);
      this.Xqedii_h9z79ll = finite(var17);
      this.Xqedii_2eebxrl = finite(var19);
      this.Xqedii_m11i0vc = var21 == null ? Xqedii_mzur6oo.Xqedii_2035n8bhzw7v5("YlbSGvK/vs2DO+RrKFfYKnNfuYK2piYvwQ2WMQ==") : var21;
      this.Xqedii_3beqnav = var23;
   }

   public UltimateUIDragEvent.Phase getPhase() {
      if ((785981871 * (785981871 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_zx5sir1;
      }
   }

   public boolean isStart() {
      if (((-2088152271 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_zx5sir1 == UltimateUIDragEvent.Phase.START
            ? Xqedii_mzur6oo.Xqedii_36qmh3yt7fxu9(-1582031308, 11)
            : Xqedii_mzur6oo.Xqedii_ap3m4pmvdm8v(-1352694891, 15)) != 0);
      }
   }

   public boolean isMove() {
      if (((-468184237 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_zx5sir1 == UltimateUIDragEvent.Phase.MOVE
            ? Xqedii_mzur6oo.Xqedii_m31trakx6xep(-1786596918, 9)
            : Xqedii_mzur6oo.Xqedii_29z2enj5iypet(1335833459, 29)) != 0);
      }
   }

   public boolean isEnd() {
      if (((1222216450 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_zx5sir1 == UltimateUIDragEvent.Phase.END
            ? Xqedii_mzur6oo.Xqedii_36qmh3yt7fxu9(-1926730489, 1)
            : Xqedii_mzur6oo.Xqedii_ap3m4pmvdm8v(-2087342241, 31)) != 0);
      }
   }

   public double getStartX() {
      if ((-1748682821 * -1748682821 + -1748682821 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1jk9bgr;
      }
   }

   public double getStartY() {
      if ((-689394314 ^ -689394314) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2u45shk;
      }
   }

   public double getOffsetX() {
      if ((-1103359887 * (-1103359887 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.getPageX() - this.Xqedii_1jk9bgr;
      }
   }

   public double getOffsetY() {
      if (((657854035 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.getPageY() - this.Xqedii_2u45shk;
      }
   }

   public double getStepX() {
      if ((606561208 * (606561208 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_h9z79ll;
      }
   }

   public double getStepY() {
      if (((1270347643 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2eebxrl;
      }
   }

   public String getDropBlockId() {
      if ((-1838945243 * (-1838945243 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_m11i0vc;
      }
   }

   public String getDropContainerId() {
      if ((-2064498122 * -2064498122 - -2064498122 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3buf7ef;
      }
   }

   public boolean isDroppedOnBlock() {
      if (((-263721913 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((!this.Xqedii_m11i0vc.isEmpty()
            ? Xqedii_mzur6oo.Xqedii_36qmh3yt7fxu9(-2084137930, 24)
            : Xqedii_mzur6oo.Xqedii_m31trakx6xep(1786596917, 19)) != 0);
      }
   }

   public boolean isDraggable() {
      if ((-1545859072 * -1545859072 + -1545859072 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3beqnav;
      }
   }

   public boolean isCancelled() {
      if ((614284404 * 614284404 - 614284404 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3nd458c;
      }
   }

   public void setCancelled(boolean var1) {
      if (((-1968634676 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3nd458c = var1;
      }
   }

   public HandlerList getHandlers() {
      if ((383145084 * 383145084 + 383145084 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2g7p8we;
      }
   }

   public static HandlerList getHandlerList() {
      if ((448637356 * 448637356 + 448637356 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_2g7p8we;
      }
   }

   static {
      if (((188563356 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2g7p8we = new HandlerList();
      }
   }

   public static enum Phase {
      START,
      MOVE,
      END;
      public static final String Xqedii_16lglb5eogycg = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   }
}

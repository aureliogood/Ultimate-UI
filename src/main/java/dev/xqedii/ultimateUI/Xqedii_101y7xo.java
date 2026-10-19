package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_101y7xo {
   private static final ConcurrentHashMap<String, String> Xqedii_19tit9mv0sr5l = new ConcurrentHashMap<>();
   private static volatile int Xqedii_xtl15eh9k850 = -1588711798;
   private static volatile int Xqedii_3jr5md219vj8a = 1466005596;
   private static volatile int Xqedii_3rropltgjkfvb = 601257776;
   private static volatile int Xqedii_3csshvcx6gnsr = -484431141;
   private static volatile long Xqedii_1gf451ybfleuy = 3347351581571769206L;
   private static volatile long Xqedii_1fjs3h6xhof29 = -7122619882458289623L;
   private static volatile long Xqedii_55u0jka5zb43 = -5187791985277510208L;
   private static volatile long Xqedii_1hv3tlkc629h1 = -8039205104605996870L;

   public static int Xqedii_x42dgjucv46g(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_xtl15eh9k850, var1);
   }

   public static int Xqedii_cz9vvmvpbj34(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3jr5md219vj8a;
   }

   public static int Xqedii_32yuti7slijjp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3rropltgjkfvb;
   }

   public static int Xqedii_g54i57lr0mm1(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3csshvcx6gnsr, var1);
   }

   public static long Xqedii_3gnyuklf4fjt3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1gf451ybfleuy, var2);
   }

   public static long Xqedii_aojlqzs452us(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1fjs3h6xhof29;
   }

   public static long Xqedii_wq6r027q3nwb(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_55u0jka5zb43;
   }

   public static long Xqedii_3rqo39zgfti7d(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1hv3tlkc629h1, var2);
   }

   public static String Xqedii_3fzcxfc08ewd8(String var0) {
      String var1 = Xqedii_19tit9mv0sr5l.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("EQvI2Cl1fENpXh2//0o5ojS7tgN28R7KFNXVXeArbQs=");
            int var3 = 1765001916;

            for (int var4 = 0; var4 < var2.length; var4++) {
               var2[var4] ^= (byte)(var3 >>> (var4 & 3) * 8);
            }

            byte[] var11 = Base64.getDecoder().decode(var0);
            Cipher var5 = Cipher.getInstance("AES/GCM/NoPadding");
            var5.init(2, new SecretKeySpec(var2, "AES"), new GCMParameterSpec(128, var11, 0, 12));
            byte[] var6 = var5.doFinal(var11, 12, var11.length - 12);
            char[] var7 = new char[var6.length / 2];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = (char)((var6[var8 * 2] & 255) << 8 | var6[var8 * 2 + 1] & 255);
            }

            String var12 = new String(var7).intern();
            Arrays.fill(var2, (byte)0);
            String var9 = Xqedii_19tit9mv0sr5l.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3kmhodwa227rs() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3pbmp3j6c4pf4() {
   }

   private static int Xqedii_astdhd4qgmn5(byte[] var0, byte[] var1) {
      if (var1.length != 0 && var0.length >= var1.length) {
         label27:
         for (int var2 = 0; var2 + var1.length <= var0.length; var2++) {
            for (int var3 = 0; var3 < var1.length; var3++) {
               if (var0[var2 + var3] != var1[var3]) {
                  continue label27;
               }
            }

            return var2;
         }

         return -1;
      } else {
         return -1;
      }
   }

   private static /* synthetic */ void Xqedii_ug6qqj1ck00f(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

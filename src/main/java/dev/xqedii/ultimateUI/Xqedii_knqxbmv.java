package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_knqxbmv {
   private static final ConcurrentHashMap<String, String> Xqedii_3rocer6aecq5k = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2jfen453ze6cq = 1528130032;
   private static volatile int Xqedii_9jwle6k3e34e = -2040550479;
   private static volatile int Xqedii_28v0f0m7jibwo = -1826155876;
   private static volatile int Xqedii_o3s59e3215kt = -1778721945;
   private static volatile long Xqedii_1virrw1jqq7d2 = -1402297320995681788L;
   private static volatile long Xqedii_ri126u9xdff5 = 4686636332123338868L;
   private static volatile long Xqedii_1q5fhuv0ullcf = -3046552099373373111L;
   private static volatile long Xqedii_2i4foysa4sw2h = -6241787375189338040L;

   public static int Xqedii_qt6pwarkxzyg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2jfen453ze6cq, var1);
   }

   public static int Xqedii_uw7c9j0tr8bh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_9jwle6k3e34e;
   }

   public static int Xqedii_1fz518tdw3s04(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_28v0f0m7jibwo;
   }

   public static int Xqedii_323c4ujoxn11t(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_o3s59e3215kt, var1);
   }

   public static long Xqedii_2e3pa0ru98jnn(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1virrw1jqq7d2, var2);
   }

   public static long Xqedii_lkcbd2w5hphz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_ri126u9xdff5;
   }

   public static long Xqedii_hd5jvgk4vt2x(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1q5fhuv0ullcf;
   }

   public static long Xqedii_3u00d41da9ubb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2i4foysa4sw2h, var2);
   }

   public static String Xqedii_7v0p63le84h8(String var0) {
      String var1 = Xqedii_3rocer6aecq5k.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("564HSWLjWucUXXR6jJ9lqGilFz4ZNcaTrvFTl+B5jcI=");
            int var3 = -870794191;

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
            String var9 = Xqedii_3rocer6aecq5k.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_19tti6mh1upny() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1h3pxknkp83v2() {
   }

   private static int Xqedii_1oyzypomcaqef(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3s9i9vksri9se(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

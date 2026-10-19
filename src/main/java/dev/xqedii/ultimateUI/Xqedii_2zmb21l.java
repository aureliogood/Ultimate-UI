package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2zmb21l {
   private static final ConcurrentHashMap<String, String> Xqedii_3put3815m0gba = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2jfhnkxmuye2f = -1438963410;
   private static volatile int Xqedii_1nlegdxobvk4t = -1617904828;
   private static volatile int Xqedii_1hq7ryijwh41v = -1192708304;
   private static volatile int Xqedii_1htjhj1j8m52d = -2013192656;
   private static volatile long Xqedii_147xx1gwxzynw = 8653802615540429365L;
   private static volatile long Xqedii_bj07yvfitx3i = 995250823020908272L;
   private static volatile long Xqedii_ybbspu1vocy8 = 431057059141997888L;
   private static volatile long Xqedii_1s14jtkh6w8ug = -5109277720202482095L;

   public static int Xqedii_27feyhdnp1o8u(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2jfhnkxmuye2f, var1);
   }

   public static int Xqedii_j4rxm5ovplfr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1nlegdxobvk4t;
   }

   public static int Xqedii_1ry7m9t5ati4c(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1hq7ryijwh41v;
   }

   public static int Xqedii_3psbwh1l6ztny(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1htjhj1j8m52d, var1);
   }

   public static long Xqedii_1ltxug4qdv25(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_147xx1gwxzynw, var2);
   }

   public static long Xqedii_3nozdqtcor31y(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_bj07yvfitx3i;
   }

   public static long Xqedii_1xgb27gop9e6v(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_ybbspu1vocy8;
   }

   public static long Xqedii_157skl9squ3py(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1s14jtkh6w8ug, var2);
   }

   public static String Xqedii_9t0ki7hby00j(String var0) {
      String var1 = Xqedii_3put3815m0gba.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("jw5k8ZFZHToxyE99TZ4RLJi0poSURM0l0WVWlD39O28=");
            int var3 = 1027440789;

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
            String var9 = Xqedii_3put3815m0gba.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_38rs3minzk2u7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1apljh2r6zfus() {
   }

   private static int Xqedii_49ujxl0qbobv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_l2gfy3azev4q(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2joeizo {
   private static final ConcurrentHashMap<String, String> Xqedii_ezubogmq4zlk = new ConcurrentHashMap<>();
   private static volatile int Xqedii_exxt82dt3nwo = -418996709;
   private static volatile int Xqedii_ko6wo7ka796v = 389717633;
   private static volatile int Xqedii_2kkgspnj421bi = -1832403755;
   private static volatile int Xqedii_3m2uv8anpwf1l = 1732084469;
   private static volatile long Xqedii_26vxzip06neko = 4545684277189442301L;
   private static volatile long Xqedii_1pi8gg0trza4v = -8699464201928877279L;
   private static volatile long Xqedii_ex53qxmef2nx = 280689380505453620L;
   private static volatile long Xqedii_1urifgbxqiil = -5652229757961105399L;

   public static int Xqedii_23hugnd3xk61t(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_exxt82dt3nwo, var1);
   }

   public static int Xqedii_ir19hgqb7bkx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ko6wo7ka796v;
   }

   public static int Xqedii_2d99ccoblqj4w(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2kkgspnj421bi;
   }

   public static int Xqedii_2cvoyoo6d4p5k(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3m2uv8anpwf1l, var1);
   }

   public static long Xqedii_3h1sjilv3j0ow(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_26vxzip06neko, var2);
   }

   public static long Xqedii_1xodxe4w13uc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1pi8gg0trza4v;
   }

   public static long Xqedii_2ifi0rwhh0z6d(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_ex53qxmef2nx;
   }

   public static long Xqedii_bifklmim7oza(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1urifgbxqiil, var2);
   }

   public static String Xqedii_1wivrlg7lqzkb(String var0) {
      String var1 = Xqedii_ezubogmq4zlk.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("LZh+Xy8tgkE6jPofZl+M5bjOYVidRkeBgpOgkHkFBZc=");
            int var3 = -1157946864;

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
            String var9 = Xqedii_ezubogmq4zlk.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1bi05nflo3o6x() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1s7rdk34vb1bv() {
   }

   private static int Xqedii_12nvifkfxusru(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1grrf623lqfsv(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

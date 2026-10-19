package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2d599cp {
   private static final ConcurrentHashMap<String, String> Xqedii_cxz23y5gotbt = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2079qi5iygncl = 734885193;
   private static volatile int Xqedii_2ynb3uha8fym5 = 999260408;
   private static volatile int Xqedii_pzizlc14hzvm = 1432429975;
   private static volatile int Xqedii_t3nhv0o8s4g8 = -1773802706;
   private static volatile long Xqedii_5s5ifb3lb0oh = 6672802913496072191L;
   private static volatile long Xqedii_u6eb05us7eey = -1237043336901494608L;
   private static volatile long Xqedii_1jxw8ufls6t5h = -8030649592902459727L;
   private static volatile long Xqedii_2ynqlv3tw9e6j = -7607451638699624070L;

   public static int Xqedii_3bhbmpd3nxh0s(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2079qi5iygncl, var1);
   }

   public static int Xqedii_16lhpip1tfbwh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2ynb3uha8fym5;
   }

   public static int Xqedii_2x68se48kfla1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_pzizlc14hzvm;
   }

   public static int Xqedii_gwanfa4wtcsv(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_t3nhv0o8s4g8, var1);
   }

   public static long Xqedii_2ph538glkwha5(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_5s5ifb3lb0oh, var2);
   }

   public static long Xqedii_10l5l7o5j14bs(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_u6eb05us7eey;
   }

   public static long Xqedii_33p5svijf64v0(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1jxw8ufls6t5h;
   }

   public static long Xqedii_wn4sxwkr6ejo(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2ynqlv3tw9e6j, var2);
   }

   public static String Xqedii_38xvp7gnyuv04(String var0) {
      String var1 = Xqedii_cxz23y5gotbt.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Xi2DrEn7En3Z5U7SajIkX59czDrVL+8WfznhVM0RhCU=");
            int var3 = 484181906;

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
            String var9 = Xqedii_cxz23y5gotbt.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1vjm351bfn35p() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_19xsigjnkax83() {
   }

   private static int Xqedii_cvjkt73gw30d(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3u3oonza1mbcf(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

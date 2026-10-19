package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3ihqgc8 {
   private static final ConcurrentHashMap<String, String> Xqedii_149yp4ev8r3ai = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1hlx9smn5xzth = 2032366790;
   private static volatile int Xqedii_oiu1uddrgqf = 398084204;
   private static volatile int Xqedii_sm56ddlyd9pu = 875512892;
   private static volatile int Xqedii_30m7fayl9o8lj = 1032529960;
   private static volatile long Xqedii_2rga8eemiz74x = -2352771673804245514L;
   private static volatile long Xqedii_yy07b9d2mxt4 = 7553552981238343335L;
   private static volatile long Xqedii_rvobbontiqbi = -4774082992117130266L;
   private static volatile long Xqedii_10nqub5pe9i53 = 1882854204791454329L;

   public static int Xqedii_e85v2ofrfaac(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1hlx9smn5xzth, var1);
   }

   public static int Xqedii_1yr2w71y595u6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_oiu1uddrgqf;
   }

   public static int Xqedii_1y3ssml1szkmh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_sm56ddlyd9pu;
   }

   public static int Xqedii_3uwg40ecgal2u(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_30m7fayl9o8lj, var1);
   }

   public static long Xqedii_2t1lvuv30ewth(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2rga8eemiz74x, var2);
   }

   public static long Xqedii_3q99a8e1nv4ng(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_yy07b9d2mxt4;
   }

   public static long Xqedii_g4b6gcmn35m1(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_rvobbontiqbi;
   }

   public static long Xqedii_3u3apuri2wjbb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_10nqub5pe9i53, var2);
   }

   public static String Xqedii_1uu5gx5gc3ttb(String var0) {
      String var1 = Xqedii_149yp4ev8r3ai.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("xwIApYDvlil9gMBzRmoqS2SL45k0b/M5vnVGPWhmuAo=");
            int var3 = -335531466;

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
            String var9 = Xqedii_149yp4ev8r3ai.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1flnyrzoah5ec() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3c3w4fzd5p1ee() {
   }

   private static int Xqedii_2mtgpbhebjg99(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3vaqjqorkvagu(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

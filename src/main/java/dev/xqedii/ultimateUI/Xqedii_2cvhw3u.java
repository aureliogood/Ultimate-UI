package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2cvhw3u {
   private static final ConcurrentHashMap<String, String> Xqedii_3u60jqim7qasi = new ConcurrentHashMap<>();
   private static volatile int Xqedii_wl3ros29fmz = 927622393;
   private static volatile int Xqedii_el2h5k3001nw = -730859783;
   private static volatile int Xqedii_16z6b83froy33 = 1766066391;
   private static volatile int Xqedii_jnhmlckp7btt = 817040925;
   private static volatile long Xqedii_28fmltdufn6oq = 7511403199057921594L;
   private static volatile long Xqedii_2xfd5c9bep1h = -7748948829858050817L;
   private static volatile long Xqedii_35xdx517r710p = 8507753675212595807L;
   private static volatile long Xqedii_1odrsa05mtaql = 7613776503394033599L;

   public static int Xqedii_1tyysaokco069(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_wl3ros29fmz, var1);
   }

   public static int Xqedii_2gxtn9sv4rsel(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_el2h5k3001nw;
   }

   public static int Xqedii_2p5ht5gxt6g9b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_16z6b83froy33;
   }

   public static int Xqedii_2huwchpjjgzw0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_jnhmlckp7btt, var1);
   }

   public static long Xqedii_2x3fjghq8jhf5(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_28fmltdufn6oq, var2);
   }

   public static long Xqedii_q4kqiezxd5xi(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2xfd5c9bep1h;
   }

   public static long Xqedii_2vojpwc4h6v7g(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_35xdx517r710p;
   }

   public static long Xqedii_3rl2x36av32q1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1odrsa05mtaql, var2);
   }

   public static String Xqedii_2lvbjoj2ghd5g(String var0) {
      String var1 = Xqedii_3u60jqim7qasi.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("pbK91UMlvhc0BYHW2QFm0CAwK2OwDwq228ivl7tZ10Q=");
            int var3 = 1981657588;

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
            String var9 = Xqedii_3u60jqim7qasi.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2q77bppuedeev() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_sifh3odxet1j() {
   }

   private static int Xqedii_2nxuq0fx13vs8(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1r8iskhi870c(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

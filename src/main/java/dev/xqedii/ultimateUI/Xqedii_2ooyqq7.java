package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2ooyqq7 {
   private static final ConcurrentHashMap<String, String> Xqedii_2x2g275cpe337 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_s8l8a00cdjcu = 1584599772;
   private static volatile int Xqedii_nbypvn4ccco0 = -1978951709;
   private static volatile int Xqedii_2b38521jwyje2 = -1689068841;
   private static volatile int Xqedii_eqz90bp7a4ot = 110447440;
   private static volatile long Xqedii_i6hsr7vupj0h = -6804195477256378159L;
   private static volatile long Xqedii_vtjyiq3pokdo = -1491298047642153204L;
   private static volatile long Xqedii_3j8dr79js00hl = -6728644664165113591L;
   private static volatile long Xqedii_144k9me23r7r0 = -8787310727523938054L;

   public static int Xqedii_2mkycpeffnpl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_s8l8a00cdjcu, var1);
   }

   public static int Xqedii_17eb4bvfhjyc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_nbypvn4ccco0;
   }

   public static int Xqedii_2y1oedeyf7v1x(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2b38521jwyje2;
   }

   public static int Xqedii_2mr0flwlasmvg(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_eqz90bp7a4ot, var1);
   }

   public static long Xqedii_beg5qpipx6xu(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_i6hsr7vupj0h, var2);
   }

   public static long Xqedii_132evdfifjr5p(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_vtjyiq3pokdo;
   }

   public static long Xqedii_2sz5ltjdtlbeo(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3j8dr79js00hl;
   }

   public static long Xqedii_37tfg7nfadpe9(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_144k9me23r7r0, var2);
   }

   public static String Xqedii_206c0sg7dmt1c(String var0) {
      String var1 = Xqedii_2x2g275cpe337.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("GexNpcPgxoWS1LY5cArryjjPQBUzF+zx+Nf6Sj0PudU=");
            int var3 = 293173354;

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
            String var9 = Xqedii_2x2g275cpe337.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1ubcftaxh1yjt() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_6e9t07iglhf2() {
   }

   private static int Xqedii_1tdo9wzzkytmo(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3tiv7vvzthgg5(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

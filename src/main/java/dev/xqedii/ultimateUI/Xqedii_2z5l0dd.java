package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2z5l0dd {
   private static final ConcurrentHashMap<String, String> Xqedii_3im27xdcn1ob2 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_38cj6tmswtdnw = -1842152613;
   private static volatile int Xqedii_1v29pab44kh50 = -2074729476;
   private static volatile int Xqedii_22qrl7endxzpa = -1555490488;
   private static volatile int Xqedii_zfxhybaxtlgo = 1492670273;
   private static volatile long Xqedii_tyqh44bu6gy0 = -4960303504099724781L;
   private static volatile long Xqedii_31di0bz1v4qgj = 963855778747335524L;
   private static volatile long Xqedii_dnfg82ykno4h = 3483487932404326173L;
   private static volatile long Xqedii_1jsvd2ltenal3 = 1321768057600511143L;

   public static int Xqedii_vc8zv0eywg5p(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_38cj6tmswtdnw, var1);
   }

   public static int Xqedii_1u2g1vsusrioy(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1v29pab44kh50;
   }

   public static int Xqedii_qqb7ewp7leds(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_22qrl7endxzpa;
   }

   public static int Xqedii_25cy03lzzzn7j(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_zfxhybaxtlgo, var1);
   }

   public static long Xqedii_1hj3m4tloz0et(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_tyqh44bu6gy0, var2);
   }

   public static long Xqedii_1m3vnheqwcdhj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_31di0bz1v4qgj;
   }

   public static long Xqedii_2h21ouv3gkpl0(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_dnfg82ykno4h;
   }

   public static long Xqedii_uqsq3vep60jj(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1jsvd2ltenal3, var2);
   }

   public static String Xqedii_2cdqvlyqk21cm(String var0) {
      String var1 = Xqedii_3im27xdcn1ob2.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("DCEYW2dRNc0NK5FLM/6WW8WB6hSccbxCJKWVJE9U2L0=");
            int var3 = 1884225893;

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
            String var9 = Xqedii_3im27xdcn1ob2.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_xyhr4qgli2cv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_ffof3j74uww5() {
   }

   private static int Xqedii_3nytrwz41xg8i(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3l2kk9hhymmkj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

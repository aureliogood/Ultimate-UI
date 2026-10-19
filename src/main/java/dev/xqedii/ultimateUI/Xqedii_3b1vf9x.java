package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3b1vf9x {
   private static final ConcurrentHashMap<String, String> Xqedii_29kqca5mdub5u = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1a8p5u2rctgen = 1967018069;
   private static volatile int Xqedii_1er2q3c9sxzd0 = -354463213;
   private static volatile int Xqedii_pveechs3qma2 = 742967590;
   private static volatile int Xqedii_2fiup7l6gye9w = -1477840702;
   private static volatile long Xqedii_3rlm1why2nk86 = 7779614620765316113L;
   private static volatile long Xqedii_385vmdt42fant = -193757807765424594L;
   private static volatile long Xqedii_7qegov9jgum3 = -7723183257728216873L;
   private static volatile long Xqedii_22tu72ijblz41 = 7212108809728649615L;

   public static int Xqedii_1svx06iafuxv1(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1a8p5u2rctgen, var1);
   }

   public static int Xqedii_3ju3gegdsztzd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1er2q3c9sxzd0;
   }

   public static int Xqedii_25192ak0nfeuh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_pveechs3qma2;
   }

   public static int Xqedii_3hdtmisfv7jw7(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2fiup7l6gye9w, var1);
   }

   public static long Xqedii_2mh59o41a8d0c(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3rlm1why2nk86, var2);
   }

   public static long Xqedii_30j5hfj6jmnrh(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_385vmdt42fant;
   }

   public static long Xqedii_34rt0r9fmi315(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_7qegov9jgum3;
   }

   public static long Xqedii_3i6kn9mpdp14m(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_22tu72ijblz41, var2);
   }

   public static String Xqedii_3oqm41kt2631b(String var0) {
      String var1 = Xqedii_29kqca5mdub5u.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Yb0aFyhlNZIWE/NF7dK2xnXgBL81c4aPYrucwaHHs6M=");
            int var3 = -674259587;

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
            String var9 = Xqedii_29kqca5mdub5u.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3by0rlkw87ipy() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3dllj2jgil2jq() {
   }

   private static int Xqedii_1ep15qwc83y5u(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_12rr7qug30gcb(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

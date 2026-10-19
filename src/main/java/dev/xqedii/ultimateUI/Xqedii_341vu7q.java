package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_341vu7q {
   private static final ConcurrentHashMap<String, String> Xqedii_844xror506sa = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1km6xyxac7a9d = 4535845;
   private static volatile int Xqedii_2u39f2g0vlbyx = -1197193381;
   private static volatile int Xqedii_30wk0k8rhtor4 = -2093699516;
   private static volatile int Xqedii_9dalq88wxvs8 = -1840197324;
   private static volatile long Xqedii_3s5pl7wtikrci = 8638504851855998246L;
   private static volatile long Xqedii_1hyauekqwqt9q = 105601938992288651L;
   private static volatile long Xqedii_1xtqtuwg1k0fr = 4676179950263485880L;
   private static volatile long Xqedii_3p7mjhhrgjt32 = 4510369720374807152L;

   public static int Xqedii_1xe8gi7yeka16(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1km6xyxac7a9d, var1);
   }

   public static int Xqedii_326zks0s33g7t(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2u39f2g0vlbyx;
   }

   public static int Xqedii_153wqi3ziy1xq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_30wk0k8rhtor4;
   }

   public static int Xqedii_26ytr6o2d1g0e(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_9dalq88wxvs8, var1);
   }

   public static long Xqedii_3mjjghoj91tke(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3s5pl7wtikrci, var2);
   }

   public static long Xqedii_1q4fc61jffl46(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1hyauekqwqt9q;
   }

   public static long Xqedii_2eaei1q34vf4b(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1xtqtuwg1k0fr;
   }

   public static long Xqedii_1gmdw987zcja(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3p7mjhhrgjt32, var2);
   }

   public static String Xqedii_1ljo8j4k43k8y(String var0) {
      String var1 = Xqedii_844xror506sa.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("wdDfNeS5s8+kYcazFG4TqlcdDwkwx+ro7+E6UoJtT1I=");
            int var3 = -134327984;

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
            String var9 = Xqedii_844xror506sa.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_28akjq4vex6f7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3okylcizan2cm() {
   }

   private static int Xqedii_wcsozlwalis8(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_31jztx3t87wvj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_21041al {
   private static final ConcurrentHashMap<String, String> Xqedii_2cd2gwm5jgios = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3jkpoyprns60k = -1098193266;
   private static volatile int Xqedii_nv7i1i3siayc = 1645236210;
   private static volatile int Xqedii_22o52c2794ah5 = 1996561750;
   private static volatile int Xqedii_nzwlefznnqrh = 2078323787;
   private static volatile long Xqedii_33zzhh79gjue7 = 8397798730881442835L;
   private static volatile long Xqedii_21io2aytgdnte = -7080707756773791833L;
   private static volatile long Xqedii_3bg53qyh6ifr5 = -3664943829200271540L;
   private static volatile long Xqedii_3ljbyq6h7h042 = 8280049044301639495L;

   public static int Xqedii_3gyl85wlb28gp(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3jkpoyprns60k, var1);
   }

   public static int Xqedii_9jlfcfataent(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_nv7i1i3siayc;
   }

   public static int Xqedii_2nm5x2oggzojj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_22o52c2794ah5;
   }

   public static int Xqedii_eitt3ntm1tu6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_nzwlefznnqrh, var1);
   }

   public static long Xqedii_11nnwti2q61lq(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_33zzhh79gjue7, var2);
   }

   public static long Xqedii_1q2olknux7opf(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_21io2aytgdnte;
   }

   public static long Xqedii_2xg7ac80lys0t(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3bg53qyh6ifr5;
   }

   public static long Xqedii_sii3fhiely51(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3ljbyq6h7h042, var2);
   }

   public static String Xqedii_ejzoe2a2k223(String var0) {
      String var1 = Xqedii_2cd2gwm5jgios.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("6xRa5Hh4tW528cGYGYvFt6H91ybDk7N7IYcEcoDHNgg=");
            int var3 = 313048850;

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
            String var9 = Xqedii_2cd2gwm5jgios.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_ntbdi099rmsq() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_en4lak7ydc2c() {
   }

   private static int Xqedii_1ns72j2zdoyjt(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3opi6am1g0lue(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

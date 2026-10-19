package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2n3at0b {
   private static final ConcurrentHashMap<String, String> Xqedii_2k10e5l8xccvg = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3ahukub72m274 = -544660479;
   private static volatile int Xqedii_3jzd0re2ap631 = -198014133;
   private static volatile int Xqedii_2sgqylddza7j1 = -614696621;
   private static volatile int Xqedii_33xhre83m9txh = 1617159309;
   private static volatile long Xqedii_t56h2qwfl26i = -4067115105881284781L;
   private static volatile long Xqedii_2vffampsik3z3 = 5440117800387430669L;
   private static volatile long Xqedii_1h5uild8jmqex = 9199954550357401416L;
   private static volatile long Xqedii_5v8aajvi19xz = -2893452918242504837L;

   public static int Xqedii_23n9epd1ol86(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3ahukub72m274, var1);
   }

   public static int Xqedii_3qll0apkhf7wm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3jzd0re2ap631;
   }

   public static int Xqedii_3aeqr0vbird8b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2sgqylddza7j1;
   }

   public static int Xqedii_1ksu7b6etosv0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_33xhre83m9txh, var1);
   }

   public static long Xqedii_3q3nq1u8m0fg8(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_t56h2qwfl26i, var2);
   }

   public static long Xqedii_1z9d6kc3vcfoe(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2vffampsik3z3;
   }

   public static long Xqedii_36jae9zuybfd7(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1h5uild8jmqex;
   }

   public static long Xqedii_1fne7dnk7v8yv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_5v8aajvi19xz, var2);
   }

   public static String Xqedii_11iiow9gdbaa0(String var0) {
      String var1 = Xqedii_2k10e5l8xccvg.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("cP/+KOEgOJopXibxeGIzY6xc/RiIfVFwJr4GCiZzdzY=");
            int var3 = 1520464012;

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
            String var9 = Xqedii_2k10e5l8xccvg.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_ng7rsbdn66a5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_nyhuauh6sy50() {
   }

   private static int Xqedii_24rd2m6ve05z(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3dlmn9jq1o5x0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

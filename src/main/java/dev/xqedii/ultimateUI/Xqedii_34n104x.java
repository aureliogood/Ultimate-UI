package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_34n104x {
   private static final ConcurrentHashMap<String, String> Xqedii_1tygh3cgy094h = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1g10hjbbn8qgt = -2026260239;
   private static volatile int Xqedii_3qf0vyyajls5y = 801346065;
   private static volatile int Xqedii_kzqvmp1eyv3w = 1048109826;
   private static volatile int Xqedii_31q4wa76q27x3 = -908364299;
   private static volatile long Xqedii_2i3utkskc6qx2 = 7462295763267573704L;
   private static volatile long Xqedii_3hrp44eg01jeo = 4985165021699690236L;
   private static volatile long Xqedii_1o5x19sai7mgx = -5210596093713612651L;
   private static volatile long Xqedii_trwro2whb3rx = 2694563277768973561L;

   public static int Xqedii_1jkfove0a472u(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1g10hjbbn8qgt, var1);
   }

   public static int Xqedii_4rjh8orze94h(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3qf0vyyajls5y;
   }

   public static int Xqedii_195onruta8i7y(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_kzqvmp1eyv3w;
   }

   public static int Xqedii_2nsb8kayfhik5(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_31q4wa76q27x3, var1);
   }

   public static long Xqedii_2gw31qyb0zgax(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2i3utkskc6qx2, var2);
   }

   public static long Xqedii_2x2r2ut3k2egc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3hrp44eg01jeo;
   }

   public static long Xqedii_l2r8dk4d6n3k(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1o5x19sai7mgx;
   }

   public static long Xqedii_33r58vzgz8fko(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_trwro2whb3rx, var2);
   }

   public static String Xqedii_gcbh72xgq3mp(String var0) {
      String var1 = Xqedii_1tygh3cgy094h.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("11QjpTMvdYF9V0g4Ffrws5kho0TAK8Xk8XiysB1Pxd4=");
            int var3 = -137953830;

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
            String var9 = Xqedii_1tygh3cgy094h.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3kvw0jl1yw51c() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_22i8wdae4gb5c() {
   }

   private static int Xqedii_3ipy8gaxzqbgk(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1f7v7tusrpya8(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

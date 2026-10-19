package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2ndqxax {
   private static final ConcurrentHashMap<String, String> Xqedii_2783hws8cczk7 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1tv5nurf62gg6 = -538199946;
   private static volatile int Xqedii_1b8xl3xi6j1h5 = 1422081941;
   private static volatile int Xqedii_23pk7x5fbvl2f = 903530183;
   private static volatile int Xqedii_39nmd6d9k646k = 1657473702;
   private static volatile long Xqedii_2nsnh1lsc12q4 = 2367867148963899927L;
   private static volatile long Xqedii_1sg02pqkjxpzd = -4172287983181875728L;
   private static volatile long Xqedii_2f3xdqfl4a8e3 = -225632988516573446L;
   private static volatile long Xqedii_2s7tscdy9b9ki = 3608173342015597871L;

   public static int Xqedii_2ofjdgbnke7u5(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1tv5nurf62gg6, var1);
   }

   public static int Xqedii_oe860oqhpykh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1b8xl3xi6j1h5;
   }

   public static int Xqedii_1p44mop4azxki(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_23pk7x5fbvl2f;
   }

   public static int Xqedii_3qcv63i86l3dk(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_39nmd6d9k646k, var1);
   }

   public static long Xqedii_16beq1a7d0e2d(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2nsnh1lsc12q4, var2);
   }

   public static long Xqedii_1z2j5r4maghsd(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1sg02pqkjxpzd;
   }

   public static long Xqedii_1p51hjg0ii66l(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2f3xdqfl4a8e3;
   }

   public static long Xqedii_3a1rbxtcpahcm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2s7tscdy9b9ki, var2);
   }

   public static String Xqedii_1oladqbs3xf8j(String var0) {
      String var1 = Xqedii_2783hws8cczk7.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("lQePytflgEkUQ/W63pOcgCAbYKO8HQkHZhQ/d5Mp1P0=");
            int var3 = -935957566;

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
            String var9 = Xqedii_2783hws8cczk7.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_33zp4qbs3w6g9() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_ox69eth8gggw() {
   }

   private static int Xqedii_2bhzfghq69rde(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_32ejer3owmmxz(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

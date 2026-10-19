package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3j0c8vx {
   private static final ConcurrentHashMap<String, String> Xqedii_29f7e0cp9v5cn = new ConcurrentHashMap<>();
   private static volatile int Xqedii_yjk0ghnup25y = -1166215067;
   private static volatile int Xqedii_2pkkd3ycurnp6 = 1535753858;
   private static volatile int Xqedii_t0ek5fruhr53 = 839635534;
   private static volatile int Xqedii_3jdrdg6p5cm0u = 81789296;
   private static volatile long Xqedii_18e2jl6kip0xv = -5024586063606523096L;
   private static volatile long Xqedii_3boks662or0wo = -4834118634301832398L;
   private static volatile long Xqedii_2zh5yfvm4glxj = 6847888901624237488L;
   private static volatile long Xqedii_1lfe4fllezze5 = 3168652108965282773L;

   public static int Xqedii_so1pq52wve5n(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_yjk0ghnup25y, var1);
   }

   public static int Xqedii_1w1vyon29wila(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2pkkd3ycurnp6;
   }

   public static int Xqedii_2th19fkmx87j5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_t0ek5fruhr53;
   }

   public static int Xqedii_3s9k2jq64haqe(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3jdrdg6p5cm0u, var1);
   }

   public static long Xqedii_36tv3lnzml120(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_18e2jl6kip0xv, var2);
   }

   public static long Xqedii_2b5tec5vu4nbz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3boks662or0wo;
   }

   public static long Xqedii_zz61ujdgp3me(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2zh5yfvm4glxj;
   }

   public static long Xqedii_8q1ipf1db1yj(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1lfe4fllezze5, var2);
   }

   public static String Xqedii_129uaw0k7vrxm(String var0) {
      String var1 = Xqedii_29f7e0cp9v5cn.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+iQVM6rzkirdUFOqRIIqlU74XwXwNbUngCy3fthAjl4=");
            int var3 = 540795162;

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
            String var9 = Xqedii_29f7e0cp9v5cn.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_283yihj9pbfmr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3773bj8dlsb1b() {
   }

   private static int Xqedii_119tm5l3hm64f(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2lq06cszukai7(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1iwjdlj {
   private static final ConcurrentHashMap<String, String> Xqedii_2zwvumpxn34jd = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3ixej3nd9lmhl = -863404346;
   private static volatile int Xqedii_1ar4odvp3syio = 34314859;
   private static volatile int Xqedii_2wigw5q39ai8x = -366157295;
   private static volatile int Xqedii_1wqlz5mexbdvd = 1242771731;
   private static volatile long Xqedii_yweahqpa7o4x = 5352959558210762050L;
   private static volatile long Xqedii_ke5hfpr8j97u = 6386134805126092908L;
   private static volatile long Xqedii_k5k4ed8oir0b = -3521494225019997980L;
   private static volatile long Xqedii_li8ln072ul3s = -6554468588697018344L;

   public static int Xqedii_1fzxf7fkr59gw(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3ixej3nd9lmhl, var1);
   }

   public static int Xqedii_2zypv7v5to9yr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1ar4odvp3syio;
   }

   public static int Xqedii_m1bnaj5u1v97(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2wigw5q39ai8x;
   }

   public static int Xqedii_1zgwvjibdo9nz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1wqlz5mexbdvd, var1);
   }

   public static long Xqedii_3n9lin2toofj(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_yweahqpa7o4x, var2);
   }

   public static long Xqedii_gcvnxx4i40fj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_ke5hfpr8j97u;
   }

   public static long Xqedii_1drvdcdjx48rc(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_k5k4ed8oir0b;
   }

   public static long Xqedii_y599v8sdog4l(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_li8ln072ul3s, var2);
   }

   public static String Xqedii_1z3b0qdeu4rrj(String var0) {
      String var1 = Xqedii_2zwvumpxn34jd.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("wz95Cnn4J6NemxF+LQIQShSe1LJgwwsREStUw2Bph0I=");
            int var3 = 1566159051;

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
            String var9 = Xqedii_2zwvumpxn34jd.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3r0anyqlaa2dt() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1s18xaa3olyko() {
   }

   private static int Xqedii_1l6ngmg5uwr5e(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2p07w8rux1pj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

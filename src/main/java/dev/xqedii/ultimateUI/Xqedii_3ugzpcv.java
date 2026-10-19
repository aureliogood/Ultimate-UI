package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3ugzpcv {
   private static final ConcurrentHashMap<String, String> Xqedii_wwqou54xy8sl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3v5xzpuj3sxfx = 2108671980;
   private static volatile int Xqedii_2rjhkclohy4vc = -514676559;
   private static volatile int Xqedii_399erbssqx8fa = -430228896;
   private static volatile int Xqedii_2d7f2hajvaq6s = -1903902731;
   private static volatile long Xqedii_352yp0v5gduzo = -7655646434770585590L;
   private static volatile long Xqedii_2kfkzq1c9lvap = 1736160572149840561L;
   private static volatile long Xqedii_3209yp36k6w2p = -613834449287645423L;
   private static volatile long Xqedii_1p8mkeg1o2ylh = 7488553542574794299L;

   public static int Xqedii_2g4cn388n0nwp(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3v5xzpuj3sxfx, var1);
   }

   public static int Xqedii_gybort8s8k9j(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2rjhkclohy4vc;
   }

   public static int Xqedii_1dzvlaowbyxkw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_399erbssqx8fa;
   }

   public static int Xqedii_xl5jv0u37hru(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2d7f2hajvaq6s, var1);
   }

   public static long Xqedii_3d2odr65n71ev(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_352yp0v5gduzo, var2);
   }

   public static long Xqedii_31aw1u97131fx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2kfkzq1c9lvap;
   }

   public static long Xqedii_12yhduiusheib(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3209yp36k6w2p;
   }

   public static long Xqedii_26ijafipdx131(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1p8mkeg1o2ylh, var2);
   }

   public static String Xqedii_2i2o0f9sma7wb(String var0) {
      String var1 = Xqedii_wwqou54xy8sl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("fz4qJ6NyDMyVAyyQtj4yOs823wIMcjY0PZAMWU3n1g8=");
            int var3 = -518478304;

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
            String var9 = Xqedii_wwqou54xy8sl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1e41dvs5kb076() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1m3ng7jfrio7n() {
   }

   private static int Xqedii_1wzwrx5g42kv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1nfvud9hwsyc8(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

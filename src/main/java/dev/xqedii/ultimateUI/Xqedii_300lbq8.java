package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_300lbq8 {
   private static final ConcurrentHashMap<String, String> Xqedii_2xqg0ediynuxi = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3od2jh682wyrl = 51403376;
   private static volatile int Xqedii_31g79jv557ob3 = -1772151613;
   private static volatile int Xqedii_28xk0n2oq54y = 376456275;
   private static volatile int Xqedii_myztqoumq4qd = -823765660;
   private static volatile long Xqedii_2c9ipcwc8xl86 = 5133542258124438689L;
   private static volatile long Xqedii_1o61ujqjdmmu9 = 8708457180724703398L;
   private static volatile long Xqedii_3k1hdngans3hc = 6849857908110012587L;
   private static volatile long Xqedii_f344ib6z9e0i = 5610272021049700425L;

   public static int Xqedii_3t4z5q99yrxph(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3od2jh682wyrl, var1);
   }

   public static int Xqedii_1xfzswwkc756l(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_31g79jv557ob3;
   }

   public static int Xqedii_10yahgeykz6k1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_28xk0n2oq54y;
   }

   public static int Xqedii_35iynom3jmygk(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_myztqoumq4qd, var1);
   }

   public static long Xqedii_31gvdzopsmfnl(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2c9ipcwc8xl86, var2);
   }

   public static long Xqedii_coaunua8mbd8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1o61ujqjdmmu9;
   }

   public static long Xqedii_1u3t5ne09mid5(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3k1hdngans3hc;
   }

   public static long Xqedii_246r9nk1x8eqs(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_f344ib6z9e0i, var2);
   }

   public static String Xqedii_36s859iy3axdj(String var0) {
      String var1 = Xqedii_2xqg0ediynuxi.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+maJEmgd9oF9CNIW0a62jTmQdwfWunye0RSmxKrzPWg=");
            int var3 = -1170649474;

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
            String var9 = Xqedii_2xqg0ediynuxi.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_361asy8sugup3() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1a2e0jr2a9kqx() {
   }

   private static int Xqedii_ee3n433kpgiq(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_10o0hg0kq778f(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

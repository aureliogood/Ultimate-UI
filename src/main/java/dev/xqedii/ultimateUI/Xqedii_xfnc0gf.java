package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_xfnc0gf {
   private static final ConcurrentHashMap<String, String> Xqedii_by6w2hdns7mq = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3648tey2hqasu = 450926359;
   private static volatile int Xqedii_1kcfwq0qhznsw = 893866182;
   private static volatile int Xqedii_3tjawr054chjq = 829425151;
   private static volatile int Xqedii_tvvkz6t9b4in = 419781703;
   private static volatile long Xqedii_wquwva632ad9 = -7865606319572285052L;
   private static volatile long Xqedii_2h96wr1cjr43x = -6194888658283620748L;
   private static volatile long Xqedii_3no63bmq5vpz0 = 4678195064213056020L;
   private static volatile long Xqedii_2f7u97d0kab01 = -835989930989101851L;

   public static int Xqedii_94ahhpdz7yuc(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3648tey2hqasu, var1);
   }

   public static int Xqedii_14zs0qfhk0coj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1kcfwq0qhznsw;
   }

   public static int Xqedii_6f1jinm92uiq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3tjawr054chjq;
   }

   public static int Xqedii_2g4vw011mxkjd(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_tvvkz6t9b4in, var1);
   }

   public static long Xqedii_159qts0lgvok9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_wquwva632ad9, var2);
   }

   public static long Xqedii_2qj76nqqq079s(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2h96wr1cjr43x;
   }

   public static long Xqedii_26u31q3z0tbxy(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3no63bmq5vpz0;
   }

   public static long Xqedii_3w1z62qfi7lt1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2f7u97d0kab01, var2);
   }

   public static String Xqedii_5drd2vu3cxl0(String var0) {
      String var1 = Xqedii_by6w2hdns7mq.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("7065JG6VVUHjmPQRxNIUcG4GsOuJuIa+MU/Fm5q86nI=");
            int var3 = -1257455847;

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
            String var9 = Xqedii_by6w2hdns7mq.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1l54vpnolsy87() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1s2fnhmy6m412() {
   }

   private static int Xqedii_1dxrb38j1in8g(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_24kwa5ozo34zq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

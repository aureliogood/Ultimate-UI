package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3qztaq2 {
   private static final ConcurrentHashMap<String, String> Xqedii_1900okldg9ock = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2ltsjvgs64sqo = 1534073506;
   private static volatile int Xqedii_2hrr5apt8te8s = 1378605446;
   private static volatile int Xqedii_39vu9o4iggytk = -94071069;
   private static volatile int Xqedii_1icvh1huartm6 = 664684915;
   private static volatile long Xqedii_1urllugw9d0tr = -1953927438808734353L;
   private static volatile long Xqedii_2z5qr1h07ivlp = -8274054011791570815L;
   private static volatile long Xqedii_35hmwycw0i14l = -7705278469274932507L;
   private static volatile long Xqedii_2ztpucoa58f76 = -3410365797775177289L;

   public static int Xqedii_zuqh3u0vxxrg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2ltsjvgs64sqo, var1);
   }

   public static int Xqedii_1ghdt5a7fu5l4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2hrr5apt8te8s;
   }

   public static int Xqedii_28ohllg0zaz9z(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_39vu9o4iggytk;
   }

   public static int Xqedii_2v2453mj0062s(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1icvh1huartm6, var1);
   }

   public static long Xqedii_uklayrfhmzmm(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1urllugw9d0tr, var2);
   }

   public static long Xqedii_3bzhuvyvevyvn(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2z5qr1h07ivlp;
   }

   public static long Xqedii_2m1kjt67popvi(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_35hmwycw0i14l;
   }

   public static long Xqedii_2o5ymizn1ihbw(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2ztpucoa58f76, var2);
   }

   public static String Xqedii_1ba46jua47osx(String var0) {
      String var1 = Xqedii_1900okldg9ock.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("uKDANR92fRRXg2WrcHjOa5MR8gZ9hOOJ1NpYBdXJ9jA=");
            int var3 = -758545896;

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
            String var9 = Xqedii_1900okldg9ock.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1eluc0u709bn8() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2lfn72ddtorcs() {
   }

   private static int Xqedii_ujjjm1h4mb1v(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3syd3z1u1ldpn(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

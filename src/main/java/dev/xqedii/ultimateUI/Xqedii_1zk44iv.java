package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1zk44iv {
   private static final ConcurrentHashMap<String, String> Xqedii_3bn8tb00s3isr = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3dxrk534w40im = 912056572;
   private static volatile int Xqedii_3s51rcpbopprb = 1947130966;
   private static volatile int Xqedii_3fy6jmhmvyui0 = 1490736771;
   private static volatile int Xqedii_2ajl4032q0ulo = -785983842;
   private static volatile long Xqedii_shsiruan2hna = 333569130967696926L;
   private static volatile long Xqedii_2ovf6a1tij9bx = -6660134608053964013L;
   private static volatile long Xqedii_1pezm36gk7h95 = 1626969994568221399L;
   private static volatile long Xqedii_j8lhn7mo2zg5 = -2124600875129759430L;

   public static int Xqedii_3s6oajx2vgh9u(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3dxrk534w40im, var1);
   }

   public static int Xqedii_7qxac1etysbd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3s51rcpbopprb;
   }

   public static int Xqedii_1i8aqpzeclv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3fy6jmhmvyui0;
   }

   public static int Xqedii_1dw8tumhxkejy(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ajl4032q0ulo, var1);
   }

   public static long Xqedii_6f7wlxzn2o31(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_shsiruan2hna, var2);
   }

   public static long Xqedii_brfo8hq04ml(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ovf6a1tij9bx;
   }

   public static long Xqedii_3m76nj6juxiox(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1pezm36gk7h95;
   }

   public static long Xqedii_qqeva3l8i1pi(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_j8lhn7mo2zg5, var2);
   }

   public static String Xqedii_2sx2af4x2s7y9(String var0) {
      String var1 = Xqedii_3bn8tb00s3isr.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("LUY1Nmks0pflLFfWZYcRuT8zD/ycSyHVx3fhWYCw9S0=");
            int var3 = -1513154831;

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
            String var9 = Xqedii_3bn8tb00s3isr.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1j7vyv901bqbs() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_228bu0ssh12yp() {
   }

   private static int Xqedii_3ope2b4mv8qwq(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_759rm1ahrjqm(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

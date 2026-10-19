package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_5ts6g93 {
   private static final ConcurrentHashMap<String, String> Xqedii_2udx9csrgfbye = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2ndz5j2rdulk8 = 734176867;
   private static volatile int Xqedii_3tcmlldx4vlda = 552299083;
   private static volatile int Xqedii_1eoyhqljm7lfx = -1751529386;
   private static volatile int Xqedii_2t8kosdyojzo5 = -1838178803;
   private static volatile long Xqedii_3o8uxi278ko90 = 37344899554633079L;
   private static volatile long Xqedii_2sdu5z6w6j06n = -190495452976503094L;
   private static volatile long Xqedii_29m1ks0i56fol = -6809569729023406251L;
   private static volatile long Xqedii_2r3ty0egqmrjv = 4405474466746523041L;

   public static int Xqedii_23lkbw7p8cem0(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2ndz5j2rdulk8, var1);
   }

   public static int Xqedii_kowup088vgfv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3tcmlldx4vlda;
   }

   public static int Xqedii_18vdmgwsuc3hv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1eoyhqljm7lfx;
   }

   public static int Xqedii_3kfxlsk5ta9se(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2t8kosdyojzo5, var1);
   }

   public static long Xqedii_1falwgsky3vk1(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3o8uxi278ko90, var2);
   }

   public static long Xqedii_2ysot0i08fgqd(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2sdu5z6w6j06n;
   }

   public static long Xqedii_2hxat01v2p5y5(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_29m1ks0i56fol;
   }

   public static long Xqedii_29mg7fy9mz6zo(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2r3ty0egqmrjv, var2);
   }

   public static String Xqedii_1lm433jucxd77(String var0) {
      String var1 = Xqedii_2udx9csrgfbye.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("2jOUyj98+KfqLyLfo8HsI93HlTnJZGJMj6Wdqcd02Qg=");
            int var3 = -839486097;

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
            String var9 = Xqedii_2udx9csrgfbye.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_z8h5vytn2u03() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3o5pzur64gw0j() {
   }

   private static int Xqedii_ecfw6vdgr1s0(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_mzsb1janas94(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

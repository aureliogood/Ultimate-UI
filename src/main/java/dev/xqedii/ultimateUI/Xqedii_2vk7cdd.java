package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2vk7cdd {
   private static final ConcurrentHashMap<String, String> Xqedii_36g7gjrr2wgs5 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1l1sx9njmhbe0 = 1634947762;
   private static volatile int Xqedii_28b36ppuy5iy4 = 2035245168;
   private static volatile int Xqedii_2mwg81z220izm = 1159376246;
   private static volatile int Xqedii_2e9wnxo7palmx = 1225797633;
   private static volatile long Xqedii_hp12tpysguxz = 1492467754721404361L;
   private static volatile long Xqedii_2tmlclpg2si1v = 1353061876831840909L;
   private static volatile long Xqedii_3gxh3kjjo1kud = 6083921865193320701L;
   private static volatile long Xqedii_1tmcxy8n1qzzc = -8708363493332274485L;

   public static int Xqedii_3a0fcics2wpjg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1l1sx9njmhbe0, var1);
   }

   public static int Xqedii_31nqhdejyato5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_28b36ppuy5iy4;
   }

   public static int Xqedii_3arfbq4qslrdt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2mwg81z220izm;
   }

   public static int Xqedii_29jlntb8fvx65(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2e9wnxo7palmx, var1);
   }

   public static long Xqedii_245ox29issy3b(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_hp12tpysguxz, var2);
   }

   public static long Xqedii_2pdmpkvkkyy5o(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2tmlclpg2si1v;
   }

   public static long Xqedii_33841cckomzl3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3gxh3kjjo1kud;
   }

   public static long Xqedii_bn3grdu08rq3(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1tmcxy8n1qzzc, var2);
   }

   public static String Xqedii_nqtqqmmjjlbb(String var0) {
      String var1 = Xqedii_36g7gjrr2wgs5.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("m+pYFToQFRiusP6jnRHT3dWaTw/0H4PhpRBznv5Sqsc=");
            int var3 = 1128924027;

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
            String var9 = Xqedii_36g7gjrr2wgs5.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1l1pl7di1bq4f() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2xf7l8whvufo7() {
   }

   private static int Xqedii_1o700latw3m23(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_icv7166mcqey(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

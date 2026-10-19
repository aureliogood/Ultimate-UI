package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1fm7ht4 {
   private static final ConcurrentHashMap<String, String> Xqedii_2bcl9fbwhtzhq = new ConcurrentHashMap<>();
   private static volatile int Xqedii_aoxvct1vuu5x = 843517995;
   private static volatile int Xqedii_mq4vlmrxehpi = -237994243;
   private static volatile int Xqedii_2o4620rpbve6y = 1051996958;
   private static volatile int Xqedii_1nob5i7oe4fi6 = -919546195;
   private static volatile long Xqedii_24dkqigrs7ks0 = 4305522950631685461L;
   private static volatile long Xqedii_11zr4qgm3fo32 = -2872089027675425377L;
   private static volatile long Xqedii_w7zsgqyaqdcm = 4473515714292919885L;
   private static volatile long Xqedii_2lhhphe2aukax = 5732682408064557746L;

   public static int Xqedii_2x1fsp3ob3puh(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_aoxvct1vuu5x, var1);
   }

   public static int Xqedii_6r3eu0kym2ni(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_mq4vlmrxehpi;
   }

   public static int Xqedii_2a3ha6yzjf7ll(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2o4620rpbve6y;
   }

   public static int Xqedii_1133g50idm9y3(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1nob5i7oe4fi6, var1);
   }

   public static long Xqedii_ne08h8ezw96(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_24dkqigrs7ks0, var2);
   }

   public static long Xqedii_37g3gmt2o3h7n(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_11zr4qgm3fo32;
   }

   public static long Xqedii_1jhm8be64ills(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_w7zsgqyaqdcm;
   }

   public static long Xqedii_19vdkouqj4vxw(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2lhhphe2aukax, var2);
   }

   public static String Xqedii_csd5ajy7ekth(String var0) {
      String var1 = Xqedii_2bcl9fbwhtzhq.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("xihFa/pwIFljBx/1CaHkOJH13vvm+GydnQig2t2we8o=");
            int var3 = -73564849;

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
            String var9 = Xqedii_2bcl9fbwhtzhq.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_92qzaiezhaxp() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2bvv8lnmvc2o6() {
   }

   private static int Xqedii_2lpf3i4fbagtl(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_ulhyl4y13pnx(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

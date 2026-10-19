package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2ecgdn6 {
   private static final ConcurrentHashMap<String, String> Xqedii_foi7svakt2xx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_13lfypde9u7xd = 1896434933;
   private static volatile int Xqedii_3947chvicklpj = 1891316273;
   private static volatile int Xqedii_38p8pkvvorob3 = -1469291033;
   private static volatile int Xqedii_3v0ui5a8u3yig = -982269294;
   private static volatile long Xqedii_20i1oy64vy3na = 4337969103773413829L;
   private static volatile long Xqedii_29fosowlbbl1y = -8447388232452093017L;
   private static volatile long Xqedii_1qi402gjjzbgo = -288635666038985671L;
   private static volatile long Xqedii_32rmmoehsyv3y = -7034845955457392478L;

   public static int Xqedii_1a1aydiwckbk0(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_13lfypde9u7xd, var1);
   }

   public static int Xqedii_k01yob24gqs4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3947chvicklpj;
   }

   public static int Xqedii_36ce6dcl7ljtq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_38p8pkvvorob3;
   }

   public static int Xqedii_357tto2c1sl3r(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3v0ui5a8u3yig, var1);
   }

   public static long Xqedii_610a9lqej7hx(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_20i1oy64vy3na, var2);
   }

   public static long Xqedii_2ofttcxlgxwdu(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_29fosowlbbl1y;
   }

   public static long Xqedii_2didwat35bdal(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1qi402gjjzbgo;
   }

   public static long Xqedii_18j8134kgd56p(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_32rmmoehsyv3y, var2);
   }

   public static String Xqedii_2gzg6493peybs(String var0) {
      String var1 = Xqedii_foi7svakt2xx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("aQvhCQmCxdY7w9ZZ42L8lSTDWJMk0Y4DyYuWl9wVC5A=");
            int var3 = 431345532;

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
            String var9 = Xqedii_foi7svakt2xx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3tlvd5wzjebc6() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2qgm8leasgb67() {
   }

   private static int Xqedii_3juat2fgaf1gi(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1dl9j3c2hbjm6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

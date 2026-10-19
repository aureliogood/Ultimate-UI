package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_38fr5mq {
   private static final ConcurrentHashMap<String, String> Xqedii_dr2sv4qivsiu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2aebilcedwnez = 325085256;
   private static volatile int Xqedii_2hje5homrrq4u = -1158593842;
   private static volatile int Xqedii_2plekz398bfpy = -2092317401;
   private static volatile int Xqedii_2kn9ff1bv9le6 = 591341754;
   private static volatile long Xqedii_29ta49yyqodgx = 7176316166585371845L;
   private static volatile long Xqedii_lsyktcj8wsp6 = 7571544651850120618L;
   private static volatile long Xqedii_1vfj2squxiq8d = 3747856682544573735L;
   private static volatile long Xqedii_9ofccdl8rqv6 = -5794008803321969933L;

   public static int Xqedii_3tg49kzireyzd(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2aebilcedwnez, var1);
   }

   public static int Xqedii_1eacij1ene2ih(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2hje5homrrq4u;
   }

   public static int Xqedii_1l7irzvrqxem7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2plekz398bfpy;
   }

   public static int Xqedii_1cen2m2z6rebm(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2kn9ff1bv9le6, var1);
   }

   public static long Xqedii_1q20rm3i3dax4(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_29ta49yyqodgx, var2);
   }

   public static long Xqedii_2tmjwvvob95wg(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_lsyktcj8wsp6;
   }

   public static long Xqedii_jsuju3ehpyoo(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1vfj2squxiq8d;
   }

   public static long Xqedii_tr2yojanhluh(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_9ofccdl8rqv6, var2);
   }

   public static String Xqedii_11dtasbugqjn7(String var0) {
      String var1 = Xqedii_dr2sv4qivsiu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("tPyFoVmJ3VKI8jxLQZv87gw8fxd+z8MkPaTDlAQgIgk=");
            int var3 = 922317765;

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
            String var9 = Xqedii_dr2sv4qivsiu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3m9ov6bdjhnme() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_wfq564dvv7bn() {
   }

   private static int Xqedii_12bcky21wjbva(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_v20usvkmdz23(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

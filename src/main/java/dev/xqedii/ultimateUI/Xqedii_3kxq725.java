package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3kxq725 {
   private static final ConcurrentHashMap<String, String> Xqedii_1qfyv3ttw49t9 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2y25sxlgjlcx6 = 985738590;
   private static volatile int Xqedii_7psk0amffyak = 1961395809;
   private static volatile int Xqedii_2pfxm2yrnt34u = 628088298;
   private static volatile int Xqedii_lrkokoerxkwf = 2011911028;
   private static volatile long Xqedii_3etg9t6v2qozw = 4774156548395393220L;
   private static volatile long Xqedii_1uts1qcmwfmux = 7230774652193897418L;
   private static volatile long Xqedii_2t1dju9uobexy = 2031483144877988720L;
   private static volatile long Xqedii_3q66zt0vpwe = 6815694979535579841L;

   public static int Xqedii_17tuii68gypp4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2y25sxlgjlcx6, var1);
   }

   public static int Xqedii_z5hawwfhx1yy(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_7psk0amffyak;
   }

   public static int Xqedii_2d38ro98tsmqh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2pfxm2yrnt34u;
   }

   public static int Xqedii_jto013pcop9d(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_lrkokoerxkwf, var1);
   }

   public static long Xqedii_3hfxho6575rpq(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3etg9t6v2qozw, var2);
   }

   public static long Xqedii_xiny2onuxs8h(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1uts1qcmwfmux;
   }

   public static long Xqedii_2fsxcsn4hq634(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2t1dju9uobexy;
   }

   public static long Xqedii_da4f5xcv2vd(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3q66zt0vpwe, var2);
   }

   public static String Xqedii_fegndy6y367g(String var0) {
      String var1 = Xqedii_1qfyv3ttw49t9.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("BF8B/DSOVbqE8gvQaCVWLLYdaRBQhAev/1V83tumPNs=");
            int var3 = 76117035;

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
            String var9 = Xqedii_1qfyv3ttw49t9.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1x561br8i35jv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1800n60zfsz95() {
   }

   private static int Xqedii_2rtl9eqlrzpm0(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2o8193ujsno18(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

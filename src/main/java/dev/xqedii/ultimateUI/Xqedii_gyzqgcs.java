package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_gyzqgcs {
   private static final ConcurrentHashMap<String, String> Xqedii_h3gl2m3grciw = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1y2k4oze1j5wr = 1004709349;
   private static volatile int Xqedii_xucthjgnpnkj = -1532763557;
   private static volatile int Xqedii_1hjvcb03931az = 148808846;
   private static volatile int Xqedii_8hwgxbwh9czj = -1733936107;
   private static volatile long Xqedii_290ui8zh3yqma = -2524253335641321042L;
   private static volatile long Xqedii_19106k18gutnc = 2339932856787515106L;
   private static volatile long Xqedii_2dan12dozhue8 = -6311506351110856420L;
   private static volatile long Xqedii_4hph527bzjpl = 5593043609350179705L;

   public static int Xqedii_109dovchhx6k2(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1y2k4oze1j5wr, var1);
   }

   public static int Xqedii_2555tk8gpqvc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_xucthjgnpnkj;
   }

   public static int Xqedii_51sh4l8s5asx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1hjvcb03931az;
   }

   public static int Xqedii_t0m4o5qq5pti(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_8hwgxbwh9czj, var1);
   }

   public static long Xqedii_3o4m6v97rff06(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_290ui8zh3yqma, var2);
   }

   public static long Xqedii_3ebh3qgq7f4xf(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_19106k18gutnc;
   }

   public static long Xqedii_33fxqbrufxf89(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2dan12dozhue8;
   }

   public static long Xqedii_qnjkqhh3ntki(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_4hph527bzjpl, var2);
   }

   public static String Xqedii_32jpmuayeotlk(String var0) {
      String var1 = Xqedii_h3gl2m3grciw.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Q5TgybX9Wrwx9M4e1ks2WHyJKhty1gPRkMnumUsyLhA=");
            int var3 = -766021986;

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
            String var9 = Xqedii_h3gl2m3grciw.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2yopkxgxs60xb() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1t7z7fgpmdpk8() {
   }

   private static int Xqedii_hm7kq50a3di7(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_10wpnzroeww7h(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

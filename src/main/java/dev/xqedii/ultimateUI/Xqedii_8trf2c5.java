package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_8trf2c5 {
   private static final ConcurrentHashMap<String, String> Xqedii_1wldxdp2v5tfg = new ConcurrentHashMap<>();
   private static volatile int Xqedii_pudgeepzz7fk = 1047327165;
   private static volatile int Xqedii_2a9knhm3xugjv = -564375235;
   private static volatile int Xqedii_k3kp5gh6x8en = 374346809;
   private static volatile int Xqedii_1jvk4i6zq3a1q = 1552906691;
   private static volatile long Xqedii_34qq7a82inhq0 = 1431500403614656860L;
   private static volatile long Xqedii_1d4l7xx1s5tqv = 2878441868370085720L;
   private static volatile long Xqedii_1jhjeweujij3u = -1354735692699767559L;
   private static volatile long Xqedii_3vrb4m032k75 = -1695936179052037975L;

   public static int Xqedii_117chq1l0dm1b(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_pudgeepzz7fk, var1);
   }

   public static int Xqedii_21o8jjf0fhzgr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2a9knhm3xugjv;
   }

   public static int Xqedii_27vtnqgokv6cr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_k3kp5gh6x8en;
   }

   public static int Xqedii_1zet7588ic81(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1jvk4i6zq3a1q, var1);
   }

   public static long Xqedii_4q2k8s0zfiou(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_34qq7a82inhq0, var2);
   }

   public static long Xqedii_15lr18ctzqob8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1d4l7xx1s5tqv;
   }

   public static long Xqedii_113gt16nb87r8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1jhjeweujij3u;
   }

   public static long Xqedii_1lpxg5zbkhvws(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3vrb4m032k75, var2);
   }

   public static String Xqedii_21v5uqmbcyoeu(String var0) {
      String var1 = Xqedii_1wldxdp2v5tfg.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("CEZhJZh4hW5ko7kqdhVFhNgewVtFaqQ0hFRcF3sXeiQ=");
            int var3 = -346589435;

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
            String var9 = Xqedii_1wldxdp2v5tfg.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_266xerpyg4ztp() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2xwm9ds5bkv17() {
   }

   private static int Xqedii_2bzvab5agvdi7(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_12597to8xq599(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

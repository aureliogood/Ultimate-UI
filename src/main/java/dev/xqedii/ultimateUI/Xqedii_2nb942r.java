package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2nb942r {
   private static final ConcurrentHashMap<String, String> Xqedii_3uhfx5l3bfzty = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3vruxwke6s30b = -854880820;
   private static volatile int Xqedii_2mpq7bti87wcx = -1628160377;
   private static volatile int Xqedii_2qq5k7bj482bx = 1059806148;
   private static volatile int Xqedii_q7oaooqnnzmy = 76596519;
   private static volatile long Xqedii_kp91o89dubm5 = -3674746761740235810L;
   private static volatile long Xqedii_531yjfvktvib = 4889024221370958610L;
   private static volatile long Xqedii_3k44op3suj3e = -8083826794761393037L;
   private static volatile long Xqedii_1t3oe1053fas0 = 3073656264939946946L;

   public static int Xqedii_1ba7fue43n9sn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3vruxwke6s30b, var1);
   }

   public static int Xqedii_3euputdu5ldu1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2mpq7bti87wcx;
   }

   public static int Xqedii_1rnomd6f5x4bv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2qq5k7bj482bx;
   }

   public static int Xqedii_rg558mhqt06m(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_q7oaooqnnzmy, var1);
   }

   public static long Xqedii_3mlap4v4txz17(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_kp91o89dubm5, var2);
   }

   public static long Xqedii_o2nay2z25ye6(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_531yjfvktvib;
   }

   public static long Xqedii_15963pc1gxbpv(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3k44op3suj3e;
   }

   public static long Xqedii_1poymj5lmtqe1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1t3oe1053fas0, var2);
   }

   public static String Xqedii_2619cqai8nyax(String var0) {
      String var1 = Xqedii_3uhfx5l3bfzty.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ExdOuptpa74KFUa+p1wiRKHjZggK8Hm/Q9lajFpaPvw=");
            int var3 = -295432327;

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
            String var9 = Xqedii_3uhfx5l3bfzty.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3ks8idghj0i8d() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3c17fn8g91uem() {
   }

   private static int Xqedii_fzmjocehg8zr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3b786s6z45lja(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2g2l2cd {
   private static final ConcurrentHashMap<String, String> Xqedii_35e6z6za0olrq = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3a3z8jgxvqw29 = -1751567320;
   private static volatile int Xqedii_3gbgbtbwzkzwh = -522560354;
   private static volatile int Xqedii_2zcpu1cmsoqkb = 1300413594;
   private static volatile int Xqedii_1etwbpobmkmpd = 1647866888;
   private static volatile long Xqedii_8rarzrii8bw8 = 8971791525495946556L;
   private static volatile long Xqedii_137d77tjlz5i4 = 2907750483422620164L;
   private static volatile long Xqedii_3jrgnj2xsab5x = -3162952767450063104L;
   private static volatile long Xqedii_1yunxv75zyr35 = -1502185013286091099L;

   public static int Xqedii_1v43soyk0w9vn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3a3z8jgxvqw29, var1);
   }

   public static int Xqedii_37z8d198h8r9u(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3gbgbtbwzkzwh;
   }

   public static int Xqedii_2p2iu6bahtr56(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2zcpu1cmsoqkb;
   }

   public static int Xqedii_vpbz0mu28knw(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1etwbpobmkmpd, var1);
   }

   public static long Xqedii_35f1yufr2qj3g(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_8rarzrii8bw8, var2);
   }

   public static long Xqedii_1gkvyus1g7ru2(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_137d77tjlz5i4;
   }

   public static long Xqedii_22s9dqivzvpra(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3jrgnj2xsab5x;
   }

   public static long Xqedii_3nx9y5fgorjy7(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1yunxv75zyr35, var2);
   }

   public static String Xqedii_244mkgkfz4g9h(String var0) {
      String var1 = Xqedii_35e6z6za0olrq.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("XW7y6bu/iF9R0yhsfpvkiXHD9jVtVROEHhuNjHS3BCQ=");
            int var3 = -548990466;

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
            String var9 = Xqedii_35e6z6za0olrq.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1y1y21t2j8nu6() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_212yb2xthgaiw() {
   }

   private static int Xqedii_21toic9jrn8tr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2us5f2t62r046(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

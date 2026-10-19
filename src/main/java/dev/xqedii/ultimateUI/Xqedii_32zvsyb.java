package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_32zvsyb {
   private static final ConcurrentHashMap<String, String> Xqedii_3gdrk6p5r1yqp = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1k98cpehtg8rn = -1404542592;
   private static volatile int Xqedii_v5nqbqjeutwp = -1161161520;
   private static volatile int Xqedii_2izbuwsm8u22b = -621892956;
   private static volatile int Xqedii_vb954dhqpug4 = 2001573613;
   private static volatile long Xqedii_2mlvxubhxi891 = 8360256542590784564L;
   private static volatile long Xqedii_nm2f0zjaonmo = -3571164740359118076L;
   private static volatile long Xqedii_aig8zbbq6c6t = 6080410914784474039L;
   private static volatile long Xqedii_4udq9ff5snve = 551167790190368107L;

   public static int Xqedii_10iz9l47pg3ct(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1k98cpehtg8rn, var1);
   }

   public static int Xqedii_qy7uigv17ser(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_v5nqbqjeutwp;
   }

   public static int Xqedii_2cg77550xd5th(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2izbuwsm8u22b;
   }

   public static int Xqedii_2a31wzmf58n86(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_vb954dhqpug4, var1);
   }

   public static long Xqedii_3on6pbkpz61ms(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2mlvxubhxi891, var2);
   }

   public static long Xqedii_1al1nps1ggwdz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_nm2f0zjaonmo;
   }

   public static long Xqedii_y83bnsb9tt6z(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_aig8zbbq6c6t;
   }

   public static long Xqedii_22i34oexqafzh(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_4udq9ff5snve, var2);
   }

   public static String Xqedii_3dkswailwz0xw(String var0) {
      String var1 = Xqedii_3gdrk6p5r1yqp.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("zFIVMuHPB7gVFcMlg4SSaVmEZZU5tHmwJ+PKp0kkSVk=");
            int var3 = -1109952197;

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
            String var9 = Xqedii_3gdrk6p5r1yqp.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_6gx08vbd6j8l() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_36cejqqkrq4i6() {
   }

   private static int Xqedii_2q7mqzcms4zw9(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_r2xfs51rk5jd(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_qihwd0j {
   private static final ConcurrentHashMap<String, String> Xqedii_2urbbe9u2jn3u = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2jtk2m9w2mpcv = 446609399;
   private static volatile int Xqedii_1mluxvutm8bbs = -2042133139;
   private static volatile int Xqedii_182nkvqav21cb = -234410812;
   private static volatile int Xqedii_2krd2munh601i = -977028333;
   private static volatile long Xqedii_3q7agilhmymp8 = -3959673336012101679L;
   private static volatile long Xqedii_2191fsx5wsmj6 = -3376159167910534143L;
   private static volatile long Xqedii_20cwx4hu20uwx = -2891614809358658269L;
   private static volatile long Xqedii_12npmwgvlkt13 = -4008007165687767893L;

   public static int Xqedii_2woryejbos0uu(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2jtk2m9w2mpcv, var1);
   }

   public static int Xqedii_3luve4bx6ulmn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1mluxvutm8bbs;
   }

   public static int Xqedii_1d8hvigs54yf1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_182nkvqav21cb;
   }

   public static int Xqedii_3dzo2ayfseazt(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2krd2munh601i, var1);
   }

   public static long Xqedii_36kfic2f3mcw1(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3q7agilhmymp8, var2);
   }

   public static long Xqedii_2itkbepj84104(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2191fsx5wsmj6;
   }

   public static long Xqedii_1fsczolv3cubr(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_20cwx4hu20uwx;
   }

   public static long Xqedii_zaogrs4umuz7(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_12npmwgvlkt13, var2);
   }

   public static String Xqedii_294t8u67xdz04(String var0) {
      String var1 = Xqedii_2urbbe9u2jn3u.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("WCtMCb7KeILDVq5mMS4VWWildaafwwIRbXyt9PZrQAw=");
            int var3 = 262899695;

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
            String var9 = Xqedii_2urbbe9u2jn3u.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_6zx7ln9ls0we() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2v5euwxpw3x5y() {
   }

   private static int Xqedii_1n2x9wsvrgj2u(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_yhw2toyjzusn(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_23g9vkk {
   private static final ConcurrentHashMap<String, String> Xqedii_zxazmnhhzxtx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_jpsjcjoheq8b = -2125915800;
   private static volatile int Xqedii_2vl7jtk0cm3az = -1585920419;
   private static volatile int Xqedii_1deoxxnkrrgvg = -1595969426;
   private static volatile int Xqedii_1h9wckoq7vsxm = -377680751;
   private static volatile long Xqedii_2tacl24lbhla3 = 2464873931729737535L;
   private static volatile long Xqedii_efit0auyo6z5 = -1807637637587178914L;
   private static volatile long Xqedii_2bsb2ho62vfss = 7981655502047686327L;
   private static volatile long Xqedii_2hnty7wdv3sf8 = -4748092206318499930L;

   public static int Xqedii_2lofmesv4jy38(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_jpsjcjoheq8b, var1);
   }

   public static int Xqedii_20399aqkbcgd5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2vl7jtk0cm3az;
   }

   public static int Xqedii_l8w0cgk4mepu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1deoxxnkrrgvg;
   }

   public static int Xqedii_2xil62z39zwmz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1h9wckoq7vsxm, var1);
   }

   public static long Xqedii_3c4uqia6ujnk6(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2tacl24lbhla3, var2);
   }

   public static long Xqedii_1898apaqtk5ny(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_efit0auyo6z5;
   }

   public static long Xqedii_1p3ra5msxr61c(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2bsb2ho62vfss;
   }

   public static long Xqedii_3h0gt1l8lhqzo(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2hnty7wdv3sf8, var2);
   }

   public static String Xqedii_oes8uub3gfa5(String var0) {
      String var1 = Xqedii_zxazmnhhzxtx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("XWFLyjGAJ4Q90BeWQtmIOGJQk6Eb+ArHOUiro/8Kglw=");
            int var3 = 1206292954;

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
            String var9 = Xqedii_zxazmnhhzxtx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_35ivozro0l0kt() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_16omk03yyfm3q() {
   }

   private static int Xqedii_23v7nzpwjigjv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_35aj2bjs9zfix(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

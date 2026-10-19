package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2139ag5 {
   private static final ConcurrentHashMap<String, String> Xqedii_1i1slmagbdwx1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2h3dxs976d9jr = 538382605;
   private static volatile int Xqedii_3m2q4tjs3nwy = 734568346;
   private static volatile int Xqedii_w85jh46ofhcc = 1523988995;
   private static volatile int Xqedii_3nldr72nvd6pc = 915113392;
   private static volatile long Xqedii_2ybacyrw0rod7 = -1789661876899231512L;
   private static volatile long Xqedii_raut4ybvg2ic = -590305740943470818L;
   private static volatile long Xqedii_7p0kj8k5oh14 = -6908485960458836407L;
   private static volatile long Xqedii_17nrhsmgwpl6f = -4338447748129205555L;

   public static int Xqedii_38dl05iy67mrp(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2h3dxs976d9jr, var1);
   }

   public static int Xqedii_2n8iayvbemtc9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3m2q4tjs3nwy;
   }

   public static int Xqedii_2qeu8kjtgxtdi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_w85jh46ofhcc;
   }

   public static int Xqedii_1xpgzrlw87jpz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3nldr72nvd6pc, var1);
   }

   public static long Xqedii_3kr5gdg2ux3f8(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2ybacyrw0rod7, var2);
   }

   public static long Xqedii_29tusor5pogpm(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_raut4ybvg2ic;
   }

   public static long Xqedii_32yk7vc1gzn9q(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_7p0kj8k5oh14;
   }

   public static long Xqedii_p7wz77xm108n(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_17nrhsmgwpl6f, var2);
   }

   public static String Xqedii_2yffyfu4h0hml(String var0) {
      String var1 = Xqedii_1i1slmagbdwx1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("WopUd5Mkr9KjFsn+rgNvw2RYlDLdzVFTDDBxln5qd/4=");
            int var3 = 1671648227;

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
            String var9 = Xqedii_1i1slmagbdwx1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_7d51rd21kgov() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_61lx60i4knp5() {
   }

   private static int Xqedii_2y2c0mzs65o4i(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1x6b9hmjkf3xk(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

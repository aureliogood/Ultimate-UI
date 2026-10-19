package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_55753dg {
   private static final ConcurrentHashMap<String, String> Xqedii_2j35e9m9gznsl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3gebgeuyzzw2g = -213779071;
   private static volatile int Xqedii_fd2cakjufdfz = 922796277;
   private static volatile int Xqedii_1dgwhh36bcan = 1474993852;
   private static volatile int Xqedii_10lgpt5m4n71m = -986732031;
   private static volatile long Xqedii_kbl7dxjt4ok7 = -7555483852187564858L;
   private static volatile long Xqedii_2z6q9j3rh512v = -8089994517514057502L;
   private static volatile long Xqedii_2kwmvcab06itg = -6060355525251875877L;
   private static volatile long Xqedii_3g1f4nwh1stoi = 5726549251624912653L;

   public static int Xqedii_2o1609kc6sya5(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3gebgeuyzzw2g, var1);
   }

   public static int Xqedii_r2ld43yslohb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_fd2cakjufdfz;
   }

   public static int Xqedii_2s59p1lqhe74y(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1dgwhh36bcan;
   }

   public static int Xqedii_3dofn4hit75u0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_10lgpt5m4n71m, var1);
   }

   public static long Xqedii_1li6wkp2sleel(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_kbl7dxjt4ok7, var2);
   }

   public static long Xqedii_2brizj3fud63n(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2z6q9j3rh512v;
   }

   public static long Xqedii_3qbkv9dcs2gqq(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2kwmvcab06itg;
   }

   public static long Xqedii_2y3ztn1riiiim(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3g1f4nwh1stoi, var2);
   }

   public static String Xqedii_9ag7fc002542(String var0) {
      String var1 = Xqedii_2j35e9m9gznsl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("N/oXjs4bqqAjihWQd13JwUcyqh3GDPcfI/dN74454jw=");
            int var3 = -37080978;

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
            String var9 = Xqedii_2j35e9m9gznsl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2wn0amba3gt2y() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3o3f12sqd0ze9() {
   }

   private static int Xqedii_4nwzthnlz2y4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2plyx1baws9rf(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

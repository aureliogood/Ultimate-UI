package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ml97w4s {
   private static final ConcurrentHashMap<String, String> Xqedii_20qp32g6pupfj = new ConcurrentHashMap<>();
   private static volatile int Xqedii_sjymhc1xanhm = -970160538;
   private static volatile int Xqedii_eg0tlksg6pro = -1030588288;
   private static volatile int Xqedii_1wu2ilsvahimt = -1466530336;
   private static volatile int Xqedii_2op5yqsx9fm71 = -662103440;
   private static volatile long Xqedii_3jbqzdlwuxdzi = -8316386032992623466L;
   private static volatile long Xqedii_ukahivgt715l = -3596764199279361620L;
   private static volatile long Xqedii_b8y8fs0dxger = 8338560226741745948L;
   private static volatile long Xqedii_1joo6huiwe3ak = -1613886291271455993L;

   public static int Xqedii_30o9xtqkibre4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_sjymhc1xanhm, var1);
   }

   public static int Xqedii_2v5o8zwerktnz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_eg0tlksg6pro;
   }

   public static int Xqedii_18zkceonhp96j(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1wu2ilsvahimt;
   }

   public static int Xqedii_30ghbf80tg8xm(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2op5yqsx9fm71, var1);
   }

   public static long Xqedii_1lmx4078rqur7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3jbqzdlwuxdzi, var2);
   }

   public static long Xqedii_2p53bdpy7eycp(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_ukahivgt715l;
   }

   public static long Xqedii_y0bcwbevxmq3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_b8y8fs0dxger;
   }

   public static long Xqedii_37cpku787u6zl(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1joo6huiwe3ak, var2);
   }

   public static String Xqedii_1bh7czqfpz0d5(String var0) {
      String var1 = Xqedii_20qp32g6pupfj.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("AwiL4h92x/+abnUPwOwUBVa1H36Fu7t+R9UGtLU92e8=");
            int var3 = -299229241;

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
            String var9 = Xqedii_20qp32g6pupfj.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_qq9xi287pje9() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ipyt2hmn6qf4() {
   }

   private static int Xqedii_qc4fdc3069f2(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_152j8hz7ob82u(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

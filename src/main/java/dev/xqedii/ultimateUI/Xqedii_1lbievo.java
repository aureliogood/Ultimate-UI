package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1lbievo {
   private static final ConcurrentHashMap<String, String> Xqedii_3bjxyrhglltbl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2ezcetr44e4n8 = 537832261;
   private static volatile int Xqedii_zdt05pdu78xh = 543023133;
   private static volatile int Xqedii_3v9ow7kfq15a = 24800907;
   private static volatile int Xqedii_19jmhm0aefyhy = 1851828812;
   private static volatile long Xqedii_3rljj6yos8qpf = -6998019094087866881L;
   private static volatile long Xqedii_90knuox515t0 = 7796364083411839581L;
   private static volatile long Xqedii_3igsfgwfd2prm = -3373837809468316946L;
   private static volatile long Xqedii_1obf0t4u6e7m2 = 3443152735852115695L;

   public static int Xqedii_3uwcly88jo2ym(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2ezcetr44e4n8, var1);
   }

   public static int Xqedii_3evul6ygeglfz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_zdt05pdu78xh;
   }

   public static int Xqedii_321mxj7tclmi0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3v9ow7kfq15a;
   }

   public static int Xqedii_djsfar3sty2z(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_19jmhm0aefyhy, var1);
   }

   public static long Xqedii_3mz0vn9f94ba7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3rljj6yos8qpf, var2);
   }

   public static long Xqedii_qbzqr1exc6v5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_90knuox515t0;
   }

   public static long Xqedii_27dd9ncy36b8z(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3igsfgwfd2prm;
   }

   public static long Xqedii_m201bjb6pkf2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1obf0t4u6e7m2, var2);
   }

   public static String Xqedii_3v78kfpx0mk8z(String var0) {
      String var1 = Xqedii_3bjxyrhglltbl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("OV1nQW4NWhsPtiCZNoBMXIMQZX1JRbeyqXxvyY/UGrs=");
            int var3 = -731798254;

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
            String var9 = Xqedii_3bjxyrhglltbl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2smauuej2j7o1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3vi0k51kdmjeb() {
   }

   private static int Xqedii_33pcywtede5r1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3mxv2rkrv7z30(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_8gwmt3x {
   private static final ConcurrentHashMap<String, String> Xqedii_2om3fz457hepl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_271e13hyjmrrn = 1732639045;
   private static volatile int Xqedii_1i77nw7wlzrly = 1825014158;
   private static volatile int Xqedii_1v4eu33orl9zy = -651489615;
   private static volatile int Xqedii_2pf5j8qke8qcd = -1643968384;
   private static volatile long Xqedii_f02e7hnxq5ko = 2412622846072339934L;
   private static volatile long Xqedii_9rvhiyrigf8b = 6845263582803267869L;
   private static volatile long Xqedii_39f99r7a2eyyp = -140308495169108902L;
   private static volatile long Xqedii_1e9r5nsgzor1p = -9022827781039742026L;

   public static int Xqedii_3o2srp2hqtn44(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_271e13hyjmrrn, var1);
   }

   public static int Xqedii_1zilwyubr17g9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1i77nw7wlzrly;
   }

   public static int Xqedii_38c6hq8nf8vbp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1v4eu33orl9zy;
   }

   public static int Xqedii_2ajotwm8foeyd(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2pf5j8qke8qcd, var1);
   }

   public static long Xqedii_8ujeb0kfgry5(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_f02e7hnxq5ko, var2);
   }

   public static long Xqedii_vb8dnn7vxygt(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_9rvhiyrigf8b;
   }

   public static long Xqedii_ajilndk1x3cw(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_39f99r7a2eyyp;
   }

   public static long Xqedii_2gf8j33g72a83(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1e9r5nsgzor1p, var2);
   }

   public static String Xqedii_eebdjkp6zxwk(String var0) {
      String var1 = Xqedii_2om3fz457hepl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("fphQzZ2EjiG3I89DsRvVLrKEpUYnuHOTRxKUtMi4YRA=");
            int var3 = 61715885;

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
            String var9 = Xqedii_2om3fz457hepl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_21822tdd18cjz() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_216fijhtsrmp4() {
   }

   private static int Xqedii_36j8qfcvxibrl(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1qmp4syflnqd1(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

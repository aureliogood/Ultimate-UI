package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2qvcepy {
   private static final ConcurrentHashMap<String, String> Xqedii_bkdwdo68hf4e = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1p7rduka10j3j = -746255530;
   private static volatile int Xqedii_24b1sbgl3p6t6 = -1415280390;
   private static volatile int Xqedii_1mxsxk88as3g7 = -1248636425;
   private static volatile int Xqedii_222ji306tho5h = 532261612;
   private static volatile long Xqedii_7rd2rh4do2q2 = 7740449934639069322L;
   private static volatile long Xqedii_1u6hn1sd76ci4 = 6095808248080941749L;
   private static volatile long Xqedii_39l13jkk88bjw = -69655335412240393L;
   private static volatile long Xqedii_1126red1xmhvo = 6748652533286674991L;

   public static int Xqedii_2kg59109rorit(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1p7rduka10j3j, var1);
   }

   public static int Xqedii_5bet9txwk6tx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_24b1sbgl3p6t6;
   }

   public static int Xqedii_28vq4rofy04m6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1mxsxk88as3g7;
   }

   public static int Xqedii_10by89q9qgku8(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_222ji306tho5h, var1);
   }

   public static long Xqedii_3vb6cgeeobagb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_7rd2rh4do2q2, var2);
   }

   public static long Xqedii_2f0eyndlz6trk(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1u6hn1sd76ci4;
   }

   public static long Xqedii_2wchn3ckqes57(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_39l13jkk88bjw;
   }

   public static long Xqedii_1iufkgl7oyw2w(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1126red1xmhvo, var2);
   }

   public static String Xqedii_r3axxbwvnwd7(String var0) {
      String var1 = Xqedii_bkdwdo68hf4e.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("8McX67iC5iqbvaZShnKoffx5HrTlyhR/GT8vhlAqp4o=");
            int var3 = -817708077;

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
            String var9 = Xqedii_bkdwdo68hf4e.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_10ahg62jhb53c() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_5lf1o345yvgz() {
   }

   private static int Xqedii_19a9iowmap5pf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3fyjrlpte14mb(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

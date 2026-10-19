package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_26g1yh1 {
   private static final ConcurrentHashMap<String, String> Xqedii_5p6lwrvghpt3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3kgjyzg6y14rh = -727978613;
   private static volatile int Xqedii_5bqax5klqdaf = -1178819294;
   private static volatile int Xqedii_3mro6g5qvo6cm = 916226425;
   private static volatile int Xqedii_2gp6es3l6miu6 = 1264991971;
   private static volatile long Xqedii_3nhmcyjwmdu83 = -1998921803100071485L;
   private static volatile long Xqedii_xbexoobcjffw = -8728057797403741537L;
   private static volatile long Xqedii_28y36s3ezhjgq = 5425253139305720438L;
   private static volatile long Xqedii_3dvrppfcgnrdr = -3575504448745285668L;

   public static int Xqedii_8x74lf8ieafi(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3kgjyzg6y14rh, var1);
   }

   public static int Xqedii_388fb623tc8jf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_5bqax5klqdaf;
   }

   public static int Xqedii_2s5g763h3rl5z(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3mro6g5qvo6cm;
   }

   public static int Xqedii_2h0ppg8lerrdv(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2gp6es3l6miu6, var1);
   }

   public static long Xqedii_3svdacd8t21no(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3nhmcyjwmdu83, var2);
   }

   public static long Xqedii_hbx8huoueq8y(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_xbexoobcjffw;
   }

   public static long Xqedii_2nhexa2puub8d(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_28y36s3ezhjgq;
   }

   public static long Xqedii_3uq7z22pcy0e2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3dvrppfcgnrdr, var2);
   }

   public static String Xqedii_1ax6zal1746cb(String var0) {
      String var1 = Xqedii_5p6lwrvghpt3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("BfPWkIsS4PV0uRG3CUX/1q3+pJ+Zqk2SpoxdELHMmMQ=");
            int var3 = 2089253504;

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
            String var9 = Xqedii_5p6lwrvghpt3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_jepg91labf34() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3fvvjz93tyq25() {
   }

   private static int Xqedii_2mczb4utsbenm(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3fmcbspnr4o58(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

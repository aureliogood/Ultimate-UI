package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_39da8qy {
   private static final ConcurrentHashMap<String, String> Xqedii_288jgr0tm71kf = new ConcurrentHashMap<>();
   private static volatile int Xqedii_sgaljw39nhda = -149284896;
   private static volatile int Xqedii_2dvkg8e4jjl9 = -1832620384;
   private static volatile int Xqedii_2w0rr65mt2h23 = -549041805;
   private static volatile int Xqedii_1k2t7d4cxzhir = 1379335890;
   private static volatile long Xqedii_h7ks40es1jrd = 6796968154085158093L;
   private static volatile long Xqedii_1qqj360njx5q7 = 1685241157609437391L;
   private static volatile long Xqedii_32bnvbj1i4xaq = -3114841569394009066L;
   private static volatile long Xqedii_1dj2xujnh2yqp = -8449935372268539317L;

   public static int Xqedii_1kp54wafwwahf(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_sgaljw39nhda, var1);
   }

   public static int Xqedii_26qbnjrvdwhxr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2dvkg8e4jjl9;
   }

   public static int Xqedii_126j3xeibbwxj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2w0rr65mt2h23;
   }

   public static int Xqedii_6ex6ls84emrv(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1k2t7d4cxzhir, var1);
   }

   public static long Xqedii_2exkkxg4v63y5(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_h7ks40es1jrd, var2);
   }

   public static long Xqedii_1cdrf4rtguvmt(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1qqj360njx5q7;
   }

   public static long Xqedii_1ariyxhlkpvmu(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_32bnvbj1i4xaq;
   }

   public static long Xqedii_1flant2ycfryt(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1dj2xujnh2yqp, var2);
   }

   public static String Xqedii_1kwhoip753g4b(String var0) {
      String var1 = Xqedii_288jgr0tm71kf.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("DX8sfi51QrJ17RD0Dv4nueQZeBLLR0JQFnDTN8Lf81Q=");
            int var3 = -550561244;

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
            String var9 = Xqedii_288jgr0tm71kf.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_akzjm4tigxc() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_15ai6kwkrcrz5() {
   }

   private static int Xqedii_zxh5wdngr0vs(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3q4kykgamkiyy(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

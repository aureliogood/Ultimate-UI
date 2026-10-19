package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ewno2jh {
   private static final ConcurrentHashMap<String, String> Xqedii_21twmhvmaj41v = new ConcurrentHashMap<>();
   private static volatile int Xqedii_fk137tnrykac = -1773973374;
   private static volatile int Xqedii_3ocnd5g5xby6x = 1854582992;
   private static volatile int Xqedii_2srv1lz9yn3t1 = 1320359958;
   private static volatile int Xqedii_299hgzwu7sph4 = 738577467;
   private static volatile long Xqedii_50ilubp05nlu = 9117167426966581220L;
   private static volatile long Xqedii_bc1tq26n7z8q = 8715441135382605079L;
   private static volatile long Xqedii_2swnhr03qls81 = -7938019869305282580L;
   private static volatile long Xqedii_1hv6v154ju49e = -1535823856507431974L;

   public static int Xqedii_14f5rgqqd6esf(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_fk137tnrykac, var1);
   }

   public static int Xqedii_6u06pk1qh6md(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3ocnd5g5xby6x;
   }

   public static int Xqedii_2ky4yuiwpmr91(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2srv1lz9yn3t1;
   }

   public static int Xqedii_2nu4in3bz3uyp(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_299hgzwu7sph4, var1);
   }

   public static long Xqedii_2rob42q3rr7n3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_50ilubp05nlu, var2);
   }

   public static long Xqedii_3ie139ifrxxbi(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_bc1tq26n7z8q;
   }

   public static long Xqedii_qlznhxdytier(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2swnhr03qls81;
   }

   public static long Xqedii_3bkz0hor4np0z(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1hv6v154ju49e, var2);
   }

   public static String Xqedii_3bigczepfpjkb(String var0) {
      String var1 = Xqedii_21twmhvmaj41v.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("m7+oJB5QAGmalX3+ZhXOvRcuPSQcAzboiFLnB6CngrY=");
            int var3 = 777723151;

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
            String var9 = Xqedii_21twmhvmaj41v.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3w082g2cnydcv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_xwx6xivz2t6c() {
   }

   private static int Xqedii_1ota5hfrshq50(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3iej03kcranee(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

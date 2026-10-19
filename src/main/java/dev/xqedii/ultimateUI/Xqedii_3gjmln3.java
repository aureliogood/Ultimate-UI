package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3gjmln3 {
   private static final ConcurrentHashMap<String, String> Xqedii_113u66rgscfn3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2jxox2x65qtma = -711288742;
   private static volatile int Xqedii_2xrt5xt18xjyv = 946277729;
   private static volatile int Xqedii_1qn45x4qe8fn = -701403335;
   private static volatile int Xqedii_3h38h0yufv1zc = 395268212;
   private static volatile long Xqedii_rrw16xlet7o6 = 2979916082250622893L;
   private static volatile long Xqedii_1o0ebop990ctq = 1770958183145199324L;
   private static volatile long Xqedii_2y766t8jjoajv = 6634290227625136466L;
   private static volatile long Xqedii_1desnln3j1re4 = -3955013382389923127L;

   public static int Xqedii_3ig0nm2etpc7o(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2jxox2x65qtma, var1);
   }

   public static int Xqedii_zxddzgbdlm6d(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2xrt5xt18xjyv;
   }

   public static int Xqedii_192bum8mulxl1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1qn45x4qe8fn;
   }

   public static int Xqedii_b7tlmmxw9j4g(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3h38h0yufv1zc, var1);
   }

   public static long Xqedii_2lqwav8njsh26(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_rrw16xlet7o6, var2);
   }

   public static long Xqedii_2i2cx1ylrh0lz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1o0ebop990ctq;
   }

   public static long Xqedii_3bx38aloabcsd(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2y766t8jjoajv;
   }

   public static long Xqedii_2y8r6vkkdfokr(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1desnln3j1re4, var2);
   }

   public static String Xqedii_dxazx552vbca(String var0) {
      String var1 = Xqedii_113u66rgscfn3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("TDEnOpK/+zrodGTejnc7bZhU4H4JMRNl+H1TdpdKNVI=");
            int var3 = 512032897;

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
            String var9 = Xqedii_113u66rgscfn3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3jaol0qtirp3v() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_stiqkf4w4fri() {
   }

   private static int Xqedii_19sow7suj2chx(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1vdczh9bd42n9(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

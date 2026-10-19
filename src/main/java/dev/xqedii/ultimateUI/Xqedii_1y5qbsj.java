package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1y5qbsj {
   private static final ConcurrentHashMap<String, String> Xqedii_20cwqmgx4k29h = new ConcurrentHashMap<>();
   private static volatile int Xqedii_4xvcmn0367wn = 70528538;
   private static volatile int Xqedii_3qzfk3lrshftw = -1638385178;
   private static volatile int Xqedii_3kpknq9u7sunn = 1617515282;
   private static volatile int Xqedii_1jzi9sg204lqg = 2115749867;
   private static volatile long Xqedii_pz59w5wj3j93 = -8797906571780311229L;
   private static volatile long Xqedii_xrw6bxvucrxw = 1627778476416196558L;
   private static volatile long Xqedii_23r6yjwoqi1hc = 8545799884820923786L;
   private static volatile long Xqedii_34v3zkeogxoxo = -157894906283980897L;

   public static int Xqedii_1ejfplofg46sg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_4xvcmn0367wn, var1);
   }

   public static int Xqedii_762hx9vggx6j(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3qzfk3lrshftw;
   }

   public static int Xqedii_23841oap77e67(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3kpknq9u7sunn;
   }

   public static int Xqedii_r60jwdkf5sri(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1jzi9sg204lqg, var1);
   }

   public static long Xqedii_1ok1lbnhnzkk4(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_pz59w5wj3j93, var2);
   }

   public static long Xqedii_2ti9suvnrjcm5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_xrw6bxvucrxw;
   }

   public static long Xqedii_3ucilvuxy1h9d(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_23r6yjwoqi1hc;
   }

   public static long Xqedii_29sbmf8y8iw3l(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_34v3zkeogxoxo, var2);
   }

   public static String Xqedii_29v8y9hb28uot(String var0) {
      String var1 = Xqedii_20cwqmgx4k29h.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("y4bq7hdYol+gD3szn3U0cP6X4A27haB4vfn9uFahARw=");
            int var3 = 191056335;

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
            String var9 = Xqedii_20cwqmgx4k29h.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_234ya67xqacm2() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1nlpejjwwlmlh() {
   }

   private static int Xqedii_2s8wdwtz1a6bz(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3tpzow9p8b240(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

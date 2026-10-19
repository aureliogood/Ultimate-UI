package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2oui423 {
   private static final ConcurrentHashMap<String, String> Xqedii_28bvvrm3m2lhi = new ConcurrentHashMap<>();
   private static volatile int Xqedii_4jfan4hlu219 = 1758730997;
   private static volatile int Xqedii_398rtxn5bch1n = -1613981625;
   private static volatile int Xqedii_3nyenw7ly0ir6 = -550057580;
   private static volatile int Xqedii_3g66a3v4d5ou = 2040631850;
   private static volatile long Xqedii_2tt6bwa4em8ar = -445284428440224208L;
   private static volatile long Xqedii_fk4aupwxhu2x = 7596564559792804721L;
   private static volatile long Xqedii_ezf7ohh8lkn0 = -3101819237560641774L;
   private static volatile long Xqedii_1a0q9hn35szb2 = 8390718239302164447L;

   public static int Xqedii_1ejremg5pu4od(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_4jfan4hlu219, var1);
   }

   public static int Xqedii_2ic49vuczhpbr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_398rtxn5bch1n;
   }

   public static int Xqedii_12upi8ck3lezj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3nyenw7ly0ir6;
   }

   public static int Xqedii_1lna8y53054hm(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3g66a3v4d5ou, var1);
   }

   public static long Xqedii_3kbj193k5cf7o(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2tt6bwa4em8ar, var2);
   }

   public static long Xqedii_g983fqcx6qnr(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_fk4aupwxhu2x;
   }

   public static long Xqedii_31qdgnqhxenaw(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_ezf7ohh8lkn0;
   }

   public static long Xqedii_2wcjlveg0hlwq(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1a0q9hn35szb2, var2);
   }

   public static String Xqedii_2oejzutgubf3h(String var0) {
      String var1 = Xqedii_28bvvrm3m2lhi.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("iYvlGpu5SnGaBvicTBWiHnE1RePD9ft4h0cV658tNTI=");
            int var3 = 593845221;

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
            String var9 = Xqedii_28bvvrm3m2lhi.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1s7fzozne6124() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1wnkp4fq3xbcm() {
   }

   private static int Xqedii_3f5270on5ktsw(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_4jbnwk83wtk3(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

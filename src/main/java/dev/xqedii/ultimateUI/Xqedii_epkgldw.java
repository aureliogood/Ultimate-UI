package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_epkgldw {
   private static final ConcurrentHashMap<String, String> Xqedii_884xok5d41ub = new ConcurrentHashMap<>();
   private static volatile int Xqedii_38ztwk61wmg9s = -1595670912;
   private static volatile int Xqedii_i4sukcqab8r8 = 2115238802;
   private static volatile int Xqedii_2eumhgmf13rn1 = -415275912;
   private static volatile int Xqedii_1gporb6nxlal = 913652937;
   private static volatile long Xqedii_32b2idgsb3nc6 = 6277790188625726406L;
   private static volatile long Xqedii_5s0kv8a7mi16 = 4129557916587739012L;
   private static volatile long Xqedii_3nnarc54wqkgj = 411074593753605953L;
   private static volatile long Xqedii_3vwjcdjeuh6nd = -5021084768645874635L;

   public static int Xqedii_2trga3zmvh52l(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_38ztwk61wmg9s, var1);
   }

   public static int Xqedii_26ygu9b39ptwf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_i4sukcqab8r8;
   }

   public static int Xqedii_sqjnmfast8ek(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2eumhgmf13rn1;
   }

   public static int Xqedii_1cztk1iq7jqod(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1gporb6nxlal, var1);
   }

   public static long Xqedii_1vdl1xudik50p(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_32b2idgsb3nc6, var2);
   }

   public static long Xqedii_h7mgmrnlmhjf(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_5s0kv8a7mi16;
   }

   public static long Xqedii_1axi6mxbsbcqb(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3nnarc54wqkgj;
   }

   public static long Xqedii_2vyjdr6azynta(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3vwjcdjeuh6nd, var2);
   }

   public static String Xqedii_a4ezlnvd9ocy(String var0) {
      String var1 = Xqedii_884xok5d41ub.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("pspuBg3WpMGGYQ7SmR7rpSZjhnhuXIZ5Xy8f9aPSlhI=");
            int var3 = -1572131534;

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
            String var9 = Xqedii_884xok5d41ub.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_8dqs9sxjwzz4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_482h3nnok9gz() {
   }

   private static int Xqedii_231813p5xyuor(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1y15j4y2qlrfn(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_5j63r0a {
   private static final ConcurrentHashMap<String, String> Xqedii_2x592tm3ukpjo = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3akfxdpinlq4v = -527413235;
   private static volatile int Xqedii_212z3vpnd639b = 831537408;
   private static volatile int Xqedii_1tzsl4co03cbf = 746170100;
   private static volatile int Xqedii_3odb4amez8a39 = 313857672;
   private static volatile long Xqedii_77ogezq2ulmw = 8138383211594880534L;
   private static volatile long Xqedii_3t82q1897hvl1 = -3616468681702353655L;
   private static volatile long Xqedii_2h2p0dktgat9a = 3438030474175782603L;
   private static volatile long Xqedii_3w56k73ox7q08 = -7211036848487090444L;

   public static int Xqedii_3rw0kpfm5f76w(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3akfxdpinlq4v, var1);
   }

   public static int Xqedii_1t0qvuvy7dubb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_212z3vpnd639b;
   }

   public static int Xqedii_1sdvk6v9rn8yq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1tzsl4co03cbf;
   }

   public static int Xqedii_azdvsuon00ld(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3odb4amez8a39, var1);
   }

   public static long Xqedii_4vky5yyxqzeo(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_77ogezq2ulmw, var2);
   }

   public static long Xqedii_19ploh90zd9i1(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3t82q1897hvl1;
   }

   public static long Xqedii_1viiab1tv47t5(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2h2p0dktgat9a;
   }

   public static long Xqedii_326wqc6s4qv5n(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3w56k73ox7q08, var2);
   }

   public static String Xqedii_3kvf7d5cc9ayr(String var0) {
      String var1 = Xqedii_2x592tm3ukpjo.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("301UwodPDS/WPyRi7EIaC1HWhKDJE20B/V75Lxcztq8=");
            int var3 = -69307418;

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
            String var9 = Xqedii_2x592tm3ukpjo.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2y9tu66ej8mqd() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_e22s6qkhx6w7() {
   }

   private static int Xqedii_1ki3fkkgz3bbt(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1eglfijegoxcn(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

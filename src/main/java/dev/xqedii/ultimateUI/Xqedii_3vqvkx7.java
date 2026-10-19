package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3vqvkx7 {
   private static final ConcurrentHashMap<String, String> Xqedii_2nwjkmmxxlcyf = new ConcurrentHashMap<>();
   private static volatile int Xqedii_p9ca9m9o9v9k = 1015288806;
   private static volatile int Xqedii_fe1sgyj364hy = 1520865898;
   private static volatile int Xqedii_325b52wpmuiz7 = 346933762;
   private static volatile int Xqedii_10u650hde6uqb = -1126316368;
   private static volatile long Xqedii_8psvt22uz8s6 = -2142729082810154087L;
   private static volatile long Xqedii_3lzjgvxs5qk1l = 8865638628570460554L;
   private static volatile long Xqedii_t0alfnu6pleu = 2969886215301987488L;
   private static volatile long Xqedii_3fij3ade68ctr = -1672730434989424376L;

   public static int Xqedii_3vy218zq7vosr(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_p9ca9m9o9v9k, var1);
   }

   public static int Xqedii_38qj4y3j9wuc2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_fe1sgyj364hy;
   }

   public static int Xqedii_19gu1ytu8vbu5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_325b52wpmuiz7;
   }

   public static int Xqedii_28yvjuuts93cy(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_10u650hde6uqb, var1);
   }

   public static long Xqedii_rjhldshzcgi7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_8psvt22uz8s6, var2);
   }

   public static long Xqedii_mcszjbdais4s(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3lzjgvxs5qk1l;
   }

   public static long Xqedii_llmkk26uzq2h(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_t0alfnu6pleu;
   }

   public static long Xqedii_3pigl4gba3asp(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3fij3ade68ctr, var2);
   }

   public static String Xqedii_29epr5nqsqzzr(String var0) {
      String var1 = Xqedii_2nwjkmmxxlcyf.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("eb36ECYDgS34ZndOKIXgKvkRZuj4Dfs85WsQ5F8PbA8=");
            int var3 = 649986781;

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
            String var9 = Xqedii_2nwjkmmxxlcyf.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1nq0rw9tk45ei() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1cno9o2s30g4p() {
   }

   private static int Xqedii_1iglzegtdyhhv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3sgs86i8kj8ev(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

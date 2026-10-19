package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2quc4wr {
   private static final ConcurrentHashMap<String, String> Xqedii_rznmcub68ja0 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_23ndbjcv081bn = -109475518;
   private static volatile int Xqedii_34oxtrpe0x10m = -916247129;
   private static volatile int Xqedii_3k4r6ihnty6gb = -924327647;
   private static volatile int Xqedii_w6kf9t7u3mud = -293473212;
   private static volatile long Xqedii_10insaji3uyf = 5815723319433956589L;
   private static volatile long Xqedii_3iew0ahso5744 = 8221057383546599664L;
   private static volatile long Xqedii_1gis6q6rldkyr = 3630807219453186880L;
   private static volatile long Xqedii_355jxjbdui6xj = 4715290730148949075L;

   public static int Xqedii_29f3a9wyxfc9w(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_23ndbjcv081bn, var1);
   }

   public static int Xqedii_lvtadniowbg5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_34oxtrpe0x10m;
   }

   public static int Xqedii_xmq0ear5b8v2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3k4r6ihnty6gb;
   }

   public static int Xqedii_1p90jwslvaraz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_w6kf9t7u3mud, var1);
   }

   public static long Xqedii_3sswx6zf2lsk(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_10insaji3uyf, var2);
   }

   public static long Xqedii_33a1wbi338cxt(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3iew0ahso5744;
   }

   public static long Xqedii_159qa35u1zfbl(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1gis6q6rldkyr;
   }

   public static long Xqedii_160s8byxei6nx(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_355jxjbdui6xj, var2);
   }

   public static String Xqedii_g5sua0kc5i48(String var0) {
      String var1 = Xqedii_rznmcub68ja0.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("qFG2nKjUK8F+6MI8xPaiI1pQ8S08iSCmRNpZLr+kjyw=");
            int var3 = -546458823;

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
            String var9 = Xqedii_rznmcub68ja0.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1w0dciwkxfpu8() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_xdlp04aaxk59() {
   }

   private static int Xqedii_2gzics2ti2pgc(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3ey1vtwivbpp3(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

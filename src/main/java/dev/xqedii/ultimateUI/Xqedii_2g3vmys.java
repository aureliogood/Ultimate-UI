package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2g3vmys {
   private static final ConcurrentHashMap<String, String> Xqedii_2rnb4ha2lvd8r = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3k6o87a6xwdbu = -600988187;
   private static volatile int Xqedii_2mkqftllftue8 = 498804145;
   private static volatile int Xqedii_3ue491eiwptjm = -1267838371;
   private static volatile int Xqedii_1xij9npnmmpst = 1137866231;
   private static volatile long Xqedii_3gwj0dq0vi2ab = -6630188262108734306L;
   private static volatile long Xqedii_1vbv9oeiqfgtk = 1657052315203223780L;
   private static volatile long Xqedii_249kthv5pc4ae = -1787145416933927623L;
   private static volatile long Xqedii_2sca6dghw6cdd = 5686717803253182212L;

   public static int Xqedii_1ydmb86aagp2t(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3k6o87a6xwdbu, var1);
   }

   public static int Xqedii_1dmvf669lqqy5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2mkqftllftue8;
   }

   public static int Xqedii_3iuyholx650lu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3ue491eiwptjm;
   }

   public static int Xqedii_xmkc7v7hipdc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1xij9npnmmpst, var1);
   }

   public static long Xqedii_1ba0jxwoeni5c(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3gwj0dq0vi2ab, var2);
   }

   public static long Xqedii_1eti921j8z80p(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1vbv9oeiqfgtk;
   }

   public static long Xqedii_22stre4kdgbzl(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_249kthv5pc4ae;
   }

   public static long Xqedii_38c69czjn6qz8(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2sca6dghw6cdd, var2);
   }

   public static String Xqedii_2he7ankp7nmt5(String var0) {
      String var1 = Xqedii_2rnb4ha2lvd8r.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("HdGbAwl4WhjhfDcAlVtCIWrk+x9lmHOtjiGfhCTXOrY=");
            int var3 = 71969711;

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
            String var9 = Xqedii_2rnb4ha2lvd8r.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1z356m7fuabh0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2tptwmdnkci5h() {
   }

   private static int Xqedii_s2li5xywr3lz(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2ev12op3eragh(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

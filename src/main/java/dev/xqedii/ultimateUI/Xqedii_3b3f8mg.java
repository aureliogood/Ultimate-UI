package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3b3f8mg {
   private static final ConcurrentHashMap<String, String> Xqedii_2eqagt6idqqm3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_nwatmintbljc = -677820364;
   private static volatile int Xqedii_12g61jesu4c15 = 1508191908;
   private static volatile int Xqedii_39ajs7f02eeu2 = -2010406989;
   private static volatile int Xqedii_10wk14zcrbqv6 = 1861755947;
   private static volatile long Xqedii_r640agmcsl5k = 3143266787858807400L;
   private static volatile long Xqedii_qxnoi2sj0647 = 2074562074897718524L;
   private static volatile long Xqedii_3l1tukbhjh0f3 = 1586731066072987735L;
   private static volatile long Xqedii_1hu24dj00i0n2 = -8340566057168087623L;

   public static int Xqedii_2rcnntl7pzihq(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_nwatmintbljc, var1);
   }

   public static int Xqedii_27zuecxii6v5a(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_12g61jesu4c15;
   }

   public static int Xqedii_120djxek0ngug(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_39ajs7f02eeu2;
   }

   public static int Xqedii_nx6cuuvq3r1d(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_10wk14zcrbqv6, var1);
   }

   public static long Xqedii_2spn3h8f00fnt(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_r640agmcsl5k, var2);
   }

   public static long Xqedii_1wdnslrxg2u8z(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_qxnoi2sj0647;
   }

   public static long Xqedii_9u8aw59v2x5n(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3l1tukbhjh0f3;
   }

   public static long Xqedii_2p5ci3d7bw25m(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1hu24dj00i0n2, var2);
   }

   public static String Xqedii_2lgz74o263zjo(String var0) {
      String var1 = Xqedii_2eqagt6idqqm3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("JQKAWehQD+81cBJNo6s1kt2b/5ZXNkCayc0gXbClsZ4=");
            int var3 = -944197110;

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
            String var9 = Xqedii_2eqagt6idqqm3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2bc196zx4zmd6() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2jq9zo6z6dj0a() {
   }

   private static int Xqedii_1dmapswi6pwaf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3ruxrkg6yb8za(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

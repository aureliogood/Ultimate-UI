package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_n2yidbu {
   private static final ConcurrentHashMap<String, String> Xqedii_1v62s3oedqev = new ConcurrentHashMap<>();
   private static volatile int Xqedii_39zg811u53exx = 558194944;
   private static volatile int Xqedii_1dx75rxdda5k3 = -1437140564;
   private static volatile int Xqedii_1sqr9ieejvf6x = 141286641;
   private static volatile int Xqedii_26ekgks4ougtv = 1173435368;
   private static volatile long Xqedii_32vp6ofr664o0 = -2004079099661015476L;
   private static volatile long Xqedii_z5awim1mkhlv = -8775014552362694229L;
   private static volatile long Xqedii_354as95wkm0br = -1410494814393280624L;
   private static volatile long Xqedii_29zr63tsf8r0w = 1051299381032876365L;

   public static int Xqedii_3fdwuay78nekn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_39zg811u53exx, var1);
   }

   public static int Xqedii_pj7z7gbht5gq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1dx75rxdda5k3;
   }

   public static int Xqedii_3n2mrgnj30ywl(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1sqr9ieejvf6x;
   }

   public static int Xqedii_2v4ns5806glbd(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_26ekgks4ougtv, var1);
   }

   public static long Xqedii_7tq6b9soe503(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_32vp6ofr664o0, var2);
   }

   public static long Xqedii_2oms7s6zjkyyr(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_z5awim1mkhlv;
   }

   public static long Xqedii_1sp7n7biszrnc(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_354as95wkm0br;
   }

   public static long Xqedii_zq5pxwtw8g27(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_29zr63tsf8r0w, var2);
   }

   public static String Xqedii_2upwzf3qrxfu9(String var0) {
      String var1 = Xqedii_1v62s3oedqev.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("6HGp6KYNGxs/kds4n37VUUBPcR2yvShGVeQJ1dLaNII=");
            int var3 = 333345613;

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
            String var9 = Xqedii_1v62s3oedqev.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1feianr1l4ftc() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_ocxz06r6zblk() {
   }

   private static int Xqedii_35jgwxdeapwxv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3azeq4g3wirs6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

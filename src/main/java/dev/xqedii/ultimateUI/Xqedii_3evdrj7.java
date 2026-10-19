package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3evdrj7 {
   private static final ConcurrentHashMap<String, String> Xqedii_33nlfnzc8nsy9 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_n7es3iyz8wyw = -948257335;
   private static volatile int Xqedii_3edx5n9i6rcy9 = 2023815797;
   private static volatile int Xqedii_3hj6h2sc4xurq = -1835639533;
   private static volatile int Xqedii_3t0fu32a1dlni = -1792337364;
   private static volatile long Xqedii_38nf6e6591dyf = 7249783045698821856L;
   private static volatile long Xqedii_1jglhq15ale4v = -325663975870876711L;
   private static volatile long Xqedii_3a92zg13n50os = 1678169398678042863L;
   private static volatile long Xqedii_1o5tkaq77mwlo = -512022538331030260L;

   public static int Xqedii_gnacqgn11rln(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_n7es3iyz8wyw, var1);
   }

   public static int Xqedii_2v1mdnzulgx21(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3edx5n9i6rcy9;
   }

   public static int Xqedii_2sovr0xzugz8n(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3hj6h2sc4xurq;
   }

   public static int Xqedii_3oirulnto3w33(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3t0fu32a1dlni, var1);
   }

   public static long Xqedii_clzpoq3pfaod(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_38nf6e6591dyf, var2);
   }

   public static long Xqedii_1kv6rioq6mqhj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1jglhq15ale4v;
   }

   public static long Xqedii_15qvmhhy8tojs(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3a92zg13n50os;
   }

   public static long Xqedii_1a3cj0po5031f(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1o5tkaq77mwlo, var2);
   }

   public static String Xqedii_blzw2ymm45ll(String var0) {
      String var1 = Xqedii_33nlfnzc8nsy9.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Vxq4rvg6V68Limg2VCqFLQ18Yb/a764TXEojPa8p0sU=");
            int var3 = 1287959090;

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
            String var9 = Xqedii_33nlfnzc8nsy9.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1rlaxpd1dec73() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_x0szq0lx4ckb() {
   }

   private static int Xqedii_15eyan5piqcxy(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1scncrmngsczf(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

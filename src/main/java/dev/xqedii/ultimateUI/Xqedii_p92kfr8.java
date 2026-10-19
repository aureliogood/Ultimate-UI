package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_p92kfr8 {
   private static final ConcurrentHashMap<String, String> Xqedii_1olds6911q0yh = new ConcurrentHashMap<>();
   private static volatile int Xqedii_14f1klhs9e3u9 = -596921861;
   private static volatile int Xqedii_1olkbedr9k1og = 1987128837;
   private static volatile int Xqedii_12h8tdv996g4m = 1449228470;
   private static volatile int Xqedii_2zc1yartk6s8i = 1242767674;
   private static volatile long Xqedii_ggfsi5ky1k90 = 2556893261190638579L;
   private static volatile long Xqedii_1wfhtyme4grgp = -4610863194366526433L;
   private static volatile long Xqedii_wbfvr6axkgur = -8937052130913914983L;
   private static volatile long Xqedii_37lflh2u3d89c = -5251109032773370651L;

   public static int Xqedii_1lu9r5ulbypuc(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_14f1klhs9e3u9, var1);
   }

   public static int Xqedii_lmv0hkpfqrnh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1olkbedr9k1og;
   }

   public static int Xqedii_15ae4j3j41jaq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_12h8tdv996g4m;
   }

   public static int Xqedii_vjb2772t99mu(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2zc1yartk6s8i, var1);
   }

   public static long Xqedii_d6u0z0eajmc9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_ggfsi5ky1k90, var2);
   }

   public static long Xqedii_1uyxzw93yu3um(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1wfhtyme4grgp;
   }

   public static long Xqedii_12um4tc7nzty0(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_wbfvr6axkgur;
   }

   public static long Xqedii_274j413le3omf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_37lflh2u3d89c, var2);
   }

   public static String Xqedii_2bk7y6qkjw7ma(String var0) {
      String var1 = Xqedii_1olds6911q0yh.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("NesjV23CWRUcPtb8i8u2rQyR9RUITU8rw0IMuGz2Vjc=");
            int var3 = 119073716;

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
            String var9 = Xqedii_1olds6911q0yh.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2ugrkij4xhzjv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_pck8jbandggm() {
   }

   private static int Xqedii_1p36ej6gub34(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2m5vs6ycr99o(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

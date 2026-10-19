package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3npa30o {
   private static final ConcurrentHashMap<String, String> Xqedii_3c4w7u4cmdbww = new ConcurrentHashMap<>();
   private static volatile int Xqedii_spxrdykxfdk9 = -1670536798;
   private static volatile int Xqedii_exnevv8iwkwd = 2069941244;
   private static volatile int Xqedii_1mlzm9hfpdat1 = -456670988;
   private static volatile int Xqedii_3nhzlbv1egoyn = -1847974066;
   private static volatile long Xqedii_3r0hj78x789y7 = -3017992184062089267L;
   private static volatile long Xqedii_mplxv5adq8fv = -6679456226020242976L;
   private static volatile long Xqedii_3j7ajv98s6r1s = -4321716756096435972L;
   private static volatile long Xqedii_2ogqks1ez2d3n = 5461869586525925322L;

   public static int Xqedii_13b2e97ct6qkh(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_spxrdykxfdk9, var1);
   }

   public static int Xqedii_1nog9yap432t0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_exnevv8iwkwd;
   }

   public static int Xqedii_24814flojcqzj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1mlzm9hfpdat1;
   }

   public static int Xqedii_1vbvxqx9ik2qp(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3nhzlbv1egoyn, var1);
   }

   public static long Xqedii_3a5vwhhj59jas(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3r0hj78x789y7, var2);
   }

   public static long Xqedii_1t4go69ndce0x(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_mplxv5adq8fv;
   }

   public static long Xqedii_5gz7g22uydcw(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3j7ajv98s6r1s;
   }

   public static long Xqedii_38rwvpkd262hc(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2ogqks1ez2d3n, var2);
   }

   public static String Xqedii_1iqm68lgt5anc(String var0) {
      String var1 = Xqedii_3c4w7u4cmdbww.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("hHJ8EzHPJQXDponuj31SKEPsKe7PfB6uEUNz2sVRnho=");
            int var3 = 393640803;

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
            String var9 = Xqedii_3c4w7u4cmdbww.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2frknnj7bwf9t() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_38elf1ky8nzm2() {
   }

   private static int Xqedii_3tjbob2spe1mq(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_b7c8x1hl6rkg(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

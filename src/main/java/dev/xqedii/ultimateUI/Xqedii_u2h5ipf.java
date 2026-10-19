package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_u2h5ipf {
   private static final ConcurrentHashMap<String, String> Xqedii_3pl0z947q9xic = new ConcurrentHashMap<>();
   private static volatile int Xqedii_k9i4udirxijg = 1243830379;
   private static volatile int Xqedii_1n20heywk4wji = 1113311296;
   private static volatile int Xqedii_153bqbjipa45h = 1372306419;
   private static volatile int Xqedii_2ik1wyd3hwlxn = 1296816489;
   private static volatile long Xqedii_22c0mjodlfz4s = 4077733454173559838L;
   private static volatile long Xqedii_1crycb3wgo3io = 2443298383577640281L;
   private static volatile long Xqedii_35xdk1fdap7pc = -1800909636588751261L;
   private static volatile long Xqedii_1m9gznb3i500 = 1892475846343506827L;

   public static int Xqedii_utcj04b6ekya(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_k9i4udirxijg, var1);
   }

   public static int Xqedii_e0lggjliln2r(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1n20heywk4wji;
   }

   public static int Xqedii_201250mppvcjw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_153bqbjipa45h;
   }

   public static int Xqedii_1jvd3834j1o2f(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ik1wyd3hwlxn, var1);
   }

   public static long Xqedii_11gkn3ptil37o(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_22c0mjodlfz4s, var2);
   }

   public static long Xqedii_3c712whl5acye(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1crycb3wgo3io;
   }

   public static long Xqedii_pk2zjed27vfv(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_35xdk1fdap7pc;
   }

   public static long Xqedii_2osfoeksxweyx(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1m9gznb3i500, var2);
   }

   public static String Xqedii_gsv3wgod4yg7(String var0) {
      String var1 = Xqedii_3pl0z947q9xic.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/bmzvFbvNkhgQp8uavDPm52QkHo9VPhJV2tvuDz/Vz0=");
            int var3 = -656155883;

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
            String var9 = Xqedii_3pl0z947q9xic.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2k7hewdnhya27() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1hz79m1x7mex2() {
   }

   private static int Xqedii_2e6s4xyaiim75(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_daszdq5w8ks0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

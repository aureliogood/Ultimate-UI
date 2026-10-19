package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2p1qx0p {
   private static final ConcurrentHashMap<String, String> Xqedii_8rn7jk4sq9s0 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_311vfhkuo0ohh = -756062143;
   private static volatile int Xqedii_y0by3myxlma7 = -1362449748;
   private static volatile int Xqedii_3ool09u1kmamf = -737664498;
   private static volatile int Xqedii_2sq3uqmb45lfs = -450993775;
   private static volatile long Xqedii_15ip9e10eo94w = -3342487110726213093L;
   private static volatile long Xqedii_33bklqbduonv5 = 5823718882214282080L;
   private static volatile long Xqedii_17obuwre5crqb = 2874090341992836571L;
   private static volatile long Xqedii_8con9tjkpkkk = 187461368321906563L;

   public static int Xqedii_28095sgl1qhda(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_311vfhkuo0ohh, var1);
   }

   public static int Xqedii_2vz92el33j4wg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_y0by3myxlma7;
   }

   public static int Xqedii_a3fx9j8bjfrd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3ool09u1kmamf;
   }

   public static int Xqedii_1o83hofrmj55j(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2sq3uqmb45lfs, var1);
   }

   public static long Xqedii_xcdypfev3r6d(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_15ip9e10eo94w, var2);
   }

   public static long Xqedii_bvphqphcjb3g(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_33bklqbduonv5;
   }

   public static long Xqedii_pnubgpkvjce2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_17obuwre5crqb;
   }

   public static long Xqedii_2rsqpji18stir(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_8con9tjkpkkk, var2);
   }

   public static String Xqedii_1jruufhroc556(String var0) {
      String var1 = Xqedii_8rn7jk4sq9s0.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/AUSxPWMeQSanyUMEpFU4UuvnBvJQgdgi7oPFUOlDaU=");
            int var3 = -163700361;

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
            String var9 = Xqedii_8rn7jk4sq9s0.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_23wbbmxapwt0o() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_iieihtisrt81() {
   }

   private static int Xqedii_hbic0ua0981f(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3gr2a1rwqp0r(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

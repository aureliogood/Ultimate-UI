package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1iy6b4g {
   private static final ConcurrentHashMap<String, String> Xqedii_1r3eaagt89r3w = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3ci3fb8d8l1ye = -744250091;
   private static volatile int Xqedii_99x57yhjp7uc = 1142654140;
   private static volatile int Xqedii_1ebgyevsn02kr = -1604952196;
   private static volatile int Xqedii_386wle65bzpn8 = 6853685;
   private static volatile long Xqedii_2neroxvoq7d62 = 2666319924825459224L;
   private static volatile long Xqedii_2tz7wcyvgusll = 6295079535684382453L;
   private static volatile long Xqedii_1tfgc7kc50t0f = -7886556672628299208L;
   private static volatile long Xqedii_2q75cimh0154c = 9085133123505235744L;

   public static int Xqedii_3cityyn7gvhcq(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3ci3fb8d8l1ye, var1);
   }

   public static int Xqedii_23xia8l8oc4fn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_99x57yhjp7uc;
   }

   public static int Xqedii_1gvem58crlq3s(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1ebgyevsn02kr;
   }

   public static int Xqedii_1vhgd9x9us37r(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_386wle65bzpn8, var1);
   }

   public static long Xqedii_2dr3us0aci3k5(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2neroxvoq7d62, var2);
   }

   public static long Xqedii_1uzd029zwi2ky(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2tz7wcyvgusll;
   }

   public static long Xqedii_3jjd05sfj3vtf(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1tfgc7kc50t0f;
   }

   public static long Xqedii_15uw1qmmxvz9v(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2q75cimh0154c, var2);
   }

   public static String Xqedii_fhdt42p7co5z(String var0) {
      String var1 = Xqedii_1r3eaagt89r3w.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Wa31tnQQjebVvc7MLdRQaXqQnNdOFsU8JJj1Zp2qlXM=");
            int var3 = 697294644;

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
            String var9 = Xqedii_1r3eaagt89r3w.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_9hz5cbb626bl() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1odur6d6h3298() {
   }

   private static int Xqedii_3435svdfus2ze(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_l3zomg99tltl(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

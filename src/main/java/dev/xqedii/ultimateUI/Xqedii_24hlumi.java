package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_24hlumi {
   private static final ConcurrentHashMap<String, String> Xqedii_2taezkte38nzd = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2t0rlyvmdpaky = -679025532;
   private static volatile int Xqedii_3qpso2syqed9m = 363768631;
   private static volatile int Xqedii_2pd0ehvjv26h0 = -1089492977;
   private static volatile int Xqedii_3b0yoemphs25f = -1237109698;
   private static volatile long Xqedii_tprkz3fwcg5g = 5708486511636847276L;
   private static volatile long Xqedii_13pqpqxbb0v3n = -6568314717339467325L;
   private static volatile long Xqedii_15sk2z277g45c = 2909154894413754419L;
   private static volatile long Xqedii_3345fodvwy9d1 = 8272676430448502940L;

   public static int Xqedii_1knipmgycx8x7(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2t0rlyvmdpaky, var1);
   }

   public static int Xqedii_1c1cskwrfqq0c(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3qpso2syqed9m;
   }

   public static int Xqedii_35lgp2t7b2v1m(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2pd0ehvjv26h0;
   }

   public static int Xqedii_3jkiakoi6rkpm(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3b0yoemphs25f, var1);
   }

   public static long Xqedii_1o349xr6grsgt(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_tprkz3fwcg5g, var2);
   }

   public static long Xqedii_358zf186frrgs(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_13pqpqxbb0v3n;
   }

   public static long Xqedii_39co7c8k37pv9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_15sk2z277g45c;
   }

   public static long Xqedii_1qy3wj8t3vdtz(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3345fodvwy9d1, var2);
   }

   public static String Xqedii_1nl2u913u7chn(String var0) {
      String var1 = Xqedii_2taezkte38nzd.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("M0fV+6+Wq2IkpFQA6raG3MaOQWW6WtJeOxq5ngE7ORQ=");
            int var3 = 831072312;

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
            String var9 = Xqedii_2taezkte38nzd.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1deuu0jdezkjt() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1ainc9gy4fkbk() {
   }

   private static int Xqedii_c1aye5kpjtz0(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_mx6ymcslvnyr(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

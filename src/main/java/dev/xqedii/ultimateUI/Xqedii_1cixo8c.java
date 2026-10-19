package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1cixo8c {
   private static final ConcurrentHashMap<String, String> Xqedii_1s35ldrv64115 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1bpodkoyx09mi = -449504983;
   private static volatile int Xqedii_25ztkfvtoekx1 = 1446106264;
   private static volatile int Xqedii_1zprkj48s6ym9 = -1546280936;
   private static volatile int Xqedii_1hk6xere7yhp9 = -1097496865;
   private static volatile long Xqedii_31xzkkryinftk = -7220327055353798621L;
   private static volatile long Xqedii_2u5rgrq0f19z5 = 56228005194259685L;
   private static volatile long Xqedii_1nomxq197zzi0 = 2535804302182417109L;
   private static volatile long Xqedii_1sebnoeyaahbe = -5632325223945577655L;

   public static int Xqedii_2u7a6dt8liia(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1bpodkoyx09mi, var1);
   }

   public static int Xqedii_3clkf3wc9zje8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_25ztkfvtoekx1;
   }

   public static int Xqedii_37idzi0zs3n92(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1zprkj48s6ym9;
   }

   public static int Xqedii_2ek310jd134jg(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1hk6xere7yhp9, var1);
   }

   public static long Xqedii_2lov3thk5wj6e(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_31xzkkryinftk, var2);
   }

   public static long Xqedii_2b6hskgc387pz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2u5rgrq0f19z5;
   }

   public static long Xqedii_27ks2zwcx13q7(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1nomxq197zzi0;
   }

   public static long Xqedii_1cfad0wu4soht(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1sebnoeyaahbe, var2);
   }

   public static String Xqedii_20t0mfj389zhc(String var0) {
      String var1 = Xqedii_1s35ldrv64115.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("4+OsBDS0l7Xxt+IxQQG9+Rwl0AXmfjwyE6mNDGlyNMI=");
            int var3 = -1141182866;

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
            String var9 = Xqedii_1s35ldrv64115.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_21p1mw7wnqrgc() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_17kzmjkxk7gql() {
   }

   private static int Xqedii_29wseaow9aa2q(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2t2iymc6l3oci(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

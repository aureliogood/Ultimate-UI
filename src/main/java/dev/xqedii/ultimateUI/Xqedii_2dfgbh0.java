package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2dfgbh0 {
   private static final ConcurrentHashMap<String, String> Xqedii_nta4ln4ddbge = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3bd3t7pd48zj4 = 1115477049;
   private static volatile int Xqedii_21hffa8lceemz = -1716485484;
   private static volatile int Xqedii_2y9drguadd7y1 = -519926089;
   private static volatile int Xqedii_16l473ruxip5d = -1346625673;
   private static volatile long Xqedii_ig5yy9x55ytl = 6729086791819995648L;
   private static volatile long Xqedii_z8v8nihmuvni = 814407059866427528L;
   private static volatile long Xqedii_3fplrodfuxvu9 = 6199830222112778518L;
   private static volatile long Xqedii_l7i4r551ha7s = -7798565427270546891L;

   public static int Xqedii_33i9gl8xlxeoi(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3bd3t7pd48zj4, var1);
   }

   public static int Xqedii_3e71ueyoqy3yw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_21hffa8lceemz;
   }

   public static int Xqedii_21t1a6tp2gqio(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2y9drguadd7y1;
   }

   public static int Xqedii_1nbrqu313ycve(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_16l473ruxip5d, var1);
   }

   public static long Xqedii_279kqn5oduse2(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_ig5yy9x55ytl, var2);
   }

   public static long Xqedii_1clo6w29rp85g(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_z8v8nihmuvni;
   }

   public static long Xqedii_1czh0czdzdrhr(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3fplrodfuxvu9;
   }

   public static long Xqedii_1tyxeq21vicqm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_l7i4r551ha7s, var2);
   }

   public static String Xqedii_7dejczvzuu5n(String var0) {
      String var1 = Xqedii_nta4ln4ddbge.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("CC6Lj8bxCPb95AbiCaUIadzmutFqE418S+T5EEs+beE=");
            int var3 = -1048805312;

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
            String var9 = Xqedii_nta4ln4ddbge.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2c4tj9hhghm7i() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2m2ggjskrfu0c() {
   }

   private static int Xqedii_3vc3vztnfjwke(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1tf11kic44ws4(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

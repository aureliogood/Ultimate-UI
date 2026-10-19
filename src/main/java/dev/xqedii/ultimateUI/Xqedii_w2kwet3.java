package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_w2kwet3 {
   private static final ConcurrentHashMap<String, String> Xqedii_18e2zlml70act = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2y31z2h2r1gll = -112528828;
   private static volatile int Xqedii_3h6zqsv5wjlu4 = -1978131105;
   private static volatile int Xqedii_1hxgfbls5vnd9 = -1822714474;
   private static volatile int Xqedii_7u32pyzcoarh = 1964617478;
   private static volatile long Xqedii_3mtq9f05e620l = -4818948378362298572L;
   private static volatile long Xqedii_1iwmy6rolwcap = 1769618809001019089L;
   private static volatile long Xqedii_2uij7375oz87m = -1951310673570065240L;
   private static volatile long Xqedii_3p561a0l36dz7 = 1674319634346221941L;

   public static int Xqedii_1w14lr3x4gbtj(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2y31z2h2r1gll, var1);
   }

   public static int Xqedii_2sjt4go3njt6f(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3h6zqsv5wjlu4;
   }

   public static int Xqedii_rnl2bncmt4ck(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1hxgfbls5vnd9;
   }

   public static int Xqedii_11bf5mk6aojhb(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_7u32pyzcoarh, var1);
   }

   public static long Xqedii_hnx4u5iw2rls(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3mtq9f05e620l, var2);
   }

   public static long Xqedii_3gak36tuuunj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1iwmy6rolwcap;
   }

   public static long Xqedii_2qolz6ssmbe5c(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2uij7375oz87m;
   }

   public static long Xqedii_195tps93tevln(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3p561a0l36dz7, var2);
   }

   public static String Xqedii_oavk7fyuhdi4(String var0) {
      String var1 = Xqedii_18e2zlml70act.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("EWNl57oWpV6l3Qt1ecyhFu8bXtBETwwwQXzVN4wo6L0=");
            int var3 = -431898287;

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
            String var9 = Xqedii_18e2zlml70act.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1fv8l1i9ate6l() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1eapn6vw7nx39() {
   }

   private static int Xqedii_eowpzetswiwo(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_364v60r76bvp2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

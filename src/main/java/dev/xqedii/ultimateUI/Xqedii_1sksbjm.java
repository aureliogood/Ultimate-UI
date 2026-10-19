package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1sksbjm {
   private static final ConcurrentHashMap<String, String> Xqedii_1af5mgooh3kmd = new ConcurrentHashMap<>();
   private static volatile int Xqedii_x53rk3pa39xl = 503959674;
   private static volatile int Xqedii_2035rfjrzovro = -722413360;
   private static volatile int Xqedii_2tex6fhwpim76 = -1859035480;
   private static volatile int Xqedii_3u4oe7o9kssnx = -501956235;
   private static volatile long Xqedii_2u022q1f1kop6 = 1027357929124410689L;
   private static volatile long Xqedii_2a12w3oieonk = 628709972925564630L;
   private static volatile long Xqedii_13yqde597nnjg = -2717318306264920186L;
   private static volatile long Xqedii_2b0y9z59hjwki = 3478612017105157850L;

   public static int Xqedii_1nk8sbo560wh3(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_x53rk3pa39xl, var1);
   }

   public static int Xqedii_15irfo9fs3do0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2035rfjrzovro;
   }

   public static int Xqedii_19s4tws57yuuk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2tex6fhwpim76;
   }

   public static int Xqedii_3iotgihaci52y(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3u4oe7o9kssnx, var1);
   }

   public static long Xqedii_9okgv7aze45k(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2u022q1f1kop6, var2);
   }

   public static long Xqedii_gm3juyo5ukog(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2a12w3oieonk;
   }

   public static long Xqedii_dggr2docbuqs(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_13yqde597nnjg;
   }

   public static long Xqedii_2eapkhcwsxzs4(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2b0y9z59hjwki, var2);
   }

   public static String Xqedii_1x964navpcv5x(String var0) {
      String var1 = Xqedii_1af5mgooh3kmd.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("xTqhMl/pgXJRzJmFv/E/KjGKFgiyAM7Z9rU6Dy/9bn0=");
            int var3 = 936834742;

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
            String var9 = Xqedii_1af5mgooh3kmd.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2rkm2fsbi9gyh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2qcl41zqbs79a() {
   }

   private static int Xqedii_2ohu57l9r7jde(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2waxunifomffp(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

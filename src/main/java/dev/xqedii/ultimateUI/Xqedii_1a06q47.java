package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1a06q47 {
   private static final ConcurrentHashMap<String, String> Xqedii_2hf68178lpc6r = new ConcurrentHashMap<>();
   private static volatile int Xqedii_uxhb81xbs1f1 = -237702964;
   private static volatile int Xqedii_116d5xg3u9n80 = -194838566;
   private static volatile int Xqedii_h7g3wr0yq3fs = -1355648622;
   private static volatile int Xqedii_33un3mw4rathn = 1525338653;
   private static volatile long Xqedii_166ean7yt0vhp = 253757595417681987L;
   private static volatile long Xqedii_1wxdm08v6qoso = -911435352130244106L;
   private static volatile long Xqedii_378z3pv8y8mbm = 2242503722310037401L;
   private static volatile long Xqedii_1zx0apk46ckmu = 1515228639225446181L;

   public static int Xqedii_irrwu3eoxd0k(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_uxhb81xbs1f1, var1);
   }

   public static int Xqedii_2r7rrdncsn6ba(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_116d5xg3u9n80;
   }

   public static int Xqedii_1mzrpvilwdeno(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_h7g3wr0yq3fs;
   }

   public static int Xqedii_1vi696ftc6hys(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_33un3mw4rathn, var1);
   }

   public static long Xqedii_zn0c70na45vi(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_166ean7yt0vhp, var2);
   }

   public static long Xqedii_tzt9t14bqrp(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1wxdm08v6qoso;
   }

   public static long Xqedii_5m5cf8vbtrvy(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_378z3pv8y8mbm;
   }

   public static long Xqedii_2uchycqercdn1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1zx0apk46ckmu, var2);
   }

   public static String Xqedii_10ulobqfs7iri(String var0) {
      String var1 = Xqedii_2hf68178lpc6r.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("RwDcHZ+j/Vfpvr/MieL3XUwP5n3LI43BzsR38/pbD1s=");
            int var3 = -1655680792;

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
            String var9 = Xqedii_2hf68178lpc6r.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_ps794dna9seb() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_a77q88wyptw0() {
   }

   private static int Xqedii_3skr45wvoiyzr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2a876hsin1x9(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

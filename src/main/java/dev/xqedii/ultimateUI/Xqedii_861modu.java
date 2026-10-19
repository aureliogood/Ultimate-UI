package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_861modu {
   private static final ConcurrentHashMap<String, String> Xqedii_35873i75mdtgc = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2milaf85fu0r3 = 1651488794;
   private static volatile int Xqedii_1obu912bnv70m = -360260407;
   private static volatile int Xqedii_7fznsz5dva4o = 1458075852;
   private static volatile int Xqedii_20ih56ucex603 = 1376344316;
   private static volatile long Xqedii_1fkkumikkw82a = -6676440018336842401L;
   private static volatile long Xqedii_12aepsf0r6jwa = 4255659571010889221L;
   private static volatile long Xqedii_xjnfzcmaq9p9 = 5400212219455767689L;
   private static volatile long Xqedii_f7472w14gl6q = 247018290995407297L;

   public static int Xqedii_2zlxa5tfkxedf(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2milaf85fu0r3, var1);
   }

   public static int Xqedii_htn4szvorld0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1obu912bnv70m;
   }

   public static int Xqedii_1b0oqqhonwju0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_7fznsz5dva4o;
   }

   public static int Xqedii_1gs47dj4farm0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_20ih56ucex603, var1);
   }

   public static long Xqedii_3r8g3nz3sv202(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1fkkumikkw82a, var2);
   }

   public static long Xqedii_h5dlv9jjxlvx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_12aepsf0r6jwa;
   }

   public static long Xqedii_2jb93s7rfxfe3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_xjnfzcmaq9p9;
   }

   public static long Xqedii_1x1tkcpbzooy0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_f7472w14gl6q, var2);
   }

   public static String Xqedii_25bq6ccf6dbna(String var0) {
      String var1 = Xqedii_35873i75mdtgc.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ToHrtJxFHlNaQlNm9HPjmw30piov7CTXR1r0Ex0Da7w=");
            int var3 = 603320461;

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
            String var9 = Xqedii_35873i75mdtgc.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1yj3l1snltcst() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_s3bzjvx160sh() {
   }

   private static int Xqedii_2caff41b5rb31(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_15a95xip5n71(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

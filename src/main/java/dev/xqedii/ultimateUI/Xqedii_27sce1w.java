package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_27sce1w {
   private static final ConcurrentHashMap<String, String> Xqedii_3638rgmmqpx0i = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3qm3a4lr6qerz = -72418869;
   private static volatile int Xqedii_oitb1mzdvinr = -77519552;
   private static volatile int Xqedii_2nc2yjrjbdeur = -1397226102;
   private static volatile int Xqedii_3psxsujyprwwl = -1288835203;
   private static volatile long Xqedii_16qomtjrfp1r = -1464701441591307884L;
   private static volatile long Xqedii_23bflpjluzbfx = 6468063715792230542L;
   private static volatile long Xqedii_1e1ck2300d4l9 = 4101992897091884087L;
   private static volatile long Xqedii_24lplo563i5b3 = 7593819865599916226L;

   public static int Xqedii_247t772j9h0z(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3qm3a4lr6qerz, var1);
   }

   public static int Xqedii_37htijzo9b1zy(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_oitb1mzdvinr;
   }

   public static int Xqedii_2b4s1o2ky6vm3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2nc2yjrjbdeur;
   }

   public static int Xqedii_ms2o3cw9ungl(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3psxsujyprwwl, var1);
   }

   public static long Xqedii_3szrm9uh6f5wu(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_16qomtjrfp1r, var2);
   }

   public static long Xqedii_2x7o0twc2tabi(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_23bflpjluzbfx;
   }

   public static long Xqedii_17sh4o3eoaida(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1e1ck2300d4l9;
   }

   public static long Xqedii_1h96gqz76df3p(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_24lplo563i5b3, var2);
   }

   public static String Xqedii_1oczg2mur344m(String var0) {
      String var1 = Xqedii_3638rgmmqpx0i.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("GkqwfRmktaxF/xe37KIxVYK7O20LufFkMw5JPzyCONg=");
            int var3 = 826678993;

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
            String var9 = Xqedii_3638rgmmqpx0i.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_g2g7375hzgr4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1m5rjxdzq4yz1() {
   }

   private static int Xqedii_inu9r2cib8n7(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3iloheddqbmfb(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

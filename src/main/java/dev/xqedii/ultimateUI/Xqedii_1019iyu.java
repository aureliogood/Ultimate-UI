package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1019iyu {
   private static final ConcurrentHashMap<String, String> Xqedii_2nbs4sdapcm3g = new ConcurrentHashMap<>();
   private static volatile int Xqedii_or4tettvofuq = -473372795;
   private static volatile int Xqedii_1tg4tgzp1uain = -1429493946;
   private static volatile int Xqedii_1d71szjutt3c1 = -1225918967;
   private static volatile int Xqedii_1vffthse04c4x = -1903467761;
   private static volatile long Xqedii_noflhtn0ueh9 = -5605042057367407319L;
   private static volatile long Xqedii_makba63qhopk = 8464743015373954439L;
   private static volatile long Xqedii_2uu2ig4hs879r = -183693266462361660L;
   private static volatile long Xqedii_en8gbhe3j2ig = 4156272918038453415L;

   public static int Xqedii_3ci69x92tvmm1(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_or4tettvofuq, var1);
   }

   public static int Xqedii_1ndyeq6xlchef(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1tg4tgzp1uain;
   }

   public static int Xqedii_2mfne2y896ulb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1d71szjutt3c1;
   }

   public static int Xqedii_3gzb6g7f2isku(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1vffthse04c4x, var1);
   }

   public static long Xqedii_2pxaxmj62fyal(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_noflhtn0ueh9, var2);
   }

   public static long Xqedii_2w0dnuupia291(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_makba63qhopk;
   }

   public static long Xqedii_1i6lyl5vinqcz(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2uu2ig4hs879r;
   }

   public static long Xqedii_2tlt4yrv5mrai(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_en8gbhe3j2ig, var2);
   }

   public static String Xqedii_yegp40fedzhm(String var0) {
      String var1 = Xqedii_2nbs4sdapcm3g.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("2UyRw5PjAu4Y9tWsdb2mnZOBBhMXOF8sQtxsx9TBJnk=");
            int var3 = -1590709823;

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
            String var9 = Xqedii_2nbs4sdapcm3g.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_37rdxs6lirvyr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_38zy4j30bdsps() {
   }

   private static int Xqedii_hhbnh2mkboum(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3faez03tvy4f7(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

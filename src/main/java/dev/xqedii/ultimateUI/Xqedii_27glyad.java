package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_27glyad {
   private static final ConcurrentHashMap<String, String> Xqedii_1wzv9lykql3r8 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1aomqci3qfbtd = -378721734;
   private static volatile int Xqedii_37aql4ypudzb1 = -1419059712;
   private static volatile int Xqedii_3oxw1nm5otqzi = 1813308676;
   private static volatile int Xqedii_2afbjblortdkv = 236858014;
   private static volatile long Xqedii_14x56uisr0lkw = -6560045218780406072L;
   private static volatile long Xqedii_2yen02egt7wcr = 6586322398478624178L;
   private static volatile long Xqedii_2x15blw2ms58z = 3503379261775488299L;
   private static volatile long Xqedii_2ptvwapvvhz9g = 4535046498280217873L;

   public static int Xqedii_on6fty6v5way(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1aomqci3qfbtd, var1);
   }

   public static int Xqedii_rf5ix5b3qilr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_37aql4ypudzb1;
   }

   public static int Xqedii_1im9a8tvaxjde(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3oxw1nm5otqzi;
   }

   public static int Xqedii_1xtb073di5jmh(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2afbjblortdkv, var1);
   }

   public static long Xqedii_3n8lhu9pmqlj(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_14x56uisr0lkw, var2);
   }

   public static long Xqedii_3uppyth3o17wd(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2yen02egt7wcr;
   }

   public static long Xqedii_1rzltsvtqdyck(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2x15blw2ms58z;
   }

   public static long Xqedii_213q6dt9wjjfk(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2ptvwapvvhz9g, var2);
   }

   public static String Xqedii_ydrbdexjmgqk(String var0) {
      String var1 = Xqedii_1wzv9lykql3r8.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("HLoFJ3lK2yI+Rh7IDZvIJQYYjXpGAXqXp/BOGFgtBZg=");
            int var3 = 706101471;

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
            String var9 = Xqedii_1wzv9lykql3r8.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_plu1jkut9x82() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_j59htvvtaodw() {
   }

   private static int Xqedii_3778feh4ly92(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1zzguqlqenv9s(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

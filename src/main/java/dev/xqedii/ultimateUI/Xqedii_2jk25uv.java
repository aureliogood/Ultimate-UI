package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2jk25uv {
   private static final ConcurrentHashMap<String, String> Xqedii_2kvvard6z2bw6 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1zfdgxnc3z39f = 2044799486;
   private static volatile int Xqedii_3474pi77xxz4p = 860423377;
   private static volatile int Xqedii_2ze585bn25nhl = -1012946095;
   private static volatile int Xqedii_2l52ab61wzlew = -1476415118;
   private static volatile long Xqedii_9bt0tbpi00jt = 8337186658333144713L;
   private static volatile long Xqedii_3zd3nf7craui = -7463439138214134641L;
   private static volatile long Xqedii_ax94a09refji = 3900181279333962198L;
   private static volatile long Xqedii_2psnj90nyt42l = -1461555197634217567L;

   public static int Xqedii_5kib6y7roqq1(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1zfdgxnc3z39f, var1);
   }

   public static int Xqedii_1d899vcfj8r9l(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3474pi77xxz4p;
   }

   public static int Xqedii_2attsp1fpsx6y(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2ze585bn25nhl;
   }

   public static int Xqedii_3ui8dz7tz1bf6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2l52ab61wzlew, var1);
   }

   public static long Xqedii_1ay6p3rhqc36t(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_9bt0tbpi00jt, var2);
   }

   public static long Xqedii_2sh4mwtexbcuo(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3zd3nf7craui;
   }

   public static long Xqedii_3utjkrxufx99y(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_ax94a09refji;
   }

   public static long Xqedii_27ljvv2vrevap(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2psnj90nyt42l, var2);
   }

   public static String Xqedii_2131079x6kbgh(String var0) {
      String var1 = Xqedii_2kvvard6z2bw6.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("kmIKSXENJLLq0URedI7h8u34DRQ4BeKatkqYuywhwKU=");
            int var3 = 320042057;

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
            String var9 = Xqedii_2kvvard6z2bw6.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1n80lmnud4a5b() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_34k2210lvxomk() {
   }

   private static int Xqedii_gn4x8g9c26za(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_hj3kgzw81qy5(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

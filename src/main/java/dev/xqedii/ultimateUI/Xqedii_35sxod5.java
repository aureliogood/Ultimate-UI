package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_35sxod5 {
   private static final ConcurrentHashMap<String, String> Xqedii_kbjy5tmi1ln0 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1yavk7pc6a5wv = 1300177468;
   private static volatile int Xqedii_1btf6jl2vooaz = 647638711;
   private static volatile int Xqedii_2i9nactvzfadb = 172040501;
   private static volatile int Xqedii_3uwfyfwsfkfbw = -1333656369;
   private static volatile long Xqedii_lnluh8wxb6sb = -3784362525671782015L;
   private static volatile long Xqedii_dyc24tasuev4 = -749674692650058379L;
   private static volatile long Xqedii_1swnf24tp0932 = 5338610223191597073L;
   private static volatile long Xqedii_3luowv4aqqqao = 6182823075234801378L;

   public static int Xqedii_3kp06hraq4h9k(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1yavk7pc6a5wv, var1);
   }

   public static int Xqedii_yjresv4hfgec(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1btf6jl2vooaz;
   }

   public static int Xqedii_1q89t4bwnuwds(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2i9nactvzfadb;
   }

   public static int Xqedii_5f29wh49w6tc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3uwfyfwsfkfbw, var1);
   }

   public static long Xqedii_2ca8kftqk7brw(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_lnluh8wxb6sb, var2);
   }

   public static long Xqedii_1xsg83hcal1jv(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_dyc24tasuev4;
   }

   public static long Xqedii_11cp7xk7whvqd(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1swnf24tp0932;
   }

   public static long Xqedii_3p2yqwz62sjow(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3luowv4aqqqao, var2);
   }

   public static String Xqedii_11abvogo4katv(String var0) {
      String var1 = Xqedii_kbjy5tmi1ln0.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("baNKFtrw4kcQinA0usgtmbvVujhN1gujI0xpHtbYZHo=");
            int var3 = 1593204353;

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
            String var9 = Xqedii_kbjy5tmi1ln0.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3k4wqvnd4691k() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_r96h97oweky7() {
   }

   private static int Xqedii_33tga8afabekw(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1fw3umnbeqb5i(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

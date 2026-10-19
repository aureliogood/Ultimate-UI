package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1jvz3mj {
   private static final ConcurrentHashMap<String, String> Xqedii_a4k3nbt0cwbr = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1gq6pyw1rwdjm = 1465452261;
   private static volatile int Xqedii_1tpjd0031lm34 = 1184956306;
   private static volatile int Xqedii_3lsk52hsff10p = -25403727;
   private static volatile int Xqedii_2b9m6r7wt36df = -311132875;
   private static volatile long Xqedii_2pcpt2uo80mx9 = -7500306660052218658L;
   private static volatile long Xqedii_36ei80tzf22zb = 38175572200817077L;
   private static volatile long Xqedii_2188lqwornssw = -1133783817388560627L;
   private static volatile long Xqedii_39fo2z4fkj22 = 4144012116835065043L;

   public static int Xqedii_69xlnx5u9129(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1gq6pyw1rwdjm, var1);
   }

   public static int Xqedii_7o7o5v3hecj1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1tpjd0031lm34;
   }

   public static int Xqedii_3nua1f5m0h2uu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3lsk52hsff10p;
   }

   public static int Xqedii_213pm4cg7agvz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2b9m6r7wt36df, var1);
   }

   public static long Xqedii_1i8l5rviji5rk(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2pcpt2uo80mx9, var2);
   }

   public static long Xqedii_8yh1a1yu7nek(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_36ei80tzf22zb;
   }

   public static long Xqedii_2tse63a805z48(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2188lqwornssw;
   }

   public static long Xqedii_3kv5tx5m9up1q(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_39fo2z4fkj22, var2);
   }

   public static String Xqedii_2ju2k5guv8h3o(String var0) {
      String var1 = Xqedii_a4k3nbt0cwbr.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("gyJR7bxi8NTEpw2rarVBkmbUU9tXypuv39UE4okYpt8=");
            int var3 = -634777369;

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
            String var9 = Xqedii_a4k3nbt0cwbr.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2lgfh08bvypko() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_26icwg8plliol() {
   }

   private static int Xqedii_3uwkw3ri7nszy(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_20109jw7q0hos(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

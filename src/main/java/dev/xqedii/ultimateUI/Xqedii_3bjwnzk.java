package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3bjwnzk {
   private static final ConcurrentHashMap<String, String> Xqedii_2juzli44gn7a4 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_652vqgw612ec = -422871654;
   private static volatile int Xqedii_13snisjcct9fi = -863303242;
   private static volatile int Xqedii_hnqp6g01w95q = -1849970952;
   private static volatile int Xqedii_2qe4ss48ij9t4 = 890840902;
   private static volatile long Xqedii_1x85g7z7a02yg = 1420863465872735268L;
   private static volatile long Xqedii_2bxydxb8pqrzt = -6711890186036021274L;
   private static volatile long Xqedii_2b859o7ho0z4t = 3787099109074722923L;
   private static volatile long Xqedii_34yfxh07mw4jg = 9028069962853263909L;

   public static int Xqedii_2yqhebjooxbsu(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_652vqgw612ec, var1);
   }

   public static int Xqedii_1civq0jk6adih(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_13snisjcct9fi;
   }

   public static int Xqedii_1gqn2s5ht8rti(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_hnqp6g01w95q;
   }

   public static int Xqedii_3vyxnyia7s48(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2qe4ss48ij9t4, var1);
   }

   public static long Xqedii_b4za1aaiazox(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1x85g7z7a02yg, var2);
   }

   public static long Xqedii_2776l3g5s7i1n(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2bxydxb8pqrzt;
   }

   public static long Xqedii_16jqwxqnhqthe(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2b859o7ho0z4t;
   }

   public static long Xqedii_rkaw07h9qqrb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_34yfxh07mw4jg, var2);
   }

   public static String Xqedii_chhw3eba8hn6(String var0) {
      String var1 = Xqedii_2juzli44gn7a4.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("c2GkluWr5pPRna9phgrUk3bg8bhx7vo8+vAOZS18oRg=");
            int var3 = 1564432234;

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
            String var9 = Xqedii_2juzli44gn7a4.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3a2i1yjo4june() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3j9vdi88akes0() {
   }

   private static int Xqedii_3l2pcrgj9e3ry(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_m04fk1j8sqss(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

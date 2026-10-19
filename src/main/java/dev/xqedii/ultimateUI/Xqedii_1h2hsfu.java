package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1h2hsfu {
   private static final ConcurrentHashMap<String, String> Xqedii_1ad68mq871zrx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3jkvhzoqiw06s = 292187171;
   private static volatile int Xqedii_1unzi4hvx83ju = -1734967857;
   private static volatile int Xqedii_2x9jvq7fkuc2j = -1117269581;
   private static volatile int Xqedii_2vt6st18339eq = 1395506031;
   private static volatile long Xqedii_31wfi3l5uhqwt = 7841221020546168412L;
   private static volatile long Xqedii_1qc4bjpts7q4e = -2264045027213572717L;
   private static volatile long Xqedii_1x72qfliw2t90 = -1855200787424395684L;
   private static volatile long Xqedii_2stn52u3o1qx9 = -5393904350907932665L;

   public static int Xqedii_28xhz4zs5kuar(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3jkvhzoqiw06s, var1);
   }

   public static int Xqedii_u9cca9og2zlb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1unzi4hvx83ju;
   }

   public static int Xqedii_yfqvw91g16am(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2x9jvq7fkuc2j;
   }

   public static int Xqedii_2p4yfstzu1okj(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2vt6st18339eq, var1);
   }

   public static long Xqedii_2srvp7m83tgky(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_31wfi3l5uhqwt, var2);
   }

   public static long Xqedii_12j4egyf4df7a(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1qc4bjpts7q4e;
   }

   public static long Xqedii_286o06t1644p4(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1x72qfliw2t90;
   }

   public static long Xqedii_21qxyldntu5u1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2stn52u3o1qx9, var2);
   }

   public static String Xqedii_2aguafu6gnx8o(String var0) {
      String var1 = Xqedii_1ad68mq871zrx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("NeZ7QdS6zXrdcHMtG7cBsLz4GGUZnxib8LQFIUs0llw=");
            int var3 = -1594319726;

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
            String var9 = Xqedii_1ad68mq871zrx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3h7yk32jowjz1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3616beutyzvs7() {
   }

   private static int Xqedii_3ilxyfgilr539(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1wqswyjvnrjyc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

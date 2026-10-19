package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1vir44s {
   private static final ConcurrentHashMap<String, String> Xqedii_1wqchqmtczuay = new ConcurrentHashMap<>();
   private static volatile int Xqedii_18raecsd43zh2 = 1321095943;
   private static volatile int Xqedii_2uqt6es51fm8e = 1756064275;
   private static volatile int Xqedii_17o81xemxlt0n = 1885703843;
   private static volatile int Xqedii_260uopmt9rekw = 1133673496;
   private static volatile long Xqedii_1jwbqsgoi85t7 = -9088400809976091934L;
   private static volatile long Xqedii_27v1kiedurqg0 = 2737699157305360228L;
   private static volatile long Xqedii_1kxe7hzi0fvg3 = 5162959507380986207L;
   private static volatile long Xqedii_2lfqntjtfadwp = 7640683025310423682L;

   public static int Xqedii_32qj5lqcj4c9q(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_18raecsd43zh2, var1);
   }

   public static int Xqedii_d6nrvc6zgvf1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2uqt6es51fm8e;
   }

   public static int Xqedii_1wjkucnl71x28(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_17o81xemxlt0n;
   }

   public static int Xqedii_1mgo8kcjusb83(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_260uopmt9rekw, var1);
   }

   public static long Xqedii_iiyy8yqlolhz(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1jwbqsgoi85t7, var2);
   }

   public static long Xqedii_ew2tu2zm2ig4(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_27v1kiedurqg0;
   }

   public static long Xqedii_3pgvt6jm2lmuc(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1kxe7hzi0fvg3;
   }

   public static long Xqedii_1igbhs4v9jed9(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2lfqntjtfadwp, var2);
   }

   public static String Xqedii_318zkvctmdttj(String var0) {
      String var1 = Xqedii_1wqchqmtczuay.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("wpv8d34RcsatxFQxVNyqMuuLKSg7htwMNp+ZEUk2eMA=");
            int var3 = 979923438;

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
            String var9 = Xqedii_1wqchqmtczuay.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2wiuyyc4686ot() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_r1o1mw84y43n() {
   }

   private static int Xqedii_16bay8an5qmtz(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1qcgczo65371s(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

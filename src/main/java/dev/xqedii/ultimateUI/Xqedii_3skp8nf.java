package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3skp8nf {
   private static final ConcurrentHashMap<String, String> Xqedii_1gi4110eyptib = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1uffyr535qxml = 2138490665;
   private static volatile int Xqedii_3fw177hg19ht7 = -806015181;
   private static volatile int Xqedii_zo344sulspys = 393562566;
   private static volatile int Xqedii_39rgaqzc3y8l4 = 1132014430;
   private static volatile long Xqedii_1eup2ji4i919t = 778165984230663299L;
   private static volatile long Xqedii_2tk7u0jz75pdp = -575599553917598181L;
   private static volatile long Xqedii_3thvv8mulsflf = -6845872991061859074L;
   private static volatile long Xqedii_3dsae8kh47qbw = 676376041613812610L;

   public static int Xqedii_1revoc8e6s8gx(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1uffyr535qxml, var1);
   }

   public static int Xqedii_2gt9owpphsazs(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3fw177hg19ht7;
   }

   public static int Xqedii_i932wkwicf0g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_zo344sulspys;
   }

   public static int Xqedii_30tcf85zspsi(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_39rgaqzc3y8l4, var1);
   }

   public static long Xqedii_1h7jz1vvgdog7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1eup2ji4i919t, var2);
   }

   public static long Xqedii_2xmqbjl871sin(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2tk7u0jz75pdp;
   }

   public static long Xqedii_3ueadn8eawh4a(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3thvv8mulsflf;
   }

   public static long Xqedii_1roh2mjebvdw(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3dsae8kh47qbw, var2);
   }

   public static String Xqedii_2swdnlsluteda(String var0) {
      String var1 = Xqedii_1gi4110eyptib.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("z0wT9ZsE8wzMkS0hTCLixnB7oIb/r8DaY/HNWehLMjA=");
            int var3 = 985465595;

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
            String var9 = Xqedii_1gi4110eyptib.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3uwjvk3tyaeoq() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_20kmrnspliczv() {
   }

   private static int Xqedii_26ndbozk6x3gw(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1atsbnhkibxnp(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

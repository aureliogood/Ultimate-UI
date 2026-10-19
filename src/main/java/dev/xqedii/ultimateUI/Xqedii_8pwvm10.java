package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_8pwvm10 {
   private static final ConcurrentHashMap<String, String> Xqedii_12mdd17g3rsec = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1sa72qmr1zo18 = 1495244626;
   private static volatile int Xqedii_99s7nak1lt8n = -45858073;
   private static volatile int Xqedii_1v81qj9o4v0zv = -127459824;
   private static volatile int Xqedii_24p7x65twvc8c = -1268734094;
   private static volatile long Xqedii_24pyw69p742i1 = -2475003444994956194L;
   private static volatile long Xqedii_1ttq5ed0cfpze = -8989238266955774696L;
   private static volatile long Xqedii_39yja1p4l8jzf = -6181378566713732404L;
   private static volatile long Xqedii_10m71289joudt = -3643844371620962318L;

   public static int Xqedii_2g8ovz5wjyhaw(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1sa72qmr1zo18, var1);
   }

   public static int Xqedii_10jzjs7hh7vjw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_99s7nak1lt8n;
   }

   public static int Xqedii_18o62qxk2t4n4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1v81qj9o4v0zv;
   }

   public static int Xqedii_wu39i6ydw3ac(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_24p7x65twvc8c, var1);
   }

   public static long Xqedii_2ylfhgq8rsllb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_24pyw69p742i1, var2);
   }

   public static long Xqedii_1dciqvf4rzifs(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1ttq5ed0cfpze;
   }

   public static long Xqedii_tzvugqq192u4(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_39yja1p4l8jzf;
   }

   public static long Xqedii_k8bf6xtiahfe(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_10m71289joudt, var2);
   }

   public static String Xqedii_1apg6evxoluej(String var0) {
      String var1 = Xqedii_12mdd17g3rsec.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ZJH+Qt7HGfcoS30/PHYuxDTRlQcuXV6cQAEVB50iSaU=");
            int var3 = -1425717367;

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
            String var9 = Xqedii_12mdd17g3rsec.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1hqvtptnm7w7j() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_9gl0l27wcy5j() {
   }

   private static int Xqedii_28ykxr33biqc2(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3k97gpi2cuuby(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

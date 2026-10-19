package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_234ruba {
   private static final ConcurrentHashMap<String, String> Xqedii_e6s3pgoxqsag = new ConcurrentHashMap<>();
   private static volatile int Xqedii_6uwwr7p7cfet = -747406234;
   private static volatile int Xqedii_24jxzurndz9pj = -174621576;
   private static volatile int Xqedii_3qisakdjlfksl = -1715736166;
   private static volatile int Xqedii_1utiwxhyqzyxt = -680153245;
   private static volatile long Xqedii_25yos9ju1u698 = -5699055313553173666L;
   private static volatile long Xqedii_1wpabebq0605j = -458381746590197280L;
   private static volatile long Xqedii_1sivauf1ssak6 = -1743257928928072352L;
   private static volatile long Xqedii_1bemetg066bks = -2507193019468611489L;

   public static int Xqedii_1yw39gldl2dht(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_6uwwr7p7cfet, var1);
   }

   public static int Xqedii_2mdohxf1usjbb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_24jxzurndz9pj;
   }

   public static int Xqedii_2vo28b1ol02rx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3qisakdjlfksl;
   }

   public static int Xqedii_141n38zfnaq0s(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1utiwxhyqzyxt, var1);
   }

   public static long Xqedii_6xnjdt57r0zu(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_25yos9ju1u698, var2);
   }

   public static long Xqedii_367ucipz7uju4(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1wpabebq0605j;
   }

   public static long Xqedii_3smucwn9vmccg(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1sivauf1ssak6;
   }

   public static long Xqedii_2l9aziz5csdbx(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1bemetg066bks, var2);
   }

   public static String Xqedii_3826pr3a97s8z(String var0) {
      String var1 = Xqedii_e6s3pgoxqsag.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("DhZPy+EB49ubtodSOef1m6k1yG6xZXFOiHkqLUoQL9c=");
            int var3 = -824277468;

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
            String var9 = Xqedii_e6s3pgoxqsag.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2trvl8x26qkhr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_356tic1bz7a2g() {
   }

   private static int Xqedii_af1og8wibzra(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3h87j4biyw8z(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

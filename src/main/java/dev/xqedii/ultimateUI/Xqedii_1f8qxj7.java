package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1f8qxj7 {
   private static final ConcurrentHashMap<String, String> Xqedii_2mth615tr4cga = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2m55822j17zf5 = 1785715845;
   private static volatile int Xqedii_1bq2cbii36lwj = 348727741;
   private static volatile int Xqedii_2l4fhplweoyl3 = -1730019029;
   private static volatile int Xqedii_py8ibdfu7vo5 = -869545928;
   private static volatile long Xqedii_38k4um5jznw71 = 8334761444833190429L;
   private static volatile long Xqedii_15mdw8j4009ov = -3331260225461734919L;
   private static volatile long Xqedii_2epb92xjodbvi = -5209253020524561376L;
   private static volatile long Xqedii_3u96qdtx9iz8d = 7577290010283230015L;

   public static int Xqedii_t4czll9zbup6(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2m55822j17zf5, var1);
   }

   public static int Xqedii_smyk2liunors(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1bq2cbii36lwj;
   }

   public static int Xqedii_22c1snni7xkok(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2l4fhplweoyl3;
   }

   public static int Xqedii_1qcju9hjpqd7d(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_py8ibdfu7vo5, var1);
   }

   public static long Xqedii_28mqj4cpjqta4(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_38k4um5jznw71, var2);
   }

   public static long Xqedii_826wol9pgdnc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_15mdw8j4009ov;
   }

   public static long Xqedii_10xxrry392ksy(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2epb92xjodbvi;
   }

   public static long Xqedii_2ux48bm3catkn(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3u96qdtx9iz8d, var2);
   }

   public static String Xqedii_3brdmubjx5w2u(String var0) {
      String var1 = Xqedii_2mth615tr4cga.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("y898HlDfIqCMci3KvtB0MFC6hzNKa0bOCR2/CJmtGEg=");
            int var3 = -1438163466;

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
            String var9 = Xqedii_2mth615tr4cga.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_qdy8y95ezf6z() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_39g397q8wr6al() {
   }

   private static int Xqedii_1apzfahw7bou6(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1cvtkkqahw4kn(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}

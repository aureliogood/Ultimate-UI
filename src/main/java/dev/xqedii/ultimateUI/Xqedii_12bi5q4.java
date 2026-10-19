package dev.xqedii.ultimateUI;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Xqedii_12bi5q4 {
   public static final String Xqedii_1sijnhg0lgmyu = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final Pattern Xqedii_yovgrx8;
   public static final String Xqedii_3vkx8q9 = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
      "XHBNLXt3fzHfMkfaOuc/gouB5bYgQqe7PrzYlHsNkYJMze8pJV1/mD7EUkhY1+DAe4NFZOkfzfIbKmEMQFZRlWPZOxko06nowxw62H+5YvtCazQYPCy+k6yBURE="
   );
   public static final String Xqedii_24nvj29 = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("hOqZK9XIOtphP2OIjN/GvwhWZj/9rgLPLnRowDo8ACdBazPP");
   public static final String Xqedii_1i3rtx0 = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
      "Lwc+8UAwghNmnx6lMW1dhGG9bhH3vSZbKoPZrzs8wwMSwE/SHzZykuaWPV3OPsrziUrSkeXsjeympe7VJLKo45ed"
   );
   public static final String Xqedii_22f2a4h = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
      "Cyvd1xJLI8NO8l6qqkZrFY1+am/Pub0+tmuiQtfHXY70L6vKLuSJGqWpja5UCYZCOtMLH2yMm0iDjlvW"
   );
   public final JavaPlugin Xqedii_1p68vxq;

   public Xqedii_12bi5q4(JavaPlugin var1) {
      this.Xqedii_1p68vxq = var1;
   }

   public File Xqedii_1kxrs0m(Xqedii_hme1l2t var1) {
      if ((1137841140 * 1137841140 + 1137841140 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var2 = this.Xqedii_1p68vxq.getDataFolder().getParentFile();
         return var2 == null ? null : new File(var2, var1.Xqedii_lho1nuv());
      }
   }

   public Xqedii_1pwigla Xqedii_278kok9(Xqedii_hme1l2t var1, File var2) throws IOException {
      if (((-1212320742 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var3 = this.Xqedii_1kxrs0m(var1);
         if (var3 != null && var3.isDirectory()) {
            ArrayList var4 = new ArrayList();
            switch (var1) {
               case ITEMSADDER:
                  File var8 = new File(var3, Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("zn0/xch/SWSYNbjFigETOsGXS79b/YvOjN+Ls3gwa3zTOwfvsztUYZKbBnxoxC2Q"));
                  String[] var12 = new String[Xqedii_2wp1s9w.Xqedii_1594t5y4co522(1333050400, 27)];
                  var12[Xqedii_2wp1s9w.Xqedii_1bokz0ze0nj5x(-1125437278, 5)] = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
                     "VVFGTF7ege8q4p10aNXgxCLGIjOonGgOsRqqo1UCTLXNaeGLB6uSAwtMdwCX9dXe6rRiEjVPw7YZALIDFBLnAJfoyLFFtt347RlGMQBGPJMBZJ+svgGRIt6XLA4go0Bmb8wguJKDRMUTsYOBqmKQP3AZ7LtQTYn/FwTN51dt"
                  );
                  var12[Xqedii_2wp1s9w.Xqedii_1bokz0ze0nj5x(1125437277, 19)] = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
                     "4Kflxt2wfveH0ANwT1bU60n8v1uNSwRhJa38XFyqebVwpTEyxyXIAb48IhYRGTEaqiWIFcrDLWN66XsN08/0F3CLdNw2Eahx5iN/Kn6Q2WGyLAY65SP+vr4Jy5JcQVat4xg="
                  );
                  this.Xqedii_1oajq4y(var1, var8, var4, var12);
                  var12 = new String[Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(465800998, 30)];
                  var12[Xqedii_2wp1s9w.Xqedii_1594t5y4co522(-2079592809, 16)] = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
                     "7syAXW5fMTo80Jrdk5K+jAUVGBBIoMMTd08g2gpIhutR2qKRZ+j9cAxcf6+iq7u/qEfSX2SE2l/Mwkum+uPPqLTl5cs="
                  );
                  this.Xqedii_1oajq4y(var1, var8, var4, var12);
                  Path var9 = var3.toPath()
                     .resolve(
                        Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
                           "XHBNLXt3fzHfMkfaOuc/gouB5bYgQqe7PrzYlHsNkYJMze8pJV1/mD7EUkhY1+DAe4NFZOkfzfIbKmEMQFZRlWPZOxko06nowxw62H+5YvtCazQYPCy+k6yBURE="
                        )
                     );
                  this.Xqedii_26ro3w8(var9);
                  this.Xqedii_14n5qio(var2, var9, (Xqedii_2wp1s9w.Xqedii_1bokz0ze0nj5x(-1125437278, 25) != 0));
                  return new Xqedii_1pwigla(
                     var1,
                     var4,
                     List.of(
                        Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("p7HMlhP/7paFCY03p30cqlbw3ncpDEG9u9xqYi1OgVaTD56VgR/xKb1BdUs="),
                        Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("5s2+++n07+VdUScF9Wi3JrZ6o+KXq3k3StUfFw869Fwb2mZ3OaU=")
                     )
                  );
               case NEXO:
                  File var7 = new File(var3, Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("d+iWMKAZnL8HnbzaToNsxrWL/u60S6c1uyLt9uMOhvM6vD7KBB9kRt7BAuUalH2zNmUYCw=="));
                  String[] var11 = new String[Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(1639725298, 26)];
                  var11[Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(-10605769, 11)] = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
                     "fT27OBvAZzYGtugSNtmrAv3HqkBI6o786iDdq4ZFer2ygyRZEHSKOGMMEovzM+Wi9c7vux4gYtsivOex/QSDtz361hBXmw=="
                  );
                  this.Xqedii_1oajq4y(var1, var7, var4, var11);
                  Path var6 = var3.toPath()
                     .resolve(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("Lwc+8UAwghNmnx6lMW1dhGG9bhH3vSZbKoPZrzs8wwMSwE/SHzZykuaWPV3OPsrziUrSkeXsjeympe7VJLKo45ed"));
                  Files.createDirectories(var6);
                  Path var10000 = var2.toPath();
                  Path var10001 = var6.resolve(
                     Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("Cyvd1xJLI8NO8l6qqkZrFY1+am/Pub0+tmuiQtfHXY70L6vKLuSJGqWpja5UCYZCOtMLH2yMm0iDjlvW")
                  );
                  CopyOption[] var10002 = new CopyOption[Xqedii_2wp1s9w.Xqedii_1594t5y4co522(1085204856, 20)];
                  var10002[Xqedii_2wp1s9w.Xqedii_1594t5y4co522(100092866, 23)] = StandardCopyOption.REPLACE_EXISTING;
                  Files.copy(var10000, var10001, var10002);
                  return new Xqedii_1pwigla(
                     var1, var4, List.of(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("fXV6kZtrm25y2HcLHh2SM9Qrpro2NMmbhz7cx1jenxElC85ZXKTVWxYZsMNhk45n5oA="))
                  );
               case ORAXEN:
                  File var5 = new File(var3, Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("d+iWMKAZnL8HnbzaToNsxrWL/u60S6c1uyLt9uMOhvM6vD7KBB9kRt7BAuUalH2zNmUYCw=="));
                  String[] var10004 = new String[Xqedii_2wp1s9w.Xqedii_1bokz0ze0nj5x(1125437277, 25)];
                  var10004[Xqedii_2wp1s9w.Xqedii_1594t5y4co522(1578119098, 10)] = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
                     "XjJy9K/WhlP83/UN8Ef3EfBYaWMOYVl+5a7KEM7pa2kKyiQDjancWCwj8zaFyNWUlUhc7LA7266r4nO6LmglRDf4QJ4ipTIMfoS6ZL/L"
                  );
                  this.Xqedii_1oajq4y(var1, var5, var4, var10004);
                  var10004 = new String[Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(-568559312, 1)];
                  var10004[Xqedii_2wp1s9w.Xqedii_1594t5y4co522(-377995074, 4)] = Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
                     "yQKOZLyfYhc3D3Dk6DtbcVFFyfIs6v98r5dBfk5ohSAox9N/fwY+OcGWx4PDhUKJH/1z9BBn1hJfdtYE40WVqYCJhiB4mN0PBg4AhbU3gNU="
                  );
                  this.Xqedii_1oajq4y(var1, var5, var4, var10004);
                  this.Xqedii_14n5qio(
                     var2,
                     var3.toPath().resolve(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("hOqZK9XIOtphP2OIjN/GvwhWZj/9rgLPLnRowDo8ACdBazPP")),
                     (Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(465800998, 30) != 0)
                  );
                  return new Xqedii_1pwigla(
                     var1, var4, List.of(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("lSCDiBMzcpnBbrhTGkJR854gOEouWlbC18F5fLbVw75TEaiYNZVFBjtFNtQOIXM23+20zk0K"))
                  );
               default:
                  return null;
            }
         } else {
            return null;
         }
      }
   }

   public void Xqedii_1oajq4y(Xqedii_hme1l2t var1, File var2, List<String> var3, String... var4) throws IOException {
      if (((-335075558 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && var2.isFile() && var4.length != 0) {
         String var5 = Files.readString(var2.toPath(), StandardCharsets.UTF_8);
         String var6 = var5.contains(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("nKQ1TleG8RHWwlfyy7jZwZJ3qyngOUiEf/ZR343BjPA="))
            ? Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("nKQ1TleG8RHWwlfyy7jZwZJ3qyngOUiEf/ZR343BjPA=")
            : Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("KRgpUpD1qEz8TV1++1EMW+QbGjGWvDqapAGc61lB");
         String[] var7 = var5.split(
            Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("SSaVwupYmCn4Ei4j65NvMCDnQMUcmu7zq7miKuvXKlJf3w=="), Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(-946680351, 13)
         );
         String[] var8 = var4;
         int var9 = var4.length;

         for (int var10 = Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(-10605769, 3); var10 < var9; var10++) {
            String var11 = var8[var10];
            int var12 = this.Xqedii_2itmi4u(var7, var11);
            if (var12 >= 0) {
               Matcher var13 = Xqedii_yovgrx8.matcher(var7[var12]);
               if (var13.matches()) {
                  String var14 = var13.group(Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(-568559308, 1));
                  int var15 = this.Xqedii_2o7kh0a(var14);
                  String var16 = (var15 >= 0 ? var14.substring(Xqedii_2wp1s9w.Xqedii_1594t5y4co522(-259949102, 13), var15) : var14).trim();
                  if (!var16.isEmpty()) {
                     if (var16.equalsIgnoreCase(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("ea1plxXC/gvS1Jf3JIQqfPOwmVGuV3qHjmyx/6Ud01kfCA4lXhQ="))) {
                        return;
                     }

                     String var17 = var15 >= 0
                        ? Xqedii_2vpm7fh1fjy5p(var14.substring(var15).trim())
                        : Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("bP/asxAXYRr+WmrOeJ0jmWTZwr08NWDsp8mY4Q==");
                     var7[var12] = Xqedii_1p717hep0rprc(
                        var13.group(Xqedii_2wp1s9w.Xqedii_1594t5y4co522(-2124557584, 21)),
                        var13.group(Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(508344199, 15)),
                        var17
                     );
                     Files.writeString(var2.toPath(), String.join(var6, var7), StandardCharsets.UTF_8);
                     var3.add(Xqedii_22x5timzseqmt(var1.Xqedii_lho1nuv(), var2.getName(), var11));
                     return;
                  }
               }
            }
         }

         YamlConfiguration var18 = YamlConfiguration.loadConfiguration(var2);
         var18.set(var4[Xqedii_2wp1s9w.Xqedii_1594t5y4co522(-73015038, 30)], Boolean.valueOf((Xqedii_2wp1s9w.Xqedii_1bokz0ze0nj5x(-1125437278, 21) != 0)));
         var18.save(var2);
         var3.add(Xqedii_37cggqre3i9m5(var1.Xqedii_lho1nuv(), var2.getName(), var4[Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(-253507210, 4)]));
      }
   }

   public int Xqedii_2itmi4u(String[] var1, String var2) {
      if ((-568696538 * (-568696538 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList<Integer> var3 = new ArrayList<>();
         ArrayList var4 = new ArrayList();

         for (int var5 = Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(508278663, 15); var5 < var1.length; var5++) {
            String var6 = var1[var5];
            String var7 = var6.trim();
            if (!var7.isEmpty()
               && !var7.startsWith(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("tbrwxp/xDofEgaCx6MQAdDMIHHbNrKWvlhA5v8qd"))
               && !var7.startsWith(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("3KaRpEXmfZzAHQivMgkAw0DAlzi3vCnRLZgEk7j5"))) {
               Matcher var8 = Xqedii_yovgrx8.matcher(var6);
               if (var8.matches()) {
                  int var9 = var8.group(Xqedii_2wp1s9w.Xqedii_1bokz0ze0nj5x(1125437277, 13)).length();

                  while (!var3.isEmpty() && var3.get(var3.size() - Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(-11130057, 19)) >= var9) {
                     var3.remove(var3.size() - Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(-10605705, 6));
                     var4.remove(var4.size() - Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(-279041225, 28));
                  }

                  var3.add(var9);
                  var4.add(this.Xqedii_2la92pk(var8.group(Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(-10607817, 10))));
                  if (String.join(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("TiQlqtFThktiSHv3WDEG5hncOUnvuVqgGn8Smel1"), var4).equals(var2)) {
                     return var5;
                  }
               }
            }
         }

         return Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(10605768, 29);
      }
   }

   public int Xqedii_2o7kh0a(String var1) {
      if ((-402448083 * -402448083 + -402448083 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (int var2 = Xqedii_2wp1s9w.Xqedii_1594t5y4co522(2110976129, 29); var2 < var1.length(); var2++) {
            if (var1.charAt(var2) == Xqedii_2wp1s9w.Xqedii_1bokz0ze0nj5x(1125928797, 14)
               && (var2 == 0 || Character.isWhitespace(var1.charAt(var2 - Xqedii_2wp1s9w.Xqedii_bs12cdwpthji(465800998, 30))))) {
               return var2;
            }
         }

         return Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(10605768, 2);
      }
   }

   public String Xqedii_2la92pk(String var1) {
      if (((-1635916374 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1.length() < Xqedii_2wp1s9w.Xqedii_1594t5y4co522(-755990211, 5)
               || (
                     !var1.startsWith(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("xknFnu2m+ia5AkfRPozdV4r2LaYYhOgWxAWa+HJS"))
                        || !var1.endsWith(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("xknFnu2m+ia5AkfRPozdV4r2LaYYhOgWxAWa+HJS"))
                  )
                  && (
                     !var1.startsWith(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("7ClQya0KiNgUPkgBd8Kte18evjwdLujCzquSg2Gi"))
                        || !var1.endsWith(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("7ClQya0KiNgUPkgBd8Kte18evjwdLujCzquSg2Gi"))
                  )
            ? var1
            : var1.substring(Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(-1084347593, 30), var1.length() - Xqedii_2wp1s9w.Xqedii_3vpb2p26tmtbv(-10605771, 1));
      }
   }

   public void Xqedii_14n5qio(File var1, Path var2, boolean var3) throws IOException {
      if ((-1103776523 ^ -1103776523) != 0) {
         throw new IllegalStateException();
      } else {
         Path var4 = var2.toAbsolutePath().normalize();
         Files.createDirectories(var4);

         try (ZipFile var5 = new ZipFile(var1)) {
            Enumeration var6 = var5.entries();

            while (var6.hasMoreElements()) {
               ZipEntry var7 = (ZipEntry)var6.nextElement();
               String var8 = var7.getName();
               if (!var3
                  || !var8.equals(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("ULbiJKtv/GY168PMHRwMNwiw+eA+bmCRNbjjXzANCvgI2mv8IWbAgUrFGJ7X6Aj1qzc="))
                     && !var8.equals(Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("Rev/tMx9N937n+7II5NJSulNfLbipX0o1msnCwb6IbmeHMY6bPaKcbalgFc="))) {
                  Path var9 = var4.resolve(var8).normalize();
                  if (var9.startsWith(var4)) {
                     if (var7.isDirectory()) {
                        Files.createDirectories(var9);
                     } else {
                        Files.createDirectories(var9.getParent());

                        try (InputStream var10 = var5.getInputStream(var7)) {
                           CopyOption[] var10002 = new CopyOption[Xqedii_2wp1s9w.Xqedii_1bokz0ze0nj5x(1125437277, 8)];
                           var10002[Xqedii_2wp1s9w.Xqedii_1594t5y4co522(-1168240593, 2)] = StandardCopyOption.REPLACE_EXISTING;
                           Files.copy(var10, var9, var10002);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void Xqedii_26ro3w8(Path var1) throws IOException {
      if ((791438317 * (791438317 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (Files.exists(var1)) {
         try (Stream var2 = Files.walk(var1)) {
            for (Path var4 : (Iterable<Path>) (var2.sorted(Comparator.reverseOrder()).toList())) {

               Files.deleteIfExists(var4);
            }
         }
      }
   }

   static {
      if ((-1408188975 * -1408188975 + -1408188975 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_yovgrx8 = Pattern.compile(
            Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei(
               "t6MF+tR5nUlLh0FUuYJ5ZZi3H+WPug9SJY9FlBSyG0zfggYf+C2PGUiiLZ8lcijZ3xKcRk4D/pQVsxIZC5ixG8ZqLacoWrTEgqAxH4vD/wVuFbBdSZZFNmyis1gCoEVmNNTpzgdbTDgQMu9NpGD82EMR+pOMGuOLCz2OQNxi"
            )
         );
      }
   }

   private static /* synthetic */ String Xqedii_2vpm7fh1fjy5p(String string) {
        return Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("1RqbFNyzqCXuO7DsLqJxTrS8IoU5Y2YBmWLilUc6") + string;
    }

    private static /* synthetic */ String Xqedii_1p717hep0rprc(String string, String string2, String string3) {
        return string + string2 + Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("OErNuEjJBbhpqCimHBWK3V888b1Lz6dwDaCMZBHx5kU1I7IAFzoDKVVE") + string3;
    }

    private static /* synthetic */ String Xqedii_22x5timzseqmt(String string, String string2, String string3) {
        return string + Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("yeTSoAqyNOWRaKyt4pm4DLBHBosmYbpxBYdP3H0T") + string2 + Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("iPG/C6feZvRhEEoXfxR43i2qD0fkTwujX8EFEEgdKf5R9CZy") + string3 + Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("OErNuEjJBbhpqCimHBWK3V888b1Lz6dwDaCMZBHx5kU1I7IAFzoDKVVE");
    }

    private static /* synthetic */ String Xqedii_37cggqre3i9m5(String string, String string2, String string3) {
        return string + Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("yeTSoAqyNOWRaKyt4pm4DLBHBosmYbpxBYdP3H0T") + string2 + Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("iPG/C6feZvRhEEoXfxR43i2qD0fkTwujX8EFEEgdKf5R9CZy") + string3 + Xqedii_2wp1s9w.Xqedii_3oo49ifcq92ei("OErNuEjJBbhpqCimHBWK3V888b1Lz6dwDaCMZBHx5kU1I7IAFzoDKVVE");
    }
}

package dev.xqedii.ultimateUI;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public abstract class Xqedii_162huh6 extends Xqedii_2olys1t {
   public static final String Xqedii_1csz5pc94fty5 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public Xqedii_162huh6(File var1) {
      super(var1);
   }

   public int[] Xqedii_22cnhtn(File var1) throws IOException {
      if ((15717715 * (15717715 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         long var2 = this.Xqedii_se5h7oc(var1);
         File var4 = new File(
            this.Xqedii_ef13m9a, Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("g7wA/UxXj6Xj7TGCAhln3627oUZneVvk/IH5erbOYEIT21ukhwZoH27eHNCYax+GKJ2CoA/bPoF5ggn1ANk=")
         );
         if (!var4.isDirectory() && !var4.mkdirs()) {
            throw new IOException(Xqedii_33xflr4tczg8v(String.valueOf(var4)));
         } else {
            File var5 = new File(
               var4, Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("12I6vrDsiwocjsYaRz3MN4UCa7/94fsux+lnoFtbEXIw/PSmKOIhhk0bT9uvR0L7zwMfnraYmsmT66xMtvPPg1CSKLjkjfjp/40=")
            );
            Properties var6 = new Properties();
            if (var5.isFile()) {
               try (InputStream var7 = Files.newInputStream(var5.toPath())) {
                  var6.load(var7);
               } catch (IOException var17) {
               }
            }

            long var18 = Xqedii_yq23l46(
               var6.getProperty(Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("axTZ6NQPYRBatW1JqEYI9Bhk9QbipabO++UgZ8HF80k4oLtzwVsxfh2VIh3fzNkgXZE=")),
               Xqedii_23g9vkk.Xqedii_1898apaqtk5ny(-5959444431271318753L, 45)
            );
            int var9 = (int)Math.max(
               Xqedii_23g9vkk.Xqedii_1p3ra5msxr61c(-5682881932815520293L, 6),
               Xqedii_yq23l46(
                  var6.getProperty(Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("DguDYx5D3el9L+zHutARNIk6XdhuFMBS0oa6Z58pVazHxXsSE2c=")),
                  Xqedii_23g9vkk.Xqedii_3h0gt1l8lhqzo(-4748092206318499930L, 62)
               )
            );
            if (var18 != var2) {
               var9++;
               var6.setProperty(Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("axTZ6NQPYRBatW1JqEYI9Bhk9QbipabO++UgZ8HF80k4oLtzwVsxfh2VIh3fzNkgXZE="), Long.toString(var2));
               var6.setProperty(Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("DguDYx5D3el9L+zHutARNIk6XdhuFMBS0oa6Z58pVazHxXsSE2c="), Integer.toString(var9));

               try (OutputStream var10 = Files.newOutputStream(var5.toPath())) {
                  var6.store(
                     var10,
                     Xqedii_23g9vkk.Xqedii_oes8uub3gfa5(
                        "Oz60DrHbuF4HiUWtFqgGn5uy9qAd2VdiNr57rNz4xD5jnzP5bYDg3m9pD/tycpJ1nz+HbnYketzSFd3XSIAt67YqEuGxcUj8HTHrHjkv123VFqagvYQzIec3l9tg2AunOn2FDMSUgxcR5cdrVGa1PYuYEFwPgNra44jd0DQiW8MlROuXLEDXg5UdJGe/OkIAnQgQrI9o"
                     )
                  );
               }
            }

            int[] var10000 = new int[Xqedii_23g9vkk.Xqedii_2lofmesv4jy38(-2125915896, 5)];
            var10000[Xqedii_23g9vkk.Xqedii_2xil62z39zwmz(-377680751, 12)] = Xqedii_23g9vkk.Xqedii_2lofmesv4jy38(-1052173976, 30);
            var10000[Xqedii_23g9vkk.Xqedii_20399aqkbcgd5(395077066, 4)] = var9 / Xqedii_23g9vkk.Xqedii_l8w0cgk4mepu(-600528841, 14);
            var10000[Xqedii_23g9vkk.Xqedii_2xil62z39zwmz(511898478, 27)] = var9 % Xqedii_23g9vkk.Xqedii_2xil62z39zwmz(377668334, 7);
            return var10000;
         }
      }
   }

   public long Xqedii_se5h7oc(File var1) throws IOException {
      if ((403558425 * 403558425 + 403558425 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         this.Xqedii_1ti13cf(var1, var2);
         var2.sort(Comparator.comparing(File::getAbsolutePath, String.CASE_INSENSITIVE_ORDER));
         Path var3 = var1.toPath();
         long var4 = Xqedii_23g9vkk.Xqedii_3h0gt1l8lhqzo(-4748068665401423962L, 40);
         byte[] var6 = new byte[Xqedii_23g9vkk.Xqedii_l8w0cgk4mepu(-467949513, 14)];

         for (File var8 : (Iterable<File>) (var2)) {

            String var9 = var3.relativize(var8.toPath())
               .toString()
               .replace((char)Xqedii_23g9vkk.Xqedii_20399aqkbcgd5(218875440, 27), (char)Xqedii_23g9vkk.Xqedii_2lofmesv4jy38(-2125915850, 1));
            if (!Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("Hx0wlAQ3FPZRTU05xaPKzJdzO76yp/iCZRPMupTVzKxeg4VuxVSwphh+VHVSiAI5Yt5z6vHu").equalsIgnoreCase(var9)) {
               var4 = Xqedii_23g9vkk.Xqedii_3c4uqia6ujnk6(2464873932367271743L, 25) * var4 + var9.hashCode();

               int var11;
               try (InputStream var10 = Files.newInputStream(var8.toPath())) {
                  while ((var11 = var10.read(var6)) != Xqedii_23g9vkk.Xqedii_2lofmesv4jy38(2125915799, 29)) {
                     for (int var12 = Xqedii_23g9vkk.Xqedii_l8w0cgk4mepu(1856036720, 24); var12 < var11; var12++) {
                        var4 = Xqedii_23g9vkk.Xqedii_3h0gt1l8lhqzo(4748092206318499911L, 0) * var4 + var6[var12];
                     }
                  }
               }
            }
         }

         return var4;
      }
   }

   public static long Xqedii_yq23l46(String var0, long var1) {
      if ((161303104 * 161303104 - 161303104 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isBlank()) {
         try {
            return Long.parseLong(var0.trim());
         } catch (NumberFormatException var4) {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public File Xqedii_1sujeju(File var1) throws IOException {
      if (((369993074 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var2 = new File(
            this.Xqedii_ef13m9a, Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("g7wA/UxXj6Xj7TGCAhln3627oUZneVvk/IH5erbOYEIT21ukhwZoH27eHNCYax+GKJ2CoA/bPoF5ggn1ANk=")
         );
         if (!var2.isDirectory() && !var2.mkdirs()) {
            throw new IOException(Xqedii_7dahvdkc9k44(String.valueOf(var2)));
         } else {
            File var3 = new File(
               var2,
               Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("xKRgilBbqXzVOcLjeKdjzhJkwxdI73zm72hEJtkM2l/1nz/CnblnDUWGDEnHtPm8d+suKAwtI6QQwp35IXAmpg4nkKiiB+1WkJc0/wOO")
            );
            File var4 = new File(
               var2,
               Xqedii_23g9vkk.Xqedii_oes8uub3gfa5(
                  "O7d6WGFeu5mElvjvAeA56OlgNk5zYu8BlXlVtcM3dkyh01KxRcYaoFbFfGZpS80sDimVzxLplkZTU62GX2Rv3WNS/ii4hbyk7zxgpdbys3tj4utogB8="
               )
            );
            Path var5 = var1.toPath();
            ArrayList var6 = new ArrayList();
            this.Xqedii_1ti13cf(var1, var6);
            var6.sort(Comparator.comparing(File::getAbsolutePath, String.CASE_INSENSITIVE_ORDER));

            try (ZipOutputStream var7 = new ZipOutputStream(Files.newOutputStream(var4.toPath()))) {
               byte[] var8 = new byte[Xqedii_23g9vkk.Xqedii_2lofmesv4jy38(-2125915832, 24)];

               for (File var10 : (Iterable<File>) (var6)) {

                  String var11 = var5.relativize(var10.toPath())
                     .toString()
                     .replace((char)Xqedii_23g9vkk.Xqedii_2xil62z39zwmz(1988293477, 29), (char)Xqedii_23g9vkk.Xqedii_2lofmesv4jy38(-1970726552, 22));
                  if (!var11.isBlank()) {
                     ZipEntry var12 = new ZipEntry(var11);
                     var12.setTime(var10.lastModified());
                     var7.putNextEntry(var12);

                     int var14;
                     try (InputStream var13 = Files.newInputStream(var10.toPath())) {
                        while ((var14 = var13.read(var8)) != Xqedii_23g9vkk.Xqedii_2xil62z39zwmz(-914551663, 29)) {
                           if (var14 > 0) {
                              var7.write(var8, Xqedii_23g9vkk.Xqedii_2xil62z39zwmz(-377680751, 16), var14);
                           }
                        }
                     }

                     var7.closeEntry();
                  }
               }
            } catch (IOException var20) {
               Files.deleteIfExists(var4.toPath());
               throw var20;
            }

            Path var10000 = var4.toPath();
            Path var10001 = var3.toPath();
            CopyOption[] var10002 = new CopyOption[Xqedii_23g9vkk.Xqedii_l8w0cgk4mepu(-546279520, 8)];
            var10002[Xqedii_23g9vkk.Xqedii_l8w0cgk4mepu(117146485, 3)] = StandardCopyOption.REPLACE_EXISTING;
            Files.move(var10000, var10001, var10002);
            return var3;
         }
      }
   }

   public void Xqedii_1ti13cf(File var1, List<File> var2) {
      if ((-193060543 * -193060543 + -193060543 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File[] var3 = var1.listFiles();
         if (var3 != null) {
            File[] var4 = var3;
            int var5 = var3.length;

            for (int var6 = Xqedii_23g9vkk.Xqedii_20399aqkbcgd5(-484870523, 10); var6 < var5; var6++) {
               File var7 = var4[var6];
               if (var7 != null) {
                  if (var7.isDirectory()) {
                     this.Xqedii_1ti13cf(var7, var2);
                  } else if (var7.isFile()) {
                     var2.add(var7);
                  }
               }
            }
         }
      }
   }

   public void Xqedii_3297wz8(File var1, String var2) throws IOException {
      if (((-1099912471 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var3 = var1.getParentFile();
         if (var3 != null && !var3.isDirectory() && !var3.mkdirs()) {
            throw new IOException(Xqedii_27y8lb0g1mo3(String.valueOf(var3)));
         } else {
            Files.writeString(var1.toPath(), var2, StandardCharsets.UTF_8);
         }
      }
   }

   private static /* synthetic */ String Xqedii_33xflr4tczg8v(String string) {
        return Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("6E/jrRyDy1or6L+kY+gsH364UKZw/SqV1b51ELM1M/wWzO9OnGXgoW5DApZKFvNIMLjzsi3oMpAol8GrPp0=") + string;
    }

    private static /* synthetic */ String Xqedii_7dahvdkc9k44(String string) {
        return Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("6E/jrRyDy1or6L+kY+gsH364UKZw/SqV1b51ELM1M/wWzO9OnGXgoW5DApZKFvNIMLjzsi3oMpAol8GrPp0=") + string;
    }

    private static /* synthetic */ String Xqedii_27y8lb0g1mo3(String string) {
        return Xqedii_23g9vkk.Xqedii_oes8uub3gfa5("6E/jrRyDy1or6L+kY+gsH364UKZw/SqV1b51ELM1M/wWzO9OnGXgoW5DApZKFvNIMLjzsi3oMpAol8GrPp0=") + string;
    }
}
